import java.util.HashSet;
import java.util.Set;

public class Application {
    private static Set<Group> groups;

    public static void main(String[] args) {


        //Students
        Set<Student> students = new HashSet<Student>();
        Student s1 = new Student(1, "Ionescu");
        Student s2 = new Student(2, "Popescu");
        Student s3 = new Student(3, "Constantinescu");
        Student s4 = new Student(4, "Iliescu");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

       //Courses
       Set<Course> courses = new HashSet<Course>();
       Course course1 = new Course(1101,"Tehnologii Java" );
       Course course2 = new Course(1102,"Interacţiune om-calculator" );
       Course course3 = new Course(1103,"Calitatea sistemelor software" );
       Course course4 = new Course(1104,"Capitole avansate de reţele neuronale" );
       Course course5 = new Course(1105,"Capitole speciale de învăţare automată" );
       Course course6 = new Course(1106,"Cercetări operaţionale" );
       Course course7 = new Course(1107,"Dezvoltarea aplicaţiilor Web" );
       courses.add(course1);
       courses.add(course2);
       courses.add(course3);
       courses.add(course4);
       courses.add(course5);
       courses.add(course6);
       courses.add(course7);

        //each Teacher should teach 2 Courses
        Set<Teacher> teachers = new HashSet<Teacher>();
        Teacher teacher1 = new Teacher();
        teacher1.setId(10);
        teacher1.setName("Busaco");
        teacher1.addCourse(course2);
        teacher1.addCourse(course7);

        Teacher teacher2 = new Teacher();
        teacher2.setId(11);
        teacher2.setName("Ciortuz");
        teacher2.addCourse(course4);
        teacher2.addCourse(course5);

        Teacher teacher3 = new Teacher();
        teacher3.setId(12);
        teacher3.setName("Lucanu");
        teacher3.addCourse(course3);
        teacher3.addCourse(course6);

        Teacher teacher4 = new Teacher();
        teacher4.setId(13);
        teacher4.setName("Iacob");
        teacher4.addCourse(course1);
        teacher4.addCourse(course6);

        Teacher teacher5 = new Teacher();
        teacher5.setId(14);
        teacher5.setName("Breaban");
        teacher5.addCourse(course4);
        teacher5.addCourse(course5);

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        teachers.add(teacher5);

        // each Group should have 4 Teachers
        //each Group should have 3 Students

        //define necessary fields
        groups = new HashSet<>();
        Group group1 = new Group();
        group1.setId(20);
        group1.setName("Group1");
        group1.addTeacher(teacher1);
        group1.addTeacher(teacher2);
        group1.addTeacher(teacher3);
        group1.addTeacher(teacher4);
        group1.addStudent(s1);
        group1.addStudent(s2);
        group1.addStudent(s3);

        Group group2 = new Group();
        group2.setId(21);
        group2.setName("Group2");
        group2.addTeacher(teacher1);
        group2.addTeacher(teacher2);
        group2.addTeacher(teacher3);
        group2.addTeacher(teacher5);
        group2.addStudent(s1);
        group2.addStudent(s2);
        group2.addStudent(s3);

        //add 2 Groups to the set of groups
        groups.add(group1);
        groups.add(group2);

        System.out.println("########## Group1 ##########");
        System.out.println("Group1 has id: " + group1.getId());
        System.out.println("Group1 has name: " + group1.getName());
        System.out.println();
        System.out.println("Group1 has 4 teachers: " );
        for(Teacher teacher: group1.getTeachers()){
            System.out.println(teacher.toString());
        }
        System.out.println();
        System.out.println("Group1 has 3 students: ");
        for(Student student: group1.getStudents()){
            System.out.println(student.toString());
        }
        System.out.println("###########################");


        System.out.println("########## Group2 ##########");
        System.out.println("Group2 has id: " + group2.getId());
        System.out.println("Group2 has name: " + group2.getName());
        System.out.println();
        System.out.println("Group2 has 4 teachers: " );
        for(Teacher teacher: group2.getTeachers()){
            System.out.println(teacher.toString());
        }
        System.out.println();
        System.out.println("Group2 has 3 students: ");
        for(Student student: group2.getStudents()){
            System.out.println(student.toString());
        }
        System.out.println("###########################");
        System.out.println();
        System.out.println(group1);//functioneaza pentru ca am suprascris toString()
        System.out.println();
        System.out.println(group2);//functioneaza pentru ca am suprascris toString()

        //Question: why is better to store Teachers for example in a Set and not in a List?
        //Preserve unique elements
    }
}
