package chapter12_collection;

import java.util.Comparator;

// TreeSet�� �����ϱ� ���� Comparable�� ���Եǵ��� �ؾ��Ѵ� (�������̽�)
public class Member implements Comparable<Member>, Comparator<Member> // ��ó�� �ۼ�
{
	
	private int memberId;
	private String memberName;
	
	public Member() {
		
	}
	public Member(int memberId, String memberName) // ������
	{
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString()
	{
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}
	

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member)
		{
			Member member = (Member)obj;
			
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}


	@Override
	public int compareTo(Member member) { // Comparable �������̽��� ��ӹ޾����Ƿ� compareTo �� �������̵� ������� (������)
		// TreeSetTest Ŭ�������� ���� �̼���, ������ �� ���ؾ��ϹǷ� �����ؾ���
		// �̸������� ���ص��ǰ�, Id������ ���ص��˴ϴ�.
		// �̹��ǽ������� Id������ ���ϴ� ���� �غ��ڽ��ϴ�.
		return (this.memberId - member.memberId);  // ���� �� ū ��� (this.memberId) ����� ��ȯ�Ǹ� ������������ ����
												  // ������ ��ȯ�Ǹ� ������������ ����
												  // �ݴ�� ���� �� ������ ������ ���Ͻ�Ű�� ������ �ڿ� *(-1); �� �߰����ָ� �ȴ�.
		
		// return (this.memberName.compareTo(member.memberName)); // �̸������� �����ϴ� ���
		
		// >> MemberTreeSetTest.java�� ���� �����غ��� �� ���ĵǾ� ����� �Ǵ°��� Ȯ���� �� ����
	}

	@Override
	public int compare(Member member1, Member member2) { // ���� �޼��带 ����, ���⼭�� ���� �����̰�, ���� member2�� ���� ��
		return member1.memberId - member2.memberId; // �������� ����
		// ������ �� compare���ٴ� compareTo�޼��尡 �켱������ �Ҹ��� �ȴ�. �̷��� MemberTreeSet�� �⺻�����ڸ� ������־����
		// CompareTo�� compare�� �Ѵ� �����ϴ� ���� ���� ���ٰ� ���ø�˴ϴ�.
	}
	
	
}
