/* 
	problem statement:
		given 1d integer array
		if array in descending oreder return 0
		if array of element repeate les then one then return 0
		else return 1

*/
public class ArrayChallange {
	public static void main(String[] args) {
		int a[] = {1,1,1,1,1,2,2,2};
		System.out.print(checkArray(a));
	}
	public static int checkArray(int[] a){
		int count=1;
		for (int i=1;i<a.length;i++) {
			if (a[i]==a[i-1]) // check currunt element = last element if true then increasing count to one
				count++;
			else if (a[i]!=a[i-1]) { // check currunt element is not past element 
				if (a[i]-a[i-1]<0) // check element change and not in assending order then return 0
					return 0;
				else if (count<3) //check if count less then 3 then return 0
					return 0;
				count =1; //set count value to 1;
			}
		}
		if (count>=3) //if count value greater than 3 then return 1
			return 1;
		else //check if count less then 3 then return 0
			return 0;
	}
}