package chapter12_collection.arraylist;

import chapter12_collection.Member;

// MemberArrayList가 테스트할 테스트코드

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberSong = new Member(101, "송강호");
		Member memberHwang = new Member(102, "황인욱");
		Member memberJan = new Member(103, "잔나비");
		
		memberArrayList.addMember(memberSong);
		memberArrayList.addMember(memberHwang);
		memberArrayList.addMember(memberJan);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(memberSong.getMemberId());

	}

}
