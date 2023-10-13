package org.example.thread.p01thread.waitnotify;

import java.util.ArrayList;

public class Mother {

    public static void main(String[] args) {

            ArrayList<Cookie> dish = new ArrayList<Cookie>();
            dish.add( new Cookie() );


            new Child("child1", dish ).start();
            new Child("child2", dish ).start();
            new Child("child3", dish ).start();
        
            try {Thread.sleep(2*1000); } catch (InterruptedException e) {e.printStackTrace(); }
            System.out.println("Mother put 2 more cookies in dish ...");
            try {Thread.sleep(2*1000); } catch (InterruptedException e) {e.printStackTrace(); }

            dish.add( new Cookie() );
            dish.add( new Cookie() );

            System.out.println("Mother call children...");
            synchronized(dish) { dish.notifyAll(); }
        
    }

}