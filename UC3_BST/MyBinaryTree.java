package com.bridgelabz.bst;

public class MyBinaryTree<K extends Comparable<K>>{

	private MyBinaryNode<K> root;

	public void add (K key) {
		this.root = this.addRecursively(root,key);
	}

	private MyBinaryNode<K>addRecursively(MyBinaryNode<K> current, K key){

		if(current==null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult==0)
			return current;
		if(compareResult<0) {
			current.left =addRecursively(current.left, key);
		}
		else {
			current.right =addRecursively(current.right, key);
		}
		return current;

	}

	public MyBinaryNode<K> search(K key) {

		return searchRecursive(root, key);
	}

	private MyBinaryNode<K> searchRecursive(MyBinaryNode<K> current, K key) {
		if (current == null)    
			return null;
		else if(current.key.compareTo(key) == 0)     
			return current;
		else if(current.key.compareTo(key) < 0)      
			return searchRecursive(current.right, key);
		else
			return searchRecursive(current.left, key);  
	}

	public void printNodes() {
		printNodes(root);

	}

	private void printNodes(MyBinaryNode<K> root) {
		if (root != null) {
			printNodes(root.left);
			System.out.println(root.key);
			printNodes(root.right);

		}
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}
	public int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 +this.getSizeRecursive(current.left)+this.getSizeRecursive(current.right);

	}

}


