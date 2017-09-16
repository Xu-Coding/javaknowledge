package com.part3;

import java.io.IOException;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket=null;
		try {
			socket=new Socket("localhost",8080);
			
			InputStream in=socket.getInputStream();
			BufferedReader reader=new BufferedReader(new InputStreamReader(in,"UTF-8"));
			
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter ows=new OutputStreamWriter(out,"UTF-8");
			PrintWriter writer=new PrintWriter(ows,true);
			
			writer.println("helllo server"); 
			String message=reader.readLine();
			System.out.println("server said:"+message);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
