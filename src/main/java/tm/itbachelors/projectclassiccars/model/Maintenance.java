// Ferre Goovaerts r1092398
package tm.itbachelors.projectclassiccars.model;

public class Maintenance {
    private String type;
    private int duration;
    private double hourlyRate;
    private Staff responsible;

    public Maintenance() {
    }

    public Maintenance(String type) {
        this.type = type;
    }

    public Maintenance(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public Maintenance(String type, int duration, double hourlyRate) {
        this.type = type;
        this.duration = duration;
        this.hourlyRate = hourlyRate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Staff getResponsible() {
        return responsible;
    }

    public void setResponsible(Staff responsible) {
        this.responsible = responsible;
    }

    public double getPrice(){
        return hourlyRate * duration / 60;
    }
}
