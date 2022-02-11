package chapter12_collection.treeset;

import chapter12_collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet memberHashSet = new MemberTreeSet();
		
		Member memberSong = new Member(102, "�۰�ȣ");
		Member memberHwang = new Member(101, "Ȳ�ο�");
		Member memberJan = new Member(103, "�ܳ���");
		
		memberHashSet.addMember(memberSong);
		memberHashSet.addMember(memberHwang);
		memberHashSet.addMember(memberJan);
		
		memberHashSet.showAll();
		
		Member memberSong2 = new Member(101, "����"); // ����غ��� �� ���� Ȯ���� �� �ִµ�, TreeSetTest.java���� ddd�� �ߺ��� ������� �ʾ�
													// �߰����� �ʴ��Ͱ� ���ϸ� �ǹ��� ���� �� ����
													// equals�� hashcode�� ������ ���� �ʾ��ֱ� ������ = equals�� hashcode�� �������̵� �ϸ� �ذ�
													// ���� ��Ű���� Member.java�� �߰��� �� �ٽ� �����غ��� �̹����� '����'�� �߰����� ���� ���� Ȯ�� ����
		memberHashSet.addMember(memberSong2);
		memberHashSet.showAll();
	}

}
