package chapter12_collection.arraylist;

import java.util.ArrayList;

class MyQueue
{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) // enQueue�� ���� ������ ����̹Ƿ� ��ȯ�� ���� �����Ƿ� void�� ��ȯ�� ������ Ÿ���� ������ ������ ���δ�.
	{
		arrayQueue.add(data);
	}
	
	public String deQueue() // deQueue�� ���� ������ ����̹Ƿ� ��ȯ���������� �־���ϹǷ� enQueue���� �����ߴ� String�� �״�� �����ش�.
	{
		int len = arrayQueue.size(); // ť�� ����� len���� ����
		
		if(len == 0) // ���ð� ���������� �ڷ������ ������� ����� ���ܸ� ����
		{
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		
		return arrayQueue.remove(0); // ������ ��ȯ���� �ְ� �������� ������. get���� �ٸ� ����. ������ ���� �����ֱ⸸��
	}
}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A"); // ������ ����
		queue.enQueue("B"); // ������ ����
		queue.enQueue("C"); // ������ ����
		
		System.out.println(queue.deQueue()); // A ��ȯ
		System.out.println(queue.deQueue()); // B ��ȯ
		System.out.println(queue.deQueue()); // C ��ȯ
		
		System.out.println(queue.deQueue()); // ť�� �������.	
	}
}
