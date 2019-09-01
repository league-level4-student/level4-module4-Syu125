package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EncapsulateTest {
	EncapsulateTheData e = new EncapsulateTheData();

	
	@Test
	public void itemsReceivedException() {
		e.setitemsReceived(5);
		assertEquals(5,e.getitemsReceived());
	}
	
	@Test
	public void degreesTurnedException() {
		System.out.println();
	}
}
