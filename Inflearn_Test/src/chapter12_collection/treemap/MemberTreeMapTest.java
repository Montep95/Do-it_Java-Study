package chapter12_collection.treemap;

import chapter12_collection.Member;
import chapter12_collection.treemap.MemberTreeMap;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberSong = new Member(102, "송강호");
		Member memberHwang = new Member(101, "황인욱");
		Member memberJan = new Member(103, "잔나비");
		
		memberTreeMap.addMember(memberSong);
		memberTreeMap.addMember(memberHwang);
		memberTreeMap.addMember(memberJan);
		
		memberTreeMap.showAllMember(); // TreeMap도 정렬이 되어서 출력이됨을 확인 가능
		
		/*
		memberTreeMap.removeMember(102); // 102를 지우고
		memberTreeMap.showAllMember(); // 재 출력
		*/
		
	}

}
