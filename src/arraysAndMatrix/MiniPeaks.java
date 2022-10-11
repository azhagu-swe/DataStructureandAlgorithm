package arraysAndMatrix;

import java.util.Scanner;

public class MiniPeaks {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements : ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
			{
				System.out.println("Mini Peaks : "+arr[i]);
			}
		}
		sc.close();
	}

}
