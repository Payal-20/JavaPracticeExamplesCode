// Java program to demonstrate working
// of StringBuffer.deleteCharAt() method

import java.lang.*;
class Payal
{

	public static void main(String[] args)
	{

		StringBuffer sbf = new StringBuffer("BHOR");
		System.out.println("String buffer before deletion = " + sbf);

		// Deleting the character at indexpoint 5
		sbf.deleteCharAt(3);
		System.out.println("After deletion new StringBuffer = " + sbf);
	}
}
// Java program to demonstrate StringBuffer insert
// for boolean input.
class GFG {
	public static void main(String[] args)
	{
		StringBuffer str =
			new StringBuffer("example  for practical");
		System.out.println("string = " + str);

		// insert boolean value at offset 8
		str.insert(8, true);

		// prints stringbuffer after insertion
		System.out.print("After insertion = ");
		System.out.println(str.toString());
	}
}
class StringGetCharsExample2 { 
    public static void main(String[] args){          
        String str = new String("Welcome to Javatpoint");         
        char[] ch  = new char[20];      
        try {  
    str.getChars(1, 26, ch, 0);  
 System.out.println(ch);  
} catch (Exception e) {  
System.out.println(e);          
}  
}  }
	 class EqualsExample{  
  	public static void main(String args[]){  
  	String s1="javatpoint";  
  	String s2="javatpoint";  
  	String s3="JAVATPOINT";  
  	String s4="python";  
  	System.out.println(s1.equals(s2));//true because content and case is same  
  	System.out.println(s1.equals(s3));//false because case is not same  
  	System.out.println(s1.equals(s4));//false because content is not same  
  }}  
  	class EqualsIgnoreCaseExample{  
    	public static void main(String args[]){  
    	String s1="javatpoint";  
    	String s2="javatpoint";  
    	String s3="JAVATPOINT";  
    	String s4="python";  
     System.out.println(s1.equalsIgnoreCase(s2));//true because content and case b oth are same  
     System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  9.
    System.out.println(s1.equalsIgnoreCase(s4));//false because content is not sam e  
    }}
    	 class StartsWithExample{  
      	public static void main(String args[]){  
      	String s1="java string split method by javatpoint";  
      	System.out.println(s1.startsWith("ja"));  
      	System.out.println(s1.startsWith("java string"));  
      	}} 
        	 class EndsWithExample{  
          	public static void main(String args[]){  
          	String s1="java by javatpoint";  
          	System.out.println(s1.endsWith("t"));  
          	System.out.println(s1.endsWith("point"));  
          	}}  
            class SubstringExample{  
            	public static void main(String args[]){  
            	String s1="javatpoint";  
            	System.out.println(s1.substring(2,4));//returns va  
            	System.out.println(s1.substring(2));//returns vatpoint  
            	}}  
              

