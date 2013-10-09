

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
			List next = Node.next;
	        Node.next = previous;
	        previous = Node;
	        Node = next;
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