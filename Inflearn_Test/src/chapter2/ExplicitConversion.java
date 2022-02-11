package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000; // 4바이트
		byte bNum = (byte)iNum; // 1바이트 이므로 256개 (-128~127)까지만 표현 
								// 1000은 들어갈 수 없음, 따라서 짤린 수가 표현 (-24) 출력
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14; // 8바이트
		iNum = (int)dNum; // 4바이트인 int형에다가 int로 형변환해 넣겠다.
		System.out.println(iNum); // 소수점 이하부분은 삭제되고 출력이된다.
		
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; // 3 + 0 = (int)3
		int num2 = (int)(dNum + fNum); // 3.14 + 0.9 = 4.23 -> (int)4 "0.23부분이 유실(Truncate)된다."
		// 이 두가지 경우는 차이가 있는지 비교
		System.out.println(num1); 
		System.out.println(num2);
		
	}

}
