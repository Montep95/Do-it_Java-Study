package chapter2;

public class OperationEx {

	public static void main(String[] args) {
		int age = 24;
		
		int age2 = -age; // 부호 연산자는 이처럼 간단히 사용이 가능하다.
		
		System.out.println(age);
		System.out.println(age2);
		// ===== 부호 연산자 ===== // 
		
		// ===== 관계 연산자 ===== //
		boolean flag = (age > age2); // 24 > -24
		System.out.println(flag); // true
		
		// ===== 논리 연산자 ===== //
		// =====단락 회로 평가===== //
		
		int num1 = 10;
		int i = 2;
		
		System.out.println("===== 논리곱 평가 이전 값 =====");
		System.out.println(num1);
		System.out.println(i);
		
		boolean value = ( ((num1 = num1 + 10) < 10) && ((i = i+2) > 10)); // 논리곱 앞의 연산이 false이기 때문에 뒤는 연산 안함
		// boolean value2 = ( ((num1 = num1 + 10) > 10) && ((i = i+2) > 10)); // 논리곱 앞의 연산이 true이기 때문에 뒤를 연산해 i값 증가	
		
		System.out.println("===== 논리곱 평가 이후 값 =====");
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // i 값이 바뀌지 않은 것을 알 수 있음 
		
		boolean value3 = ( ((num1 = num1 + 10) > 10) || ((i = i+2) > 10)); // 논리'합' 앞의 연산이 true이기 때문에
																		// 뒤는 볼 필요도 없이 true여서 연산을 안함
																		// i구문이 계산이 되지 않음
		
		System.out.println("===== 논리합 평가 이후 값 =====");
		System.out.println(value3);
		System.out.println(i);
		
		// ===== 복합대입 연산자 ===== //
		
		int num2 = 10;
		System.out.println("===== 복합 대입 연산자 =====");
		
		System.out.println(num2 += 1); // 11
		System.out.println(num2 %= 10); // 10으로 나눈 나머지, 1출력
		
		num2 -= 1;
		System.out.println(num2); // 1에서 1을 뺐으므로 0출력
		
		
	}

}
