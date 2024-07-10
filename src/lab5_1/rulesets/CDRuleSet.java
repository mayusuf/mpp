package lab5_1.rulesets;

import java.awt.Component;

import lab5_1.gui.CDWindow;

import javax.swing.*;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Object ob) throws RuleException {

		if (ob instanceof CDWindow) {
			CDWindow cd = (CDWindow) ob;
			// Add specific CD rules here
			checkAllFieldsNonEmpty(cd);
			priceMustFloatTwoDecimal(cd);
			priceNumberGrater(cd);

		} else {
			throw new IllegalArgumentException("Invalid object type for CDRules");
		}
	}

	private void priceNumberGrater(CDWindow cd) throws RuleException {

		 boolean r = Double.parseDouble(cd.getPriceValue()) > 0.49 ? true:false;

		 if(r== false){
			 //JOptionPane.showMessageDialog(cd, "Price must be greater than 0.49 !!");
			 throw new RuleException("Price must be greater than 0.49 !!");
		 }
	}

	private void priceMustFloatTwoDecimal(CDWindow cd) throws RuleException {

		String s = cd.getPriceValue();
		if(!s.matches("^\\d+\\.\\d{2}$")){
			//JOptionPane.showMessageDialog(cd, "Price doesn't has two decimal places !!");
			throw new RuleException("Price doesn't has two decimal places !!");
		}

	}

	private void checkAllFieldsNonEmpty(CDWindow cd) throws RuleException {

		if(cd.getPriceValue().isEmpty() || cd.getArtistValue().isEmpty() || cd.getTitleValue().isEmpty()){

			//JOptionPane.showMessageDialog(cd, "One of the Fields is Empty !!");
			throw new RuleException("One of the Fields is Empty !!");
		}

	}

}
