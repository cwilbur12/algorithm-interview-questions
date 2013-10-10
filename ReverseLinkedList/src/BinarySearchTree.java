import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;


public class BinarySearchTree {
	
	
	
	
	
	public static void main(String[] args){
		Node root = new Node(new Node(null,null,1), new Node(null,null,3), 2);
		
		
	}
	
	
}

class Node{
	Node leftChild;
	Node rightChild;
	int value;
	
	public Node(Node lc, Node rc, int value){
		leftChild = lc;
		rightChild = rc;
		this.value = value;
	}
	
	//a lot of work to do 
	public String toString(){
		//difficult implementation 
		ArrayList<Integer> listToPrint = toStringHelper(this);
		String output = "";
		
		output = listToPrint.get(0) + "/n";
		StringBuilder builderOutput = new StringBuilder(output);
		for(int i = 1;i<listToPrint.size();i++){
			 int level = (int) Math.pow(2,i); //a^b
			 for(int j = 1; j <= level; j +=2){
				 builderOutput.append("/" + " \\ ");
			 }
			 builderOutput.append("/n");
		}
		
		return output;
	}
	
	public ArrayList<Integer> toStringHelper(Node n){
		ConcurrentLinkedQueue<Node> queue = new ConcurrentLinkedQueue<Node>();
		
		ArrayList<Integer> listToPrint = new ArrayList<Integer>();
				
		queue.add(n);
		
		while(!queue.isEmpty()){

			queue.add(n.leftChild);
			queue.add(n.rightChild);
			
			listToPrint.add(queue.poll().value);

		}

		return listToPrint;
	}
}
