import java.util.*;
class ArrayDemo {
    public void arrayFunc(int arr[],int sum) {
        System.out.println("Pairs of elements whose sum is "+sum+" = ");
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if(arr[i]+arr[j]==sum)
                    System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
            }
        }
    }
    public void arrayFunc(int[] A, int p, int[] B, int q) {
        for (int i=0; i<p; i++) {
            if (A[i]>B[0]) {
                int temp=A[i]; 
                A[i]=B[0];
                B[0]=temp;
                int first_arr=B[0];
                int k;
                for (k=1; k<q && B[k]<first_arr; k++)
                    B[k-1]=B[k];
                B[k-1]=first_arr;
            }
        }
    }
}
public class MethodOver {
    public static void main(String args[]) {
        ArrayDemo ob=new ArrayDemo();
        int[] arr={1, 5, 7, -1, 5};
        int sum=6; 
        ob.arrayFunc(arr, sum);
        int[] A={1, 5, 6, 7, 8, 10};
        int[] B={2, 4, 9};
        int p=A.length;
        int q=B.length; 
        System.out.println("\nOriginal Arrays:");
        System.out.println("A: "+Arrays.toString(A)); 
        System.out.println("B: "+Arrays.toString(B)); 
        ob.arrayFunc(A, p, B, q); 
        System.out.println("\nSorted Arrays:"); 
        System.out.println("A: "+Arrays.toString(A)); 
        System.out.println("B: "+Arrays.toString(B));
    }
}
