package com.liang.deng.service.TCP;

import java.net.ServerSocket;

import javax.servlet.ServletContext;

import com.liang.deng.util.tcp.TCPServerSelector;

public class SocketThread extends Thread {
	TCPServerSelector server;
	
	public SocketThread(ServerSocket serverSocket, ServletContext servletContext) {
		server = new TCPServerSelector();
	}

	public void run() {
		System.out.println("server running");
		try {
			String [] arg={"2002","2003","2004","2005"};
			server.TCPServer(arg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeServerSocket() {
		try {
			this.interrupt();
		} catch (Exception ex) {
			System.out.println("SocketThread err:" + ex.getMessage());
		}
	}
}
