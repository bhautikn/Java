public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("hello world from main");
	}
	static {
		System.out.println("hello world from block");
	}
}