package chapter12_generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		
		printer.setMaterial(new Powder()); // setMaterial �� Powder�� �� public void setMaterial(Object material)
											// Object material���� Powder�� ���� ����
		Powder powder = (Powder)printer.getMaterial(); // ����, (Powder)�� ���־� �ٿ�ĳ������ ������� 
												//= Object�� ������ ��ĳ�������߾��⶧���� �ٽ� �ٿ�ĳ�������ִ� �����
		
		//===================ThreeDPrinter.java�� <T> ���׸� Ŭ������ ������ �Ŀ���================//
		ThreeDPrinter<Powder> printer2 = new ThreeDPrinter<Powder>(); // ó�� ���� �� ����
		printer2.setMaterial(new Powder());
		Powder powder2 = printer2.getMaterial(); // ���� �޸� �ٿ�ĳ������ ���� ���� ���� Ȯ�ΰ��� 
		System.out.println(printer); // ���� Powder �Դϴ�. ���
		
		ThreeDPrinter<Plastic> printer3 = new ThreeDPrinter<Plastic>(); // ó�� ���� �� ����
		printer3.setMaterial(new Plastic());
		Plastic plastic = printer3.getMaterial(); // ���� �޸� �ٿ�ĳ������ ���� ���� ���� Ȯ�ΰ��� 
		System.out.println(printer3); // ���� Plastic �Դϴ�. ���
		
		/*
		ThreeDPrinter<Water> printer4 = new ThreeDPrinter<Water>(); // ó�� ���� �� ����
		printer4.setMaterial(new Water());
		Water Water = printer4.getMaterial(); // ���� �޸� �ٿ�ĳ������ ���� ���� ���� Ȯ�ΰ��� 
		System.out.println(printer4); // ���� Water �Դϴ�. ���
		*/
		// >> ��� <T>ó�� ���׸�Ŭ������ ���ԵǸ� ��� ��ü�� �ֵ� ���� ������ �� ����� ���� Ȯ���� �� ����.
		// ������ ���� ���� �ȵǹǷ� ����Ŭ������ �ϳ� ����� (Material) ����� �ް��ϰ�, ThreeDPrinter���� extends Material �� ���־�
		// ��ӹ��� Ŭ�����鸸 ��밡���ϵ��� �������ָ� (Water����) Water�� ����� �� ���Եȴ�.
		
		printer3.printing(); // �ö�ƽ ���� ����մϴ� ���.
		
		
		
	}

}
