package com.example.android.miwok;

/**
 * Created by Gideon on 10/2/2016.
 */

public class Word {

    private String mMiwok_Translation;
    private String mDefault_Translation;

    //Miwok translation
    public Word(String default_translation, String miwok_Translation) {
        mMiwok_Translation = miwok_Translation;
        mDefault_Translation = default_translation;
    }

    //Get default translation
    public String getDefaultTranslation() {
        return mDefault_Translation;
    }

    //Get Miwok translation
    public String getMiwokTranslation() {
        return mMiwok_Translation;
    }
}
