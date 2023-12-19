import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Main.
 */
public class Main {
    private static ArrayList<Question> questions = new ArrayList<>();

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        init();
    }

    /**
     * Initialize the files, and generate the questions and create objects
     *
     * @throws IOException the io exception
     */
    public static void init() throws IOException {
        File questionFile = new File("questions.txt");

        BufferedReader brQ = new BufferedReader(new FileReader(questionFile));

        File answerFile = new File("answers.txt");

        BufferedReader brA = new BufferedReader(new FileReader(answerFile));

        String q;
        String a;
        while ((q = brQ.readLine()) != null) {
            while ((a = brA.readLine()) != null) {
                List<String> answers = Arrays.asList(a.split(","));
                questions.add(new Question(q, answers.get(0), answers));
            }
        }

        for (Question qs : questions) {
            System.out.println("Question: " + qs.getQuestionText());
            System.out.println("Answer: " + qs.getAnswerText());
            for (String s : qs.getOptions()) {
                System.out.println(s);
            }
        }
    }
}