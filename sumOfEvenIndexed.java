/*
 *Q-> write a  program to find the sum of even indexed elements of an array

 */

import java.util.Scanner;

public class sumOfEvenIndexed {
    public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int [n];
        System.out.print("Enter the array :");

        for(int i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++)
        {
            if(i%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum of the even indexed array is: "+sum);

    }
   
    
           }
