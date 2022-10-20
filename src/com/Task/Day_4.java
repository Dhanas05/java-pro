package com.Task;

public class Day_4 {
public static void main(String[] args) {
	
	String s = "greens technology";
	String s1 = "GREENS TECHNOLOGY";
	String s2= "seleniumautomationtool";
	String s3 = "velumurgan";
	String s4 = "java ";
	String s5 = "9095484678";
	
	int l = s.length();
	int l1 = s1.length();
	int l2 = s2.length();
	int l3 = s3.length();
	int l4 = s4.length();
	int l5 = s5.length();

System.out.println(l);
System.out.println(l1);
System.out.println(l2);
System.out.println(l3);
System.out.println(l4);
System.out.println(l5);

 char ch = s.charAt(14);
 System.out.println(ch);
 
 int in = s1.indexOf("O");
 System.out.println(in);
 
 boolean b = s1.equals("s2");
 System.out.println(b);

String r = s.replace("technology", "Adayar");
System.out.println(r);

String l6 = s1.toLowerCase();
System.out.println(l6);

String u = s.toUpperCase();
System.out.println(u);

String r1 = s.replace("e", "@");
System.out.println(r1);


}
}
