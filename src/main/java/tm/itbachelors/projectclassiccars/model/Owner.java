// Ferre Goovaerts r1092398

package tm.itbachelors.projectclassiccars.model;


import java.util.ArrayList;

public class Owner extends Person {
    private int yearOfBirth;
    private String carCode;
    private ArrayList<String> wishList = new ArrayList<>();

    public Owner(String firstName, String surName){
        super(firstName, surName);
        this.carCode = "undefined"; //**//

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public ArrayList<String> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<String> wishList) {
        this.wishList = wishList;
    }

    public boolean addToWishList(String carName){
        if (wishList.size() < 5) {
            wishList.add(carName);
            return true;
        }
        return false;
    }
    public int getNumberOfWishes(){
        return wishList.size();

    }
    public String toString(){
        return "Owner " + super.toString() + " ("+getNationality()+  ") with car code " +carCode;
    }
}
