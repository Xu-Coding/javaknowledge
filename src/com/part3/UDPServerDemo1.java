package com.part3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo1 {
	public static void main(String[] args) {
		DatagramSocket socket=null;
		try {
			socket=new DatagramSocket(8088);
			System.out.println("wait client link...");
			byte[] data=new byte[1024];
			DatagramPacket packet=new DatagramPacket(data,data.length);
			socket.receive(packet);
			System.out.println("a client linked!");
			
			String str=new String(packet.getData(),0,packet.getLength());
			System.out.println("client said:"+str);
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			if(socket!=null){
				socket.close();
			}
		}
	}
}
