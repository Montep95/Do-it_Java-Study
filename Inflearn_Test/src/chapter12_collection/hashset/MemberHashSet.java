package chapter12_collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter12_collection.Member;

// MemberArrayList�� �ڵ尡 ����

public class MemberHashSet {
	
	private HashSet<Member> hashSet; 
	
	public MemberHashSet() // ������
	{
		hashSet = new HashSet<Member>(); // ��ü ����
	}
	
	public void addMember(Member member)
	{
		hashSet.add(member); // add�޼���� HashSet�� member�� �߰��ϴ� ����
	}
	
	public boolean removeMember(int memberId) // ����� �ϳ��� �����ϴ� ��� ����
	{
		// get(i)�� �ȵǱ⶧���� for���� �׳� ����
		
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) // �������� ������ ��Ұ� �ֳĸ� ����� �޼��� hasNext(), hasNext�� Ŀ���� �� ù��° ��ҿ� �ֱ⶧���� ��� ����� ��ȸ�ϱ⿡ ȿ����
		{
			Member member = iterator.next(); // ���� ����� ��Ҹ� �����ͼ� member�� ���� // �� for������ HashSet.get(i)�� ����� ����
			int tempId = member.getMemberId();
			
			if(memberId == tempId) // �ӽ÷� ������ ���̵�� ������
			{
				hashSet.remove(member); // remove()�޼���� ����
				return true; 		// true ��ȯ
			}
		}
		
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() { // �� �����ִ� �޼ҵ�
		
		for (Member member : hashSet)
		{
			System.out.println(member);
		}
		System.out.println(); // �ݺ������� ����
		
		// System.out.println(hashSet);
	}
}

