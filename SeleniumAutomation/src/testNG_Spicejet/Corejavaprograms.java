package testNG_Spicejet;


import org.testng.annotations.Test;

public class Corejavaprograms {
	
	
	  public class CorejavaPrograms {
	  @Test(enabled=false)
	  public void reverseString() {
		  String str="Nagesh";
		  System.out.println(str.length());
		  
		  for(int i=0; i<str.length(); i++) {
			  System.out.println(str.charAt(i));		  
		  }
		 System.out.println("----------------------"); 
		  for(int i=str.length()-1; i>=0; i--) {
			  System.out.println(str.charAt(i));	  
		  }
		  
		 /* System.out.print(str.charAt(0));
		  System.out.print(str.charAt(1));
		  System.out.print(str.charAt(2));
		  System.out.print(str.charAt(3));
		  System.out.print(str.charAt(4));
		  System.out.println(str.charAt(5));*/
		  
	  }
	  
	  @Test(enabled=false)
	  public void stringComparisons() {
		  String str="Nagesh";
		/*  if(str.equalsIgnoreCase("nagesh")) {
			  System.out.println("Matching");
		  }else {
			  System.out.println(" Not Matching");
		  }*/
	/*	  if(str.equals("nagesh")) {
			  System.out.println("Matching");
		  }else {
			  System.out.println(" Not Matching");
		  }*/
		  if(str.contains("Nag")) {
			  System.out.println("available");
		  }else {
			  System.out.println(" Not available");
		  }
		  
	  }
	  @Test
	  public void palindrome() {
		  String str="Madam";
		  String str1 = "";
		  for(int i=str.length()-1; i>=0; i--) {
			  System.out.println(str.charAt(i));
			  str1=str1+str.charAt(i);
		  }
		  System.out.println(str1);
		  if(str.equalsIgnoreCase(str1)) {
			  System.out.println("Palindrome");
		  }else {
			  System.out.println("Not Palindrome");
		  }
		  
	  }
	}


























}
