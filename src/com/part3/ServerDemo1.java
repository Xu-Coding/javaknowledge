package com.part3;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class ServerDemo1 {
	private ServerSocket server;
	private List<PrintWriter> allOut;
	
	public ServerDemo1(){
		try {
			allOut=new ArrayList<PrintWriter>();
			server=new ServerSocket(8088);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private synchronized void addOut(PrintWriter out){
		allOut.add(out);
	}
	private synchronized void removeOut(PrintWriter out){
		allOut.remove(out);
	}
	private synchronized void sendMessageToAllClient(String message){
		for(PrintWriter out:allOut){
			out.println(message);
		}
	}
	
	public void start(){
		try {
			while(true){
				System.out.println("等待客户端连接...");
				Socket socket=server.accept();
				System.out.println("一个客户端连接!");
				ClientHandler handler=new ClientHandler(socket);
				Thread t=new Thread(handler);
				t.start();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		ServerDemo1 serverdemo=new ServerDemo1();
		serverdemo.start();
	}
	
	private class ClientHandler implements Runnable{
		private Socket socket;
		private String host;
		public ClientHandler(Socket socket){
			this.socket=socket;
			InetAddress address=socket.getInetAddress();
			host=address.getHostAddress();
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			PrintWriter pw=null;
			try {
				OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
				pw=new PrintWriter(osw,true);
				addOut(pw);
				
				InputStream in=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(in,"UTF-8");
				BufferedReader br=new BufferedReader(isr);
				
				String message=null;
				while((message=br.readLine())!=null){
					sendMessageToAllClient(host+"-said:"+message);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				System.out.println("客户端失去连接");
				removeOut(pw);
				try {
					socket.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
	
	
	
	
	
	
}
