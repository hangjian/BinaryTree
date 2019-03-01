package com.hangjian.binarytree;

/**
 * 二叉树节点类
 * @author 杭健
 *
 */
public class TreeNode<T> {

	/**
	 * 节点的数据
	 */
	private T data;
	/**
	 * 节点的左子树
	 */
	private TreeNode<T> left;
	/**
	 * 节点的右子树
	 */
	private TreeNode<T> right;

	public TreeNode() {
	}

	public TreeNode(T data) {
		super();
		this.data = data;
	}

	public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}

}
