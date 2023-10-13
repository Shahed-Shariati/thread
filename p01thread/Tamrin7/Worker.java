package org.example.thread.p01thread.Tamrin7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.LinkedBlockingQueue;

public class Worker implements Runnable {
private Connection connection;
private String person;
private PreparedStatement preparedStatement;
private LinkedBlockingQueue<Person> people;
private  SemaphoreLock semaphoreLock = new SemaphoreLock();

    public Worker(LinkedBlockingQueue<Person> people) {
        this.people = people;
    }

    @Override
    public void run() {
        try {
            connection = semaphoreLock.acquaireConnection();
            Person person = people.remove();
            insertInto(person);
            semaphoreLock.releaseConnection(connection);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



     private synchronized void insertInto(Person person){
        String query = " INSERT INTO thread (first_name,last_name) VALUES (?,?)";
         try {
             preparedStatement = connection.prepareStatement(query);
             preparedStatement.setString(1,person.getFirstName());
             preparedStatement.setString(2,person.getLastname());
             preparedStatement.execute();
         } catch (SQLException e) {
             e.printStackTrace();
         }


     }

     public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
