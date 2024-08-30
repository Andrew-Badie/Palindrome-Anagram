/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab2;

/**
 *
 * @author andre
 */
public class Palindrome {
    
//Requires: It should not be null and should have a length that is greater than 1

//Effects: The string a gets compared to a string which is reverse of it by using the for loop and the
    //specific conditions. It returns false if it does not align and true if it does.
public static boolean isPalindrome(String a) {
   String reverse ="";
   if(a==null||a.length()==0){
       return false;
   }
for(int i=a.length()-1; i>=0;i--){
reverse = reverse +a.charAt(i);

  
}
if(reverse.equalsIgnoreCase(a)){
     
    return true;
   
}
else {
  
    return false;
}
}

public static void main(String[] args) {
  
if(args.length == 1) {
if (args[0].equals("1"))
System.out.println(isPalindrome(null));
else if (args[0].equals("2"))
System.out.println(isPalindrome(""));
else if (args[0].equals("3"))
System.out.println(isPalindrome("deed"));
else if (args[0].equals("4"))
System.out.println(isPalindrome("abcd"));
}
}

    
    
}
    
    