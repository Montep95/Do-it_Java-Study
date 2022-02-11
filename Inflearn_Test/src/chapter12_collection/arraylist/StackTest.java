package chapter12_collection.arraylist;

import java.util.ArrayList;

class MyStack
{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	public void push(String data) // 스택의 데이터 추가 push 구현
	{
		arrayStack.add(data);
	}
	
	
	public String pop()
	{
		int len = arrayStack.size(); // 스택의 사이즈를 len으로 간편히 표현
		
		if(len ==  0) // 스택에 들어있는 데이터가 없으면
		{
			System.out.println("스택이 비었습니다");
			return null;
		}
		
		String data = arrayStack.remove(arrayStack.size() - 1); // 스택은 맨 뒤의 데이터를 삭제하므로 구현한 방법
		return data;
	}
	
	
	public String peek() // pop과는 달리 맨 위의 값을 단지 꺼내기만하므로 밑 return부분만 수정해줌.
	{
		int len = arrayStack.size(); // 스택의 사이즈를 len으로 간편히 표현
		
		if(len ==  0) // 스택에 들어있는 데이터가 없으면
		{
			System.out.println("스택이 비었습니다");
			return null;
		}
		
		String data = arrayStack.get(arrayStack.size() - 1); // get()함수로 단지 꺼내기만하는 기능 구현
		return data;
	}
}

public class StackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("A"); // 데이터 삽입
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop()); // c 반환
		System.out.println(stack.pop()); // b 반환
		System.out.println(stack.pop()); // a 반환
		
		System.out.println(stack.pop()); // 스택이 비어있음.	
	}

}
