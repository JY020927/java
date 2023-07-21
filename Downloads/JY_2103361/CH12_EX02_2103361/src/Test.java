interface A {
	int m=3; //public static final 
	void abc(); //public abstract : 오류가 안남: abstract이 붙었다는 의미
}

//class B implements A{
//	void abc() { //오류 : public이 붙었다는 증거
//	}
//}

public class Test {
	public static void main(String[] args) {
		System.out.println(A.m); //static이 붙었다는 의미
		//A.m=5;//오류 : final 붙었다는 의미
		
	}
}