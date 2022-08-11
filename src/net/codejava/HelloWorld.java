package net.codejava;
import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name = s.next();
		System.out.println("Enter the Id");
		int id = s.nextInt();
		System.out.println("name"+" "+ " id"+ " " +id);	
	}
}

