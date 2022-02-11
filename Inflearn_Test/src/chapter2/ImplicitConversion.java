package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10; // byte는 1바이트
		int num = bNum; // int는 4바이트 
		// 묵시적 형변환이 일어난다! (자료의 손실이 발생하지 않고) - 작은 수에서 큰 수로 형변환
		System.out.println(num);
		
		long lNum = 10; // 8바이트
		float fNum = lNum; // 4바이트
		// 묵시적 형변환이 일어난다! (long은 정수형이고 float는 실수형이기때문에 
		// 더 정밀한 float로 자연스럽게 형변환이 일어난다)
		System.out.println(fNum);
		
		double dNum = fNum + num; // 두 값을 더한 결과가 double형으로 형변환되어 결과가 나오게된다.
		System.out.println(dNum);
		
		
	}

}
