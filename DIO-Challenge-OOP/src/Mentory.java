import java.time.LocalDate;

public class Mentory extends Content {

    private LocalDate date;
    
    @Override
    public double calculateXP() {
        return PATTERN_XP + 20;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentory [title=" + getTitle() + ", description=" + getDescription() + ", date=" + date + "]";
    }

    
}
