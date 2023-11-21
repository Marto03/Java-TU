import java.util.List;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Collections;
import java.io.IOException;

public class Quiz {
    private Student student;

    public Quiz(Student student, String questions) {
        this.student = student;
        this.questions = questions;
        this.currentQuestion = 0;
        loadQuestions();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private String questions;

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    private int currentQuestion;

    // public int getCurrentQuestion() {
    // return currentQuestion;
    // }

    // public void setCurrentQuestion(int currentQuestion) {
    // this.currentQuestion = currentQuestion;
    // }

    public List<Question> quest;

    public List<Question> loadQuestions() {
        try (DataInputStream st = new DataInputStream(new FileInputStream("questions.bin"))) {
            String s = st.readUTF();
            questions.add(s);
            quest.add(s);
        } catch (IOException e) {
            System.err.println("No such file");
        } finally {
            Collections.shuffle(quest);
        }

        return quest;
    }

    public boolean hasNext() {
        if (currentQuestion < loadQuestions().size()) {
            currentQuestion++;
            return true;
        }
        return false;
    }

    public String getCurrentQuestion() {
        String questionC = loadQuestions(currentQuestion);
        return questionC;
    }

    public void setAnswer() {

    }
}
