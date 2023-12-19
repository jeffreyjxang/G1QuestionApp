import java.util.ArrayList;
import java.util.List;

/**
 * The type Question.
 */
public class Question {
    private String questionText;
    private String answerText;
    private ArrayList<String> options;

    /**
     * Instantiates a new Question.
     *
     * @param questionText the question text
     * @param answerText   the answer text
     * @param options      the options
     */
    public Question(String questionText, String answerText, List<String> options) {
        this.questionText = questionText;
        this.answerText = answerText;
        this.options = new ArrayList<>(options);
    }

    /**
     * Gets question text.
     *
     * @return the question text
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Sets question text.
     *
     * @param questionText the question text
     */
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    /**
     * Gets answer text.
     *
     * @return the answer text
     */
    public String getAnswerText() {
        return answerText;
    }

    /**
     * Sets answer text.
     *
     * @param answerText the answer text
     */
    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    /**
     * Gets options.
     *
     * @return the options
     */
    public ArrayList<String> getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options the options
     */
    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }
}
