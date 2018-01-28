package ch.bbw.Rechner;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestsRechner {

	@Test
	public void TestSummPositiv() {
		Rechner rechner = new Rechner();
		int result = rechner.adieren(2, 4);
		assertEquals(6, result);
	}
	
	@Test
	public void TestSummNegativ() {
		Rechner rechner = new Rechner();
		int result = rechner.adieren(-2, -3);
		assertEquals(-5, result);
	}
	
	@Test
	public void TestSummNull() {
		Rechner rechner = new Rechner();
		int result = rechner.adieren(0, 0);
		assertEquals(0, result);
	}

}
