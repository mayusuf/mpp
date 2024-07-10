package lab2_1;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String projectId;
    private List<Release> releaseList;
    private List<Feature> featureList;
    private Feature feature;
    private Release release;

    public Project(String projectId) {
        this.projectId = projectId;
        this.releaseList = new ArrayList<>();
        this.featureList = new ArrayList<>();
        this.feature = new Feature("Login Page", 100);
        addFeatures(this.feature);
        this.release = new Release("1.0");
        addRelease(this.release);
    }

    public String getId() {
        return projectId;
    }

    public void setId(String projectId) {
        this.projectId = projectId;
    }

    public List<Release> getReleases() {
        return releaseList;
    }

    public void addRelease(Release release) {
        this.releaseList.add(release);
    }

    public List<Feature> getFeatures() {
        return featureList;
    }

    public void addFeatures(Feature feature) {
        this.featureList.add(feature);
    }
}
