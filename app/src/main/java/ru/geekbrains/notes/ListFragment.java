package ru.geekbrains.notes;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListFragment extends Fragment {

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    private void initView(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        String[] notesList = getResources().getStringArray(R.array.titlesNotes);

        for (int i = 0; i < notesList.length; i++) {
            String title = notesList[i];
            TextView textView = new TextView(getContext());

            textView.setText(title);
            textView.setTextSize(30);
            textView.setTextColor(Color.BLACK);
            
            final int position = i;
            textView.setOnClickListener(v -> {
                showNote(position);
            });
          linearLayout.addView(textView);
        }
    }

    private void showNote(int position) {
        NoteFragment noteFragment = NoteFragment.newInstance(position);
        requireActivity().getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.noteFragment, noteFragment)
                .commit();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       initView(view);
    }
}