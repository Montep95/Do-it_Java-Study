package chapter12_generics;

public class ThreeDPrinter<T extends Material>// <T> = ���׸� Ŭ���� ���� = <T> �� �Ű����� Ÿ���� ����	
{
	
	private T material; // �ö�ƽ�̰� �Ŀ���� ����� Object�� ��ȯ�Ǿ ���� �� �ְ���

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
