package com.stackroute.Pe5;

import java.util.Comparator;

class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student stud1, Student stud2) {

        // for comparison
        int nameCompare = stud1.getName().compareTo(stud2.getName());
        int ageCompare;
        int idCompare;

        if (stud1.getAge() > stud2.getAge()) {
            ageCompare = -10;
        } else if (stud1.getAge() < stud2.getAge()) {
            ageCompare = 10;
        } else {

            if (nameCompare != 0) {
                return nameCompare;
            }

            if (stud1.getStudentId() > stud2.getStudentId()) {
                idCompare = 10;
            } else {
                idCompare = -10;
            }

            return idCompare;

        }
        return ageCompare;

    }
}


