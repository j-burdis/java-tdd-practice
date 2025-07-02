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
}
