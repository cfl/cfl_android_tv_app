package com.example.android.tvleanback;

import android.support.v17.leanback.widget.HeaderItem;

/**
 * Created by tgiolas on 2016-10-04.
 */

public class CustomHeaderItem extends HeaderItem {
    private  String mName;
    private  String mUrl;

    public CustomHeaderItem(String name) {
        super(name);
    }

    public CustomHeaderItem(String name, String url) {
        super(name);
        mName = name;
        mUrl = url;
    }

    public final String getUrl() {
        return mUrl;
    }
}
