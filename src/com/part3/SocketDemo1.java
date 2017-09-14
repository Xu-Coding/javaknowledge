package com.part3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

public class SocketDemo1 {
	
	public static void main(String[] argg) throws Exception{
		Socket socket=new Socket("localhost",8090);
		InetAddress add=socket.getLocalAddress();
		System.out.println("a");
		System.out.println(add.getCanonicalHostName());
		System.out.println(add.getHostAddress());
		System.out.println(socket.getPort());
	}
	
}
