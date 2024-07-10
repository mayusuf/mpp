package lab3_4;

public class Driver {

	public static void main(String[] args) {

		Property[] objects = {
				new House(9000, "1000 N","Faifield", "IA", "52556"),
				new Condo(2, "1000 N","Faifield", "IA", "52556"),
				new Trailer(9, "1000 N","Faifield", "IA", "52556")
		};
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}
