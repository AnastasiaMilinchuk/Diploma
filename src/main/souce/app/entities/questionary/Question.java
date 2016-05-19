package app.entities.questionary;

/**
 * Created by click on 5/5/2016.
 */
public class Question {
    private int id;
    private String question;

    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
