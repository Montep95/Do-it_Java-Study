package chapter12_collection.treemap;

import java.util.TreeMap;
import java.util.Iterator;

import chapter12_collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> TreeMap;
	
	public MemberTreeMap()
	{
		TreeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member)
	{
		TreeMap.put(member.getMemberId(), member); // TreeMap���� �������� put
	}
	
	public boolean removeMember(int memberId) // �������� get������ �����Ҷ� remove
	{
		if(TreeMap.containsKey(memberId)) { //TreeMap�� �ִ������θ� containsKey�޼���� ������ �� ����
			TreeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember()
	{
		Iterator<Integer> ir = TreeMap.keySet().iterator(); // <Integer> �� ���� = Ű���� �ٷ�⋚��
		
		while(ir.hasNext())
		{
			int key = ir.next();
			
			Member member = TreeMap.get(key);
			System.out.println(member);
		}
	}
	
}
