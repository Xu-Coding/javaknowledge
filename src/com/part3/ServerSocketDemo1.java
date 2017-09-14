package com.part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServerSocket server=null;
		try {
			server=new ServerSocket(8088);   //set the server listening port number
			Socket socket=server.accept();   //listens for client connections
			
			InputStream in=socket.getInputStream();
			BufferedReader reader=new BufferedReader(new InputStreamReader(in,"UTF-8"));
			
			OutputStream out=socket.getOutputStream();
//			PrintWriter writer=new PrintWriter(out);  //the menthod to create printwriter ,but can not set the encoding
			PrintWriter writer=new PrintWriter(new OutputStreamWriter(out,"UTF-8"));
			
			String message=reader.readLine();
			System.out.println("client said:"+message);
			
			writer.println("server said:hello client");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}

	}

}
