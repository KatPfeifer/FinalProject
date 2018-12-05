package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtAnnualReturnPay;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtAnnualReturnWithdrawal;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private TextField txtMonthlySSI;
	
	@FXML
	private Label lblSaveEachMonth;
	
	@FXML
	private Label lblNeedToSave;

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		
		//	TODO: Clear all the text inputs
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		Retirement rmt = new Retirement(Integer.parseInt(txtYearsToWork.getText()), Double.parseDouble(txtAnnualReturnPay.getText()), Integer.parseInt(txtYearsRetired.getText()), Double.parseDouble(txtAnnualReturnWithdrawal.getText()), Double.parseDouble(txtRequiredIncome.getText()), Double.parseDouble(txtMonthlySSI.getText())); 
		double dNeedToSave=rmt.TotalAmountSaved();
		String StrNeedToSave=String.format("%.2f", dNeedToSave);
		double dSaveEachMonth=rmt.AmountToSave();
		String StrSaveEachMonth=String.format("%.2f", dSaveEachMonth);
		lblSaveEachMonth.setText(StrSaveEachMonth);
		System.out.println(StrSaveEachMonth);
		lblNeedToSave.setText(StrNeedToSave);
	}
	
}
