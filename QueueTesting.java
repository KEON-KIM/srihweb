package Queue;

public class QueueTesting {
	public static void main(String[] args) {
		LinkedQueue Queue=new LinkedQueue();
		
		System.out.println("LinkedList Queue �׽�Ʈ : ");
		for(int i=1;i<=4;i++) {
			Queue.Enqueue("������"+i);		
		}
		System.out.println(Queue.Dequeue());
		System.out.println(Queue.Dequeue());



		
	}
}