public class ComplexNumberDemo {
	public static void main(String[] args) {
		ComplexNumber n1 = new ComplexNumber(2,3);
		ComplexNumber n2 = new ComplexNumber(4,7);
		ComplexNumber n3 = new ComplexNumber();
		n3 = addNumber(n1,n2);
		System.out.printf("real part: %d\nimagnary part: %d",n3.getRealPart(),n3.getImgPart());
	}
	static ComplexNumber addNumber(ComplexNumber n1, ComplexNumber n2){
		ComplexNumber temp = new ComplexNumber();
		temp.realPart = n1.realPart + n2.realPart;
		temp.imgPart = n1.imgPart + n2.imgPart;
		return temp;
	}
}
class ComplexNumber{
	int realPart;
	int imgPart;

	ComplexNumber(){
		realPart = 0;
		imgPart = 0;
	}
	ComplexNumber(int realPart, int imgPart){
		this.realPart = realPart;
		this.imgPart = imgPart;
	}
	int getRealPart(){
		return realPart;
	}
	int getImgPart(){
		return imgPart;
	}
}