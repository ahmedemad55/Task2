/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Project2 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("1-Saturday,2-Sunday,3-Monday,4-Tuesday,5-Wednesday,6-Thursday,7-Friday");   
        System.out.println("Please choose a number : ");
        int num = in.nextInt();
        
        switch (num) {
            case (1)://Saturday
                for (int k = 1; k <=5; k++) {
                    if (k==3) {
                        System.out.println("This line is empty   ");
                        continue;
                    }
                    for (int j = 0; j <k; j++) {
                        System.out.print("*"); }
                    System.out.println(); }
       
                break;
            case(2):   
            case(3)://Sunday,Monday
                 System.out.println("Entere a number");
                 int size = in.nextInt();
                 int array [] =new int[size];
                 for (int i = 0; i < size; i++) {
                    System.out.println("Entere the elements:");
                     array[i]= in.nextInt();
                }
                  double aver = 0;
                   for (int i = 0; i < size; i++) {
                     aver = aver+array[i]; 
                     }

                  aver =aver/size;

                  System.out.println("Average=" + aver);
                 
                break;
            
             case (4)://Tuesday
                 System.out.println("This is a break");
                break;
                
             case (5)://Wendesday
                 System.out.println("Enter number of rows : "); 
                   int row = in.nextInt(); 
                  System.out.println("Enter number of colums : "); 
                    int col = in.nextInt(); 
                  int[][] math = new int[row][col]; 
             
                  for (int indexR = 0; indexR <row ; indexR++) { 
                     for (int indexC = 0; indexC < col; indexC++) { 
                         System.out.println("Enter a number: ");  

                         math[indexR][indexC] = in.nextInt(); } 
                    } 
                  
                 for (int indexR = 0; indexR < row; indexR++) { 
                     for (int indexC = 0; indexC < col; indexC++) {     
                         System.out.print(math[indexR][indexC] + " ");}
                      
                     System.out.println(); }
                 break;
                 
             case (6):// Thursday
                    int[] Array= new int[4];
                     for (int i = 0; i < 4; i++) { 
                         System.out.println("Enter an array: ");  
                         Array[i] = in.nextInt(); 
                         } 
                         Array(Array);
                     for (int i = 0; i < 4; i++) {
                         System.out.print(Array[i]+" ");}
                 break;
             case(7)://Friday
                 System.out.println("Enter a number : ");
                  int x = in.nextInt(); 
                    method(x);
                    
                 System.out.println("Enter a number : ");
                  float multi = in.nextFloat();
                   method(multi);
                   
                 System.out.println("Enter a word : ");
                  String word = in.next();
                   method(word);
                break;
              
              default:
                System.out.print("Please entere a vaild number ");
        }
        }
        
     public static int method (int x){
         for (int i = 0; i < x; i++) {
               System.out.println("OOP");
        }
         return x ;  } 
     public static float method (float multi){
                 System.out.println(multi*3);
         return (multi*3) ; 
        } 
     public static String method (String word){
                 System.out.println("Hello " +word );
         return ("Hello"+word );  
        } 
     public static void Array (int [] Array){
         for (int i = 0; i < 4; i++) {
             Array [i] +=5;}
         }
}

         
      
     
   

