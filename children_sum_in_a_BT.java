class Solution
{
        
    private static int[] helper(Node root) {
        if (root == null) {
            return new int[]{0, 1};
        } else if (root.left == null && root.right == null) {
            return new int[]{root.data, 1};
        }
        int[] leftStore = helper(root.left);
        int[] rightStore = helper(root.right);
        int[] currStore = new int[2];
        
        currStore[0] = root.data;
        if (leftStore[0] + rightStore[0] == root.data && leftStore[1] == 1 && rightStore[1] == 1) {
            currStore[1] = 1;
        }
        return currStore;
    }
    
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        int[] store = helper(root);
        return store[1];
    }
}
