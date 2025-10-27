public class Exam extends Assessment {

    private double weight; // bobot ujian, misalnya 0.6 (60%)

    public Exam(String title, double score, double weight) {
        super(title, score);
        this.weight = weight;
    }

    @Override
    public double calculateFinalScore() {
        return score * weight; // perhitungan sederhana berdasarkan bobot
    }

    @Override
    public String getGrade() {
        double finalScore = calculateFinalScore();
        if (finalScore >= 85) return "A";
        else if (finalScore >= 70) return "B";
        else if (finalScore >= 55) return "C";
        else if (finalScore >= 40) return "D";
        else return "E";
    }
}
