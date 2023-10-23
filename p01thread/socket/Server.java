package org.example.thread.p01thread.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.FileChannel;

public class Server {
    public static void main(String[] args) {
        String source="C:\\Users\\Raha\\Desktop\\1.txt";

        try (ServerSocket listener = new ServerSocket(1234);){
            System.out.println("server is waiting to coming request");
            Socket accept = listener.accept();
            OutputStream outputStream = accept.getOutputStream();
            InputStream in=new BufferedInputStream(new FileInputStream(source),4*1024);
            int length;
            PrintWriter printWriter=new PrintWriter(outputStream,true);
            while ((length=in.read())!=-1)
            {
               printWriter.write(length);
            }
            printWriter.close();
            outputStream.close();

        } catch (IOException e) {

        }
    }
}
