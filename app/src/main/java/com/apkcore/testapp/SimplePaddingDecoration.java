package com.apkcore.testapp;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class SimplePaddingDecoration extends RecyclerView.ItemDecoration {
    private int dividerHeight;

    public SimplePaddingDecoration(Context context) {
        this.dividerHeight = context.getResources().getDimensionPixelOffset(R.dimen.divider_height);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = dividerHeight;
    }
}
