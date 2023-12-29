
public class PrintLeafNodes {
	
	public static void printLeafNodes(TreeNode head) {
		if(head==null) {
			return;
		}
		if(head.left==null && head.right==null) {
			System.out.print(head.val + " ");
			return;
		}
		if(head.left!=null) {
			printLeafNodes(head.left);
		}
		if(head.right!=null) {
			printLeafNodes(head.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t9 = new TreeNode(9);
		TreeNode t12 = new TreeNode(12);
		TreeNode t16 = new TreeNode(16);
		TreeNode t19 = new TreeNode(19);
		TreeNode t21 = new TreeNode(21);
		TreeNode t23 = new TreeNode(23);
		TreeNode t3 = new TreeNode(3, t9, t12);
		TreeNode t5 = new TreeNode(5, t16, t19);
		TreeNode t4 = new TreeNode(4, null, t21);
		TreeNode t11 = new TreeNode(11, null, t23);
		TreeNode t7 = new TreeNode(7, t3, t5);
		TreeNode t8 = new TreeNode(8, t4, t11);
		TreeNode t10 = new TreeNode(10, t7, t8);
		
		printLeafNodes(t10);
	}

}
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val){
		this.val = val;
	}
	TreeNode(int val, TreeNode left, TreeNode right){
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
