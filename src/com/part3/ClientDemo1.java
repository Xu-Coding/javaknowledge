package com.part3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
	private Socket socket;
	public ClientDemo1(){
		try {
			socket=new Socket("172.16.20.90",8088);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void start(){
		try {
			GetMessageHandler handler=new GetMessageHandler();
			Thread t=new Thread(handler);
			t.start();
			OutputStream out=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
			PrintWriter pw=new PrintWriter(osw,true);
			
			Scanner scanner=new Scanner(System.in);
			while(true){
				pw.println(scanner.nextLine());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		try {
			ClientDemo1 clientdemo=new ClientDemo1();
			clientdemo.start();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("client fialed to run");
		}
	}
	
	private class GetMessageHandler implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				InputStream in=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"UTF-8");
				BufferedReader br=new BufferedReader(isr);
				String message=null;
				while((message=br.readLine())!=null){
					System.out.println(message);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
	
	
}
