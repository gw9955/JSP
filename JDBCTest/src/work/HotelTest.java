package work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import kr.or.ddit.util.JDBCUtil;

public class HotelTest {
	private Scanner scan;
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public HotelTest() {
		scan = new Scanner(System.in);
	}

	// 메뉴를 출력하는 메서드
	public void displayMenu() {
		System.out.println();
		System.out.println("어떤 업무를 하시겠습니까?");
		System.out.println("1.체크인 2.체크아웃 3.객실상태 4.업무종료");
		System.out.print("메뉴 선택=>  ");
	}

	// 프로그램을 시작하는 메서드
	public void hotelStart() {
		System.out.println("**************************");
		System.out.println("호텔 문을 열었습니다.");
		System.out.println("**************************");

		while (true) {
			displayMenu();

			int menuNum = scan.nextInt();
			scan.nextLine();

			switch (menuNum) {
			case 1:
				checkIn();
				break;
			case 2:
				checkOut();
				break;
			case 3:
				rs();
				break;
			case 4:
				System.out.println("호텔문을 닫았습니다..");
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시입력하세요");
			}
		}
	}

	private void rs() {
		System.out.println("====전체회원 목록====");
		
		try {
			conn = JDBCUtil.getConnection();

			String sql = "select * from hotel";

			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String roomNum = rs.getString("room_num");
				String name = rs.getString("guest_name");

				System.out.println(roomNum + "\t" + name);
			}

			System.out.println();
		} catch (SQLException e) {
//			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, pstmt, rs);
		}
	}

	private void checkOut() {
		System.out.println();
		System.out.println("어느방을 체크아웃 하시겠습니까?");
		System.out.print("방번호 입력=> ");
		String roomNum = scan.nextLine();

		try {
			conn = JDBCUtil.getConnection();
			
			String sql = "delete from hotel where room_num = ? ";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, roomNum);
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, pstmt, rs);
		}
	}

	private void checkIn() {
		
		boolean chk = false;
		String roomNum = "";
		do {
			System.out.println();
			System.out.println("어느방에 체크인 하시겠습니까?");
			System.out.print("방번호 입력 => ");
			roomNum = scan.next();
			
			chk = checkRoom(roomNum);
			
			if(chk == true) {
				System.out.println(roomNum + " 방은 이미 체크인 되어있습니다");
				System.out.println("다시 입력해주세요");
			}
			
		} while(chk == true);

		System.out.println();
		System.out.println("누구를 체크인 하시겠습니까?");
		System.out.print("이름 입력=> ");
		String name = scan.next();
		
		scan.nextLine();

		try {
			conn = JDBCUtil.getConnection();

			String sql = "insert into hotel values(?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, roomNum);
			pstmt.setString(2, name);
			int chk2 = pstmt.executeUpdate();
			
			if(chk2 > 0) {
				System.out.println(roomNum + "번방 체크인 성공!");
			} else {
				System.out.println(roomNum + "번방 체크인 실패!");
			}

		} catch (SQLException e) {
//			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, pstmt, rs);
		}
	}
	private boolean checkRoom(String roomNum) {
		boolean chk = false;
		try {
			conn = JDBCUtil.getConnection();
			String sql = "";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, roomNum);
			
			rs = pstmt.executeQuery();
			
			int cnt = 0;
			if(rs.next()) {
				cnt = rs.getInt("cnt");
			}
			if(cnt > 0) {
				chk = true;
			}
			
		} catch(SQLException e) {
//			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, stmt, pstmt, rs);
		}
		return chk;
	}
	public static void main(String[] args) {
		new HotelTest().hotelStart();
	}
}