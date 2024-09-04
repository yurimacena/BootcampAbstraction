import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> enrolledContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();
    
    public void enrollBootcamp(Bootcamp bootcamp) {
        this.enrolledContents.addAll(bootcamp.getContents());
        bootcamp.getEnrolledDevs().add(this);
    }

    public void moveForward() {
        Optional<Content> content = this.enrolledContents.stream().findFirst();
        if(content.isPresent()) {
            this.completedContents.add(content.get());
            this.enrolledContents.remove(content.get());

        } else {
            System.err.println("You are not enrolled in any content.");
        }
    }

    public double calculateXp() {
        return this.completedContents
        .stream()
        .mapToDouble(content -> content.calculateXP())
        .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getEnrolledContents() {
        return enrolledContents;
    }

    public void setEnrolledContents(Set<Content> enrolledContents) {
        this.enrolledContents = enrolledContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enrolledContents, completedContents);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (enrolledContents == null) {
            if (other.enrolledContents != null)
                return false;
        } else if (!enrolledContents.equals(other.enrolledContents))
            return false;
        if (completedContents == null) {
            if (other.completedContents != null)
                return false;
        } else if (!completedContents.equals(other.completedContents))
            return false;
        return true;
    }

}
