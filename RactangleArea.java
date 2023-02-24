public class RactangleArea {
	public static void main(String[] args) {
		Ractangle r = new Ractangle(5,5);
		Ractangle r2 = new Ractangle(r);
		System.out.println("area of r1: "+r2.getArea());
		System.out.println("count of Ractangle: "+Ractangle.count);
	}
}
class Ractangle{
	int height;
	int width;
	static int count;

	Ractangle(){
		height = 0;
		width = 0;
		count++;
	}
	Ractangle(int height, int width){
		this.height = height;
		this.width = width;
		count++;
	}
	Ractangle(Ractangle r){
		height= r.height;
		width = r.width;
		count++;
	}
	int getHeight(){
		return height;
	}
	int getWidth(){
		return width;
	}
	float getArea(){
		return (float)height*width;
	}
}