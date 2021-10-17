package model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import exceptions.NotCorrespondingDayException;
import exceptions.YoungerException;


class MiniMarketTest {
	
	private MiniMarket market;
	
	public void setupScene1() {
		market=new MiniMarket();
	}
	
	@Test
	public void testAddClient1() {
		setupScene1();

		int day=LocalDate.now().getDayOfMonth();
		String typeId="CC";
		String id="125"+(day+1)+"3";
		
		try {
			market.addClient(typeId, id, day);
		} catch (YoungerException | NotCorrespondingDayException e) {
			fail();
		}
		
	}
	
	
	
	@Test
	public void testAddClient2() {
		setupScene1();
		int day=LocalDate.now().getDayOfMonth();
		String typeId="TI";
		String id="125"+(day+1)+"3";
		
		try {
			market.addClient(typeId, id, day);
			fail();
		} 
		catch (YoungerException e) {
		}
		catch (NotCorrespondingDayException e) {
			fail();
		}
	}
	
	@Test
	public void testAddClient3() {
		setupScene1();
		int day=LocalDate.now().getDayOfMonth();
		String typeId="CC";
		String id="125"+day+"3";
		
		try {
			market.addClient(typeId, id, day);
			fail();
		} 
		catch (YoungerException e) {
			fail();
		}
		catch (NotCorrespondingDayException e) {
			
		}
		
	}
	
}
