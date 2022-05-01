package creatingclass;

public class Dog {
    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    public Dog(String dogType, String dogName, String dogColor, int dogAge){
        super();
        this.dogType = dogType;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    public String getDogType(){
        return dogType;
    }
    public String getDogName(){
        return dogName;
    }
    public String getDogColor(){
        return dogColor;
    }
    public int getDogAge(){
        return dogAge;
    }

    public void setDogType(String newDogType){
        this.dogType = newDogType;
    }
    public void setDogName(String newDogName){
        this.dogName = newDogName;
    }
    public void setDogColor(String newDogColor){
        this.dogColor = newDogColor;
    }
    public void setDogAge(int newDogAge){
        this.dogAge = newDogAge;
    }

    public String toString(){
        return "Dog Type: " + dogType + "Dog name: " + dogName + "Dog Color: " + dogColor + "Dog Age: " + dogAge;
    }
}
