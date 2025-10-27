public class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void introduce() {
        System.out.println("Saya adalah seseorang bernama " + name + ".");
    }
}
