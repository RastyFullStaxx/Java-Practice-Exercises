public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();
        TreeNode p = root.left;
        TreeNode q = root.right;

        TreeNode lca = lowestCommonAncestor(root, p, q);

        System.out.println("Lowest Common Ancestor of Nodes " + p.data + " and " + q.data + ": " + lca.data);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        return root;
    }
}
