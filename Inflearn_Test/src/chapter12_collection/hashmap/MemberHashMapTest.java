package chapter12_collection.hashmap;

import chapter12_collection.Member;
import chapter12_collection.hashmap.MemberHashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberSong = new Member(102, "송강호");
		Member memberHwang = new Member(101, "황인욱");
		Member memberJan = new Member(103, "잔나비");
		
		memberHashMap.addMember(memberSong);
		memberHashMap.addMember(memberHwang);
		memberHashMap.addMember(memberJan);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(102); // 102를 지우고
		memberHashMap.showAllMember(); // 재 출력
		
		
	}

}
