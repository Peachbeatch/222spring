package web.model;

public class Car {
    private String model;
    private String colour;
    private short year;

    public Car(){}

    public Car(String model, short year, String colour){
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public String getColour() { return colour; }

    public void setColour(String colour) { this.colour = colour; }

    public short getYear() { return year; }

    public void setYear(short year) { this.year = year; }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                '}';
    }
}
