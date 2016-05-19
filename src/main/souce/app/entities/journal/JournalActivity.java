package app.entities.journal;

import app.entities.userdata.User;

import java.sql.Date;

/**
 * Created by click on 5/5/2016.
 */
public class JournalActivity {
    private int id;
    private User user;
    private Entity like;
    private Date date;

    public JournalActivity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
