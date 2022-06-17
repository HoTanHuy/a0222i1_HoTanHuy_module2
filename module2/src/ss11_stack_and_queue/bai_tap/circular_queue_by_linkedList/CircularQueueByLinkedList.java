package ss11_stack_and_queue.bai_tap.circular_queue_by_linkedList;

public class CircularQueueByLinkedList<E> {
    private Node font;
    private Node rear;

    public CircularQueueByLinkedList() {
    }

    public void eQueue(E e){
        Node n = new Node(e);
        if (this.font == null){
            this.font = n;
        }else {
            this.rear.next=n;
        }
        this.rear = n ;
        this.rear.next = this.font;
    }

    public E deQueue(){
        if (this.font==null){
            return null;
        }
        E e = (E)this.font.data;
        this.font = this.font.next;
        this.rear.next = this.font;
        return e;
    }

    public void displayQueue(){
        if (this.font==null){
            System.out.println("Queue is empty");
        }
        Node e = this.font;
        do {
            System.out.println(e.data);
            e = e.next;
        }while (e != this.font);
    }
}
