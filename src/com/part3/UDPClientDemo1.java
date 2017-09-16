package com.part3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo1 {
	public static void main(String[] args) {
		DatagramSocket socket=null;
		try {
			socket =new DatagramSocket();
			Scanner scanner=new Scanner(System.in);
			String str=scanner.nextLine();
			byte[] data=str.getBytes();
			DatagramPacket packet=new DatagramPacket(data,data.length,InetAddress.getByName("localhost"),8088);
			socket.send(packet);
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			if(socket!=null){
				socket.close();
			}
		}
	}
}
