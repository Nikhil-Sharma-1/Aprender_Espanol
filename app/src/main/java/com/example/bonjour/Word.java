package com.example.bonjour;

public class Word {

    private String mDefaultTranslation;

    private String mSpanishTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;


    public Word(String defaultTranslation, String spanishTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String spanishTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getSpanishTranslation() {
        return mSpanishTranslation;
    }

    public int getImageResourceId() {return mImageResourceId;}

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}

