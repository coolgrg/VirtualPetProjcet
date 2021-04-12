
public class Duck {
    public String name;
    // Define our attributes (fields)
    private String duck;
    private int age;

    public Duck() {

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;

    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    public String speak() {

        return "QUACK";
    }
}
