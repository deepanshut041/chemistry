package in.deepanshutyagi.chemistry.model;

public class Student {
    private static Student ourInstance = new Student();

    public static Student getInstance() {
        return ourInstance;
    }

    private Student() {
    }
}
