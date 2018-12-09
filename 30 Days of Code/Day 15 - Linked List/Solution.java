import java.util.Scanner;

public class Solution {

    public static Node insert(Node head,int data) {
    	
    	//At start head is null, so we make store data in it and make it a valid node. It points to null
    	//Now head is valid node and it points to null. To add node, we make a new node and then make head point to it
    	//Then for all next nodes we recurse
    	//Recursion is required as head has to traverse to the tail so that it can add stuff at tail
    	//Now when all recursive calls come back, the state of head is restored and head is again the node at the head, and not at the tail where new node was added
    	//A simple for loop till the tail wont do the same as at the end of the tail, head has traversed to tail and so when we return this, only tail would be printed as head has tail data and points to null as it is last
    	//With recursion we are able to update by recursing on head.next and then reverting back the state of head when the recursive call returns
    	
        if(head == null) head = new Node(data); //base case
        else if (head.next == null) head.next=new Node(data); // base case
        else insert(head.next, data);
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}