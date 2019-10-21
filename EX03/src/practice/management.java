package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class management {
	Scanner sc = new Scanner(System.in);
	String user_num = "";
	
	public management() {
		
	}
	
	public void start() {
		while(true) {
			System.out.println("사용하려는 기능의 번호를 입력하시오 ");
			System.out.println("");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 삭제");
			System.out.println("3. 물품 추가");
			System.out.println("4. 물품 삭제");
			System.out.println("5. 회원정보 보기");
			System.out.println("6. 물품정보 보기");
			
			String result = sc.next();
			
			switch(result) {
			
			case "1" :
				addCustomer();
			
			case "2" :
				deleteCustomer();
				
			case "3" : 
				addGoods();
			
			case "4" : 
				deleteGoods();
			
			case "5" :
				sortCustomer();
				
			case "6" :
				sortGoods();
			}
		}
	}

	
	

	

	

	public void addCustomer() {
		// TODO Auto-generated method stub
		String user_name;
		int user_age;
		String user_phone;
		
		System.out.println("회원 추가 시작");
		user_name = checkString("이름을 입력하세요", "<= 이름이 맞다면 1을 눌러주세요");
		user_age = checkInt("나이를 입력하세요", "<= 나이가 맞다면 1을 눌러주세요");
		user_phone = checkString("번호를 입력하세요", "<= 번호가 맞다면 1을 눌러주세요");
		
		Random random = new Random();
		
		int count = 0;
		while(true) {
			if(count<6) {
				user_num += random.nextInt(9);
			} else {
				
			}
		}
		
	}
	
	

	public String checkString(String a, String b) {
		String answer = "";
		while(true) {
			System.out.println(a);
			answer = sc.next();
			System.out.println(answer + b);
			if(sc.next().equals("1")) {
				break;
			} else {
				System.out.println("다시 입력하세요");
				
			}
		}
		return answer;
	}
	
	public int checkInt(String string, String string2) {
		int answer = 0;
		while(true) {
			System.out.println(string);
			answer = sc.nextInt();
			System.out.println(answer+string2);
			if(sc.next().equals("1")) 
				break;
			else {
				System.out.println("다시 입력하세요");
			}	
		}
		return answer;
	}

	public void deleteCustomer() {
		// TODO Auto-generated method stub
		
	}
	
	public void addGoods() {
		// TODO Auto-generated method stub
		
	}
	
	public void deleteGoods() {
		// TODO Auto-generated method stub
		
	}
	
	public void sortCustomer() {
		// TODO Auto-generated method stub
		
	}
	
	public void sortGoods() {
		// TODO Auto-generated method stub
		
	}

}
