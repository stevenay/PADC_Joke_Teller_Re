package com.passion.padc_joke_teller_re.data.models;

import android.content.Context;

import com.passion.padc_joke_teller_re.JokeTellerRe;
import com.passion.padc_joke_teller_re.R;
import com.passion.padc_joke_teller_re.data.vos.JokeVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NayLinAung on 7/5/2016.
 */
public class JokeModel {

    private static JokeModel objInstance;

    private List<JokeVO> jokeList;

    private JokeModel() { jokeList = setUpInitialJokes(); }

    private List<JokeVO> setUpInitialJokes() {
        Context context = JokeTellerRe.getContext();

        List<JokeVO> tempList = new ArrayList<>();
        jokeList.add(new JokeVO(context.getString(R.string.joke_one_title), context.getString(R.string.joke_one_content), R.drawable.joke_1));
        jokeList.add(new JokeVO(context.getString(R.string.joke_two_title), context.getString(R.string.joke_two_content), R.drawable.joke_2));
        jokeList.add(new JokeVO(context.getString(R.string.joke_three_title), context.getString(R.string.joke_three_content), R.drawable.joke_3));
        return tempList;
    }

    public JokeVO getJoke(int index) {
        return this.jokeList.get(index);
    }

}
