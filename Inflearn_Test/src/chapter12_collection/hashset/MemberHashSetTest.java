package chapter12_collection.hashset;

import chapter12_collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberSong = new Member(101, "�۰�ȣ");
		Member memberHwang = new Member(102, "Ȳ�ο�");
		Member memberJan = new Member(103, "�ܳ���");
		
		memberHashSet.addMember(memberSong);
		memberHashSet.addMember(memberHwang);
		memberHashSet.addMember(memberJan);
		
		memberHashSet.showAll();
		
		Member memberSong2 = new Member(101, "����"); // ����غ��� �� ���� Ȯ���� �� �ִµ�, HashSetTest.java���� ddd�� �ߺ��� ������� �ʾ�
													// �߰����� �ʴ��Ͱ� ���ϸ� �ǹ��� ���� �� ����
													// equals�� hashcode�� ������ ���� �ʾ��ֱ� ������ = equals�� hashcode�� �������̵� �ϸ� �ذ�
													// ���� ��Ű���� Member.java�� �߰��� �� �ٽ� �����غ��� �̹����� '����'�� �߰����� ���� ���� Ȯ�� ����
		memberHashSet.addMember(memberSong2);
		memberHashSet.showAll();
	}

}
