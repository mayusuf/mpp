package lab2_1;

import java.util.ArrayList;
import java.util.List;

public class Developer {
    private String developerId;
    private List<Feature> assignedFeatures;
    private Feature feature;

    public Developer(String developerId) {
        this.developerId = developerId;
        this.assignedFeatures = new ArrayList<>();
        this.feature = new Feature("Login Page", 10);
        assignedFeatures(this.feature);
    }

    public String getId() {
        return developerId;
    }

    public void setId(String developerId) {
        this.developerId = developerId;
    }

    public List<Feature>getAssignedFeatures(){
        return assignedFeatures;
    }

    public void assignedFeatures(Feature feature) {
        this.assignedFeatures.add(feature);
    }

    public void getRemaintimeOfFeature() {
        feature.getEstimatedTimRemain();
    }
}
