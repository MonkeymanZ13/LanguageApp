package com.example.languages;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import static com.example.languages.Constants.*;

public class LanguageAdapter extends FragmentPagerAdapter {

    private int mLanguage;

    public LanguageAdapter(FragmentManager fm, int language) {
        super(fm);
        mLanguage = language;
    }

    @Override
    public Fragment getItem(int position) {
        if(mLanguage == ITALIAN) {
            if(position == 0) {
                return new ItalianPhrasesFragment();
            } else if(position == 1) {
                return new ItalianNumbersFragment();
            } else {
                return new ItalianQuizFragment();
            }
        } else if(mLanguage == GERMAN) {
            if(position == 0) {
                return new GermanPhrasesFragment();
            } else if(position == 1) {
                return new GermanNumbersFragment();
            } else {
                return new GermanQuizFragment();
            }
        } else if(mLanguage == CZECH) {
            if(position == 0) {
                return new CzechPhrasesFragment();
            } else if(position == 1) {
                return new CzechNumbersFragment();
            } else {
                return new CzechQuizFragment();
            }
        } else if(mLanguage == DUTCH) {
            if(position == 0) {
                return new DutchPhrasesFragment();
            } else if(position == 1) {
                return new DutchNumbersFragment();
            } else {
                return new DutchQuizFragment();
            }
        } else {
            if(position == 0) {
                return new FrenchPhrasesFragment();
            } else if(position == 1) {
                return new FrenchNumbersFragment();
            } else {
                return new FrenchQuizFragment();
            }
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return "Phrases";
        } else if(position == 1) {
            return "Numbers";
        } else {
            return "Quiz";
        }
    }

    @Override
    public int getCount() {
        return 2;
    } //set back to 3 to enable quiz tabs
}
