// Ferre Goovaerts r1092398

package tm.itbachelors.projectclassiccars.model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Staff extends Person {
    private LocalDate startDate;
    private boolean senior;

    public Staff( String firstName, String surName){
        super(firstName,surName);
        this.startDate = LocalDate.now();
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String role;
        if (senior){
            role="Senior staff member ";
        }
        else{
            role="Staff member ";
        }
        return role + super.toString() + " is employed since " + startDate.format(dtf);
    }
}
