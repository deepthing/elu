package tcp;

import com.liang.deng.util.tcp.TCPServerSelector;

public class TestTCPServer {

	public static void main(String args[]) {
		TCPServerSelector server = new TCPServerSelector();
		try {
			String [] arg={"2002","2003","2004","2005"};
			server.TCPServer(arg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
