package com.java.ds.queue;
//Reference link :https://www.java2novice.com/java-design-patterns/
public class QueueImpl {
	private int capacity;
	int queueArr[];
	int front = 0;
	int rear = -1;
	int currentSize = 0;
	
	public QueueImpl(int capacitySize) {
		this.capacity = capacitySize;
		queueArr = new int [capacitySize];		
	}
	
	/**
	 * this method adds element at the end of the queue.
	 * @param item
	 * @throws Exception 
	 */
	public void enqueue(int item){
		if(isQueueFull()){
			System.out.println("Overflow! unable to add element "+item);
		}else{
			rear++;
			if(rear == capacity-1){
				rear =0;
			}
			queueArr[rear] = item;
			currentSize++;
			System.out.println("Element "+item+" is pushed to queue !");
		}
	}
	
	/**
	 *  this method removes an element from the top of the queue
	 */
	public void dequeue(){
		if(isQueueEmpty()){
			System.out.println("Underflow! unable to remove element from queue");
		}else{
			front++;
			if(front == capacity -1){
				System.out.println("Pop operation done ! removed :"+queueArr[front-1]);
				front = 0;
			}else{
				System.out.println("Pop operation done ! removed :"+ queueArr[front-1]);
			}
			currentSize--;
		}
	}
	
	/**
	 * This method checks whether the queue is full or not
	 * @return
	 */
	public boolean isQueueFull(){
		boolean status = false;
		if(currentSize == capacity){
			status = true;
		}
		return status;
	}
	
	/**
	 * This method checks whether the queue is empty or not
	 * @return
	 */
	public boolean isQueueEmpty(){
		boolean status = false;
		if(capacity == 0){
			status = true;
		}
		return status;
	}
	public static void main(String[] args) {
		QueueImpl queue = new QueueImpl(4);
		 	queue.enqueue(4);
	        queue.dequeue();
	        queue.enqueue(56);
	        queue.enqueue(2);
	        queue.enqueue(67);
	        queue.dequeue();
	        queue.dequeue();
	        queue.enqueue(24);
	        queue.dequeue();
	        queue.enqueue(98);
	        queue.enqueue(45);
	        queue.enqueue(23);
	        queue.enqueue(435);
	}
}
