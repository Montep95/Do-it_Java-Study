package chapter12_collection.arraylist;

import chapter12_collection.Member;

// MemberArrayList�� �׽�Ʈ�� �׽�Ʈ�ڵ�

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberSong = new Member(101, "�۰�ȣ");
		Member memberHwang = new Member(102, "Ȳ�ο�");
		Member memberJan = new Member(103, "�ܳ���");
		
		memberArrayList.addMember(memberSong);
		memberArrayList.addMember(memberHwang);
		memberArrayList.addMember(memberJan);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(memberSong.getMemberId());

	}

}
