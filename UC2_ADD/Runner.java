package com.bridgelabz;

public class Runner {

	public static void main (String[]args) {
		MyBinaryTree<Integer> element = new MyBinaryTree<>();
		element.add(56);
		element.add(30);
		element.add(70);
		element.add(22);
		element.add(40);
		element.add(60);
		element.add(95);
		element.add(11);
		element.add(65);
		element.add(3);
		element.add(16);
		element.add(63);
		element.add(67);
		int size = element.getSize();
		System.out.println(size);

	}
}


