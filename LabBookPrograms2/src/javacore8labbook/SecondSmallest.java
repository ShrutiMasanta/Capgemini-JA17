package javacore8labbook;
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		SecondSmallest one = new SecondSmallest();
		System.out.println("Enter the number of elements of array===>");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements of the array===>");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("The second smallest element of the array is: " + one.getSecondSmallest(arr));
	}
	
	public int getSecondSmallest(int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}

}

