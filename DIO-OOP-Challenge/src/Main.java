import Controller.Bootcamp;
import Controller.Course;
import Controller.Dev;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Java Course 1");
        course1.setTimeDuration(8);

        Course course2 = new Course();
        course2.setTitle("JavaScript Course");
        course2.setDescription("JavaScript Course 1");
        course2.setTimeDuration(4);

        System.out.println("Courses:");
        System.out.println(course1);
        System.out.println(course2);
        System.out.println("-----------------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer Bootcamp");
        bootcamp.setDescription("Bootcamp for Java Developers");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);

        System.out.println("Bootcamp:");
        System.out.println(bootcamp);
        System.out.println("-----------------------");

        Dev devAlice = new Dev();
        devAlice.setName("Alice");
        devAlice.enrollBootcamp(bootcamp);

        Dev devBob = new Dev();
        devBob.setName("Bob");
        devBob.enrollBootcamp(bootcamp);

        System.out.println("Devs:");
        System.out.println(devAlice);
        System.out.println(devBob);
        System.out.println("-----------------------");


        System.out.println(bootcamp);

        System.out.println("Progressing...");
        devAlice.progress();
        devBob.progress();
        devBob.progress();
        System.out.println(devAlice);
        System.out.println(devBob);
        System.out.println("Alice XP:  " + devAlice.computeTotalXp());
        System.out.println("Bob XP:   " + devBob.computeTotalXp());
    }
}
