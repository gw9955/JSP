package work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Hotel {
	private Scanner scan;
	private Map<String, HotelVO> hotelMap;

	public Hotel() {
		scan = new Scanner(System.in);
		hotelMap = new HashMap<String, HotelVO>();
	}

	public void hotellobby() {
		System.out.println();
		System.out.println("**************************");
		System.out.println("어떤 업무를 하시겠습니까?");
		System.out.println("1.체크인  2.체크아웃 3.객실상태 4.업무종료");
		System.out.println("**************************");
		System.out.print(" 번호입력 >> ");
	}

	public void hotelStart() {
		System.out.println("**************************");
		System.out.println("호텔 문을 열었습니다.");
		System.out.println("**************************");

		while (true) {

			hotellobby(); // 메뉴 출력

			int menuNum = scan.nextInt();

			switch (menuNum) {
			case 1:
				checkin();
				break;
			case 2:
				checkout();
				break;
			case 3:
				checkinAll();
				break;
			case 0:
				System.out.println("영업종료입니다.");
				return;
			default:
				System.out.println("잘못들었습니다?");
			}
		}
	}

	private void checkout() {
		System.out.println();
		System.out.println("어느방을 체크아웃 하시겠습니까?");
		System.out.print("방번호 입력 => ");
		String rmNum = scan.next();

		if (hotelMap.remove(rmNum) == null) {
			System.out.println(rmNum + "투숙중인 사람이 없습니다.");
		} else {
			System.out.println(rmNum + "체크아웃 되었습니다.");
		}
	}

	private void checkinAll() {
		Set<String> keySet = hotelMap.keySet();
		System.out.println("==========================");
		System.out.println(" 	방번호\t이름");
		System.out.println("==========================");

		if (keySet.size() == 0) {
			System.out.println("등록된 투숙객 정보가 없습니다.");
		} else {
			Iterator<String> it = keySet.iterator();
			int cnt = 0;
			while (it.hasNext()) {
				cnt++;
				String rmNum = it.next(); // 키값 가져오기
				HotelVO h = hotelMap.get(rmNum);
				System.out.println(" " + cnt + "\t" + h.getRmNum() + "\t" + h.getName() + "\t");
			}
		}
		System.out.println("==========================");
		System.out.println("출력 완료.");
	}

	private void checkin() {
		System.out.println();
		System.out.println("어느방에 체크인 하시겠습니까?");
		System.out.print("방번호 입력 => ");
		String rmNum = scan.next();

		if (hotelMap.get(rmNum) != null) {
			System.out.println(rmNum + "번방에는 이미 사람이 있습니다.");
			return;
		}

		System.out.print("이름 입력 => ");
		String name = scan.next();
		hotelMap.put(rmNum, new HotelVO(rmNum, name));
		System.out.println(rmNum + "체크인 되었습니다.");
	}

	public static void main(String[] args) {
		new Hotel().hotelStart();
	}

}

class HotelVO {
	private String rmNum;
	private String name;

	public HotelVO(String rmNum, String name) {
		super();
		this.rmNum = rmNum;
		this.name = name;
	}

	public String getRmNum() {
		return rmNum;
	}

	public void setRmNum(String rmNum) {
		this.rmNum = rmNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HotelVO [rmNum=" + rmNum + ", name=" + name + "]";
	}

}