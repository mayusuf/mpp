package lab2_1;

public class Feature {
    private String description;
    private int remainTime;

    public Feature(String description, int remainTime) {
        this.description = description;
        this.remainTime = remainTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstimatedTimRemain(){
        return this.remainTime;
    }


}