import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa); // Sort in descending order
    }

    @Override
    public String toString() {
        return name + " (GPA: " + gpa + ")";
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 3.9));
        students.add(new Student("David", 3.7));

        Collections.sort(students);

        System.out.println("Students sorted by GPA (descending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
