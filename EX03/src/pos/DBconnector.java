package pos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DBconnector {
	String url;
	BufferedWriter bw;//����
	BufferedReader br;//�б�
	String urlhuman, urlgood, urlmonth;//������,��ǰ����,�ǸŰ���

	//txt ���Ϸ� ����
	public DBconnector() {
		urlhuman = "humanpage.txt";
		urlgood = "goods.txt";
		urlmonth = "month.txt";
	}

	//1.�� ��� ������ ���Ͽ� �����ϴ� �޼ҵ�
	public boolean addCustomer(String customer_num, String customer_name,
			int customer_age, String customer_phone) {//����ȣ, �̸�, ����, ��ȭ��ȣ
		try {
			bw = new BufferedWriter(new FileWriter(urlhuman, true));//������ ���Ͽ� ����. true�̸� �ִ� ���� �ڿ� ÷���ϴ� ��.
			String localtype = customer_num + "\t" + customer_name + "\t" //����� �� ��� ���ڿ� ����(tab���� ����)
					+ customer_age + "\t" + customer_phone + "\t0\t0";
			System.out.println(localtype);//Ȯ��
			bw.write(localtype.toString());//�� ��� ��
			bw.newLine();//�� �� ����
			bw.flush(); //��� ������ ��¼ҽ��� ����� ��, ���۸� ����.
			bw.close();//���۸� ����.
		} catch (IOException e) {//����ó��
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		System.out.println(customer_num + "/" + customer_name + "/"
				+ customer_age + "/" + customer_phone + "/ �Է¿Ϸ�.");//���
		return true;
	}
    //���Ͽ��� �� ��ȣ�� üũ�ϴ� �޼ҵ�
	public boolean checkCustomernum(String customer_num) {
		ArrayList<String> line = new ArrayList<String>();//string ��� arraylist ��ü ����

		try {
			br = new BufferedReader(new FileReader(urlhuman));//�� ���� ���� �б�
			while (true) {
				String lines = br.readLine();//���پ� �б�
				if (lines == null) {//������ ��
					break;
				} else//������
					line.add(lines.split("\t")[0]);//����ȣ�� arraylist�� ����
			}
			br.close();//���� �ݱ�
		} catch (Exception e) {//����ó��
			// TODO Auto-generated catch bloc
			e.printStackTrace();
			return false;
		}
		System.out.println(customer_num + "/ üũ�Ϸ�");//�� ��ȣ üũ ���
		if (line.contains(customer_num))//arraylist�� �� ��ȣ�� ��� ������
			return false; //false
		else//������
			return true;//true
	}

	//���Ͽ��� ��ǰ�� Ȯ���ϴ� �޼ҵ�
	public void checkProduct() {
		try {
			br = new BufferedReader(new FileReader(urlgood));//��ǰ ���� �б�
			int count = 0;//���� �ʱ�ȭ
			while (true) {
				String lines = br.readLine();//���� ���پ� �о
				if (lines == null) {//���� ������
					break;//����
				} else//���� ������
					System.out.println(count + "\t" + lines.split("\t")[0]
							+ "\t" + lines.split("\t")[1] + "\t"
							+ lines.split("\t")[3]);//��ǰ��ȣ,��ǰ�̸�,������,���� ���
				count++;//��ǰ ��ȣ�� 1�� ����
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��� ���");
	}

	public boolean checkCustomer(String phonenumer) {
		ArrayList<String> line = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(urlhuman));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else
					line.add(lines.split("\t")[3]);
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
			return false;
		}
		System.out.println(phonenumer + "/ üũ�Ϸ�");
		if (line.contains(phonenumer))
			return true;
		else
			return false;
	}

	//�� ���� ����� Ȯ���ϴ�  �޼ҵ�
	public int checkCost(ArrayList<Integer> Prod_num,
			ArrayList<Integer> Prod_count) {//��ǰ ��ȣ,��ǰ ������ �̿��ؼ� ����� Ȯ�� 

		ArrayList<String> line = new ArrayList<String>();//string ������� arraylist ����
		int finalcost = 0; // ���� ���(��� ������ ������ ��, �հ�)
		try {
			br = new BufferedReader(new FileReader(urlgood));//��ǰ ����� �о��.
			while (true) {
				String lines = br.readLine();//�� �ٷ� �б�
				if (lines == null) {// ������ ������ ����
					break;
				} else//������ ������ 
					line.add(lines.split("\t")[3]);//����� list�� ����
			}
			br.close();
		} catch (Exception e) {//����ó��
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		for (int i = 0; i < Prod_count.size(); i++) {//��ǰ ������ size��ŭ
			finalcost += Integer.parseInt(line.get(Prod_num.get(i)))//�����Ϸ��� ��ǰ ����� ����(�����̹Ƿ� string->int ��ȯ �ʿ�)
					* Prod_count.get(i);//��ǰ�� ����
			//�����Ϸ��� ��ǰ�� ����*������ �����Ͽ� �� �ݾ��� ����.
		}

		System.out.println(Prod_num.size() + "��/ �� �ݾ� ���Ϸ� =" + finalcost);// ���Թ�ǰ�� ����, �� �ݾ� ���
		return finalcost; //�ѱݾ� ȣ��
	}

	public int checkPoint(String phonenumber) {
		String point = "";

		try {
			br = new BufferedReader(new FileReader(urlhuman));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (lines.split("\t")[3].equals(phonenumber))
					point = lines.split("\t")[5];
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		System.out.println(phonenumber + "/ ����Ʈ ��� �Ϸ�");
		return Integer.parseInt(point);
	}

	//����Ʈ �ʱ�ȭ �޼ҵ�
	public void clearPoint(String phonenumber) {
		ArrayList<String[]> localist = new ArrayList<String[]>();//string[] arraylist ����

		try {
			br = new BufferedReader(new FileReader(urlhuman));//������ ���� ����.
			while (true) {
				String lines = br.readLine();//���پ� �б�
				if (lines == null) {
					break;
				} else//���� ������  
					localist.add(lines.split("\t"));//��ü ������ ����Ʈ�� ����
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		for (int i = 0; i < localist.size(); i++) {//�� ���� ���Ͽ���
			if (localist.get(i)[3].equals(phonenumber))//��ȭ��ȣ�� ������
			{
				localist.get(i)[5] = "0";//����Ʈ�� 0
				//localist.get(i)[4] = calcCost.result_money;//���� �ݾ�(����Ʈ ��� �� ���� �ݾ�)
			
			}
		}

		try {
			bw = new BufferedWriter(new FileWriter(urlhuman));//�������� ��
			for (int i = 0; i < localist.size(); i++) {//���������Ͽ���
				String localtype = localist.get(i)[0] + "\t"
						+ localist.get(i)[1] + "\t" + localist.get(i)[2] + "\t"
						+ localist.get(i)[3] + "\t" + localist.get(i)[4] + "\t"
						+ localist.get(i)[5];//���Ӱ� ���ǵ� �� ������ �Է�(����ȣ, ���̸�, ������,������ȣ,���ݾ�,������Ʈ)
				System.out.println(localtype);
				bw.write(localtype.toString());//���Ͽ� ����
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(phonenumber + "/ ����Ʈ �ʱ�ȭ");//����Ʈ �ʱ�ȭ
	}

	//����Ʈ�� �����ϴ� �޼ҵ�
	public void addPoint(int point, String phonenumber) {//����Ʈ�� ��ȭ��ȣ�� ������  ����Ʈ ����
		ArrayList<String[]> localist = new ArrayList<String[]>();//list

		try {
			br = new BufferedReader(new FileReader(urlhuman));//������
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else
					localist.add(lines.split("\t"));//��ü ����
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		for (int i = 0; i < localist.size(); i++) {//�� ���� �� �߿���
			if (localist.get(i)[3].equals(phonenumber)) {//��ȭ��ȣ�� ������
				int local = Integer.parseInt(localist.get(i)[5]);//list�� ����� ����Ʈ ��
				localist.get(i)[5] = String.valueOf(local + point);//list�� ����� ����Ʈ ���� ���ο� ����Ʈ�� ���� �ٽ� ����Ʈ�� ����
				
			}
		}

		try {
			bw = new BufferedWriter(new FileWriter(urlhuman));//������ ����
			for (int i = 0; i < localist.size(); i++) {//������ ��ü��
				String localtype = localist.get(i)[0] + "\t"
						+ localist.get(i)[1] + "\t" + localist.get(i)[2] + "\t"
						+ localist.get(i)[3] + "\t" + localist.get(i)[4] + "\t"
						+ localist.get(i)[5];//���Ӱ� ����� ������ ����
				System.out.println(localtype);
				bw.write(localtype.toString());//����
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("����Ʈ �߰�");
	}

	//����-�԰� ���� ���� �޼ҵ�
	public void saveresult(ArrayList<Integer> Prod_num,
			ArrayList<Integer> Prod_count, String CUS_PRO, String phonenumber, int result_money) {//��ǰ ��ȣ,��ǰ ����,�������� �԰����� ����,��ȭ��ȣ�� �̿��ؼ� ��ȸ�� ���� ���� ����
		Calendar cal = Calendar.getInstance();//��¥ �Լ�
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//��,��,��,��,��,�ʱ��� ��µǴ� ����

		ArrayList<String> prod_name = new ArrayList<String>();//��ǰ �̸� ����Ʈ
		ArrayList<String> unitcost = new ArrayList<String>();//�ܰ� ����Ʈ
		ArrayList<String> line = new ArrayList<String>();//��ǰ ��� ����Ʈ
		ArrayList<Integer> primecost = new ArrayList<Integer>();//���� ����Ʈ	
		
		ArrayList<String> userline = new ArrayList<String>();//����� ������ ���� ����Ʈ

		try {
			br = new BufferedReader(new FileReader(urlgood));//���� �б�
			int count = 0;
			while (true) {
				String lines = br.readLine();//���پ� �б�
				if (lines == null) {
					break;
				} else {//���� ������
					prod_name.add(lines.split("\t")[0]);//��ü ��ǰ �̸� ����
					unitcost.add(lines.split("\t")[3]);//��ü �ܰ� ����
					primecost.add(Integer.parseInt(lines.split("\t")[2]));//��ü ���� ����
				}
				line.add(lines);//��ü ������ line list�� ����.
				
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		for (int i = 0; i < Prod_num.size(); i++) {//��ǰ ��ȣ list ũ�⸸ŭ
			
			if ((Integer.parseInt(line.get(Prod_num.get(i)).split("\t")[4]) - Prod_count
					.get(i)) < 5)//(��ǰ ����� ���-���ŵ� ��ǰ ����)�� ���� 5���� ���� ������
			{
				
				orderProduct(prod_name.get(i), primecost.get(i));//��ǰ �԰�
				/*
				line.get(Prod_num.get(i)).split("\t")[4] = String.valueOf(Integer
						.parseInt(line.get(Prod_num.get(i)).split("\t")[4])
						+50);//�԰� �� ��ǰ�� ���� string���� ��ǰ ��ȣ ����Ʈ�� ���� ��, line ����Ʈ�� ���� 
*/
			String local1 = String.valueOf(Integer
					.parseInt(line.get(Prod_num.get(i)).split("\t")[4])
					+ 50);//���� ��� ��-��ǰ ���� = string ���·� ����ȯ


			line.set(Prod_num.get(i), line.get(Prod_num.get(i)).split("\t")[0] +"\t"+line.get(Prod_num.get(i)).split("\t")[1] 
					+"\t"+line.get(Prod_num.get(i)).split("\t")[2] +"\t"+line.get(Prod_num.get(i)).split("\t")[3] +"\t"+ local1);



			}
			String local = String.valueOf(Integer
					.parseInt(line.get(Prod_num.get(i)).split("\t")[4])
					- Prod_count.get(i));//���� ��� ��-��ǰ ���� = string ���·� ����ȯ
			
			line.set(Prod_num.get(i), line.get(Prod_num.get(i)).split("\t")[0] +"\t"+line.get(Prod_num.get(i)).split("\t")[1] 
					+"\t"+line.get(Prod_num.get(i)).split("\t")[2] +"\t"+line.get(Prod_num.get(i)).split("\t")[3] +"\t"+ local);
			//��ǰ ��ȣ ����Ʈ�� ��� ������ ���� ��{��ǰ ��ȣ , ��ǰ �̸�, ��ǰ ����, ��ǰ �ܰ�, (���� ��� ��-��ǰ ����)��} ���� ����
//			System.out.println(/*"���� �� ���� ��� : "*/line.get(Prod_num.get(i)).split("\t")[4]);//������ ��� �� ���
//			System.out.println(String.valueOf(Integer
//					.parseInt(line.get(Prod_num.get(i)).split("\t")[4])
//					- Prod_count.get(i)));//������ ���- ��ǰ�� ����
		}

		try {
			bw = new BufferedWriter(new FileWriter(urlmonth, true));//�ǸŰ��� �б�
			for (int i = 0; i < Prod_count.size(); i++) {//��ǰ ������ ���������
				String localtype = format.format(cal.getTime()) + "\t"
						+ phonenumber + "\t" + prod_name.get(i) + "\t"
						+ unitcost.get(i) + "\t" + Prod_count.get(i) + "\t"
						+ CUS_PRO;//��¥, ��ȭ��ȣ, ��ǰ�̸�, �ܰ�, ��ǰ ����, �Ǹ�-�԰� ����
				//System.out.println(localtype);
				bw.write(localtype.toString());// ����
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			bw = new BufferedWriter(new FileWriter(urlgood));//��ǰ �б�
			for (int i = 0; i < line.size(); i++) {
				bw.write(line.get(i));//line ����Ʈ ���� �Է�
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			br = new BufferedReader(new FileReader(urlhuman));//���� �б�
			int count = 0;
			while (true) {
				String lines = br.readLine();//���پ� �б�
				if (lines == null) {
					break;
				} else if (lines.split("\t")[3].equals(phonenumber)){//���� ������
					int total_money = Integer.parseInt(lines.split("\t")[4]) + result_money;
					lines = lines.split("\t")[0] + "\t" +lines.split("\t")[1] + "\t"+lines.split("\t")[2] + "\t"+lines.split("\t")[3] + "\t"+ total_money + "\t"+lines.split("\t")[5];
				}
				userline.add(lines);//��ü ������ line list�� ����.
				
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		

		
		try {
			bw = new BufferedWriter(new FileWriter(urlhuman));//������ �б�
			for (int i = 0; i < userline.size(); i++) {
				bw.write(userline.get(i));//line ����Ʈ ���� �Է�
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println(CUS_PRO + "/ " + phonenumber + "/���� ��� �Ϸ�");// �Ǹ�-�԰� ����, ��ȭ��ȣ, ���

	}
	
    //��ǰ �԰� �޼ҵ�
	public void orderProduct(String prod_name, int primecost) {//��ǰ��,����

		Calendar cal = Calendar.getInstance();//��¥ �Լ�
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//����
		
		try {
			bw = new BufferedWriter(new FileWriter(urlmonth, true));//�ǸŰ���â�� �Է�
				bw.write(format.format(cal.getTime()) + "\t123456\t"+prod_name+"\t" + primecost + "\t50\tPRO");//�԰��ϴ� ��Ʈ �̸����� �ܰ� ��� ������..
				bw.newLine();
				bw.flush();
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//�� ���� ��Ȳ �޼ҵ�
	public void dayCheck() {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//����
		Date datenow = new Date();//��¥ ��ü ����
		try {
			br = new BufferedReader(new FileReader(urlmonth));//�Ǹ� ���� �б�
			while (true) {//���� ����
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (format.parse(lines.split("\t")[0]).getDate() == datenow
						.getDate())//���� �ð��̶� �ð��� ������
					System.out.println(lines);// ���� ���뿡 ���
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		System.out.println("���� ���� ���");
	}

	//�� ���� ��Ȳ �޼ҵ�
	public void monthCheck() {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date datenow = new Date();
		try {
			br = new BufferedReader(new FileReader(urlmonth));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (format.parse(lines.split("\t")[0]).getMonth() == datenow
						.getMonth())//���� ������
					System.out.println(lines);//���
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		System.out.println("���� ���� ���");
	}

	//�԰� ��ǰ ��� �޼ҵ�
	public void inputCheck() {

		try {
			br = new BufferedReader(new FileReader(urlmonth));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (lines.split("\t")[5].equals("PRO"))//�԰� �����̸�
					System.out.println(lines);// ���
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		System.out.println("�԰� ���� ���");
	}

	public void CustomerCheck() {
		try {
			br = new BufferedReader(new FileReader(urlhuman));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else
					System.out.println(lines);
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		System.out.println("�� ���� ���");
	}

	//�� �� ���� ���� �޼ҵ�
	public void PrivateCheck(String phonenumber) {

		try {
			br = new BufferedReader(new FileReader(urlmonth));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (lines.split("\t")[1].equals(phonenumber))//��ȭ��ȣ�� ������
					System.out.println(lines);//���
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		System.out.println(phonenumber + "/ �� ���� ���� ���");
	}

	//��ǰ �� ���� ���� �޼ҵ�
	public void Productcheck(String Product_number) {
		String productname = "";

		try {
			br = new BufferedReader(new FileReader(urlgood));
			int count = 0;
			while (true) {
				String lines = br.readLine();

				if (lines == null) {
					break;
				} else if (count == Integer.parseInt(Product_number)) {//��ǰ ��ȣ�� ������
					productname = lines.split("\t")[0];//��ǰ ��ȣ �ο�

				}
				count++;//1�� �����ϸ鼭 ���پ� ��µǴ°�
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		try {
			br = new BufferedReader(new FileReader(urlmonth));
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (lines.split("\t")[2].equals(productname))//��ǰ �̸��� ������
					System.out.println(lines);//���
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		System.out.println(Product_number + "/ ��ǰ �Ǹ� ���� ���");
	}

	//��ǰ �߰� �޼ҵ�
	public void addProduct(String prod_name, String prod_maker, int prime_cost,int unit_cost
			) {

		try {
			bw = new BufferedWriter(new FileWriter(urlgood, true));
			String localtype = prod_name + "\t" +prod_maker+ "\t" + prime_cost + "\t" +unit_cost ;
			System.out.println(localtype);
			bw.write(localtype.toString());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(prod_name + "/" + prod_maker  + "/" + prime_cost   + "/"
				+ unit_cost + "/ �߰� �Ϸ�");
	}

	//���Ͽ��� ��ǰ ���� �޼ҵ�
	public void delProduct(String prod_name) {
		ArrayList<String> line = new ArrayList<String>();//string ���  arraylist ����

		try {
			br = new BufferedReader(new FileReader(urlgood));//��ǰ ���� �б�
			while (true) {
				String lines = br.readLine();
				if (lines == null) {
					break;
				} else if (!lines.split("\t")[0].equals(prod_name))//��ǰ����  arraylist�� ������
					line.add(lines);//list�� ����
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

		try {
			bw = new BufferedWriter(new FileWriter(urlgood));//��ǰ ���Ͽ� ����. �ڿ� true�� �����Ƿ� ����� �ٽ� ����.
			for (int i = 0; i < line.size(); i++) {
				bw.write(line.get(i));//���Ͽ� ����
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(prod_name + "/ ���� �Ϸ�");
	}
}

