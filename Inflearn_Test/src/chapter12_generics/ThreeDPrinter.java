package chapter12_generics;

public class ThreeDPrinter<T extends Material>// <T> = 제네릭 클래스 선언 = <T> 는 매개변수 타입을 뜻함	
{
	
	private T material; // 플라스틱이건 파우더건 어떤재료건 Object로 변환되어서 사용될 수 있게함

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}

	public void printing() {
		material.doPrinting();
	}
	
	
	
	
}
