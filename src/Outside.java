import Model.Student;

public class Outside {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("David");
        student.setGender("Male");
        student.setAge(24);
        student.setStudentNumber(201410782);

        System.out.println("Name: " + student.getName() + "\n"+ "Age: " + student.getAge() + "\n" + "Gender: " + student.getGender() + "\n"
         + "Student Number: " + student.getStudentNumber()  );
    }
}
