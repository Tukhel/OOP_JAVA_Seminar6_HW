package Seminar_6_HW;

public interface UserController <T extends User > {
    void create(String firstName, String secondName, String lastName);
}
