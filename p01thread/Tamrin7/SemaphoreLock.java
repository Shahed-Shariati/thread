package org.example.thread.p01thread.Tamrin7;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SemaphoreLock {
  private Semaphore semaphore = new Semaphore(4);
  private List<String> connection = new ArrayList<>();
  private List<Connection> connections = new ArrayList<>();
    public SemaphoreLock() {
       connections.add(new DatabaseConnection1().getConnection());
       connections.add(new DatabaseConnection1().getConnection());
       connections.add(new DatabaseConnection1().getConnection());
       connections.add(new DatabaseConnection1().getConnection());
    }

    public Connection acquaireConnection() throws InterruptedException {

        semaphore.acquire();
        System.out.println("Acquair" + Thread.currentThread().getName());
       return connections.remove(0);
    }

    public void releaseConnection(Connection connection){

        this.connections.add(connection);
        semaphore.release();
        System.out.println("Release" + Thread.currentThread().getName());

    }
}
