package chapter13_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s)); // forEach = 하나씩 도는 연산자
		// 여기서 forEach는 Tomas, James, Edward 등이 하나씩 들어오면 연산을 하라는 의미.
		// 이는 밑 코드처럼 표현할 수도 있다.
		/*
		for (String s : sList)
		{
			System.out.println(s);
		}
		*/
		
		sList.stream().sorted().forEach(s->System.out.println(s)); // 오름차순 정렬하여 출력
		// Edward -> James -> Tomas
	}

}
