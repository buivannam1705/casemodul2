package Model;

public class Subject {
    private String namesubjects;
    private int Numberofsubjects;
    private int tuition;

    public Subject(String namesubjects, int numberofsubjects, int tuition) {
        this.namesubjects = namesubjects;
        Numberofsubjects = numberofsubjects;
        this.tuition = tuition;
    }

    public String getNamesubjects() {
        return namesubjects;
    }

    public void setNamesubjects(String namesubjects) {
        this.namesubjects = namesubjects;
    }

    public int getNumberofsubjects() {
        return Numberofsubjects;
    }

    public void setNumberofsubjects(int numberofsubjects) {
        Numberofsubjects = numberofsubjects;
    }

    public int getTuition() {
        return tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }

    @Override
    public String toString() {
        return
                "namesubjects='" + namesubjects + '\'' +
                ", Numberofsubjects=" + Numberofsubjects +
                ", tuition=" + tuition +
                '}';
    }
}
