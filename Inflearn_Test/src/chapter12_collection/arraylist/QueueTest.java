package chapter12_collection.arraylist;

import java.util.ArrayList;

class MyQueue
{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) // enQueue의 경우는 삽입의 경우이므로 반환할 값이 없으므로 void로 반환할 데이터 타입을 정하지 않음을 보인다.
	{
		arrayQueue.add(data);
	}
	
	public String deQueue() // deQueue의 경우는 삭제의 경우이므로 반환데이터형이 있어야하므로 enQueue에서 지정했던 String을 그대로 적어준다.
	{
		int len = arrayQueue.size(); // 큐의 사이즈를 len으로 관리
		
		if(len == 0) // 스택과 마찬가지로 자료공간이 비어있을 경우의 예외를 만듦
		{
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		return arrayQueue.remove(0); // 실제로 반환값을 주고 실제값도 지워짐. get과는 다른 개념. 개념은 단지 꺼내주기만함
	}
}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A"); // 데이터 삽입
		queue.enQueue("B"); // 데이터 삽입
		queue.enQueue("C"); // 데이터 삽입
		
		System.out.println(queue.deQueue()); // A 반환
		System.out.println(queue.deQueue()); // B 반환
		System.out.println(queue.deQueue()); // C 반환
		
		System.out.println(queue.deQueue()); // 큐가 비어있음.	
	}
}
