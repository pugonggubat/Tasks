class Student{
    private String FirstName;
    private String LastName;
    public Student(String FirstName, String LastName){
        this.FirstName=FirstName;
        this.LastName=LastName;
    }

    public void printFullName() {
        System.out.println("Full name: " + FirstName + " " + LastName);
    }

}

public class Task10 {

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Morgan","Freeman"),
                new Student("Brad","Pitt"),
                new Student("Kevin", "Spacey")
        };

        for(Student s: students){
            s.printFullName();
        }
    }
}
