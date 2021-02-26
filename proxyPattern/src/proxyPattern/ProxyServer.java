package proxyPattern;

public class ProxyServer implements Server{
	
	private DataServer dataServer;
	private String serverLocation;
	
	public ProxyServer(String serverLocation) {
		this.serverLocation = serverLocation;
				
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(dataServer == null) {
			dataServer = new DataServer(serverLocation);
		}
		dataServer.display();
		
	}

}
