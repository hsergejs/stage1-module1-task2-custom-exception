package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  //throwing custom Exception class StudentNotFoundException on method search
    public Student find(long studentID) throws StudentNotFoundException {
        Student currStudent = Student.getValueOf(studentID);
        if (currStudent != null) {
            return currStudent;
        } else {
            throw new StudentNotFoundException("Could not find student with ID " + studentID);
        }
    }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    //catching custom exception in during actual search
    for (int i = 0; i < IDs.length; i++) {
        try{
          Student student = manager.find(IDs[i]);
          System.out.println("Student name " + student.getName());
        }
        catch(StudentNotFoundException e){
          System.err.print(e);
        }
    }
  }
}