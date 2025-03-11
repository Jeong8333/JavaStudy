package ch14_jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * class Name   : JdbcSelect
 * Author       : MiJeong
 * Created Date : 2025. 3. 11.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : JDBC 사용 
 */

public class JdbcUpdate {
	public static void main(String[] args) {
		//db연결 객체
		Connection conn = null;
		//SQL 명령
		PreparedStatement ps = null;
		//쿼리 결과
		ResultSet rs = null;
		//1.드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("실패");
			e.printStackTrace();
			System.exit(0);  //프로그램 종료
		}
		//2.db연결
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";   //127.0.0.1 = localhost
		String db_id = "java";
		String db_pw = "oracle";
		
		try {
			conn = DriverManager.getConnection(url,db_id,db_pw);
			System.out.println("접속 성공");
			
			StringBuffer query = new StringBuffer();
			query.append(" SELECT info_no");   // 띄어 쓰기! 띄어 쓰지 않으면 다음줄이 바로 연결되는 것으로 인식함
			query.append("      , nm");
			query.append("      , email");
			query.append("      , hobby");
			query.append(" FROM tb_info");
			query.append(" WHERE nm LIKE ?||'%'");   // 동적 맵핑
			ps = conn.prepareStatement(query.toString());
			ps.setString(1, "이");   // 물음표에 대한 값 할당 
//			ps.setString(2, "김");	//(WHERE 절에 AND로 ?구문이 더 있다면 순서대로 할당)
			rs = ps.executeQuery();	// 쿼리문 실행!
			
			// 조회결과만큼 반복	
			while(rs.next()) {
				int no = rs.getInt("info_no");
				String nm = rs.getString("nm");
				String email = rs.getString("email");
				String hobby = rs.getString("hobby");
				System.out.println(no+"|"+nm+"|"+email+"|"+hobby);
			}
 			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("접속 종료");
			if(rs != null) {try {rs.close();} catch(SQLException e) {} }
			if(ps != null) {try {ps.close();} catch(SQLException e) {} }
			if(conn != null) {try {conn.close();} catch(SQLException e) {} }
		}
	}

}
