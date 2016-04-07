import java.util.*;

class Node{
	Node next = null;
	int data;

	public Node(int data){
		this.data = data;
	}

	void appendToTail(int data){
		Node end = new Node(data);

		Node n = this;

		while(n.next!=null){
			n = n.next;
		}
		n.next = end;
	}
}

class ll_21{
	public static void main(String[] args){
		Node head = new Node(1);
		Node cond = head;
		cond.next = new Node(1);
		cond = cond.next;
		cond.next = new Node(1);
		cond = cond.next;
		cond.next = new Node(2);
		cond = cond.next;
		cond.next = new Node(3);
		cond = cond.next;
		cond.next = new Node(2);
		cond = cond.next;
		cond.next = new Node(4);
		cond = cond.next;
		cond.next = new Node(4);
		cond = cond.next;
		cond.next = new Node(1);
		cond = cond.next;
		cond.next = new Node(5);
		cond = cond.next;
		cond.next = new Node(5);

		removeDuplicates(head);

		printNode(head);
	}

	public static void removeDuplicates(Node head){
		Node cond = head;
		Node prevCond = null;
		HashMap<Integer, Boolean> check = new HashMap<Integer, Boolean>();

		while(cond!=null){
			if(check.get(cond.data)==null){
				check.put(cond.data, true);
				prevCond = cond;
				cond = cond.next;
			}
			else{
				prevCond.next = cond.next;
				cond = cond.next;
			}
		}
	}

	public static void printNode(Node head){
		Node cond = head;
		while(cond!=null){
			System.out.print(cond.data + " ");
			cond = cond.next;
		}
		System.out.println();
	}
}