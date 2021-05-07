[16:53, 07/05/2021] Alexson Dorset: package JavaProject.entities;

public class Assignment {

    private String dueDate;
    private String description;
    private String lecturerName;
    private Module module;



    public Assignment(String dueDate, String description, String lecturerName, Module module) {
        this.dueDate = dueDate;
        this.description = description;
        this.lecturerName = lecturerName;
        this.module = module;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getDescription() {
        return description;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public Module getModule() {
        return module;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
[16:54, 07/05/2021] Alexson Dorset: package JavaProject.entities;

        import java.util.ArrayList;

public class CollegeBranch {

    private String unit;
    private String address;
    private ArrayList<Course> listOfCourses = new ArrayList<>();
    private ArrayList<Lecturer> listOfLecturers = new ArrayList<>();
    private ArrayList<Student> listOfStudents = new ArrayList<>();
//    private static ArrayList<CollegeBranch> staticListOfBranches = new ArrayList<>();


    public CollegeBranch(String unit, String address) {
        this.unit = unit;
        this.address = address;
    }

    public String getUnit() {
        return unit;
    }

    public String getAddress() {
        return address;
    }




    public ArrayList<Course> getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses(ArrayList<Course> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }

    public ArrayList<Lecturer> getListOfLecturers() {
        return listOfLecturers;
    }

    public void setListOfLecturers(ArrayList<Lecturer> listOfLecturers) {
        this.listOfLecturers = listOfLecturers;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    @Override
    public String toString() {
        return "CollegeBranch{" +
                "unit='" + unit + '\'' +
                ", address='" + address + '\'' +
                ", listOfCourses=" + listOfCourses +
                ", listOfLecturers=" + listOfLecturers +
                ", listOfStudents=" + listOfStudents +
                '}';
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
}
