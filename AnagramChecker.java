/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe528.lab2;
import java.util.Arrays;

//Requires: It shouldn't be null and should have letters
//Modifies: Each of the character arrays become modified by it being sorted into ascending order
//Each of the chars also get changed to lower case
//Effects: This method then compares the arrays to see if the chars allign, true if it does and false if it does not
public class AnagramChecker {

    public static boolean areAnagrams(char [] str1, char [] str2){
     if(str1.length!=str2.length){
         return false;
     }
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        
        
        for(int i=0;i<str1.length;i++){
          Character.toLowerCase(str1[i]);
          Character.toLowerCase(str2[i]);
         
            if(str1[i]!=str2[i]){
              return false;
          }
          
        }
      return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[]a = {'l','i','s','t','e','n'};
        char[]b = {'s','i','l','e','n','t'};
         char[]c= {'H','e','l','l','o','w'};
          char[]d = {'W','o','r','l','d'};
           char[]e = {'D','o','r','m','i','t','o','r','y'};
           char[]f = {'D','i','r','t','y',' ','r','o','o','m'};
  if(args.length == 1) {
if (args[0].equals("1"))
System.out.println(areAnagrams(a,b));
else if (args[0].equals("2"))
System.out.println(areAnagrams(c,d));
else if (args[0].equals("3"))
System.out.println(areAnagrams(e,f));

}
    }}
    
