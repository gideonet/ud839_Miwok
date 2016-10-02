package com.example.android.miwok;

/**
 * Created by Gideon on 10/2/2016.
 */

public class Word {

    private String mMiwok_Translation;
    private String mDefault_Translation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**Miwok translation constructor
     *@param Miwok
     *@param Word
     *@param image_Id
    */
    public Word(String default_Translation, String miwok_Translation) {
        mMiwok_Translation = miwok_Translation;
        mDefault_Translation = default_Translation;
    }

    public Word(String default_Translation, String miwok_Translation, int image_Id) {
        mMiwok_Translation = miwok_Translation;
        mDefault_Translation = default_Translation;
        mImageResourceId = image_Id;
    }

    //Get default translation
    public String getDefaultTranslation() {
        return mDefault_Translation;
    }

    //Get Miwok translation
    public String getMiwokTranslation() {
        return mMiwok_Translation;
    }

    //Get Image Resource ID
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Returns whether or not there is an image
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
