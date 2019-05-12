package com.java.ds.stack;
	//Reference link :https://www.java2novice.com/java-design-patterns/

	/*Stack can be simply defined as Last In First Out (LIFO) data structure,
	 * i.e.,the last element added at the top of the stack(In) should be the first element to be removed(Out) from the stack*/

	/*Stack Operations:
	Push: A new entity can be added to the top of the collection.
	Pop: An entity will be removed from the top of the collection.
	Peek or Top: Returns the top of the entity with out removing it.*/
public class MyStackImpl {
	private int stackSize;
	private int[] stackArr;
	private int top;

	/**
	 * constructor to create stack with size
	 * 
	 * @param stackSize
	 * @param stackArr
	 * @param top
	 */
	public MyStackImpl(int stackSize) {
		this.stackSize = stackSize;
		this.stackArr = new int[stackSize];
		this.top = -1;
	}

	/**
	 * This method adds new entry to the top 
     * of the stack
	 * @param entry
	 * @throws Exception
	 */
	public void push(int entry) throws Exception {
		if (this.isStackFull()) {
			throw new Exception("Stack is already full. Can not add element");
		}
		System.out.println("Adding: " + entry);
		this.stackArr[++top] = entry;
	}

	/**
	 * This method removes an entry from the top of the stack
	 * @return
	 * @throws Exception
	 */
	public int pop() throws Exception{
		if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        int entry = this.stackArr[top--];
        System.out.println("Removed entry: "+entry);
		return entry;		
	}
	
	/**
	 * This method returns top of the stack  without removing it.
	 * @return
	 */
	public int peek(){
		return stackArr[top];
	}
	
	/**
	 * This method returns true if the stack is empty
	 * @return
	 */
	public boolean isStackEmpty() {
		return (top == -1);
	}
	
	/**
	 * This method returns true if the stack is full
	 * @return
	 */
	public boolean isStackFull(){
		return (top == stackSize -1);		
	}
	
	public static void main(String[] args) {
		MyStackImpl stackImpl = new MyStackImpl(5);
		try {
			stackImpl.push(4);
			stackImpl.push(8);
			stackImpl.push(10);
			stackImpl.push(12);
			stackImpl.pop();
			stackImpl.push(34);
			stackImpl.push(45);
			stackImpl.push(78);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			stackImpl.pop();
			stackImpl.pop();
			stackImpl.pop();
			stackImpl.pop();
			stackImpl.pop();
			stackImpl.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
