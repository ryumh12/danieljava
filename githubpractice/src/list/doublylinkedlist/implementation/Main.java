package list.doublylinkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList numbers = new DoublyLinkedList();
		
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		DoublyLinkedList.ListIterator i = numbers.listIterator();
		while(i.hasNext()){
			if((int)i.next()==20){
				i.remove();
			}
		}
		System.out.println(numbers);
		
	}

}
