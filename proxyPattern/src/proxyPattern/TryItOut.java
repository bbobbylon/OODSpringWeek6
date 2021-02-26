package proxyPattern;

public class TryItOut {
	public static void main(String[] args) {
		Server s = new ProxyServer("www.ourproxydataserver.net");
		
		//let's now load our server
		s.display();
		
		//load it again, noticing that we do not load another server, we
		//simply display it again
		s.display();
		
		
	}
}
