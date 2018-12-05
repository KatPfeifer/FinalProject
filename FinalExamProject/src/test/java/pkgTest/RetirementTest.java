package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class RetirementTest {

	@Test
	public void testTotalAmountSaved() {
		int iYearsToWork=40;
		double dAnnualReturnWorking=.07;
		int iYearsRetired=20;
		double dAnnualReturnRetired=.02;
		double dRequiredIncome=10000;
		double dMonthlySSI=2642;
		String StrExpectedTotal="1454485.55";
		Retirement rmt = new Retirement(iYearsToWork, dAnnualReturnWorking, iYearsRetired, dAnnualReturnRetired, dRequiredIncome, dMonthlySSI); 
		double dAmount=rmt.TotalAmountSaved();
		String StrAmount=String.format("%.2f", dAmount);
		assertEquals(StrExpectedTotal, StrAmount);
		
		double dAmountToSave=rmt.AmountToSave();
		String StrAmountToSave=String.format("%.2f", dAmountToSave);
		String StrExpectedToSave="554.13";
		
	}

}
