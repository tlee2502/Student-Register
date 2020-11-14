Student Register System~
Follows the MVC (Model-View-Controller) design pattern and constructor-based dependency injection to achieve loosely-coupled code.
JUnit testing to test the data access object and the service layer (wihch deals with the business logic). Achieved by using stub files. Note: Mockito framework could have been used instead.
Model students using 'Student' data transfer object.
User can choose to list all students currently in the system, add a student to the system, remove a student from the system. Information is stored in a file to be read in the next time the program is run.
Catches persistence exceptions that may arise when reading from and writing to the file.
Audit log utilises the Java DateTime API to record when changes are made to the system. Writes all changes to a different file.