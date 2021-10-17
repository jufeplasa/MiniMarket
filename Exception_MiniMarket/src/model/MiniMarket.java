package model;

import java.util.ArrayList;
import java.util.List;

import exceptions.NotCorrespondingDayException;
import exceptions.YoungerException;

public class MiniMarket {
	
	
	private int tries;
	private List<People> clients;
	
	public MiniMarket() {
		clients=new ArrayList<People>();
	}

	public int getTries() {
		return tries;
	}
	
	public void addClient(String type, String id, int day) throws YoungerException, NotCorrespondingDayException {
		char number= id.charAt(id.length()-2);
		String penNumber=number+"";
		int penultimateNumber=Integer.parseInt(penNumber);
		tries++;
		if(type.equalsIgnoreCase("TI")) {
			throw new YoungerException();
		}
		else if(penultimateNumber%2==0 && day%2==0 ) {
			throw new NotCorrespondingDayException(penultimateNumber,day);
		}
		else if(penultimateNumber%2>0 && day%2>0) {

			throw new NotCorrespondingDayException(penultimateNumber,day);
		}
		else {
			clients.add(new People(type, id));
		}
	}

	public List<People> getClients() {
		return clients;
	}
	
	
	
}
