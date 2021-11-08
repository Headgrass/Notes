package ru.geekbrains.notes;

import android.os.Parcel;
import android.os.Parcelable;

public class Note implements Parcelable {
    String dateNote;
    String titleNote;
    String bodyNote;

    public Note(String dateNote, String titleNote, String bodyNote) {
        this.dateNote = dateNote;
        this.titleNote = titleNote;
        this.bodyNote = bodyNote;
    }

    protected Note(Parcel in) {
        dateNote = in.readString();
        titleNote = in.readString();
        bodyNote = in.readString();
    }

    public static final Creator<Note> CREATOR = new Creator<Note>() {
        @Override
        public Note createFromParcel(Parcel in) {
            return new Note(in);
        }

        @Override
        public Note[] newArray(int size) {
            return new Note[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(dateNote);
        parcel.writeString(titleNote);
        parcel.writeString(bodyNote);
    }
}
