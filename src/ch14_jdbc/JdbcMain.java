package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ch14_jdbc.jdbc.ConnectionFactory;

public class JdbcMain {
	
	public static void main(String[] args) {
		while (true) {
			System.out.print("학사 정보 시스템입니다");
			Scanner sc = new Scanner(System.in);
			System.out.println("1.조회|2.수정|3.추가(q:종료)");
			String msg = sc.nextLine();
			if(msg.equalsIgnoreCase("q")) {
				System.out.println("학사 정보 시스템 종료");
				break;
			}
			if (msg.equalsIgnoreCase("1")) {
				// 1.조회는 이름을 입력받아서(like 검색) 다 출력
				System.out.print("조회할 이름:");
				String nm = sc.nextLine();
				selectUser(nm);

			}else if (msg.equalsIgnoreCase("2")) {
				//2.수정은 취미를 입력받아서 변경되도록
				System.out.print("수정할 이름:");
				String changeNm = sc.nextLine();
				System.out.print("수정할 취미 내용:");
				String changeHobby = sc.nextLine();
				hobbyChange(changeNm,changeHobby);
			}
			else if (msg.equalsIgnoreCase("3")) {
				//3.추가 후 저장
				System.out.print("학생 번호:");
				String num = sc.nextLine();
				
				System.out.print("pc번호:");
				String pcNum = sc.nextLine();
				System.out.print("이름:");
				String insertName = sc.nextLine();
				System.out.print("영어이름:");
				String enNm = sc.nextLine();
				System.out.print("이메일주소:");
				String email = sc.nextLine();
				insertInfo(num, pcNum, insertName, enNm, email);
			}
			
		}
	}
	
	private static void selectUser(String name) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		ConnectionFactory factory = ConnectionFactory.getInstance();
		try {
			conn = factory.getConnection();
			StringBuffer query = new StringBuffer();
			query.append(" SELECT info_no");
			query.append("      , nm");
			query.append("      , email");
			query.append("      , hobby");
			query.append(" FROM tb_info");
			query.append(" WHERE nm LIKE '%'||?||'%'");
			ps = conn.prepareStatement(query.toString());
			ps.setString(1, name); 
			rs = ps.executeQuery(); 
			while (rs.next()) {
				int no = rs.getInt("info_no");
				String nm = rs.getString("nm");
				String email = rs.getString("email");
				String hobby = rs.getString("hobby");
				System.out.println(no + "|" + nm + "|" + email + "|" + hobby);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {try {rs.close();} catch(SQLException e) {} }
			if(ps != null) {try {ps.close();} catch(SQLException e) {} }
			if(conn != null) {try {conn.close();} catch(SQLException e) {} }
		}
	}
	
	private static void hobbyChange(String name, String hobby) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ConnectionFactory factory = ConnectionFactory.getInstance();
		try {
			conn = factory.getConnection();
			conn.setAutoCommit(false);
			StringBuffer query = new StringBuffer();
			query.append(" UPDATE tb_info");   
			query.append(" SET hobby =? ");   
			query.append(" WHERE nm =? ");   
			ps = conn.prepareStatement(query.toString());
			ps.setString(1, hobby);
			ps.setString(2, name);
			int cnt = ps.executeUpdate();	
			if(cnt > 0) {
				System.out.println("수정완료");
				conn.commit();
			}else {
				System.out.println("대상건이 없음.");
				conn.rollback();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {try {rs.close();} catch(SQLException e) {} }
			if(ps != null) {try {ps.close();} catch(SQLException e) {} }
			if(conn != null) {try {conn.close();} catch(SQLException e) {} }
		}
		
	}
	
	private static void insertInfo(String num, String pcNum, String nm, String enNm, String email) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ConnectionFactory factory = ConnectionFactory.getInstance();
		int number = Integer.parseInt(num);
		int pcNumber = Integer.parseInt(pcNum);
		try {
			conn = factory.getConnection();
			conn.setAutoCommit(false);  
			StringBuffer query = new StringBuffer();
			query.append(" INSERT INTO tb_info (info_no, pc_no, nm, en_nm, email) ");   
			query.append(" VALUES(?, ?, ?, ?, ?)");   
			ps = conn.prepareStatement(query.toString());
			ps.setInt(1, number);
			ps.setInt(2, pcNumber);
			ps.setString(3, nm);
			ps.setString(4, enNm);
			ps.setString(5, email);
			int cnt = ps.executeUpdate();	
			if(cnt > 0) {
				System.out.println("추가 완료");
				conn.commit();
			}else {
				System.out.println("대상건이 없음.");
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {try {rs.close();} catch(SQLException e) {} }
			if(ps != null) {try {ps.close();} catch(SQLException e) {} }
			if(conn != null) {try {conn.close();} catch(SQLException e) {} }
		}
	}
}
