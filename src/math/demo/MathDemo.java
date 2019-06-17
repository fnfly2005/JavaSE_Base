package math.demo;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println("java-其他对象API-Math类");
		System.out.println(Math.PI);
		Double d1 = 2.14;
		Double d2 = 2.54;
		System.out.println(Math.ceil(d1));
		System.out.println(Math.floor(d1));
		System.out.println(Math.round(d1));
		System.out.println(Math.round(d2));
		System.out.println(Math.pow(10,2));
		for (int i=0;i<6;i++)
		{
			System.out.println(Math.floor(Math.random()*6+1));
		}
		

	}

}
