package Agencia;
 
public class Customer {
private int id;
private String name;
private String surname;
private String gender;
private boolean isLicensed;
public Customer(int id, String name, String surname, String gender,
                boolean isLicensed) {
super();
this.id = id;
this.name = name;
this.surname = surname;
this.gender = gender;
this.isLicensed = isLicensed;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getSurname() {
return surname;
}
public void setSurname(String surname) {
this.surname = surname;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public boolean isLicensed() {
return isLicensed;
}
public void setLicensed(boolean isLicensed) {
this.isLicensed = isLicensed;
}
 
}