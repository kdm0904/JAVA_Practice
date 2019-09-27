class Calc{
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public int sub(int x, int y) {
		return x-y;
	}

	public int mul(int x, int y) {
		return x*y;
	}

	public int divd(int x, int y) {
		return x/y;
	}

	public int modd(int x, int y) {
		return x%y;
	}

}
public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc cc = new Calc();
		
		System.out.println("더하기 : " + cc.add(7, 3));
		System.out.println("빼기 : " + cc.sub(7, 3));
		System.out.println("곱하기 : " + cc.mul(7, 3));
		System.out.println("나누기 : " + cc.divd(7, 3));
		System.out.println("나머지 : " + cc.modd(7, 3));
	}
}
