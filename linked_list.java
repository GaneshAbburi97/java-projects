class singlelinkedlist {
Node head;
singlelinkedlist(){
	head = null;

}
class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}

}
// INSERT THE NODE AT FIRST

void insertfirst(int d) {
	Node newnode = new Node(d);
	if(head == null) {
		head = newnode;
	}
	else {
		newnode.next=head;
		head=newnode;
	}
}

// INSERT THE NODE AT LAST

void insertlast(int d) {
	Node newnode = new Node(d);
	if(head == null) {
		head = newnode;
	}
	else {
	Node temp = head;
	while(temp.next!=null) {
		temp = temp.next;
		}
		temp.next = newnode;
	}
}

// INSERT THE NODE AT MIDDLE

void insertmiddle(int d) {
	Node newnode = new Node(d);
	if(head == null || head.next ==null) {
		newnode.next = head;
		head = newnode;
	}
	Node slow = head;
	Node fast = head;
	Node prev = null;
	while(fast != null && fast.next != null) {
		prev = slow;
		slow = slow.next;
		fast = fast.next.next;
	}
	prev.next = newnode;
	newnode.next = slow;
}

// DELETE THE NODE AT FIRST

void deletefirst() {
	if(head == null) {
		System.out.println("No data present.");
	}
	head = head.next;
}

// DELETE THE NODE AT LAST

void deletelast() {
	if(head == null) {
		System.out.println("No data present.");
	}
	Node temp = head;
	if(head == null) {
		head = null;
	}
	while(temp.next.next != null) {
		temp = temp.next;
	}
	temp.next = null;
}

// DISPLAY METHOD

void display() {
	if(head==null) {
		System.out.println("No data present.");

	}
	Node temp = head;
	while(temp!=null){
		System.out.print(temp.data+" ");
		temp = temp.next;
	}
}
}
public class linked_list {
// MAIN METHOD

public static void main(String[] args) {
	singlelinkedlist L = new  singlelinkedlist();
	L.insertfirst(10);
	L.insertfirst(20);
	L.insertfirst(30);
	L.insertlast(40);
	L.insertlast(50);
	L.insertmiddle(50);
	//L.deletefirst();

	//L.deletelast();

	L.display();

}

}
