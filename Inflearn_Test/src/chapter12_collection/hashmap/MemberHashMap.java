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
		hashMap.put(member.getMemberId(), member); // HashMap에서 넣을때는 put
	}
	
	public boolean removeMember(int memberId) // 꺼낼때는 get이지만 제거할땐 remove
	{
		if(hashMap.containsKey(memberId)) { //hashMap은 있는지여부를 containsKey메서드로 구현할 수 있음
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember()
	{
		Iterator<Integer> ir = hashMap.keySet().iterator(); // <Integer> 인 이유 = 키값을 다루기떄문
		
		while(ir.hasNext())
		{
			int key = ir.next();
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
}
