package Encapsulation;

public class course {
    private String courseName, code, instructor_name;

    public course(String courseName, String code, String instructor_name) {
        this.courseName = courseName;
        this.code = code;
        this.instructor_name = instructor_name;

    }

    public course() {

    }

    public String getCourse_name() {
        return courseName;
    }

    public void setCourse_name(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }
}


