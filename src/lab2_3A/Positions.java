package lab2_3A;

import java.util.*;

public class Positions {

    private String title;
    private Positions manager;
    private List<Positions> subordinateList;


    public Positions(String title) {
        this.title = title;
        this.subordinateList = new ArrayList<Positions>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubordinate(Positions position) {

        if(this == position){
            throw new IllegalArgumentException("A position couldn't report to itself !!");
        }
        if(!this.subordinateList.contains(position)) {
            this.subordinateList.add(position);
        }
    }

    public List<Positions> getSubordinate() {
        return subordinateList;
    }

    public void setManager(Positions manager){

        if(this == manager) {
            throw new IllegalArgumentException("A manager cann't report itself !!");
        }

        if(this.manager == null){
            this.manager = manager;
            manager.setSubordinate(this);
        }
    }

    public Positions getManager() {
        return manager;
    }
}
