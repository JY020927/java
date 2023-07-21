class Apple{}
class Pencil{}

//#1. Object 타입을 사용하여 두개의 객체를 모두 관리
class C {
	Object obj;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
}
//#2. 제네릭 클래스로 두개의 객체를 관리
class D <T> {
	T t;
	T get() {
		return t;
	}
	void set(T t) {
		this.t = t;
	}
}

public class Test {
	public static void main(String[] args) {
		C c1 = new C();
		c1.setObj(new Apple()); //애플객체 입력
		Apple apple1 = (Apple)c1.getObj(); //캐스팅을 반드시 해야함
		
		C c2 = new C();
		c2.setObj(new Pencil()); //펜슬객체 입력
		Pencil pencil1 = (Pencil)c2.getObj(); //캐스팅을 반드시 해야함
		
		C c3 = new C();
		c3.setObj(new Apple()); //애플객체 입력
		//..수천줄...
		Pencil pencil2 = (Pencil)c3.getObj();
		
		
		D<Apple> d1 = new D<Apple>();
		d1.set(new Apple());
		Apple apple3 = d1.get();
		
		D<Pencil> d2 = new D<Pencil>();
		d2.set(new Pencil());
		Pencil pencil3 = d2.get();
		
		D<Apple> d3 = new D<Apple>();
//		d3.set(new Pencil()); //문법오류 발생시켜줌
		d3.set(new Apple());
//		Pencil pencil4 = d3.get(); //문법오류를 발생시켜줌
		
		
	}
}