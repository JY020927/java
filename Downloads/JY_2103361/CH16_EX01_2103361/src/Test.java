class Apple{}
class Pencil{}

//#1. Object Ÿ���� ����Ͽ� �ΰ��� ��ü�� ��� ����
class C {
	Object obj;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
}
//#2. ���׸� Ŭ������ �ΰ��� ��ü�� ����
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
		c1.setObj(new Apple()); //���ð�ü �Է�
		Apple apple1 = (Apple)c1.getObj(); //ĳ������ �ݵ�� �ؾ���
		
		C c2 = new C();
		c2.setObj(new Pencil()); //�潽��ü �Է�
		Pencil pencil1 = (Pencil)c2.getObj(); //ĳ������ �ݵ�� �ؾ���
		
		C c3 = new C();
		c3.setObj(new Apple()); //���ð�ü �Է�
		//..��õ��...
		Pencil pencil2 = (Pencil)c3.getObj();
		
		
		D<Apple> d1 = new D<Apple>();
		d1.set(new Apple());
		Apple apple3 = d1.get();
		
		D<Pencil> d2 = new D<Pencil>();
		d2.set(new Pencil());
		Pencil pencil3 = d2.get();
		
		D<Apple> d3 = new D<Apple>();
//		d3.set(new Pencil()); //�������� �߻�������
		d3.set(new Apple());
//		Pencil pencil4 = d3.get(); //���������� �߻�������
		
		
	}
}