package generic.demo;


public class Tool<o> {
	/*
	 * java-常用对象API-集合框架-泛型-泛型类
	 * java-常用对象API-集合框架-泛型-泛型方法
	 */
	private o obj;

	public o getObj() {
		return obj;
	}

	public void setObj(o obj) {
		this.obj = obj;
	}
	
	public static <w> void show(w str) {
		System.out.println("show:" + str);//可以用方法上的泛型，另外静态方法不能访问类上定义的泛型
	}

	public void print(o str) {
		System.out.println("print:" + str);//只能用对象上的泛型
	}
}
