package tcp;

import com.liang.deng.util.tcp.TCPEchoClientNonblocking;

public class TestTCPClient {

	public static void main(String args[]) {
		TCPEchoClientNonblocking tcp = new TCPEchoClientNonblocking();
		try {
			byte[] a = {0x0A,0x33,0x41,0x7F,49,48,0X44,52,125,48};
			tcp.send("127.0.0.1", a, 2003);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
