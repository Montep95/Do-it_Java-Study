package chapter7_Array;

public class enhanced_for {

	public static void main(String[] args) {
		
		String[] strArr = {"Java", "Android", "C"};
		
		// ���� for�� // 
		for (int i = 0; i<strArr.length; i++)
		{
			System.out.println(strArr[i]); // �̷� �Ϲ����� ���� �ƴ�.
		}
		
		// ���� for�� //
		for (String s : strArr) // strArr�迭�� �ϳ��ϳ� ��Ұ� s �ӽú����� ����.
		{
			System.out.println(s); // ���� ���� ����� ����.
		}
		
		// ���� for�� �Ǵٸ� ���� // 
		int[] arr = {1,2,3,4,5};
		
		for(int num : arr)
		{
			System.out.println(num);
		}
		
	}

}
