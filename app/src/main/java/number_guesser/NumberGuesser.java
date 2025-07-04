package number_guesser;

public class NumberGuesser {
    int answer;

    public NumberGuesser(int answer) {
        this.answer = answer;
    }

    public String guess(int number) {
        if (number < this.answer) {
            return "higher";
        } else if (number > this.answer) {
            return "lower";
        } else {
            return "correct!";
        }
    }

    public static void main(String[] args) {
        NumberGuesser game = new NumberGuesser(42);
        System.out.println(game.guess(30));
    }
}
