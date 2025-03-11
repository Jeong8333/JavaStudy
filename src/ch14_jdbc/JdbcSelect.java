package ch14_jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelect {
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
			System.out.println("auto 커밋 상태:"+conn.getAutoCommit());
			conn.setAutoCommit(false);  // 비활성 그럼 수동으로 commit 해야함.
			StringBuffer query = new StringBuffer();
			query.append(" UPDATE tb_info");   
			query.append(" SET hobby =? ");   
			query.append(" WHERE nm =? ");   
			ps = conn.prepareStatement(query.toString());
			ps.setString(1, "영화보기");
			ps.setString(2, "신미정");
			int cnt = ps.executeUpdate();	
			if(cnt > 0) {
				System.out.println(cnt + "건 수정됨.");
				conn.commit();
			}else {
				System.out.println("대상건이 없음.");
				conn.rollback();
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
