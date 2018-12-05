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
		double pmt = FinanceLib.pmt(dAnnualReturnWorking/12, iYearsToWork*12, 0, TotalAmountSaved(), false);
		return pmt*-1;
	}
	
	public double TotalAmountSaved()
	{
		double pv = FinanceLib.pv(dAnnualReturnRetired/12, iYearsRetired*12, dRequiredIncome-dMonthlySSI, 0, false);
		return pv*-1;
	}
}
