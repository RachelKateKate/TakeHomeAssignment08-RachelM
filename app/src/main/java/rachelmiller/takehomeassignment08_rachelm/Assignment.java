package rachelmiller.takehomeassignment08_rachelm;

/**
 * Created by rachelmiller on 3/23/17.
 */

public class Assignment {
    private String name;
    private int hours;
    private boolean complete;

    public Assignment(Assignment assignment) {

    }

    public Assignment(String name, int hours, boolean complete) {
        this.name = name;
        this.hours = hours;
        this.complete = complete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        if (isComplete()) {
            return name + " took " + hours + " is completed. ";
        } else {
            return name + " will take" + hours + " is not completed. ";
        }
    }
}