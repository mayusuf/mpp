package chatgptExample;

import java.util.ArrayList;
import java.util.List;

public class Developer {
    private String developerId;
    private String developerName;
    private List<Feature> associatedFeatures;

    public Developer(String developerId, String developerName) {
       this.developerId = developerId;
       this.developerName = developerName;
       this.associatedFeatures = new ArrayList<>();
    }

    public void addAssociatedFeature(Feature feature) {
        this.associatedFeatures.add(feature);
    }
}
