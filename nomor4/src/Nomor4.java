/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package nomor4;
import java.util.Scanner;
/**
 *
 * @author Praktikum
 */
public class Nomor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n, sum = 0, temp, remainder, digits = 0;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number : ");      
      n = in.nextInt();
 
      temp = n;
 
   
 
      while (temp != 0) {
         digits++;
         temp = temp/10;
      }
 
      temp = n;
 
      while (temp != 0) {
         remainder = temp%10;
         sum = sum + power(remainder, digits);
         temp = temp/10;
      }
 
      if (n == sum)
         System.out.println(n + " is an Armstrong number.");
      else
         System.out.println(n + " is not an Armstrong number.");         
   }
 
   static int power(int n, int r) {
      int c, p = 1;
 
      for (c = 1; c <= r; c++) 
         p = p*n;
 
      return p;   
   }
}



 

   
      