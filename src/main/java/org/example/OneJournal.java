package org.example;

public class OneJournal {
    public int id;
    public String text;
    public String createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public OneJournal(int id, String text, String createDate) {
        this.id = id;
        this.text = text;
        this.createDate = createDate;
    }

    public OneJournal() {
    }
}
