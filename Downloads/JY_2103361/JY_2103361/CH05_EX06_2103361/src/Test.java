import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//main �޼��� �Է� �Ű����� Ȯ���ϱ�
		
		System.out.println(args.length);
		
		System.out.println(args[0]+1);
		System.out.println(args[1]);
		System.out.println(args[2]+1); //31
		//���� ���ڿ� --> ���ڷ� �ٲٱ�
		System.out.println(Integer.parseInt(args[2])+1);
		System.out.println(Double.parseDouble(args[3])+1);
		
		System.out.println(Arrays.toString(args)); //�ڵ�����Ʈ ����Ű ctrl+shift+���ĺ�O
	}

}
