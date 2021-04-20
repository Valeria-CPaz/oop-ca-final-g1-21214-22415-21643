package com.assessment;

public class Driver {

    void run() throws Exception {

        // first: create administrator

        Admin admin = new Admin("Marcus", "Moura", "male", "12345678", "20.06.1995", "marcus@moura.ie", "mafr",
                "123456" );

        // admin creates a College Branch
        CollegeBranch branchOne = admin.createBranch("I", "Dorset Street");
        CollegeBranch branchTwo = admin.createBranch("II", "Abbey Street");

        // admin creates a course
        Course scienceInComputing= admin.createCourse(branchOne, "Science in Computing", 4500.00);
        Course business = admin.createCourse(branchTwo, "Business", 5000.00);

        // admin creates a module for the course
        Module programming = admin.createModule("Programming", scienceInComputing, branchOne, "Monday", "16:00");
        Module marketing = admin.createModule("Marketing", business, branchTwo, "Friday", "12:45");
        Module maths = admin.createModule("Maths", scienceInComputing, branchOne, "Tuesday", "09:00");

        // admin creates a lecturer and automatically adds him to the respective module (check lecturer class)
        Lecturer firstLecturer = admin.createLecturer("John", "Rowley", "male", "142536789",
                "02.04.1950", "john@rowley.ie", "joro",
                "123456", programming, branchOne);

        Lecturer secondLecturer = admin.createLecturer("Annette", "Forster", "female", "14563214", "14.08.1970",
                "annette@forster.ie", "anfor", "145632", maths, branchOne);

        Lecturer thirdLecturer = admin.createLecturer("Rosana", "RastaPe", "female", "14563214", "14.08.1980",
                "rosana@rasta.ie", "rora", "145632", marketing, branchTwo);


        Student student = admin.createStudents("Valeria", "Paz", "female", "789456123",
                "05.08.1989", "val@paz.ie", "valparaiso", "142536",
                branchOne, scienceInComputing, false);

        admin.addStudentToModule(programming, student);
        admin.addStudentToModule(maths, student);
        secondLecturer.setGrade(8.0, student);
        firstLecturer.setGrade(7.0, student);
//
//        admin.addPayment(student);
//        admin.addPayment(student);
//        admin.addPayment(student);
//        admin.addPayment(student);
//        admin.addPayment(student);
//        admin.addPayment(student);


//        student.printFees();
//
//        admin.printListOfBranches();

        firstLecturer.createAssignment("10.05.2021", "Create a banking app");

        student.printAssignments();


//        student.printGrades();
//        student.printTimetable();

    }
}
