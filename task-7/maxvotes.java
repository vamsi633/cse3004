import java.util.Scanner;
public class maxvotes {
static void maj(int arr[], int n) 
{ 
 int c = 0; 
 int index = -1;
 for(int i = 0; i < n; i++) 
 { 
 int count = 0; 
 for(int j = 0; j < n; j++) 
 { 
 if(arr[i] == arr[j]) 
 count++; 
 } 
 if(count > c) 
 { 
 c = count; 
 index = i; 
 } 
 } 
 if (c > n/2) { 
 System.out.println("1");
 System.out.print("Majority Element is: ");
 System.out.println (arr[index]);
 }
 else {
 System.out.println("0");
 System.out.println ("No Majority Element");
 }
}
 public static void main (String[] args) { 
 Scanner s= new Scanner(System.in);
 System.out.println("Enter length of the array");
 int l=s.nextInt();
 System.out.println("Enter the elements of the array"); 
 int[] arr= new int[l]; 
 for(int i=0; i<l; i++)
 arr[i]=s.nextInt();
 maj(arr, l); 
 } 
}