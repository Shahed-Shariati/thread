package org.example.thread.p01thread.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.FileChannel;

public class Client {
    public static void main(String[] args) {
       String destination = "C:\\Users\\Raha\\Desktop\\11.txt";
        try (Socket socket = new Socket("127.0.0.1",1234);
             InputStream inputStream = socket.getInputStream();
             OutputStream out=new BufferedOutputStream(new FileOutputStream(destination),4*1024);
        ){

            int d;
            while ((d=inputStream.read())!=-1)
            {
               out.write(d);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
