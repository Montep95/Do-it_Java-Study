package chapter12_collection.arraylist;

import java.util.ArrayList;

class MyStack
{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	public void push(String data) // ������ ������ �߰� push ����
	{
		arrayStack.add(data);
	}
	
	
	public String pop()
	{
		int len = arrayStack.size(); // ������ ����� len���� ������ ǥ��
		
		if(len ==  0) // ���ÿ� ����ִ� �����Ͱ� ������
		{
			System.out.println("������ ������ϴ�");
			return null;
		}
		
		String data = arrayStack.remove(arrayStack.size() - 1); // ������ �� ���� �����͸� �����ϹǷ� ������ ���
		return data;
	}
	
	
	public String peek() // pop���� �޸� �� ���� ���� ���� �����⸸�ϹǷ� �� return�κи� ��������.
	{
		int len = arrayStack.size(); // ������ ����� len���� ������ ǥ��
		
		if(len ==  0) // ���ÿ� ����ִ� �����Ͱ� ������
		{
			System.out.println("������ ������ϴ�");
			return null;
		}
		
		String data = arrayStack.get(arrayStack.size() - 1); // get()�Լ��� ���� �����⸸�ϴ� ��� ����
		return data;
	}
}

public class StackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("A"); // ������ ����
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop()); // c ��ȯ
		System.out.println(stack.pop()); // b ��ȯ
		System.out.println(stack.pop()); // a ��ȯ
		
		System.out.println(stack.pop()); // ������ �������.	
	}

}
