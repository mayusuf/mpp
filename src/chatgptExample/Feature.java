package chatgptExample;

public class Feature {
    private String featureName;
    private Developer developer;

    public Feature(String featureName, Developer developer) {
        this.featureName = featureName;
        this.developer = developer;
    }

    public String getFeatureName() {
        return featureName;
    }

    public Developer getDeveloper() {
        return developer;
    }

}
