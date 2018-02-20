package queue;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackOldestOnTop.add(value);
            
        }

        public T peek() {
        	if(stackOldestOnTop.size()==0)return null;
        	return stackOldestOnTop.get(0);
             
        }

        public T dequeue() {
        	int n = stackOldestOnTop.size();
            for(int i = 0; i < n;i++){
            	
            	stackNewestOnTop.add(stackOldestOnTop.pop());
            	
            }
            T temp = stackNewestOnTop.pop();
            int nn = stackNewestOnTop.size();
            for(int i = 0; i<nn;i++){
            	stackOldestOnTop.add(stackNewestOnTop.pop());
            }
            return temp;
            
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
