

public class ReverseLinkedList {
	
	public static void main(String[] args){
		List myList = new List(1);
		myList.next = new List(2);
		myList.next.next = new List(3);
		myList.next.next.next = new List(4);
		
		System.out.println(myList.toString());
		
		//System.out.println(reverse(myList).toString());
		
		System.out.println(reverseIter(myList).toString());

		
	}
	
	
	public static List reverse(List l){
		if (l == null || l.next == null)
			return l;
		List remainingReverse = reverse(l.next);
		List curr = remainingReverse;
		while(curr.next != null){
			curr = curr.next;
		}
		curr.next = l;
		l.next = null;
		
		return remainingReverse;
	}
	
	public static List reverseIter(List Node) {
	    List previous = null;
	    while (Node != null) {
			List next = Node.next; //Step 1: first so we have it when we need to get the next one in the list
	        Node.next = previous; //Step 2: make the current nodes next the node that has already been moved (the one before it or n-1)
	        previous = Node; //Step 3: now the current node will become previous for the next round
	        Node = next; //Step 4: make the current node the node you got from step 1.
	    }
	    return previous;
	}
}




class List{
	int value;
	List next;
	
	public List(int k){
		value = k;
		next = null;
	}
	
	public String toString(){
		List curr = this;
		String output = "";
		while (curr != null){
			output += curr.value + "-->";
			curr = curr.next;
		}
		
		return output + "TAIL";
	}
	
}