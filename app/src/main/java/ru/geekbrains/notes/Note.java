package ru.geekbrains.notes;

public class Note {
    String dateNote;
    String titleNote;
    String bodyNote;

    public Note(String dateNote, String titleNote, String bodyNote) {
        this.dateNote = dateNote;
        this.titleNote = titleNote;
        this.bodyNote = bodyNote;
    }

    public String getDateNote() {
        return dateNote;
    }

    public void setDateNote(String dateNote) {
        this.dateNote = dateNote;
    }

    public String getTitleNote() {
        return titleNote;
    }

    public void setTitleNote(String titleNote) {
        this.titleNote = titleNote;
    }

    public String getBodyNote() {
        return bodyNote;
    }

    public void setBodyNote(String bodyNote) {
        this.bodyNote = bodyNote;
    }
}
