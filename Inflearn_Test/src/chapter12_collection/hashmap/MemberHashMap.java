package chapter12_collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import chapter12_collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap()
	{
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member)
	{
		hashMap.put(member.getMemberId(), member); // HashMap���� �������� put
	}
	
	public boolean removeMember(int memberId) // �������� get������ �����Ҷ� remove
	{
		if(hashMap.containsKey(memberId)) { //hashMap�� �ִ������θ� containsKey�޼���� ������ �� ����
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember()
	{
		Iterator<Integer> ir = hashMap.keySet().iterator(); // <Integer> �� ���� = Ű���� �ٷ�⋚��
		
		while(ir.hasNext())
		{
			int key = ir.next();
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
}
