package com.example.languages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.languages.Constants.*;

public class ChecklistAdapter extends ArrayAdapter<Word> {

    private int mLanguage;

    public ChecklistAdapter(Context context, ArrayList<Word> words, int language) {
        super(context, 0, words);
        mLanguage = language;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.checklist_item, parent, false);
        }

        final Word currentWord = getItem(position);

        Vocab vocab = new Vocab();
        ArrayList<String> languageStrings = vocab.languageStrings;

        TextView checkboxEnglish = listItemView.findViewById(R.id.checkbox_english);
        checkboxEnglish.setText(currentWord.getEnglishTranslation());
        if(currentWord.getEnglishTranslation() == "We don't speak ") {
            checkboxEnglish.setText(currentWord.getEnglishTranslation() + languageStrings.get(mLanguage));
        } else {
            checkboxEnglish.setText(currentWord.getEnglishTranslation());
        }

        TextView checkboxForeign = listItemView.findViewById(R.id.checkbox_foreign);

        if(mLanguage == ITALIAN) {
            checkboxForeign.setText(currentWord.getItalianTranslation());
        } else if(mLanguage == GERMAN) {
            checkboxForeign.setText(currentWord.getGermanTranslation());
        } else if(mLanguage == CZECH) {
            checkboxForeign.setText(currentWord.getCzechTranslation());
        } else if(mLanguage == DUTCH) {
            checkboxForeign.setText(currentWord.getDutchTranslation());
        } else {
            checkboxForeign.setText(currentWord.getFrenchTranslation());
        }

        return listItemView;
    }
}
