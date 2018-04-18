package Queue;

public class QueueTesting {
	public static void main(String[] args) {
		LinkedQueue Queue=new LinkedQueue();
		
		System.out.println("LinkedList Queue 테스트 : ");
		for(int i=1;i<=4;i++) {
			Queue.Enqueue("데이터"+i);		
		}
		System.out.println(Queue.Dequeue());
		System.out.println(Queue.Dequeue());



		
	}
}