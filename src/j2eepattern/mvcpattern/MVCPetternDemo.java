package j2eepattern.mvcpattern;

public class MVCPetternDemo {

    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController studentController = new StudentController(model, view);
        studentController.updateView();

        studentController.setStudentName("Daisy");
        studentController.updateView();

    }

    public static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Darin");
        student.setRollNo("10");
        return student;
    }
}
