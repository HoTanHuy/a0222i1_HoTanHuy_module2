package ss11_stack_and_queue.bai_tap.circular_queue_by_linkedList;

public class Test {
    public static void main(String[] args) {
        CircularQueueByLinkedList<Integer> circularQueueByLinkedList = new CircularQueueByLinkedList<>();
        circularQueueByLinkedList.eQueue(1);
        circularQueueByLinkedList.eQueue(3);
        circularQueueByLinkedList.eQueue(5);
        circularQueueByLinkedList.eQueue(8);
        circularQueueByLinkedList.eQueue(13);

        circularQueueByLinkedList.deQueue();
        circularQueueByLinkedList.displayQueue();
    }
}
