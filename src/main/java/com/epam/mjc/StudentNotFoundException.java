package com.epam.mjc;

//creating custom exception class, with limited exception class IllegalArgumentException
//more bright using Exception class
//can be used combined to re-throw Exception (using built in JDK exceptions)
//example bellow
/*

//creating custom exception and passing Throwable class
public class StudentStoreException extends Exception {

  public StudentStoreException(String message, Throwable cause) {
    super(message, cause);
  }
}

//throwing exeption
public void save(Student student) throws StudentStoreException {
    try {
        // execute SQL statements..
    } catch (SQLException ex) {
        throw new StudentStoreException("Failed to save student", ex);
    }
}

//handling exception example
StudentManager manager = new StudentManager();
try {
    manager.save(new Student());
  } catch (StudentStoreException ex) {
    System.err.print(ex);
  }
 */


public class StudentNotFoundException extends IllegalArgumentException{
    public StudentNotFoundException(String msg){
        super(msg);
    }
}
