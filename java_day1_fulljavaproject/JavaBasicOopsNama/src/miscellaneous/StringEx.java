package miscellaneous;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

//main thread, thread1 =  sb, main thread = sb.append("AA").delete()., thread1 = sb.append("cccc")
public class StringEx {

	public static void main(String[] args) {
		
		String s = "CoreJava";  //String is immutable is java
		
		  //s.toUpperCase();
		s = s.toUpperCase(); //mutate the String , it creates a new String object "COREJAVA"
		System.out.println(s);
		
	    //for each change new String instance will get created that will block memory till its garbage collected
		s = s.toLowerCase().substring(4).toUpperCase().concat(" is lang");
		System.out.println(s);
		
		//to avoid this, use StringBuilder when you have to make lots of changes to string
			
		/* StringBuffer (legacy class used before java 1.5) and StringBuilder (added in java 1.5)
		  all methods of StringBuffer are synchronized so work bit slower than non-synchronized equivalent methods
		   of StringBuilder */
		//so for non-multithreaded env or multithreaded env but not sharing the same instance - StringBuilder
		// multithreaded and sharing the same string instance - StringBuffer = synchronized append,synchronized delete
		
		String s1 = "CoreJava";
		//String ==> StringBuilder 
		StringBuilder sb = new StringBuilder(s1);
	    StringBuffer sb1 = new StringBuffer(s1);
	   
		//StringBuilder ==> String
	    s1 = sb.append(" is lang").append(222).substring(1);
        System.out.println(s1);
       
        //String ==> StringBuilder 
        s1 = "CoreJava";
        sb = new StringBuilder(s1);
        
    	//StringBuilder ==> String
        s1 = sb.append(" is lang").append(222).delete(9,11).toString();
        System.out.println(s1);
        
        StringBuilder b = new StringBuilder("CoreJava");
        b.append(" is imp lang"); //this will change/modify the same stringbuilder object b
        System.out.println(b);
        
        //multiline string --> to separate String objects
        String ss = "Hi All of u\n I am fine thank you \n this is it";
        System.out.println(ss);
    //    ss.lines().forEach(str->System.out.println(str));
        
        //multiline String into List of String objects
        List<String> lns = ss.lines().collect(Collectors.toList());
        System.out.println(lns);
        
        //multiline string --> to separate String objects
        ss = "Mango\nApple\nStrawberry";
        System.out.println(ss);
    //    ss.lines().forEach(str->System.out.println(str));
        
        //lines method is added in java11
        //multiline String --> List of String 
        List<String> fruits = ss.lines().collect(Collectors.toList());
        System.out.println(fruits);
        
        //String -> List<Character>
        String ss1 = "Namrata";
        List<Character> lsc = ss1.chars().mapToObj(n->(char)n).collect(Collectors.toList());
        System.out.println(lsc);
        
        //String --> char[]
        char[] arr = ss1.toCharArray();
        List<Character> lsc1 = new ArrayList<Character>();
        for(char c :arr)
        	lsc1.add(c);
        
        //String --> byte[]
        byte[] byarr = "asjdhj sjkdhaskdjsad aksdsajdjasd aksjdgasjds".getBytes();
        
        System.out.println("Namrata".charAt(0));
        
        //strip,stripLeading,stripTrailing is added java11
        // test case 2 //trim is not unicode aware so it wont trim unicode character of space but strip will do/strip it
        final String str2 = "namrata \u2005";  // Unicode of white-space
        System.out.println(str2.trim().equals(str2.strip())); // return --> false
        
        String str5 = "\t    Namrata    \u2005";
        System.out.println("xxx"+str5+"xxx");
        System.out.println(str5.strip());
        
        String str6 = "\t   Namrata    \u2005";
        System.out.println("xxx"+str6.stripLeading()+"xxx");
        
        String str7 = "\t    Namrata    \u2005";
        System.out.println("xxx"+str7.stripTrailing()+"xxx");

        String str1 = "Namrata Marathe";
        String result1 = str1.repeat(5); //java 11
        System.out.println(result1);

       
 
	}

}
