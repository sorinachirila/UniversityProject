import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Group {

    //define necessary fields
    private int id;
    private String name;
    Set<Teacher> teachers = new HashSet<>();
    Set<Student> students = new HashSet<>();


    //default
    public Group() {
    }

    //constructor with parameters
    public Group(int id, String name, Set<Teacher> teachers, Set<Student> students) {
        this.id = id;
        this.name = name;
        this.teachers = teachers;
        this.students = students;
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

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void updateTeacher(Teacher teacher, String teacherName){
        teacher.setName(teacherName);
    }

    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }

    public Student getStudent(int id){
        for(Student student: students){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

     public void addStudent(Student student){
         students.add(student);
     }

     public void updateStudent(Student student){
         student.setName("Popescu");
     }

     public void removeStudent(Student student){
         students.remove(student);
     }


    //hashcode and equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return getId() == group.getId() &&
                Objects.equals(getName(), group.getName()) &&
                Objects.equals(getTeachers(), group.getTeachers()) &&
                Objects.equals(getStudents(), group.getStudents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getTeachers(), getStudents());
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
                '}';
    }
}
