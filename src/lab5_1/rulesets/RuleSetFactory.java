package lab5_1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import lab5_1.gui.BookWindow;
import lab5_1.gui.CDWindow;


final public class RuleSetFactory {

	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

	public static RuleSet getRuleSet(Object obj) {

		if (obj instanceof CDWindow) {
			return new CDRuleSet();
		} else if (obj instanceof BookWindow) {
			return new BookRuleSet();
		} else {
			throw new IllegalArgumentException("No rule set available for the provided object");
		}
	}
	
}
