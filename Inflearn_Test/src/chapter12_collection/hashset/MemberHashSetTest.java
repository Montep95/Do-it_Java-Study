package chapter12_collection.hashset;

import chapter12_collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberSong = new Member(101, "송강호");
		Member memberHwang = new Member(102, "황인욱");
		Member memberJan = new Member(103, "잔나비");
		
		memberHashSet.addMember(memberSong);
		memberHashSet.addMember(memberHwang);
		memberHashSet.addMember(memberJan);
		
		memberHashSet.showAll();
		
		Member memberSong2 = new Member(101, "송진"); // 출력해보면 들어간 것을 확인할 수 있는데, HashSetTest.java에서 ddd가 중복을 허용하지 않아
													// 추가되지 않던것과 비교하면 의문이 생길 수 있음
													// equals와 hashcode가 구현이 되지 않아있기 때문임 = equals와 hashcode를 오버라이딩 하면 해결
													// 상위 패키지의 Member.java에 추가한 후 다시 실행해보면 이번에는 '송진'은 추가되지 않은 것을 확인 가능
		memberHashSet.addMember(memberSong2);
		memberHashSet.showAll();
	}

}
