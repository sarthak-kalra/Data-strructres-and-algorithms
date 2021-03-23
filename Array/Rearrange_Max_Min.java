import java.util.Scanner;

public class Rearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();
		while (tc > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i <=arr.length - 1; i++) {
				arr[i] = scn.nextInt();

			}
			// ans(arr);
			int left = 0;
			int right = arr.length-1;
			int [] res = new int[n];
			rearrange(left,right,arr,res);
			
			
			}
	
		
		}

	private static void rearrange(int left, int right, int[] arr,int [] res) {
		// TODO Auto-generated method stub
		for (int i=0;i<res.length;i=i+2) {
			res[i]=arr[right];
			right--;
			res[i+1]=arr[left];
			left++;
		}
		
		for(int i =0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}
	

	
	}

