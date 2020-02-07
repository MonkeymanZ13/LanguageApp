package com.example.languages;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

import static com.example.languages.Constants.*;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mLanguage;

    public WordAdapter(Context context, ArrayList<Word> words, int language) {
        super(context, 0, words);
        mLanguage = language;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Vocab vocab = new Vocab();
        ArrayList<String> languageStrings = vocab.languageStrings;

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Word currentWord = getItem(position);

        LinearLayout wordsLinearLayout = listItemView.findViewById(R.id.words_linear_layout);


        if(currentWord.getEnglishTranslation() == "We don't speak ") {
            TextView englishWord = listItemView.findViewById(R.id.english_text_view);
            englishWord.setText(currentWord.getEnglishTranslation() + languageStrings.get(mLanguage));
        } else {
            TextView englishWord = listItemView.findViewById(R.id.english_text_view);
            englishWord.setText(currentWord.getEnglishTranslation());
        }

        TextView translatedWord = listItemView.findViewById(R.id.translated_text_view);

        if(mLanguage == ITALIAN) {
            translatedWord.setText(currentWord.getItalianTranslation());
            wordsLinearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.category_italian));
        } else if(mLanguage == GERMAN) {
            translatedWord.setText(currentWord.getGermanTranslation());
            wordsLinearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.category_german));
        } else if(mLanguage == CZECH) {
            translatedWord.setText(currentWord.getCzechTranslation());
            wordsLinearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.category_czech));
        } else if(mLanguage == DUTCH) {
            translatedWord.setText(currentWord.getDutchTranslation());
            wordsLinearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.category_dutch));
        } else if(mLanguage == FRENCH) {
            translatedWord.setText(currentWord.getFrenchTranslation());
            wordsLinearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.category_french));
        }

        return listItemView;
    }
}
