import java.util.Scanner;
public class binarysearch {
public static int binarySearch(int[] nums, int target)
 {
 int left = 0, right = nums.length-1;
 while (left <= right)
 {
 int mid = left +(right-left) / 2;
 
 if (target == nums[mid]) {
 return mid;
 }
 else if (target < nums[mid]) {
 right = mid - 1;
 }
 else {
 left = mid + 1;
 }
 }
 return -1;
 }
 public static void main(String[] args)
 {
 Scanner input= new Scanner(System.in);
 System.out.println("Enter Array length:");
 int len = input.nextInt(); 
 int[] nums = new int[len]; 
 System.out.println("Enter " + len + " elements");
 for (int i = 0; i < len; i++)
 {
 nums[i] = input.nextInt();
 }
 System.out.println("Enter the search key value:");
 int target = input.nextInt();
 int index = binarySearch(nums, target);
 if (index != -1) {
 System.out.println("Element found at index " + index);
 }
 else {
 System.out.println("Element not found in the array");
 }
 }
}