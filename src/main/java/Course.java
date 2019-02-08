import java.util.Objects;

public class Course {

    //define necessary fields
    private int id;
    private String name;

    //default constructor
    public Course() {
        id = 1000;
        name = "Unknown course";
    }

    //constructor with parameters
    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
