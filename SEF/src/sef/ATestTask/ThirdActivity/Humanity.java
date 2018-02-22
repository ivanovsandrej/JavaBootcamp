package sef.ATestTask.ThirdActivity;

public abstract class Humanity {
    private String address;
    private int number;
 public Humanity(String adress, int number){
     this.address = address;
     this.number = number;
 }
    public void setAddress(String newAddress) {
       this.address  = newAddress;
    }
    public String getAddress() {
        return address;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int newNumber ){
     this.number=newNumber;
    }
}
