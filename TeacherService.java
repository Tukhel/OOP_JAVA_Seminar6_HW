package Seminar_6_HW;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for (Teacher teacher : teacherList) {
            if(maxId < teacher.getTeacherId()){
                maxId = teacher.getTeacherId();
            }
        }
        teacherList.add(new Teacher(++maxId, firstName, secondName, lastName));
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    } 

}
