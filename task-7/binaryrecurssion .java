import java.util.Scanner;
public class binaryrecurssion {
public static int binarySearch(int[] nums, int left, int right, int target)
 {
 if (left > right) {
 return -1;
 }
 int mid = left + (right-left) / 2;
 if (target == nums[mid]) {
 return mid;
 }
 else if (target < nums[mid]) {
 return binarySearch(nums, left, mid - 1, target);
 }
 else {
 return binarySearch(nums, mid + 1, right, target);
 }
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
 int left = 0;
 int right = nums.length - 1;
 int index = binarySearch(nums, left, right, target);
 if (index != -1) {
 System.out.println("Element found at index " + index);
 }
 else {
 System.out.println("Element not found in the array");
 }
 }
}