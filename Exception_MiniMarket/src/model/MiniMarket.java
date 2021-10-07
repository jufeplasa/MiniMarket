package model;

import java.util.ArrayList;
import java.util.List;

public class MiniMarket {
	
	
	private int tries;
	private List<People> clients;
	
	public MiniMarket() {
		clients=new ArrayList<People>();
	}

	public int getTries() {
		return tries;
	}
	
	public void addClient(String type, String id, int day) {
		
	}

	public List<People> getClients() {
		return clients;
	}
	
	
	
}
