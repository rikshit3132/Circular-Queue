

class Hello{
	int front=-1;
	int rear=-1;
	int size=5,element;
	int cQueue[]=new int[size];
    public boolean isFull(){
    	if(front==0 && rear==size-1){
    		return true;
    	}
    	if(front==rear+1){
    		return true;
    	}
    	return false;
    }
    public boolean isEmpty(){
    	if(front==-1){
    		return true;
    	}
    	return false;
    }
     void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } else {
      if (front == -1)
        front = 0;
      rear = (rear + 1) % size;
      cQueue[rear] = element;
      System.out.println("Inserted " + element);
    }
  }
   int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    } else {
      element = cQueue[front];
      if (front == rear) {
        front = -1;
        rear = -1;
      } /* Q has only one element, so we reset the queue after deleting it. */
      else {
        front = (front + 1) % size;
      }
      System.out.println("Deleted element is:"+element);
      return 0;
    }
  }
    public void display(){
    	System.out.println("\n");
    //	System.out.println("Front is:"+front);
    //	System.out.println("Rear is:"+rear);
    	for(int i=front;i!=rear;i=(i+1)%size){

    		System.out.print(cQueue[i]+" ");
    	// System.out.println(cQueue[i]);
    	}
    }


}

class CircularQueue{
	public static void main(String args[]){
		Hello h=new Hello();
		h.enQueue(1);
		h.enQueue(2);
		h.enQueue(3);
		h.enQueue(4);
		h.enQueue(5);
		//h.enQueue(6);
		h.display();
		h.deQueue();
		h.display();
		h.enQueue(6);
		h.display();
		//h.enQueue(7);

		
		

	}

}