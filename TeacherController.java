package Seminar_6_HW;

public class TeacherController implements UserController<Teacher>, UserControllerSendConsole<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);    
    }

    @Override
    public void sendConsole() {
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }

    
}
