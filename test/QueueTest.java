import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class QueueTest {
    @Test
    public void stackSize() {
        IntQueue myTestQueue = new IntQueue();

        myTestQueue.enqueue(1);
        myTestQueue.enqueue(2);
        myTestQueue.enqueue(3);
        Assertions.assertEquals(3, myTestQueue.size());

    }

    @Test
    public void emptyQueue() {
        IntQueue myEmptyQueue = new IntQueue();
        Assertions.assertEquals(0, myEmptyQueue.size());
    }

    @Test
    public void dequeueTest() {
        IntQueue myTestQueue = new IntQueue();
        myTestQueue.enqueue(1);
        myTestQueue.enqueue(2);
        myTestQueue.enqueue(3);
        Assertions.assertEquals(1, myTestQueue.dequeue());
        Assertions.assertEquals(2, myTestQueue.size());
    }

    @Test
    public void myEmptyDequeueTest() {
        IntQueue myDequeueTest = new IntQueue();
        Assertions.assertEquals((Integer) null, null);
    }

    @Test
    public void exceptionDequeueTest() {
        IntQueue myDequeueExceptionTest = new IntQueue();
        Assertions.assertThrows(QueueTooSmallException.class, () -> {
            (new IntQueue()).dequeue();
        });
    }

    @Test
    public void dequeueNTest() {
        IntQueue myDequeueNTest = new IntQueue();
        myDequeueNTest.enqueue(1);
        myDequeueNTest.enqueue(2);
        myDequeueNTest.enqueue(3);
        myDequeueNTest.dequeue(3);
        Assertions.assertEquals(0, myDequeueNTest.size());


    }
}
