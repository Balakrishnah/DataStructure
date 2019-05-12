package com.java.ds.stack;
	/*In this example, the stack will never comes to stack overflow scenario,
	beacuse its capacity will keep increases as it reaches to max capacity,
	so it is very dynamic in capacity.*/
//Reference link :https://www.java2novice.com/java-design-patterns/

public class DynamicStackImpl {
	private int stackSize;
	private int[] stackArr;
	private int top;
	
	/**
     * constructor to create stack with size
     * @param size
     */
	public DynamicStackImpl(int stackSize) {
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
	public void push(int entry){
		if(isStackFull()){
			System.out.println("Stack is full. Increasing the capacity.");
			increaseStackCapacity();
		}
		System.out.println("Adding: "+entry);
		this.stackArr[++top] = entry;
	}
	
	/**
     * This method removes an entry from the 
     * top of the stack.
     * @return
     * @throws Exception 
     */
	public int pop() throws Exception{
		if(isEmpty()){
			throw new Exception("Stack is empty. Can not remove element.");
		}
		int entry = this.stackArr[top--];
		System.out.println("Removed entry: "+entry);
		return entry;
	}
	
	/**
     * This method returns top of the stack
     * without removing it.
     * @return
     */
	public long peek(){
		return stackArr[top];		
	}
	
	private void increaseStackCapacity(){
		int [] newStack = new int[stackSize*2];
		for(int i=0; i<stackSize; i++){
			newStack[i] = this.stackArr[i];
		}
		this.stackArr = newStack;
		this.stackSize = stackSize*2;
	}
	
	/**
     * This method returns true if the stack is 
     * empty
     * @return
     */
	public boolean isEmpty(){
		return (top == -1);
	}
	
	/**
     * This method returns true if the stack is full
     * @return
     */
	public boolean isStackFull(){
		return (top == stackSize-1);
	}
	
	public static void main(String[] args) {
		DynamicStackImpl stack = new DynamicStackImpl(2);
        for(int i=1;i<10;i++){
            stack.push(i);
        }
        for(int i=1;i<4;i++){
            try {
                stack.pop();
            } catch (Exception e) {
                           e.printStackTrace();
            }
        }
	}
}