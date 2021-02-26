package proxyPattern;

public class DataServer implements Server {

	private String serverLocation;
	public DataServer(String serverLocation) {
		this.serverLocation = serverLocation;
		loadServer(serverLocation);
	}
	private void loadServer(String serverLocation) {
		// TODO Auto-generated method stub		
		System.out.println("Loading server: " + serverLocation);
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Here is server " + serverLocation + ".");
		
	}
	

}
