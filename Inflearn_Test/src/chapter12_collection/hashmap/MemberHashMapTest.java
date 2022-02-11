package chapter12_collection.hashmap;

import chapter12_collection.Member;
import chapter12_collection.hashmap.MemberHashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberSong = new Member(102, "�۰�ȣ");
		Member memberHwang = new Member(101, "Ȳ�ο�");
		Member memberJan = new Member(103, "�ܳ���");
		
		memberHashMap.addMember(memberSong);
		memberHashMap.addMember(memberHwang);
		memberHashMap.addMember(memberJan);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(102); // 102�� �����
		memberHashMap.showAllMember(); // �� ���
		
		
	}

}
