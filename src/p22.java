import java.util.*;
     class p22 {
       public static void main(String[] args) {
        // TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[] = new int[n];
        int brr[]=new int[m];
       
        for (int i = 0; i < n; i++)
           arr[i]=sc.nextInt();
           
        for (int j = 0; j < m; j++)
            brr[j]=sc.nextInt();
        findMissingNumber(arr,brr);
     }
       private static void findMissingNumber(int[] arr, int[] brr) {
        for ( int p : brr) {
            if (false==isPresent(p, arr)) {
                System.out.println("missing number: " + p);
                break;
            }
        }
    }
        private static boolean isPresent(int n, int[] brr) {
        for (int i : brr) {
            if (n == i) {
                return true;
            }
        }
        return false;    
        }
    }
     
     
     