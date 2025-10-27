public abstract class Assessment implements Gradable {
    protected String title;
    protected double score;

    public Assessment(String title, double score) {
        this.title = title;
        this.score = score;
    }

    // Method abstrak: harus diimplementasikan di subclass
    public abstract double calculateFinalScore();
}
