package app.entities.userdata;

import app.entities.entityActivity.Tag;
import app.entities.journal.JournalActivity;
import app.entities.photo.Photo;
import app.entities.questionary.Answer;

import java.util.Date;
import java.util.List;

/**
 * Created by click on 5/5/2016.
 */
public class User {
    private List<Tag> activities;
    private Date createDate;
    private List<JournalActivity> journalActivity;
    private List<Integer> ownArticle;
    private List<Integer> likeArticles;
    private List<Integer> likePlace;
    private List<Integer> ownPlaces;
    private List<Answer> answers;
    private Photo avatar;

    public User() {
    }

    public Photo getAvatar() {
        return avatar;
    }

    public void setAvatar(Photo avatar) {
        this.avatar = avatar;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Tag> getActivities() {
        return activities;
    }

    public void setActivities(List<Tag> activities) {
        this.activities = activities;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<JournalActivity> getJournalActivity() {
        return journalActivity;
    }

    public void setJournalActivity(List<JournalActivity> journalActivity) {
        this.journalActivity = journalActivity;
    }

    public List<Integer> getOwnArticle() {
        return ownArticle;
    }

    public void setOwnArticle(List<Integer> ownArticle) {
        this.ownArticle = ownArticle;
    }

    public List<Integer> getLikeArticles() {
        return likeArticles;
    }

    public void setLikeArticles(List<Integer> likeArticles) {
        this.likeArticles = likeArticles;
    }

    public List<Integer> getLikePlace() {
        return likePlace;
    }

    public void setLikePlace(List<Integer> likePlace) {
        this.likePlace = likePlace;
    }

    public List<Integer> getOwnPlaces() {
        return ownPlaces;
    }

    public void setOwnPlaces(List<Integer> ownPlaces) {
        this.ownPlaces = ownPlaces;
    }
}
