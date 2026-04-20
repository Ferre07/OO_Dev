// Ferre Goovaerts r1092398

package tm.itbachelors.projectclassiccars.model;

public class Person {
    private String firstName;
    private String surName;
    private String nationality;

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String SurName) {
        this.surName = surName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String toString(){
        return surName.toUpperCase() + " " + firstName;
    }
}
