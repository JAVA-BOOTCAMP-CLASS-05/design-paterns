package creacional.singleton;

public class ThreadSynchronizedDemo {

    static class RunnableA implements Runnable {
        @Override
        public void run() {
            ThreadSingletonSynchronized singleton = ThreadSingletonSynchronized.getInstance("A");
            System.out.println(singleton.getValue());
        }
    }

    static class RunnableB implements Runnable {
        @Override
        public void run() {
        	ThreadSingletonSynchronized singleton = ThreadSingletonSynchronized.getInstance("B");
            System.out.println(singleton.getValue());
        }
    }	
	
	public static void main(String[] args) {
		Thread threadA = new Thread(new RunnableA());
		Thread threadB = new Thread(new RunnableB());
		
		threadA.start();
		threadB.start();
	}

}
