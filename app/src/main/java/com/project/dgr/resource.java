package com.project.dgr;

import android.content.Context;

public class resource {

    public final static String PRIMARY_700 = "PRIMARY_700";
    public final static String PRIMARY_500 = "PRIMARY_500";
    public final static String PRIMARY_200 = "PRIMARY_200";
    public final static String PRIMARY_100 = "PRIMARY_100";
    public final static String PRIMARY_50 = "PRIMARY_50";

    public int getColor(Context context, String colorName){
        switch (colorName) {
            case PRIMARY_700: return getColor(context, String.valueOf(R.color.color_00BCFF));
            case PRIMARY_500: return getColor(context, String.valueOf(R.color.color_01CAFF));
            case PRIMARY_200: return getColor(context, String.valueOf(R.color.color_70D8FF));
            case PRIMARY_100: return  getColor(context, String.valueOf(R.color.color_ACE7FE));
            case PRIMARY_50: return getColor(context, String.valueOf(R.color.color_DFF6FF));
        }
        return 0;
    }
}
