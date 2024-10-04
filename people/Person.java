package people;
public class Person {
    private String name;
    private String location;
    private int year;
    

    public Person() {
    }
    public Person(String name, String location, int year) {
        this.name = name;
        this.location = location;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    }
