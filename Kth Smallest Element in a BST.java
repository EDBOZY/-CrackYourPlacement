class Solution {
    int c=0;
    public int kthSmallest(TreeNode root, int k) {
        
        if(root==null){
            return -1;
        }
        int left=kthSmallest(root.left,k);
        if(left!=-1){
            return left;
        }
        c++;
        if(c==k){
            return root.val;
        }
        int right=kthSmallest(root.right,k);
        return right;
    }
}
