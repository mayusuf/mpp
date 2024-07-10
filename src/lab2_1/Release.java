package lab2_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Release {

    private String version;
    private Date releaseDate;
    private List<Feature> features;
    private Feature feature;

    public Release(String version) {
        this.version = version;
        this.releaseDate = new Date();
        this.features = new ArrayList<>();
        this.feature = new Feature("Login Page", 10);
        addFeature(this.feature);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void addFeature(Feature feature) {
        this.features.add(feature);
    }
}
