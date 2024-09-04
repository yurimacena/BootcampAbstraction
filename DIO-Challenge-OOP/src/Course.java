public class Course extends Content {

    private int workload;
    
    @Override
    public double calculateXP() {
        return PATTERN_XP + workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course title: " + getTitle() + ", Description: " + getDescription() + ", Workload: " + workload + "";
    }

}
