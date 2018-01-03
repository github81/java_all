import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Student {

    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return this.id;
    }
    public String getFname() {
        return this.fname;
    }
    public double getCgpa() {
        return this.cgpa;
    }
}

public class HRCollectionsSort {

    public static void main(String args[]) {

        List<Student> student_list = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        int id;
        String fname;
        double cgpa;
        for(int i=0;i<people;i++) {
            id = sc.nextInt();
            fname = sc.next();
            cgpa = sc.nextDouble();
            student_list.add(new Student(id, fname, cgpa));
        }

        //sort here
        Collections.sort(student_list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o2.getCgpa()>o1.getCgpa())
                    return 1;
                if(o2.getCgpa()<o1.getCgpa())
                    return -1;
                return o1.getFname().compareTo(o2.getFname());
            }
        });

        for(int i=0; i<people; i++) {
            Student sorted_student = student_list.get(i);
            System.out.println(sorted_student.getId() + "," + sorted_student.getFname() + "," + sorted_student.getCgpa());

        }
    }
}
