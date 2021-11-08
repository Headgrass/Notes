package ru.geekbrains.notes;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

public class NoteFragment extends Fragment {

    private static final String ARG_POSITION = "ARG_POSITION";

    int position = -1;

    public NoteFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null) {
            position = getArguments().getInt(ARG_POSITION);
        }
    }

    // Фабричный метод, сам вызывает конструктор объекта
    public static NoteFragment newInstance(int position) {
        NoteFragment noteFragment = new NoteFragment();
        Bundle args = new Bundle();
        noteFragment.setArguments(args);
        return noteFragment;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
      initView(position);
    }

    private void initView(int position) {


        TextView textView = requireActivity().findViewById(R.id.note_fragment);

        textView.setText(position);

        String[] notesList = getResources().getStringArray(R.array.titlesNotes);

        for (int i = 0; i < notesList.length; i++) {
            String title = notesList[i];
            TextView textViewnote = new TextView(getContext());

            textViewnote.setText(title);
            textViewnote.setTextSize(24);
            textViewnote.setTextColor(Color.BLACK);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_note, container, false);
    }
}