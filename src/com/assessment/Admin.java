package com.assessment;

public class Admin extends Person implements AdminTools{


    private String password;
    private Student student;
    private Tutor tutor;
    private CollegeBranch collegeBranch;
    private Courses courses;


    public Admin(String first_name, String second_name, String emailAddress, String password) {
        super(first_name, second_name, emailAddress);
        this.password = password;
    }


    public String getPassword() {
        return password;
    }


    // -> admin creates branches, tutors, students and classes


    @Override
    public CollegeBranch create_branch (String unit, String address) {

        collegeBranch = new CollegeBranch(unit, address);

        return collegeBranch;

    }


    @Override
    public Student create_students (String first_name, String last_name, String emailAddress, String password, String username) {

        student = new Student(first_name, last_name, emailAddress, password, username);
        return student;

    }


    @Override
    public Tutor create_tutor(String first_name, String last_name, String emailAddress, String password, String subject) {

        tutor = new Tutor(first_name, last_name, emailAddress, password, subject);
        return tutor;
    }

    @Override
    public Courses create_branch_class(CollegeBranch collegeBranch, Tutor tutor) {

        courses = new Courses(collegeBranch, tutor);
        return courses;

    }

    // --> adding students to the classes


    @Override
    public void add_student_to_class(Student student, CollegeBranch collegeBranch, Courses courses) {


        if (courses.getCollegeBranch().getUnit().equalsIgnoreCase(courses.getCollegeBranch().getUnit())) {
            student.getTimetable().add(courses);

            courses.getList_of_students().add(student);
        } else {
            System.out.println("ERROR - THE UNIT DOESN'T HAVE THIS CLASS");
        }

//		ArrayList<BranchClass> listClasses = new ArrayList<>();
//		listClasses = collegeBranch.getListOfClasses();
//
//
//		for (int i = 0; i < listClasses.size(); i++) {
//
//			if(listClasses.get(i).equals(branchClass)) {
//				collegeBranch.getListOfClasses().get(i).getList_of_students().add(student);
//				student.getTimetable().add(branchClass);
//				break;
//			}
//
//		}


    }








}
