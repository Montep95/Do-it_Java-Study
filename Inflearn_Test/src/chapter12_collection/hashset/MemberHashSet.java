package chapter12_collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter12_collection.Member;

// MemberArrayList와 코드가 동일

public class MemberHashSet {
	
	private HashSet<Member> hashSet; 
	
	public MemberHashSet() // 생성자
	{
		hashSet = new HashSet<Member>(); // 객체 생성
	}
	
	public void addMember(Member member)
	{
		hashSet.add(member); // add메서드로 HashSet에 member를 추가하는 예제
	}
	
	public boolean removeMember(int memberId) // 멤버를 하나씩 제거하는 기능 구현
	{
		// get(i)가 안되기때문에 for문은 그냥 삭제
		
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) // 다음번에 가져올 요소가 있냐를 물어보는 메서드 hasNext(), hasNext의 커서는 맨 첫번째 요소에 있기때문에 모든 멤버를 순회하기에 효과적
		{
			Member member = iterator.next(); // 다음 멤버의 요소를 가져와서 member에 저장 // 위 for문에서 HashSet.get(i)와 비슷한 역할
			int tempId = member.getMemberId();
			
			if(memberId == tempId) // 임시로 저장한 아이디와 같으면
			{
				hashSet.remove(member); // remove()메서드로 제거
				return true; 		// true 반환
			}
		}
		
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() { // 다 보여주는 메소드
		
		for (Member member : hashSet)
		{
			System.out.println(member);
		}
		System.out.println(); // 반복문마다 개행
		
		// System.out.println(hashSet);
	}
}

