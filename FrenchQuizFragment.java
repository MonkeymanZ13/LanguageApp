package com.example.languages;


import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.languages.Constants.FRENCH;

/**
 * A simple {@link Fragment} subclass.
 */
public class FrenchQuizFragment extends Fragment {


    public FrenchQuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.checklist, container, false);

        RelativeLayout rootLL = rootView.findViewById(R.id.root_linear_layout);
        rootLL.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.category_french));

        Vocab vocab = new Vocab();
        ArrayList<Word> phrases = vocab.phrases;
        ArrayList<Word> numbers = vocab.numbers;

        ListView phrasesListView = rootView.findViewById(R.id.checklist_phrases);
        ChecklistAdapter phrasesChecklistAdapter = new ChecklistAdapter(getContext(), phrases, FRENCH);
        phrasesListView.setAdapter(phrasesChecklistAdapter);

        ListView numbersListView = rootView.findViewById(R.id.checklist_numbers);
        ChecklistAdapter numbersChecklistAdapter = new ChecklistAdapter(getContext(), numbers, FRENCH);
        numbersListView.setAdapter(numbersChecklistAdapter);

        return rootView;
    }

}
