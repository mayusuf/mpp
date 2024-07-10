package lab3_4;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property o : properties) {
			totalRent += o.computeRent();
//			if (o instanceof House) {
//				House h = (House) o;
//				totalRent += h.computeRent();
//			}
//			else if (o instanceof Condo) {
//				Condo h = (Condo) o;
//				totalRent += h.computeRent();
//			}
//			else if (o instanceof Trailer) {
//				Trailer h = (Trailer) o;
//				totalRent += h.computeRent();
//			}
		}
		return totalRent;
	}
}
