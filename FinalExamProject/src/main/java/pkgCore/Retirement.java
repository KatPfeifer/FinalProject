package pkgCore;

import org.apache.poi.ss.formula.functions.Finance;
import org.apache.poi.ss.formula.functions.FinanceLib;
public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	public Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, double dAnnualReturnRetired, double dRequiredIncome, double dMonthlySII) {
		this.iYearsToWork=iYearsToWork;
		this.dAnnualReturnWorking=dAnnualReturnWorking;
		this.iYearsRetired=iYearsRetired;
		this.dAnnualReturnRetired=dAnnualReturnRetired;
		this.dRequiredIncome=dRequiredIncome;
		this.dMonthlySSI=dMonthlySII;
	}
	
	public double AmountToSave()
	{
		//TODO: Determine the amount to save each month based on TotalAmountSaved, YearsToWork
		//		and Annual return while working
		
		
		return 0;
	}
	
	public double TotalAmountSaved()
	{
		//	TODO: Determine amount to be saved based on Monthly SSI, Required Income, Annual return during retirement
		//		and number of years retired.
		//
		return 0;
	}
}
