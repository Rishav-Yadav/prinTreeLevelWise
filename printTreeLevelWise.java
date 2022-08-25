import java.util.Queue;
import java.util.LinkedList;
public class Solution {


 class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		
        
        Queue<TreeNode<Integer>> pendingNodes=new LinkedList();
        pendingNodes.add(root);
     
        int currentLevel=1,nextLevel=0;
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode=pendingNodes.poll();
            if(currentLevel==0){
                System.out.println();
                currentLevel=nextLevel;
                nextLevel=0;
            }
            System.out.print(frontNode.data+" ");
            for(int i=0;i<frontNode.children.size();i++){
                pendingNodes.add(frontNode.children.get(i));
               nextLevel++;
           }
            currentLevel--;
        }
        

	}
		
}
