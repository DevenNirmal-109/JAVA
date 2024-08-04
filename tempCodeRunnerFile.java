
// import java.util.Scanner;

// class Student {
//     protected int studentId;
//     protected String name;
//     protected int age;
//     protected String department;

//     public Student(String name, int age, int studentId, String department) {
//         this.name = name;
//         this.age = age;
//         this.studentId = studentId;
//         this.department = department;
//     }

//     public int getstudentId() {
//         return studentId;
//     }

//     public String getname() {
//         return name;
//     }

//     public int getage() {
//         return age;
//     }

//     public String getdepartment() {
//         return department;
//     }

//     @Override
//     public String toString() {
//         return ("Student id" + studentId + "name" + name + "age " + age + "Department " + department);
//     }
// }

// class StudentRecordSystem extends Student {
//     Student s[] = new Student[10];
//     int count = 0;

//     public void addStudent() {
//         Scanner sc=new Scanner(System.in);
//         int studentId;
//         System.out.println("Enter student id ");
//         studentId=sc.nextInt();
//         String name;
//         System.out.println("Enter student name ");
//         name=sc.nextLine();
//         int age;
//         System.out.println("Enter student age ");
//         age=sc.nextInt();
//         String department;
//         System.out.println("Enter student department ");
//         department=sc.nextLine();
//     }
// }

// public class StudentRecordMGMT {
//     public static void main(String[] args) {

//     }
// }

import java.util.Scanner;

class Student {
    public int ID;
    private int age;
    private String Name;
    private String department;

    public Student() {
        ID = 0;
        age = 0;
        Name = "";
        department = "";
    }

    public Student(int ID, int age, String Name, String department) { // Perameterised Constructor to take input:
        this.ID = ID;
        this.Name = Name;
        this.age = age;
        this.department = department;
    }

    public int getID() {
        return ID;
    }

    public int getage() {
        return age;
    }

    public String getName() {
        return Name;
    }

    public String getdepartment() {
        return department;
    }

    public void display() {
        System.out.println("ID : " + ID + "Name : " + Name + "Age" + age + "Department" + department);
    }

}

class StudentRecord extends Student {
    Student[] students = new Student[2];
    private int count;

    public StudentRecord() {
        count = 0;
    }

    // Call superclass constructor with required parameters
    public StudentRecord(int ID, int age, String Name, String department) {
        super(ID, age, Name, department);
    }

    public void addStudent(int ID, int age, String Name, String department) {
        if (count < students.length) {
            students[count] = new Student(ID, age, Name, department);
            count++;
        } else {
            System.out.println("Student record is full.");
        }
    }

    public void displayStudents() {
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    public void search(int iD) {
        if (iD == ID)
            for (int i = 0; i < count; i++) {
                students[i].display();
            }
        else {
            System.out.println("Student not found");
        }
    }
}

class StudentRecordMGMT extends StudentRecord {
    public static void main(String[] args) {