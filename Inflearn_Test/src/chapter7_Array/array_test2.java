package chapter7_Array;

public class array_test2 {

	public static void main(String[] args) {
		
		double[] num = new double[5];
		int size = 0;
		
		num[0] = 30.0; size++;
		num[1] = 20.0; size++;
		num[2] = 10.0; size++;
		
		double total = 1;
		
		for(int i=0; i < size; i++)
		{
			System.out.println(num[i]);
			total *= num[i];
		}
		
		System.out.println("total = " + total);
	}

}
