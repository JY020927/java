interface A {
	int m=3; //public static final 
	void abc(); //public abstract : ������ �ȳ�: abstract�� �پ��ٴ� �ǹ�
}

//class B implements A{
//	void abc() { //���� : public�� �پ��ٴ� ����
//	}
//}

public class Test {
	public static void main(String[] args) {
		System.out.println(A.m); //static�� �پ��ٴ� �ǹ�
		//A.m=5;//���� : final �پ��ٴ� �ǹ�
		
	}
}