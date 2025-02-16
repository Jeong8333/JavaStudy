package ch09_class.myquiz;

import java.util.ArrayList;

public class MyQuizDB {
	
	private ArrayList<MyQuiz> quizList = new ArrayList<>();
	
	private MyQuizDB() {
		quizList.add(new MyQuiz("쿠리만쥬","Q.내가 요즘 가장 좋아하는 캐릭터는?","밤","치이카와","ㅋㄹㅁㅈ"));
		quizList.add(new MyQuiz("꿈꾼","Q.나의 외출 준비 노래는?","데이식스 멤버","영케이 솔로곡","ㄲㄲ"));
		quizList.add(new MyQuiz("급류","Q.내가 현재 읽고 있는 책은?","두글자","정대건","ㄱㄹ"));
		quizList.add(new MyQuiz("초록색","Q.내가 좋아하는 색깔은?","숲","그린","ㅊㄹㅅ"));
		quizList.add(new MyQuiz("도시락","Q.학원 가기 전 내가 꼭 챙기는 것은?","소풍","점심","ㄷㅅㄹ"));
		quizList.add(new MyQuiz("미정","Q.내 블로그의 이름은?","정하지 않음","이름","ㅁㅈ"));
		quizList.add(new MyQuiz("소슬","Q.나의 최애 카페는?","혼카페","대흥동","ㅅㅅ"));
	}
	
	private static MyQuizDB instance = new MyQuizDB(); 
	
	public static MyQuizDB getInstance() {
		return instance;
	}
	public ArrayList<MyQuiz> getMyQuizList(){
		return quizList;
	}
}
