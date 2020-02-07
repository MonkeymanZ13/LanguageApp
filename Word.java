package com.example.languages;

public class Word {

    private String mEnglishTranslation;
    private String mItalianTranslation;
    private String mGermanTranslation;
    private String mCzechTranslation;
    private String mDutchTranslation;
    private String mFrenchTranslation;

    private int mItalianAudioResourceId;
    private int mGermanAudioResourceId;
    private int mCzechAudioResourceId;
    private int mDutchAudioResourceId;
    private int mFrenchAudioResourceId;

    public Word(String englishTranslation, String italianTranslation, String germanTranslation,
                String czechTranslation, String dutchTranslation, String frenchTranslation,
                int italianAudioResourceId, int germanAudioResourceId, int czechAudioResourceId,
                int dutchAudioResourceId, int frenchAudioResourceId) {

        mEnglishTranslation = englishTranslation;
        mItalianTranslation = italianTranslation;
        mGermanTranslation = germanTranslation;
        mCzechTranslation = czechTranslation;
        mDutchTranslation = dutchTranslation;
        mFrenchTranslation = frenchTranslation;

        mItalianAudioResourceId = italianAudioResourceId;
        mGermanAudioResourceId = germanAudioResourceId;
        mCzechAudioResourceId = czechAudioResourceId;
        mDutchAudioResourceId = dutchAudioResourceId;
        mFrenchAudioResourceId = frenchAudioResourceId;
    }

    public String getEnglishTranslation() { return mEnglishTranslation; }
    public String getItalianTranslation() { return mItalianTranslation; }
    public String getGermanTranslation() { return mGermanTranslation; }
    public String getCzechTranslation() { return mCzechTranslation; }
    public String getDutchTranslation() { return mDutchTranslation; }
    public String getFrenchTranslation() { return mFrenchTranslation; }

    public int getItalianAudioResourceId() { return mItalianAudioResourceId; }
    public int getGermanAudioResourceId() { return mGermanAudioResourceId; }
    public int getCzechAudioResourceId() { return mCzechAudioResourceId; }
    public int getDutchAudioResourceId() { return mDutchAudioResourceId; }
    public int getFrenchAudioResourceId() { return mFrenchAudioResourceId; }

}
