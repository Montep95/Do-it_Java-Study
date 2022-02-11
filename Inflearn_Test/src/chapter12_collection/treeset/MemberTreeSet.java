package chapter12_collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import chapter12_collection.Member;

// MemberArrayList�� �ڵ尡 ����

public class MemberTreeSet {
	
	private TreeSet<Member> TreeSet; 
	
	public MemberTreeSet() // ������
	{
		TreeSet = new TreeSet<Member>(new Member()); // ��ü ����, compare �޼��� ������ ���� �⺻������ ����
	}
	
	public void addMember(Member member)
	{
		TreeSet.add(member); // add�޼���� TreeSet�� member�� �߰��ϴ� ����
	}
	
	public boolean removeMember(int memberId) // ����� �ϳ��� �����ϴ� ��� ����
	{
		// get(i)�� �ȵǱ⶧���� for���� �׳� ����
		
		Iterator<Member> iterator = TreeSet.iterator();
		while(iterator.hasNext()) // �������� ������ ��Ұ� �ֳĸ� ����� �޼��� hasNext(), hasNext�� Ŀ���� �� ù��° ��ҿ� �ֱ⶧���� ��� ����� ��ȸ�ϱ⿡ ȿ����
		{
			Member member = iterator.next(); // ���� ����� ��Ҹ� �����ͼ� member�� ���� // �� for������ TreeSet.get(i)�� ����� ����
			int tempId = member.getMemberId();
			
			if(memberId == tempId) // �ӽ÷� ������ ���̵�� ������
			{
				TreeSet.remove(member); // remove()�޼���� ����
				return true; 		// true ��ȯ
			}
		}
		
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() { // �� �����ִ� �޼ҵ�
		
		for (Member member : TreeSet)
		{
			System.out.println(member);
		}
		System.out.println(); // �ݺ������� ����
		
		// System.out.println(TreeSet);
	}
}

