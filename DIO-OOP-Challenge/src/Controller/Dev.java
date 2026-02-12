package Controller;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> enrolledContents = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();

    public void enrollBootcamp(Bootcamp bootcamp) {
        this.enrolledContents.addAll(bootcamp.getContents());
        bootcamp.getEnrolledDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = this.enrolledContents.stream().findFirst();
        if (content.isPresent()) {
            this.finishedContents.add(content.get());
            this.enrolledContents.remove(content.get());
        } else {
            System.err.println("You are not enrolled in any content!");
        }
    }

    public double computeTotalXp() {
        double xp = this.finishedContents
                .stream()
                .mapToDouble(Content::computeXp)
                .sum();
        return xp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(enrolledContents, dev.enrolledContents) && Objects.equals(finishedContents, dev.finishedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enrolledContents, finishedContents);
    }
}
