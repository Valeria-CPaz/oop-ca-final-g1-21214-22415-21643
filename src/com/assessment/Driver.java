package com.assessment;

public class Driver {


    public Driver () {

    }

    public void run() {

        // --> Create Administrator

        Admin administrator = new Admin("One", "Above all","abcd@efgh.com", "abc123");

        // --> Create college branch

        CollegeBranch cb1 = administrator.create_branch("First Unit", "Gardiner Street");



        // --> Create Student
        Student student1 = administrator.create_students("Marcus", "Moura", "abcd@efgh.com","abcd1234", "marvin");


        // --> Create Tutor

        Tutor tutor1 = administrator.create_tutor("John", "Rowley","abcd@efgh.com", "tutorPass", "Programming");
        Tutor tutor2 = administrator.create_tutor("Annette", "Forster", "abcd@efgh.com","tutor2Pass", "Maths");
        Tutor tutor3 = administrator.create_tutor("Wenhao", "Fu", "abcd@efgh.com","tutor3Pass", "Database");


        // --> Create Classes

        Courses firstClass = administrator.create_branch_class(cb1, tutor1);
        Courses secondClass = administrator.create_branch_class(cb1, tutor2);
        Courses thirdClass = administrator.create_branch_class(cb1, tutor3);



        // --> Add student to classes

        administrator.add_student_to_class(student1, cb1, firstClass);
        administrator.add_student_to_class(student1, cb1, secondClass);
        administrator.add_student_to_class(student1, cb1, thirdClass);

        // --> Tutors put grades

        tutor1.putGrade(student1, 10.0);
        tutor2.putGrade(student1, 9.00);
        tutor3.putGrade(student1, 8.0);

//         --> Student prints grades

        student1.print_grades();

        // --> Student prints timetable


//        student1.print_timetable();




    }
}
