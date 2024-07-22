package JavaSort;

public class Student implements Comparable<Student>{
    private int ID;
    private String name;
    private double gpa;

    public Student(int ID, String name, double gpa) {
        this.ID = ID;
        this.name = name;
        this.gpa = gpa;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }


    public double getGpa() {
        return gpa;
    }

    public int compareID(Student student){
        if(this.ID < student.getID()){
            return -1;
        }else if(this.ID > student.getID()){
            return 1;
        }else{
            return 0;
        }
    }

    public int compareName(Student student){
        if(this.name.compareTo(student.getName()) > 0){
            return 1;
        } else if (this.name.compareTo(student.getName()) < 0) {
            return -1;
        }else {
            return this.compareID(student);
        }
    }

    @Override
    public int compareTo(Student student) {
        if(this.gpa > student.getGpa()){
            return -1;
        } else if (this.gpa < student.getGpa()) {
            return 1;
        }else{
            return this.compareName(student);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
