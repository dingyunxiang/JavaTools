package cn.dingyunxiang;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dingyunxiang on 16/7/20.
 */
public class TreeScan {





//    Definition for a binary tree node.

    public void preScan(TreeNode root,List<Integer> list){
        if(root == null) return ;
        preScan(root.left,list);
        list.add(root.val);
        preScan(root.right,list);
    }


    public static void main(String[] args) {
        TreeScan t = new TreeScan();

        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        root.left = l1;
        TreeNode r1 = new TreeNode(3);
        root.right = r1;
        TreeNode l11 = new TreeNode(4);
        l1.left = l11;
        TreeNode l12 = new TreeNode(5);
        l1.right = l12;
        List<Integer> list = new ArrayList<Integer>();

        t.preScan(root,list);
        StringBuffer s = new StringBuffer(list.toString());
//        System.out.println(s);
        System.out.println(t.isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        List<Integer> list = new ArrayList<Integer>();
        preScan(root,list);
        return judgeList(list);


    }



    public boolean judgeList(List<Integer> list){
        int length = list.size();
        int low = 0;
        int high = length - 1;
        while(low<high){
            if(list.get(low)!=list.get(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
