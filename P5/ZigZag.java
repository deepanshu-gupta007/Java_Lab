import java.util.*;
class ZigZag {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int n, i;
        System.out.print("Enter the size: "); 
        n=sr.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for (i=0; i<arr.length; i++)
            arr[i]=sr.nextInt();
        System.out.println("Original array:");
        for (i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
        boolean flag=true; 
        int temp=0;
        for (i=0; i<=arr.length-2; i++) {
            if (flag && arr[i]>arr[i+1]) {
                temp=arr[i]; 
                arr[i]=arr[i+1]; 
                arr[i+1]=temp;
            }
            else if (arr[i]<arr[i+1]) {
                temp=arr[i]; 
                arr[i]=arr[i+1]; 
                arr[i+1]=temp;
            }
        flag=!flag;
    }
    System.out.println("Rearranged array :");
    for (i=0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
    }
}
