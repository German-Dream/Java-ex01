// Ŭ������ �޼��常 �ִ� ���
class Calc {
	int add(int a, int b) {
		return a + b;
	}
}

public class Calculation {

	public static void main(String[] args) {
		// ��ü ����
		Calc calc = new Calc();
		// �޼��� ȣ��
		int nReturn = calc.add(3,  9);
		
		System.out.println("3 + 9 = " + nReturn);

	}

}