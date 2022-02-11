package chapter12_collection;

import java.util.Comparator;

// TreeSet을 구현하기 위해 Comparable이 포함되도록 해야한다 (인터페이스)
public class Member implements Comparable<Member>, Comparator<Member> // 이처럼 작성
{
	
	private int memberId;
	private String memberName;
	
	public Member() {
		
	}
	public Member(int memberId, String memberName) // 생성자
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
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
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
	public int compareTo(Member member) { // Comparable 인터페이스를 상속받았으므로 compareTo 를 오버라이드 해줘야함 (재정의)
		// TreeSetTest 클래스에서 보면 이순신, 김유신 등 비교해야하므로 구현해야함
		// 이름순으로 비교해도되고, Id순으로 비교해도됩니다.
		// 이번실습에서는 Id순으로 비교하는 것을 해보겠습니다.
		return (this.memberId - member.memberId);  // 내가 더 큰 경우 (this.memberId) 양수가 반환되면 오름차순으로 정렬
												  // 음수가 반환되면 내림차순으로 정렬
												  // 반대로 내가 더 컸을때 음수를 리턴시키고 싶으면 뒤에 *(-1); 을 추가해주면 된다.
		
		// return (this.memberName.compareTo(member.memberName)); // 이름순으로 정렬하는 방법
		
		// >> MemberTreeSetTest.java로 가서 실행해보면 잘 정렬되어 출력이 되는것을 확인할 수 있음
	}

	@Override
	public int compare(Member member1, Member member2) { // 비교할 메서드를 구현, 여기서는 앞이 본인이고, 뒤의 member2가 비교할 값
		return member1.memberId - member2.memberId; // 오름차순 정렬
		// 하지만 이 compare보다는 compareTo메서드가 우선적으로 불리게 된다. 이럴땐 MemberTreeSet에 기본생성자를 만들어주어야함
		// CompareTo와 compare를 둘다 구현하는 경우는 거의 없다고 보시면됩니다.
	}
	
	
}
