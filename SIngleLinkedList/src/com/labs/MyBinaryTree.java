package com.labs;

public class MyBinaryTree<T1 extends Comparable<T1>, T2> {
	private OneNode<T1, T2> rootNode;

	public void addNode(T1 key, T2 val) {
		OneNode<T1, T2> curNode = rootNode;
		OneNode<T1, T2> tmpNode = null;

		// find Node with appropriate key
		while (curNode != null) {
			int comparKeys = key.compareTo(curNode.key);

			if (comparKeys == 0) { // exist
				curNode.value = val;
				return;
			} else {
				tmpNode = curNode; // last node of branch
				curNode = comparKeys < 0 ? curNode.leftNode : curNode.rightNode;
			}
		}

		OneNode<T1, T2> newNode = new OneNode<T1, T2>(key, val);
		if (tmpNode == null) {
			rootNode = newNode;
		} else {
			// add new element into the last node of branch
			if (key.compareTo(tmpNode.key) < 0) {
				tmpNode.leftNode = newNode;
			} else {
				tmpNode.rightNode = newNode;
			}
		}
	}

	public T2 getValue(T1 key) {
		OneNode<T1, T2> curNode = rootNode;

		while (curNode != null) {
			int cmp = key.compareTo(curNode.key);

			if (cmp == 0) {
				return curNode.value;
			}
			if (cmp < 0) {
				curNode = curNode.leftNode;
			} else {
				curNode = curNode.rightNode;
			}
		}
		return null;
	}

	public OneNode<T1, T2> findNode(T1 key) {
		OneNode<T1, T2> curNode = rootNode;

		while (curNode != null) {
			int cmp = key.compareTo(curNode.key);

			if (cmp == 0) {
				return curNode;
			}
			if (cmp < 0) {
				curNode = curNode.leftNode;
			} else {
				curNode = curNode.rightNode;
			}
		}
		return null;
	}

	static class OneNode<T1, T2> {
		T1 key;
		T2 value;
		OneNode<T1, T2> leftNode, rightNode;

		public OneNode(T1 key, T2 value) {
			super();
			this.key = key;
			this.value = value;
		}
		
		
		@Override
		public String toString() {
			String leftString = leftNode != null ?  " leftNode.key = " + leftNode.key : "";
			String rightString = rightNode != null ? " rightNode.key = " + rightNode.key : "";
			return "Found node [key=" + key + ", value=" + value + ", "
					+ leftString 
					+ rightString
					+ " ]";
		}
	}
	
}
