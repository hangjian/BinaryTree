package com.hangjian.binarytree.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.hangjian.binarytree.TreeNode;

/**
 * 处理二叉树的工具类
 * @author 杭健
 *
 */
public class BinaryTreeUtil {
	private BinaryTreeUtil() {

	}

	/**
	 * 先序遍历
	 * 
	 * @param node 需要遍历的二叉树的根节点
	 * @return 按所需顺序遍历后的元素List
	 */
	public static <T> List<T> DLR(TreeNode<T> node) {
		ArrayList<T> list = new ArrayList<>();
		DLRTraverse(list, node);
		return list;
	}

	private static <T> void DLRTraverse(ArrayList<T> list, TreeNode<T> node) {
		list.add(node.getData());
		if (node.getLeft() != null) {
			DLRTraverse(list, node.getLeft());
		}
		if (node.getRight() != null) {
			DLRTraverse(list, node.getRight());
		}
		if (node.getLeft() == null && node.getRight() == null) {
			return;
		}

	}

	/**
	 * 中序遍历
	 * 
	 * @param node 需要遍历的二叉树的根节点
	 * @return 按所需顺序遍历后的元素List
	 */
	public static <T> List<T> LDR(TreeNode<T> node) {
		ArrayList<T> list = new ArrayList<>();
		LDRTraverse(list, node);
		return list;
	}

	private static <T> void LDRTraverse(ArrayList<T> list, TreeNode<T> node) {
		if (node.getLeft() != null) {
			LDRTraverse(list, node.getLeft());
		}
		list.add(node.getData());
		if (node.getRight() != null) {
			LDRTraverse(list, node.getRight());
		}
		if (node.getLeft() == null && node.getRight() == null) {
			return;
		}
	}

	/**
	 * 后序遍历
	 * 
	 * @param node 需要遍历的二叉树的根节点
	 * @return 按所需顺序遍历后的元素List
	 */
	public static <T> List<T> LRD(TreeNode<T> node) {
		ArrayList<T> list = new ArrayList<>();
		LRDTraverse(list, node);
		return list;
	}

	private static <T> void LRDTraverse(ArrayList<T> list, TreeNode<T> node) {
		if (node.getLeft() != null) {
			LRDTraverse(list, node.getLeft());
		}
		if (node.getRight() != null) {
			LRDTraverse(list, node.getRight());
		}
		list.add(node.getData());
		if (node.getLeft() == null && node.getRight() == null) {
			return;
		}
	}

	/**
	 * 层序遍历
	 * 
	 * @param root 需要遍历的二叉树的根节点
	 * @return 按所需顺序遍历后的元素List
	 */
	public static <T> List<T> BFS(TreeNode<T> root) {
		Queue<TreeNode<T>> q = new LinkedList<>();
		ArrayList<T> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		if (root.getLeft() == null && root.getRight() == null) {
			list.add(root.getData());
			return list;
		}
		q.add(root);
		BFSTraverse(root, list, q);
		return list;
	}

	private static <T> void BFSTraverse(TreeNode<T> root, ArrayList<T> list, Queue<TreeNode<T>> q) {
		TreeNode<T> temp = q.remove();
		list.add(temp.getData());
		if (temp.getLeft() != null) {
			q.add(temp.getLeft());
		}
		if (temp.getRight() != null) {
			q.add(temp.getRight());
		}
		if (temp.getLeft() != null) {
			BFSTraverse(temp.getLeft(), list, q);
		}
		if (temp.getRight() != null) {
			BFSTraverse(temp.getRight(), list, q);
		}
		if (temp.getLeft() == null && temp.getRight() == null)
			return;

	}
}
