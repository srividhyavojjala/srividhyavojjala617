package arrayspractice;
import java.util.Random;

public class ShuffleCards{
	public static void shufflenumbers(int[]arr) {
	Random randomobject = new Random();
	for(int i=0;i<arr.length;i++) {
	int randomvalue=randomobject.nextInt(arr.length);
	int currentvalue=arr[i];
	arr[i]=arr[randomvalue];
	arr[randomvalue]=currentvalue;
}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
	public static void main(String []args) {
		int arr[]= {1,2,3,4,5,6,7};
		for(int i=0;i<10;i++) {
			 ShuffleCards.shufflenumbers(arr);

		}
}
}