package fi.heiniola.viikko2t2.tehtava2.domain;

public class Student {
	
private String firstName, lastName;

public Student() {
	super();
}

public Student(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
  public String getFirstName() {
	  return firstName;
  }
  public void setFirstName(String firstName) {
	  this.firstName = firstName;
  }
  public String getLastName() {
	  return lastName;
  }

public void setLastName(String lastName) {
	this.lastName = lastName;
}
}
