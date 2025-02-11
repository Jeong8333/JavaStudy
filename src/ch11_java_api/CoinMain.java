package ch11_java_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CoinMain {
	public static void main(String[] args) throws IOException, ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("======코인 정보 시스템 입니다.======");
		
		//1.코인 종목코드 출력(한줄에 5~7개 정도 출력)
		while(true) {
			Coin();
			System.out.println("\n어떤 종목을 보여드릴까요(end:q");
			String msg = scan.nextLine();
			if(msg.equalsIgnoreCase("q")) {
				System.out.println("======== 종료 ========");
				break;
			}
			//2.해당 코인의 최저가(low), 최고가(high), 현재가(trde) 출력
			System.out.println("상세 정보=================");
			JSONObject resultObj = getCoin(msg);
			DecimalFormat format = new DecimalFormat("#,###.##");
			System.out.println("최저가: "+format.format(resultObj.get("low_price")));
			System.out.println("최고가: "+format.format(resultObj.get("high_price")));
			System.out.println("판매가: "+format.format(resultObj.get("trade_price")));
			
		}
	}
	public static void Coin() throws IOException, ParseException {
		String coinInfoUrl = "https://api.upbit.com/v1/market/all";
		URL url = new URL(coinInfoUrl);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setReadTimeout(5000); 
		int resCode = conn.getResponseCode(); 
		if(resCode==200) {
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			JSONParser parser = new JSONParser();
			JSONArray jsonArr = (JSONArray) parser.parse(response.toString());
			int i = 1;
			for(Object object:jsonArr) {
				JSONObject obj = (JSONObject) object;
				i++;
				if(i<=7) {
					System.out.println(obj);
				}
			}
		}
	}
	public static JSONObject getCoin(String code) throws IOException, ParseException{
		String detailUrl = "https://api.upbit.com/v1/ticker?markets="+code;
		URL url = new URL(detailUrl);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		int resCode = conn.getResponseCode();
		JSONObject obj = null;
		if(resCode == 200) {
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer res = new StringBuffer();
			while((inputLine = in.readLine()) != null) {
				res.append(inputLine);
			}
			in.close();
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser.parse(res.toString());
			obj = (JSONObject) array.get(0);
		}
		return obj;
	}
		
}

