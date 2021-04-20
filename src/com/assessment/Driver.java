package com.assessment;

public class Driver {

    void run() throws Exception {

        // first: create administrator

        Admin admin = new Admin("Marcus", "Moura", "male", "12345678", "20.06.1995", "marcus@moura.ie", "mafr",
                "123456");


        admin.createBranch("I", "Dorset Street");
        admin.createBranch("II", "Abbey Street");

        // creates course

        admin.createCourse(admin.getListOfBranches().get(0), "Science in Computing", 4500.00);
        admin.createCourse(admin.getListOfBranches().get(1), "Business", 5000.00);

        // creates module

        admin.createModule("Programming", admin.getListOfBranches().get(0).getListOfCourses().get(0), admin.getListOfBranches().get(0),
                "Monday", "16:00");
        admin.createModule("Marketing", admin.getListOfBranches().get(1).getListOfCourses().get(0), admin.getListOfBranches().get(1),
                "Friday", "12:45");
        admin.createModule("Maths", admin.getListOfBranches().get(0).getListOfCourses().get(0), admin.getListOfBranches().get(0),
                "Tuesday", "09:00");


        // Creates a lecturer and automatically adds him to the respective module (check lecturer class)

        admin.createLecturer("John", "Rowley", "male", "142536789",
                "02.04.1950", "john@rowley.ie", "joro",
                "123456", "Computer Science", "programming", "I");

        admin.createLecturer("Annette", "Forster", "female", "14563214", "14.08.1970",
                "annette@forster.ie", "anfor", "145632", "science in computing", "maths", "I");

        admin.createLecturer("Rosana", "RastaPe", "female", "14563214", "14.08.1980",
                "rosana@rasta.ie", "rora", "145632", "business", "marketing", "II");

        // CREATES STUDENT

        Student s = admin.createStudents("Peter", "Parker", "male", "789456123",
                "05.08.1989", "peter@parker.ie", "spiderman", "142536",
                "I",
                "Science in Computing", false, 6);



        // Adding student to MODULE

        admin.addStudentToModule(admin.getListOfBranches().get(0).getListOfCourses().get(0).getListOfModulesCourse().get(0),
                admin.getListOfBranches().get(0).getListOfCourses().get(0).getListOfStudentsCourse().get(0));

        admin.addStudentToModule(admin.getListOfBranches().get(0).getListOfCourses().get(0).getListOfModulesCourse().get(1),
                admin.getListOfBranches().get(0).getListOfCourses().get(0).getListOfStudentsCourse().get(0));



//        admin.getListOfBranches().get(0).getListOfCourses().get(0).getListOfModulesCourse().get(0).getLecturer().setGrade(10.0,
//                admin.getListOfBranches().get(0).getListOfCourses().get(0).getListOfModulesCourse().get(0).getListOfStudentsModule().get(0));

//        s.printGrades();
//        System.out.println("\n");
//        s.printFees();

//        System.out.println(admin.getListOfBranches().get(0).getListOfCourses().get(0).getListOfModulesCourse().get(0).getLecturer());
//
//        admin.deleteLecturer(admin.getListOfBranches().get(0).getListOfLecturers().get(0), admin.getListOfBranches().get(0).getListOfCourses().get(0));
//
//        System.out.println(admin.getListOfBranches().get(0).getListOfCourses().get(0).getListOfModulesCourse().get(0).getLecturer());


        System.out.println(s.getCourse().getName());






//        // admin creates a College Branch
//        CollegeBranch branchOne = admin.createBranch("I", "Dorset Street");
//        CollegeBranch branchTwo = admin.createBranch("II", "Abbey Street");
//
//        // admin creates a course
//        Course scienceInComputing = admin.createCourse(branchOne, "Science in Computing", 4500.00);
//        Course business = admin.createCourse(branchTwo, "Business", 5000.00);
//
//        // admin creates a module for the course
//        Module programming = admin.createModule("Programming", scienceInComputing, branchOne, "Monday", "16:00");
//        Module marketing = admin.createModule("Marketing", business, branchTwo, "Friday", "12:45");
//        Module maths = admin.createModule("Maths", scienceInComputing, branchOne, "Tuesday", "09:00");
//
//        // admin creates a lecturer and automatically adds him to the respective module (check lecturer class)
//        Lecturer firstLecturer = admin.createLecturer("John", "Rowley", "male", "142536789",
//                "02.04.1950", "john@rowley.ie", "joro",
//                "123456", programming, branchOne);
//
//        Lecturer secondLecturer = admin.createLecturer("Annette", "Forster", "female", "14563214", "14.08.1970",
//                "annette@forster.ie", "anfor", "145632", maths, branchOne);
//
//        Lecturer thirdLecturer = admin.createLecturer("Rosana", "RastaPe", "female", "14563214", "14.08.1980",
//                "rosana@rasta.ie", "rora", "145632", marketing, branchTwo);
//
//
//        Student student = admin.createStudents("Peter", "Parker", "male", "789456123",
//                "05.08.1989", "peter@parker.ie", "spiderman", "142536",
//                branchOne, scienceInComputing, false, 6);
//
//        admin.addStudentToModule(programming, student);
//        admin.addStudentToModule(maths, student);
//        secondLecturer.setGrade(8.0, student);
//        firstLecturer.setGrade(7.0, student);
//
//        admin.addPayment(branchOne.getListOfStudents().get(0));
////        admin.addPayment(student);
////        admin.addPayment(student);
////        admin.addPayment(student);
////        admin.addPayment(student);
////        admin.addPayment(student);
//
//
////        student.printFees();
//
////
////        admin.printListOfBranches();
//
//        Assignment firstAssignment = firstLecturer.createAssignment("10.05.2021", "Create a banking app");
//        student.printAssignments();
//
//        firstLecturer.editAssignment(firstAssignment, "11.05.2022", "Create a college app");
//        student.printAssignments();
//
//
//        student.printGrades();
//        student.printTimetable();



    }
}
