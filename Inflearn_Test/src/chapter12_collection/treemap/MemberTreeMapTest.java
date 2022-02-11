package chapter12_collection.treemap;

import chapter12_collection.Member;
import chapter12_collection.treemap.MemberTreeMap;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberSong = new Member(102, "�۰�ȣ");
		Member memberHwang = new Member(101, "Ȳ�ο�");
		Member memberJan = new Member(103, "�ܳ���");
		
		memberTreeMap.addMember(memberSong);
		memberTreeMap.addMember(memberHwang);
		memberTreeMap.addMember(memberJan);
		
		memberTreeMap.showAllMember(); // TreeMap�� ������ �Ǿ ����̵��� Ȯ�� ����
		
		/*
		memberTreeMap.removeMember(102); // 102�� �����
		memberTreeMap.showAllMember(); // �� ���
		*/
		
	}

}
