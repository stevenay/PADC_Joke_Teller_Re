package com.passion.padc_joke_teller_re.data.vos;

/**
 * Created by NayLinAung on 7/5/2016.
 */
public class JokeVO {

    private String mJokeTitle;
    private String mJokeContent;
    private int mJokeImage;

    public JokeVO(String jokeTitle, String jokeContent, int jokeImage) {
        mJokeTitle = jokeTitle;
        mJokeContent = jokeContent;
        mJokeImage = jokeImage;
    }

    public String getJokeTitle() {
        return mJokeTitle;
    }

    public String getJokeContent() {
        return mJokeContent;
    }

    public int getJokeImage() {
        return mJokeImage;
    }
}
