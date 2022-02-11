package chapter13_exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		
		try {
			for (int i = 0; i <= 5; i++)
			{
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); // (= System.out.println(e.toString());)
									// 로그 남길때는 이 부분에 로그를 남기면 됨.
			return; // finally구문이 수행된 후 수행이되는 return문
			
		}finally { // 마지막으로 정리할때 쓰는 구문, try문 수행 후 finally부터 무조건적으로 실행됨
					// 예외가 발생하더라도 finally는 무조건 한번은 실행됨
			System.out.println("finally");
		}
	
		
		System.out.println("end");
		

	}
}
