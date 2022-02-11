package chapter12_collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter12_collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList; // ArrayList ������ �� ����
	
	public MemberArrayList() // ������
	{
		arrayList = new ArrayList<Member>(); // ��ü ����
	}
	
	public void addMember(Member member)
	{
		arrayList.add(member); // add�޼���� arrayList�� member�� �߰��ϴ� ����
	}
	
	public boolean removeMember(int memberId) // ����� �ϳ��� �����ϴ� ��� ����
	{
		/*
		for( int i = 0; i < arrayList.size(); i++)
		{
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			
			if(memberId == tempId) // �ӽ÷� ������ ���̵�� ������
			{
				arrayList.remove(i); // remove()�޼���� ����
				return true; 		// true ��ȯ
			}
		}
		*/
		
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) // �������� ������ ��Ұ� �ֳĸ� ����� �޼��� hasNext(), hasNext�� Ŀ���� �� ù��° ��ҿ� �ֱ⶧���� ��� ����� ��ȸ�ϱ⿡ ȿ����
		{
			Member member = iterator.next(); // ���� ����� ��Ҹ� �����ͼ� member�� ���� // �� for������ arrayList.get(i)�� ����� ����
			int tempId = member.getMemberId();
			
			if(memberId == tempId) // �ӽ÷� ������ ���̵�� ������
			{
				arrayList.remove(member); // remove()�޼���� ����
				return true; 		// true ��ȯ
			}
		}
		
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() { // �� �����ִ� �޼ҵ�
		
		for (Member member : arrayList)
		{
			System.out.println(member);
		}
		System.out.println(); // �ݺ������� ����
		
		// System.out.println(arrayList);
	}
}
