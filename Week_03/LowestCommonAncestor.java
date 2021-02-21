/**
 * 题目：二叉树的最近公共祖先
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 4.最坏的情况就是当前轮询的root节点为null，对于上一层来说，当前这个子树没有p，q
        // 1.一般的情况，一直找下去，当前节点肯定是有p，q其中一个，对于上一层来说，就是左子树或右子数已经找到了
        if(null == root || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        // 2.如果两边子树只有一边有，那就返回另一边子树，两边肯定是有一边有的
        if(null == left || null == right){
            return (null == left) ? right:left;
        }
        // 3.不管是哪一层 左子树和右子树如果都有，那就返回当前父亲:root,也就是当前的公共祖先
        return root;

    }
}
