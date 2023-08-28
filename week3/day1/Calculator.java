package week3.day1;

public class Calculator {
 public void add(int x ,int y) {
	 System.out.println(x+y);
 }
 public void add(int x,int y, int z) {
	 System.out.println(x+y+z);
 }
 public void mul(float a,float b) {
		 
	System.out.println(a*b);
		 }
	 
 public void mul (double a,double b) {
	 System.out.println(a*b);
 }
 
	 public static void main(String[] args) {
		 
	 Calculator cal =new Calculator();
	 cal.add(2, 3);
	 cal.add(1, 2, 3);
	 cal.mul(3.5, 3.7);
	 cal.mul(5.2f, 7.2f);
 }
 
 }

