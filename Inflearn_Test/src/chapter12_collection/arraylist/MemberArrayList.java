package chapter12_collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter12_collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList; // ArrayList 생성만 한 상태
	
	public MemberArrayList() // 생성자
	{
		arrayList = new ArrayList<Member>(); // 객체 생성
	}
	
	public void addMember(Member member)
	{
		arrayList.add(member); // add메서드로 arrayList에 member를 추가하는 예제
	}
	
	public boolean removeMember(int memberId) // 멤버를 하나씩 제거하는 기능 구현
	{
		/*
		for( int i = 0; i < arrayList.size(); i++)
		{
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			
			if(memberId == tempId) // 임시로 저장한 아이디와 같으면
			{
				arrayList.remove(i); // remove()메서드로 제거
				return true; 		// true 반환
			}
		}
		*/
		
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) // 다음번에 가져올 요소가 있냐를 물어보는 메서드 hasNext(), hasNext의 커서는 맨 첫번째 요소에 있기때문에 모든 멤버를 순회하기에 효과적
		{
			Member member = iterator.next(); // 다음 멤버의 요소를 가져와서 member에 저장 // 위 for문에서 arrayList.get(i)와 비슷한 역할
			int tempId = member.getMemberId();
			
			if(memberId == tempId) // 임시로 저장한 아이디와 같으면
			{
				arrayList.remove(member); // remove()메서드로 제거
				return true; 		// true 반환
			}
		}
		
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() { // 다 보여주는 메소드
		
		for (Member member : arrayList)
		{
			System.out.println(member);
		}
		System.out.println(); // 반복문마다 개행
		
		// System.out.println(arrayList);
	}
}
