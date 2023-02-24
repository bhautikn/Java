public class ThisDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.a = 10;
		d.b = 20;
		Demo.c = 30;
		d.addValue(10,20,30);
		d.getValue();
	}
}
class Demo{
	int a;
	int b;
	static int c;
	void addValue(int a, int b,int c){
		this.a += a;
		this.b += b;
		this.c += c;
	}
	void getValue(){
		System.out.println(a+"\n"+b+"\n"+c);
	}
}