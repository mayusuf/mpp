package chatgptExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Release {
    private Date releaseDate;
    private List<Feature> features;

    public Release(Date releaseDate) {
        this.releaseDate = releaseDate;
        this.features = new ArrayList<>();
    }

    public void addFeature(Feature feature) {
        this.features.add(feature);
    }

    public List<Feature> getFeatures() {
        return features;
    }
}
