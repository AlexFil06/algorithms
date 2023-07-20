package revers;

public class LinkedList {
    private Node root;

    public void add(int value){
        if (root == null){
            root = new Node(value);
            return;
        }
        Node currentNode = root;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(value);
    }


    public void print(){
        Node currentNode = root;
        while (currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }


    public void reverse(){
        Node previousNode = null;
        Node currentNode = root;
        Node nextNode = null;
        while (currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        root = previousNode;
    }

    private class Node{
        int value;
        Node next;
        public Node(){}
        public Node (int _value){
            this.value = _value;
        }
        public Node (int _value, Node _next){
            this.value = _value;
            this.next = _next;
        }
    }
}
