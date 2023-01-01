package leetcode.java.tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//class Solution_2236 {
//    public boolean checkTree(TreeNode root) {
//        return root.val == root.left.val + root.right.val;
//    }
//}

/*
* https://leetcode.com/problems/root-equals-sum-of-children/submissions/
* 회고
* 어제에 이어서 binary Search 문제를 풀려고 했는데 풀려고 했던 문제가 tree 와 관련된 문제였다. 그런데 지금까지 tree 와 관련된 문제가 나올 때마다 너무 어렵다고 느껴 이참에 tree 부터 좀 친숙해져보려고 한다.
* 그래서 tree 문제 중 가장 쉬운 문제 하나를 풀어봤다. Acceptance 87.9% 라 정말 간단했음. 조금씩 어려운 문제를 풀어보면서 tree 와 가까워져야겠다.
* */