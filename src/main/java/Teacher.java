import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Teacher {

    //define necessary fields
    private int id;
    private String name;
    Set<Course> courses =  new HashSet<>();;



    //default constructor
    public Teacher() {
    }

    public Teacher(int id, String name, Set<Course> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
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

    public Set<Course> getCourses() {
        return courses;
    }

    public Course getCourse(int id) {
        for(Course course: courses){
            if(course.getId() == id){
                return course;
            }
        }
        return null;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    //update a course
    public void updateCourse(Course course, String courseName){
        course.setName(courseName);
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    //remove a course
    public void removeCourse(Course course){
        courses.remove(course);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return getId() == teacher.getId() &&
                Objects.equals(getName(), teacher.getName()) &&
                Objects.equals(getCourses(), teacher.getCourses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCourses());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
