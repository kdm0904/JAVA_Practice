package pos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MarkmanagementProgram {
	Scanner scan;//���� �Է��ϴ� ��.
	DBconnector dbconnecter;//DBconnector class�� ���.
	String user_num = "";//�� ��ȣ

	
	public MarkmanagementProgram() {
		scan = new Scanner(System.in);//���� �Է��ϴ� ��ü ����
	}

	public void go() {//DBconnector class ����.
		System.out.println("���� ���α׷��� �����մϴ�.");
		dbconnecter = new DBconnector();//��ü ����
		start();//start �޼ҵ� ����
	}
   //�޴� �޼ҵ�
	public void start() {
		while (true) {
			System.out.println("����Ͻ÷��� ����� ������ �ּ���");

			System.out.println("\t 1. ȸ�� �߰�");
			System.out.println("\t 2. ���� ����");
			System.out.println("\t 3. ���� �� ��ȸ");
			System.out.println("\t 4. ��ǰ �߰�");
			System.out.println("\t 5. ��ǰ ����");
			System.out.println("\t 6. ����");

			String result = scan.next();//6���� ��� �� 1�� �Է�

			switch (result) {
			case "1"://ȸ�� �߰�
				addCustomer();//�޼ҵ� �̵�
				break;
			case "2"://���� ����
				buyProduct();
				break;
			case "3"://���� �� ��ȸ
				checkSystem();
				break;
			case "4"://��ǰ �߰�
				addProduct();
				break;
			case "5"://��ǰ ����
				delProduct();
				break;
			case "6"://����
				System.out.println("�ý����� �����մϴ�.");
				break;
			default:
				System.out.println("�Է��� �߸� �Ǿ����ϴ�.");
				break;
			}
			if (result.equals("6"))
				break;
		}
	}

	//��ǰ ���� �޼ҵ�
	public void delProduct() {
		String product_name;//��ǰ��
		product_name = checkAnswerString("�����Ϸ��� �׸��� �̸��� ���� �ּ���.",
				" <= �����ø� 1�� �Է��� �ּ���.");

		dbconnecter.delProduct(product_name);//dbconnector Ŭ������ ���Ͽ� ��ǰ���� �޼ҵ� ����
	}

	//��ǰ �߰� �޼ҵ�
	public void addProduct() {
		String product_name;//��ǰ �̸�
		int product_unit_cost;//�ܰ�
		int product_prime_cost;//����
		String product_maker;//������
		product_name = checkAnswerString("�߰��Ϸ��� �׸��� �̸��� ���� �ּ���.",
				" <= �����ø� 1�� �Է��� �ּ���.");
		product_unit_cost = checkAnswerInt("�߰��Ϸ��� �׸��� �ܰ��� ���� �ּ���.",
				" <= �����ø� 1�� �Է��� �ּ���.");
		product_prime_cost = checkAnswerInt("�߰��Ϸ��� �׸��� ������ ���� �ּ���.",
				" <= �����ø� 1�� �Է��� �ּ���.");
		product_maker = checkAnswerString("�߰��Ϸ��� �׸��� �����縦 ���� �ּ���.",
				" <= �����ø� 1�� �Է��� �ּ���.");

		dbconnecter.addProduct(product_name,product_maker, product_prime_cost,product_unit_cost
				);//����
	}

	public void checkSystem() {
		System.out.println("���� �� ��ȸ�� �����մϴ�.");
		System.out.println("\t 1. �� ���� ��Ȳ.");
		System.out.println("\t 2. �� ���� ��Ȳ.");
		System.out.println("\t 3. �԰� ǰ�� ���.");
		System.out.println("\t 4. �� �� ���� ����.");
		System.out.println("\t 5. ǰ�� �� ���� ����.");
		System.out.println("\t 6. �� ��� ���.");
		System.out.println("\t 7. ����.");

		String result = scan.next();

		switch (result) {
		case "1":
			dbconnecter.dayCheck();
			break;
		case "2":
			dbconnecter.monthCheck();
			break;
		case "3":
			dbconnecter.inputCheck();
			break;
		case "4":
			String phonenumber = checkAnswerString(
					"��ȸ�� ���Ͻô� ȸ���� ��ȭ��ȣ�� �Է��� �ֽʽÿ�.", " <= �����ø� 1�� �Է��� �ּ���.");
			dbconnecter.PrivateCheck(phonenumber);
			break;
		case "5":
			dbconnecter.checkProduct();

			String productnumber = checkAnswerString("��ȸ�� ���Ͻô� ǰ���� ���ÿ�.",
					" <= �����ø� 1�� �Է��� �ּ���.");
			dbconnecter.Productcheck(productnumber);
			break;
		case "6":
			dbconnecter.CustomerCheck();
			break;

		default:
			break;
		}
	}

	//�� ��� �޼ҵ�
		public void addCustomer() {
			
			String user_name; // �� �̸�
			int user_age; //�� ����
			String user_phone; //�� ��ȭ��ȣ

			System.out.println("���ݺ��� ȸ�� �߰��� �����ϰڽ��ϴ�.");
			user_name = checkAnswerString("������ �̸��� �Է��Ͽ� �ֽʽÿ�.",
					" <= ������ �̸��� �����ø� 1�� �Է��� �ּ���.");// �� �̸��� Ȯ��
			user_age = checkAnswerInt("������ ���̸� �Է��Ͽ� �ֽʽÿ�.",
					" <= ������ ���̰� �����ø� 1�� �Է��� �ּ���.");//�� ���̸� Ȯ��
			user_phone = checkAnswerString("������ ��ȭ��ȣ�� �Է��Ͽ� �ֽʽÿ�.",
					" <= ������ �̸��� �����ø� 1�� �Է��� �ּ���.");//�� ��ȭ��ȣ�� Ȯ��

			Random rand = new Random();//���� ��ü ����
			int count = 0;//�ڸ��� �ʱ�ȭ(����ȣ�� 6�ڸ�)
			while (true) {
				if (count < 6) { // ����ȣ �ڸ����� 6���� ���� ��
					user_num += rand.nextInt(9);//0���� 9���� ���� �߿� �ƹ��ų� �̾Ƽ� ����ȣ�� �����.  
				} else {
					if (dbconnecter.checkCustomernum(user_num))//����ȣ�� �̹� �ִٸ� ��.
						break;
				}
				count++;//�ڸ����� 1�� ����	
			}
			System.out.println("����� ȸ����ȣ�� " + user_num + " �Դϴ�.");//���
			dbconnecter.addCustomer(user_num, user_name, user_age, user_phone);//�� ����.
			System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�.");
		}

		//���� ���� �޼ҵ�
		public void buyProduct() {
			System.out.println("���ݺ��� ��ǰ ���Ÿ� �����ϰڽ��ϴ�.");
			ArrayList<Integer> prod_num_list = new ArrayList<Integer>();//int���� arraylist ����(��ǰ ��ȣ)
			ArrayList<Integer> prod_count_list = new ArrayList<Integer>();//��ǰ ����

			while (true) {//���ѷ���(break �ɶ����� �ݺ�)
				dbconnecter.checkProduct();// ��ǰ ��� ���
				prod_num_list.add(checkAnswerInt("���Ͻô� �׸��� ��ȣ�� ������ �ּ���.",
						" <= �����ø� 1�� �Է��� �ּ���."));//�����Ϸ��� ��ǰ�� ��ȣ�� ��ǰ ��ȣ list�� ����
				prod_count_list.add(checkAnswerInt("������ ������ �ּ���.",
						" <= �����ø� 1�� �Է��� �ּ���."));//�����Ϸ��� ��ǰ�� ������ ��ǰ ���� list�� ����

				System.out.println("���Ÿ� �����Ͻ÷��� 1�� �Է��� �ֽð� �߰��� ���Ÿ� ���Ͻø� �ƹ�Ű�� �Է��� �ּ���.");
				if (scan.next().equals("1"))//1������ ���� �޼ҵ忡�� ����.
					break;
			}
			System.out.println("�� " + prod_count_list.size() + "���� �����ϼ̽��ϴ�.");// ��ǰ ���� list�� ������ ���� ������ ���.


		System.out.println("���� ����� ������ �ֽʽÿ�.");
		System.out.println("\t1. ����");
		System.out.println("\t2. �ſ�ī��");
		System.out.println("\t3. ��ī��");
		System.out.println("\t4. ����");

		String result = scan.next();//���� ���� ��� �޴��߿� ���� �Է�
		System.out.println(result + " <= �����ø� 1�� �Է����ּ���.");
		if (!scan.next().equals("1"))
			result = "no";

		switch (result) {
		case "1"://1. ����
			System.out.println("������ �����ϼ̽��ϴ�.");
			calcCost(result, prod_num_list, prod_count_list);//�񿬵� ���� �Լ��� ����
			break;
		case "2"://2.�ſ�ī��
			System.out.println("�ſ�ī�带 �����ϼ̽��ϴ�.");
			calcCost(result, prod_num_list, prod_count_list);//�񿬵� ���� �Լ��� ����
			break;
		case "3"://3.��ī��
			System.out.println("��ī�带 �����ϼ̽��ϴ�.");//�� �뵵�� ���� �Լ��� ����
			String result2 = "";
			int point = 0;
			while (true) {
				System.out.println("ȸ������ ��ȭ��ȣ�� �Է��� �ֽʽÿ�.(�����Ͻ÷��� 1�� �Է����ּ���.)");
				result2 = scan.next();
				if (dbconnecter.checkCustomer(result2))// ȸ�������� ��ϵǾ� ������
					break;//����
				else if (result2.equals("1"))//����
					break;//����
				else//��ȣ Ʋ����
					System.out.println("��ȣ�� �������� �ʽ��ϴ�.");
			}
			System.out.println(dbconnecter.checkPoint(result2)
					+ "���� ����Ʈ�� �ֽ��ϴ�.");//���� ����Ʈ ���� ���
			System.out.println("����Ͻ÷��� 1�� �Է��ϰ� ������� �����ø� �ƹ� ���ڳ� �Է����ּ���.");
			String result1 = scan.next();
			if (result1.equals("1"))
				point = dbconnecter.checkPoint(result2);//����Ʈ ���
			
			if (!result2.equals("1"))
				calcCost(result, prod_num_list, prod_count_list, result2, point);//�׳� �������� ���
			break;

		default:
			System.out.println("�߸��� �Է°��Դϴ�.");
			break;

		}
	}

	//���Ͽ� ����� �Է��ϴ� �޼ҵ�(����,�ſ�ī��-��ȸ�� �뵵)
	public void calcCost(String method, ArrayList<Integer> Prod_num,
			ArrayList<Integer> Prod_count) {//���� ����, ��ǰ ��ȣ,��ǰ ������ ������ ���
		
		int result_money = dbconnecter.checkCost(Prod_num, Prod_count);//������ �Ѿ��� ������ ����
		System.out.println("�� �ݾ� = >" + result_money);//�ѱݾ� ���
		
		if (method.equals("2"))//�ſ�ī�带 �����ϸ�
			result_money += result_money * 0.07;//������ 7%

		System.out.println(result_money + " �� ������ �Ϸ� �Ǿ����ϴ�.");//����, �ſ�ī��, ��ī�� ���� ���� ���
		dbconnecter.saveresult(Prod_num, Prod_count, "CUS", "11",result_money);//��ǰ ��ȣ,��ǰ ����,����,��ȸ�� ��ȭ��ȣ
	}

	//���Ͽ� ����� �Է��ϴ� �޼ҵ�(��ī���� ����Ʈ,���� orī�� ���-�� �뵵)
	public void calcCost(String method, ArrayList<Integer> Prod_num,
			ArrayList<Integer> Prod_count, String phonenumber, int point) {//���� ����, ��ǰ ��ȣ, ��ǰ ����,��ȭ��ȣ,����Ʈ�� ���
		int result_money = dbconnecter.checkCost(Prod_num, Prod_count) - point;//������ �ݾ��� �� ��뿡�� ����Ʈ ���� ���� �� ���̴�.

		if (point > 0)//����Ʈ�� 0���� ũ��
			dbconnecter.clearPoint(phonenumber);//�Էµ� ��ȭ��ȣ�� �´� ���� ����Ʈ ��� �� �ʱ�ȭ Ŭ������ �̵�
		else
			dbconnecter.addPoint(checkBonus(result_money), phonenumber);//����Ʈ �߰��ϱ�

		System.out.println(result_money + " �� ������ �Ϸ� �Ǿ����ϴ�.");//�������� ������.
		dbconnecter.saveresult(Prod_num, Prod_count, "CUS", phonenumber,result_money);//ȸ�� ��ȭ��ȣ�� ���� ��� ����
	}

	//�Ǹ� �ݾ��� ���� ��� �޼ҵ�
	public int checkBonus(int result_money) {
		if (result_money < 10000)//���� �̸�
			return (int) (result_money * 0.001);
		if (result_money >= 10000 && result_money < 50000)//���� �̻� ������ �̸�
			return (int) (result_money * 0.005);
		if (result_money >= 50000 && result_money < 100000)//������ �̻� �ʸ��� �̸�
			return (int) (result_money * 0.008);
		else//�ʸ��� �̻�
			return (int) (result_money * 0.01);
	}

	//String ���·� �Է��� ���� �´��� Ȯ���ϴ� �޼ҵ�
	public String checkAnswerString(String a, String b) {
		String answer = "";//string ������ �ʱ�ȭ
		while (true) {
			System.out.println(a);
			answer = scan.next();
			System.out.println(answer + b);
			if (scan.next().equals("1"))//�Է��� ���� 1���̸� �޼ҵ� ����.
				break;
		}
		return answer;//1�� �ƴϸ� �Է��� ���� ȣ��
	}

	//Int ���·� �Է��� ���� �´��� Ȯ���ϴ� �޼ҵ�
	public int checkAnswerInt(String a, String b) {
		int answer = 0;//int ������ �ʱ�ȭ
		while (true) {
			System.out.println(a);
			answer = scan.nextInt();
			System.out.println(answer + b);
			if (scan.next().equals("1"))
				break;
		}
		return answer;
	}
}
