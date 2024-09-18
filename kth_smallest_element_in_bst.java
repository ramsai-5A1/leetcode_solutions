class Solution {


    private void helper(TreeNode root, int[] store) {
        if (root == null) {
            return;
        }
        helper(root.left, store);
        store[0]--;
        if (store[0] == 0) {
            store[1] = root.val;
        }
        helper(root.right, store);
    }

    public int kthSmallest(TreeNode root, int k) {
        int[] store = new int[2];
        store[0] = k;
        helper(root, store);
        return store[1];
    }
}
