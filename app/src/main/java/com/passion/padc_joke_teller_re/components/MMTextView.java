package com.passion.padc_joke_teller_re.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by NayLinAung on 7/5/2016.
 */
public class MMTextView extends TextView {

    public MMTextView(Context context) {
        super(context);
        if (!isInEditMode()) {
            this.setTypeface();
        }
    }

    public MMTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MMTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
