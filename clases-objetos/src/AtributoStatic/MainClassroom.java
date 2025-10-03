package AtributoStatic;

public class MainClassroom {
    public static void main(String[] args) {
        Classroom student1 = new Classroom("Juan");
        Classroom student2 = new Classroom("María");

        student1.showInformation();
        student2.showInformation();

        Classroom.setSchoolName("Escuela 2");

        student1.showInformation();
        student2.showInformation();
    }
}
