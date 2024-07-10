package chatgptExample;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer("1", "John");
        Developer developer2 = new Developer("2", "Mark");

        Feature feature1 = new Feature( "Landing Page", developer1);
        Feature feature2 = new Feature( "Payment System", developer2);

        developer1.addAssociatedFeature(feature1);
        developer2.addAssociatedFeature(feature2);

        Release release1 = new Release(new Date());
        release1.addFeature(feature1);
        release1.addFeature(feature2);

        Project project = new Project("1");
        project.addFeature(feature1);
        project.addFeature(feature2);
    }
}
