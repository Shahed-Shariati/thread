package org.example.thread.p01thread.locking;

public class C03TestSharedObject {

    // Run this test a few times... and the result will change
    public static void main(String[] args) throws Exception  {
        
        C03SharedObject sharedObject = new C03SharedObject(0);
        
        Thread t1 = new Thread( () -> { sharedObject.change(); }  );
        Thread t2 = new Thread( () -> { sharedObject.change(); }  );
        Thread t3 = new Thread( () -> { sharedObject.change(); }  );
        Thread t4 = new Thread( () -> { sharedObject.change(); }  );
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        
        System.out.println( sharedObject.getAmount() ); //  The result is Non-deterministic!!!
        /* But if you add synchronized to m1() result will be deterministic */
        
    }

}
