package com.liang.deng.util.tcp;

import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

import com.google.common.base.Charsets;

public class TCPEchoClientNonblocking {


	public byte[] send(String host, byte[] message, int port) throws Exception {
		// 第一个参数作为要连接的服务端的主机名或IP
		String server = host;
		// 第二个参数为要发送到服务端的字符串
		byte[] argument = message;
		// 如果有第三个参数，则作为端口号
		int servPort = port;
		// 创建一个信道，并设为非阻塞模式
		SocketChannel clntChan = SocketChannel.open();
		clntChan.configureBlocking(false);
		// 向服务端发起连接
		if (!clntChan.connect(new InetSocketAddress(server, servPort))) {
			// 不断地轮询连接状态，直到完成连接
			while (!clntChan.finishConnect()) {
				// 在等待连接的时间里，可以执行其他任务，以充分发挥非阻塞IO的异步特性
				// 这里为了演示该方法的使用，只是一直打印"."
//				System.out.print("'");
			}
		}
		// 为了与后面打印的"."区别开来，这里输出换行符
		System.out.print("\n");
		// 分别实例化用来读写的缓冲区
		ByteBuffer writeBuf = ByteBuffer.wrap(argument);
		ByteBuffer readBuf = ByteBuffer.allocate(argument.length);
		// 接收到的总的字节数
		int totalBytesRcvd = 0;
		// 每一次调用read（）方法接收到的字节数
		int bytesRcvd;
		// 循环执行，直到接收到的字节数与发送的字符串的字节数相等
		while (totalBytesRcvd < argument.length) {
			// 如果用来向通道中写数据的缓冲区中还有剩余的字节，则继续将数据写入信道
			if (writeBuf.hasRemaining()) {
				clntChan.write(writeBuf);
			}
			// 如果read（）接收到-1，表明服务端关闭，抛出异常
			if ((bytesRcvd = clntChan.read(readBuf)) == -1) {
				throw new SocketException("Connection closed prematurely");
			}
			// 计算接收到的总字节数
			totalBytesRcvd += bytesRcvd;
			// 在等待通信完成的过程中，程序可以执行其他任务，以体现非阻塞IO的异步特性
			// 这里为了演示该方法的使用，同样只是一直打印"."
			//System.out.print(".");
		}
	byte[] remessage = readBuf.array();
		// 打印出接收到的
		System.out.println("Received: ");
		for(byte a:remessage){
			System.out.print(a);
			System.out.print(",");
		}
		// 关闭信道
		clntChan.close();
		return remessage;
	}
	
	public byte[] summary(String host,int port ,String data){
		try{
			
			byte[] input = data.getBytes(Charsets.UTF_8.displayName());
			int len = input.length;
			
			
			byte[] head1 = "3C1".getBytes();
			byte[] head2 = {(byte) ((len/1000)+48),(byte) (((len%1000)/100)+48),(byte) (((len%100)/10)+48),(byte) ((len%10)+48)};
			byte[] head = byteMerger(head1,head2);
			byte[] message = byteMerger(head,input);
			byte[]length ={(byte) (message.length/256),(byte) (message.length%256)};
			byte[] mess = byteMerger(length,message);
			byte[] result =   send(host,mess,port);
			
			return result ;
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public String sign(String host,int port,String data){
		
		try {
			byte[] input = data.getBytes(Charsets.UTF_8.displayName());
			send(host, input, port);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	// 合并两个byte数组  
	   public static byte[] byteMerger(byte[] byte_1, byte[] byte_2){  
	       byte[] byte_3 = new byte[byte_1.length+byte_2.length];  
	       System.arraycopy(byte_1, 0, byte_3, 0, byte_1.length);  
	       System.arraycopy(byte_2, 0, byte_3, byte_1.length, byte_2.length);  
	        return byte_3;  
	   }  


}
