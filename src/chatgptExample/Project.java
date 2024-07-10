package chatgptExample;
import java.util.*;

public class Project {
    private String projectId;
    private List<Feature> featureSet;
    private List<Release> releaseSet;

    public Project(String projectId) {
        this.projectId = projectId;
        this.featureSet = new ArrayList<>();
        this.releaseSet = new ArrayList<>();
    }

    public void addFeature(Feature feature) {
        featureSet.add(feature);
    }

    public void addRelease(Release release) {
        releaseSet.add(release);
    }

    public List<Feature> getFeatureSet() {
        return featureSet;
    }

    public List<Release> getReleaseSet() {
        return releaseSet;
    }
}
