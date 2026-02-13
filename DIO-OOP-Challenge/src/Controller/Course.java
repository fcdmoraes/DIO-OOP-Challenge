package Controller;

public class Course extends Content {
    int timeDuration;

    public Course() {
    }

    @Override
    public double computeXp() {
        return XP_STANDARD * timeDuration;
    }

    public int getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(int timeDuration) {
        this.timeDuration = timeDuration;
    }

    @Override
    public String toString() {
        return "Curse{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", timeDuration=" + timeDuration +
                '}';
    }
}
