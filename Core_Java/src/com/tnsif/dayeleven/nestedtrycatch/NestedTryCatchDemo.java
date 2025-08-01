package com.tnsif.dayeleven.nestedtrycatch;

public class NestedTryCatchDemo {
	public static void main(String[] a) {
		String name;
		int pos;
		try (Scanner sc = new Scanner(System.in)) {
			try {
				System.out.println("Enter your name : ");
				name = sc.next();
				System.out.println("Enter the position : ");
				pos = sc.nextInt();
				try {
					System.out.println("character at index " + pos + " in '" + name + "' is " + name.charAt(pos));
				} catch (StringIndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter integer ");
			}
		}

	}


}
