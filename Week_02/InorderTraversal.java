import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * 题目：二叉树的中序遍历
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(null != root){
            // 解法一：
            // 递归查找
//            List<Integer> result = new ArrayList<>();
//            search(root,result);
//            return result;

            // 解法二：
            // 执行时间相对比较长 需要优化
            // 利用栈的先进后出
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode tempNode = root;
            // 或的条件就是 当前节点可能空了 但是栈里面还有元素需要拿出来
            while (null != tempNode || !stack.isEmpty()){
                // 先把当前节点下的左节点都存一遍栈中，第二轮的时候 不一定会走到这里
                while (null != tempNode){
                    stack.push(tempNode);
                    tempNode = tempNode.left;
                }
                // 有些遍历 可能直接走这一步，节点的根节点的终止条件就是右节点为空
                tempNode = stack.pop();
                result.add(tempNode.val);
                tempNode = tempNode.right;
            }
            return result;
        }
        return Collections.emptyList();
    }

    public void search(TreeNode node,List<Integer> result){

        if(null != node){
            // 先依次左节点 往下找
            if(null != node.left){
                search(node.left,result);
            }

            // 不管怎么样 当前节点肯定是要存的
            result.add(node.val);

            // 后依次右节点 往下找
            if(null != node.right){
                search(node.right,result);
            }
        }

    }
}

