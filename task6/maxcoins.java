import java.util.*;
public class maxcoins {
 private static int getChange(int m) {
 int[] coinnames = {10,5,1};
 int qtyCoins = 0;
 while(m > 0){
 for(int i = 0; i < coinnames.length; i++){
 if(m >= coinnames[i]){
 m -= coinnames[i];
 qtyCoins++;
 break;
 }
 }
 }
 System.out.print("No of coins required:-");
 return qtyCoins;
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int m = scanner.nextInt();
 System.out.println(getChange(m));
 }
}
