package chapter12_generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		
		printer.setMaterial(new Powder()); // setMaterial 에 Powder가 들어감 public void setMaterial(Object material)
											// Object material으로 Powder가 들어가는 것임
		Powder powder = (Powder)printer.getMaterial(); // 오류, (Powder)을 써주어 다운캐스팅을 해줘야함 
												//= Object로 넣을떄 업캐스팅을했었기때문에 다시 다운캐스팅해주는 방식임
		
		//===================ThreeDPrinter.java에 <T> 제네릭 클래스를 선언한 후에는================//
		ThreeDPrinter<Powder> printer2 = new ThreeDPrinter<Powder>(); // 처럼 써줄 수 있음
		printer2.setMaterial(new Powder());
		Powder powder2 = printer2.getMaterial(); // 위와 달리 다운캐스팅이 되지 않은 것을 확인가능 
		System.out.println(printer); // 재료는 Powder 입니다. 출력
		
		ThreeDPrinter<Plastic> printer3 = new ThreeDPrinter<Plastic>(); // 처럼 써줄 수 있음
		printer3.setMaterial(new Plastic());
		Plastic plastic = printer3.getMaterial(); // 위와 달리 다운캐스팅이 되지 않은 것을 확인가능 
		System.out.println(printer3); // 재료는 Plastic 입니다. 출력
		
		/*
		ThreeDPrinter<Water> printer4 = new ThreeDPrinter<Water>(); // 처럼 써줄 수 있음
		printer4.setMaterial(new Water());
		Water Water = printer4.getMaterial(); // 위와 달리 다운캐스팅이 되지 않은 것을 확인가능 
		System.out.println(printer4); // 재료는 Water 입니다. 출력
		*/
		// >> 결론 <T>처럼 제네릭클래스를 쓰게되면 어떠한 객체를 넣든 같은 값으로 잘 출력이 됨을 확인할 수 있음.
		// 하지만 물이 들어가면 안되므로 상위클래스를 하나 만들어 (Material) 상속을 받게하고, ThreeDPrinter에는 extends Material 을 써주어
		// 상속받은 클래스들만 사용가능하도록 지정해주면 (Water제외) Water는 사용할 수 없게된다.
		
		printer3.printing(); // 플라스틱 재료로 출력합니다 출력.
		
		
		
	}

}
