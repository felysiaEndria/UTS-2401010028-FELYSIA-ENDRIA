public class Assignment extends Assessment {

    private int difficultyLevel; // 1–5

    public Assignment(String title, double score, int difficultyLevel) {
        super(title, score);
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public double calculateFinalScore() {
        // tugas yang lebih sulit memberikan sedikit bonus
        double bonus = difficultyLevel * 0.02 * score;
        return Math.min(score + bonus, 100); // pastikan tidak melebihi 100
    }

    @Override
    public String getGrade() {
        double finalScore = calculateFinalScore();
        if (finalScore >= 90) return "A";
        else if (finalScore >= 75) return "B";
        else if (finalScore >= 60) return "C";
        else if (finalScore >= 45) return "D";
        else return "E";
    }
}
