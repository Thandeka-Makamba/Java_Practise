package OOP.question11;

public class PuzzleGame extends Game {

    private Level difficulty = Level.MEDIUM;

    public Level getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Level difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public void getWelcomeMessage() {
        System.out.println("Welcome to PuzzleGame. Difficulty: " + difficulty.getDescription());
    }

    public static void main(String[] args) {
        PuzzleGame game = new PuzzleGame();

        game.start();
        game.getWelcomeMessage();
    }
}
