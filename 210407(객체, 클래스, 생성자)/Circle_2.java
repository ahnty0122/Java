
public class Circle_2 {
	int radius;
	String name;

	public Circle_2() { // ������
		radius = 1;
		name = "";
	}
	
	public Circle_2(int r, String t) {
		radius = r;
		name = t;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle_2 pizza = new Circle_2(10, "�ڹ�����");
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle_2 donut = new Circle_2();
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}

}
