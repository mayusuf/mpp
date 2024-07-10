package lab5_1.rulesets;

import java.awt.Component;

import lab5_1.gui.*;

import javax.swing.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	@Override
	public void applyRules(Object ob) throws RuleException {

		if (ob instanceof BookWindow) {
			BookWindow book = (BookWindow) ob;
			System.out.println("Applying CD rules to: " + book);
			// Add specific CD rules here
			checkAllFieldsNonEmpty(book);
			checkIsbn(book);
			priceMustFloatTwoDecimal(book);
			priceNumberGrater(book);

		} else {
			throw new IllegalArgumentException("Invalid object type for CDRules");
		}
	}

	private void checkIsbn(BookWindow book) throws RuleException {

		String isbn = book.getIsbnValue();

		if(!isbn.matches("\\d+")) {

//			JOptionPane.showMessageDialog(book, "ISBN must be a number !!");
			throw new RuleException("ISBN must be a number !!");
		}

		int length = isbn.length();

		if (length != 10 && length != 13) {

//			JOptionPane.showMessageDialog(book, "ISBN length 10 or 13!!");
			throw new RuleException("ISBN length 10 or 13!!");
		}

		if (length == 10) {
			char firstDigit = isbn.charAt(0);
			if (firstDigit != '0' && firstDigit != '1') {
				//JOptionPane.showMessageDialog(book, "Invalid ISBN !!");
				throw new RuleException("Invalid ISBN !!");
			}
		}

		if (length == 13) {
			String firstThreeDigits = isbn.substring(0, 3);
			if (!firstThreeDigits.equals("978") && !firstThreeDigits.equals("979")) {
				//JOptionPane.showMessageDialog(book, "Invalid ISBN !!");
				throw new RuleException("Invalid ISBN !!");
			}
		}

	}

	private void priceNumberGrater(BookWindow book) throws RuleException {

		boolean r = Double.parseDouble(book.getPriceValue()) > 0.49 ? true:false;

		if(r == false){
//			JOptionPane.showMessageDialog(book, "Price must be greater than 0.49 !!");
			throw new RuleException("Price must be greater than 0.49 !!");
		}
	}

	private void priceMustFloatTwoDecimal(BookWindow book) throws RuleException {

		String s = book.getPriceValue();

		if(!s.matches("^\\d+\\.\\d{2}$")){

			//JOptionPane.showMessageDialog(book, " Price doesn't has two decimal places !!");
			throw new RuleException("Price doesn't has two decimal places !!");
		}
	}

	private void checkAllFieldsNonEmpty(BookWindow book) throws RuleException {

		if(book.getPriceValue().isEmpty() || book.getIsbnValue().isEmpty() || book.getTitleValue().isEmpty()){

//			JOptionPane.showMessageDialog(book, "One of the Fields is Empty !!");
			throw new RuleException("One of the Fields is Empty !!");
		}
	}

}
