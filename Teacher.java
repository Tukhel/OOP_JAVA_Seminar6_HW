package Seminar_6_HW;

public class Teacher extends User implements Comparable<Teacher> {
    private int teacherId;
    private String firstName;
    private String secondName;
    private String lastName;

    public Teacher(int teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Teacher [teacherId=" + teacherId + ", firstName=" + super.getFirstName() + ", secondName=" + super.getSecondName()
                + ", lastName=" + super.getLastName() + "]";
    }

    @Override
    public int compareTo(Teacher o) {
        if (teacherId > o.getTeacherId()) {
            return 1;
        }
        if (teacherId < o.getTeacherId()) {
            return -1;
        }
        return 0;
    }
}
