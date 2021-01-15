import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_6_LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner teclado = new Scanner(System.in);
        
        int number = Integer.parseInt(teclado.nextLine());
        String [] wordEven = new String[number];
        String [] wordOdd = new String[number];
        
        for(int i=0; i < number; i++) {
            wordEven[i] = "";
            wordOdd[i] = "";
            
           String wordTemp = teclado.nextLine();
           
           char [] wordChar = new char[wordTemp.length()];
           
           for (int j = 0; j < wordChar.length; j++) {
               wordChar[j] = wordTemp.charAt(j);
           }
           
           int index = 0;
           for(char c: wordChar) {
               if(index % 2 == 0) {
                   wordEven[i] += c;
               }else {
                   wordOdd[i] += c;
               }
               index++;
           }
        }
        
        for(int i=0; i < number; i++) {
            System.out.printf(String.format("%s %s\n", wordEven[i], wordOdd[i]));
        } 
        
        teclado.close();
    }
}