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
		TreeMap.put(member.getMemberId(), member); // TreeMap에서 넣을때는 put
	}
	
	public boolean removeMember(int memberId) // 꺼낼때는 get이지만 제거할땐 remove
	{
		if(TreeMap.containsKey(memberId)) { //TreeMap은 있는지여부를 containsKey메서드로 구현할 수 있음
			TreeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember()
	{
		Iterator<Integer> ir = TreeMap.keySet().iterator(); // <Integer> 인 이유 = 키값을 다루기떄문
		
		while(ir.hasNext())
		{
			int key = ir.next();
			
			Member member = TreeMap.get(key);
			System.out.println(member);
		}
	}
	
}
