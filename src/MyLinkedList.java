
public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        
    }

    public void add(INode newNode) {
        if(this.tail == null){
            this.tail = newNode;
        }
        if(this.head == null){
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    
    public void append(INode myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
    
    public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
    
    public INode deleteFirst() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    
    public INode deleteLast() {
		INode tempNode = head;
        while (!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
		
	}
    
    public INode find(INode searchKey) {

        INode tempNode = this.head;
        while (tempNode != null) {
            if (tempNode == searchKey) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
    
    public void printMyNode(){
        StringBuffer myNode= new StringBuffer("My Node: ");
        INode tempNode = head;
        while(tempNode.getNext() != null){
            myNode.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNode.append("->");
            tempNode = tempNode.getNext();
        }
        myNode.append(tempNode.getKey());
        System.out.println(myNode);
    }

	
}
