class Solution {
    public int maxLevelSum(TreeNode root) {
        
        if (root == null) {
            return 0;
        }
        
        int currentLevel = 1;
        
        int maxSum = Integer.MIN_VALUE;
        int maxSumLevel = 0;
        
        
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        
        while (!Q.isEmpty()) {
            int n = Q.size();
            int sum = 0;
            
            for (int index = 0; index < n; index++) {
                TreeNode currNode = Q.poll();
                sum += currNode.val;
                
                if (currNode.left != null) {
                    Q.add(currNode.left);
                }
                
                if (currNode.right != null) {
                    Q.add(currNode.right);
                }
            }
            
            if (maxSum < sum) {
                maxSum = sum;
                maxSumLevel = currentLevel;
            }
            
            currentLevel++;
        }
        return maxSumLevel;
    }
}
