package hero;

public class Elf {
    public Elf(){}
    private int age = 21;
    private String name = ("Mia");
    private char size = ('M');
    private String location = ("Czech republik");
    private String color = ("Green");
public  void getInfo() {
    System.out.println("Эльф");
}
    public void setColor(String color) {
        this.location = location;

        }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getSize() {
        return size;
    }
    public String getColor() {
    return color;
    }

    public int getAge() {
        return age;
    }

}



