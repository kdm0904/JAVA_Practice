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
			System.out.println("����Ϸ��� ����� ��ȣ�� �Է��Ͻÿ� ");
			System.out.println("");
			System.out.println("1. ȸ�� �߰�");
			System.out.println("2. ȸ�� ����");
			System.out.println("3. ��ǰ �߰�");
			System.out.println("4. ��ǰ ����");
			System.out.println("5. ȸ������ ����");
			System.out.println("6. ��ǰ���� ����");
			
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
		
		System.out.println("ȸ�� �߰� ����");
		user_name = checkString("�̸��� �Է��ϼ���", "<= �̸��� �´ٸ� 1�� �����ּ���");
		user_age = checkInt("���̸� �Է��ϼ���", "<= ���̰� �´ٸ� 1�� �����ּ���");
		user_phone = checkString("��ȣ�� �Է��ϼ���", "<= ��ȣ�� �´ٸ� 1�� �����ּ���");
		
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
				System.out.println("�ٽ� �Է��ϼ���");
				
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
				System.out.println("�ٽ� �Է��ϼ���");
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
