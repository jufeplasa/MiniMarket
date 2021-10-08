package model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import exceptions.NotCorrespondingDayException;
import exceptions.YoungerException;
class MiniMarketTest {
	MiniMarket market;
	public void setupScene1() {
		market=new MiniMarket();
	}
	
	@Test
	public void testAddClient1() {
		setupScene1();

		int day=LocalDate.now().getDayOfMonth();
		String typeId="CC";
		String id="125"+day+"3";
		try {
			market.addClient(typeId, id, day);
		} catch (YoungerException ye) {
			ye.printStackTrace();
		} catch (NotCorrespondingDayException ncde) {
			ncde.printStackTrace();
		}
		fail("Not yet implemented");
	}
	@Test
	public void testAddClient2() {
		setupScene1();
		int day=LocalDate.now().getDayOfMonth();
		String typeId="TI";
		String id="125"+day+"3";
		try {
			market.addClient(typeId, id, day);
		} 
		catch (YoungerException ye) {
		}
		catch (NotCorrespondingDayException ncde) {
			
		}
		fail("Not yet implemented");
	}
	@Test
	public void testAddClient3() {
		setupScene1();
		int day=LocalDate.now().getDayOfMonth();
		String typeId="CC";
		String id="125"+day+"3";
		try {
			market.addClient(typeId, id, day);
		} catch (YoungerException ye) {
			ye.printStackTrace();
		} catch (NotCorrespondingDayException ncde) {
			ncde.printStackTrace();
		}
		fail("Not yet implemented");
	}

}
