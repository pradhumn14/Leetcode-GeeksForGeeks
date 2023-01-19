

class Solution {

    public class diaPair {
        int ht = -1;
        
        
        int d = 0;
    }
        public int diameterOfBinaryTree(TreeNode root) {
            return diameter(root).d;
        }

        public diaPair diameter(TreeNode root) {
            if (root == null) {
                return new diaPair();
            }
            diaPair ldp = diameter(root.left);
            diaPair rdp = diameter(root.right);
            diaPair sdp = new diaPair();

            int sd = ldp.ht + rdp.ht + 2;

            sdp.d = Math.max(ldp.d, Math.max(rdp.d, sd));
            sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
            return sdp;
        }

    }