public class Lecturer extends Person {
    private String expertise;

    public Lecturer(String name, String id, String expertise) {
        super(name, id);
        this.expertise = expertise;
    }

    @Override
    public void introduce() {
        System.out.println("Saya " + name + ", dosen dengan keahlian di bidang " + expertise + ".");
    }
}
