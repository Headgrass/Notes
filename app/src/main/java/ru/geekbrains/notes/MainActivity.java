package ru.geekbrains.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListFragment listFragment = new ListFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Проверка связи

        Note note1 = new Note("06.11", "Новая заметка", "Первая заметка, чтобы понимать, что всё работает");
        Note note2 = new Note("07.11", "Вторая заметка", "Вторая заметка, чтобы понимать, что ничего не сломалось");
        Note note3 = new Note("08.11", "Третья заметка", "Треья заметка, чтобы понимать, что всё ещё что-то работает");

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.list_container, new ListFragment())
                .replace(R.id.note_container, new NoteFragment())
                .commit();
    }
}