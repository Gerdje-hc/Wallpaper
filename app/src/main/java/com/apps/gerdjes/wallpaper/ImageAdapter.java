package com.apps.gerdjes.wallpaper;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageAdapter extends BaseAdapter {

    public Integer[]mThumbIds= {
            R.drawable.pic01,R.drawable.pic02,
            R.drawable.pic03,R.drawable.pic04,
            R.drawable.pic05,R.drawable.pic06,
            R.drawable.pic07,R.drawable.pic08,
            R.drawable.pic09,R.drawable.pic10
    };

    private Context mContext;

    public ImageAdapter(Context c) {
        this.mContext = c;
    }


    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);

        Picasso.with(mContext)
                .load (mThumbIds[position])
                .noFade()
                .resize(250,325)
                .centerCrop()
                .into(imageView);
        //imageView.setImageResource(mThumbIds[position]);
        //imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        //imageView.setLayoutParams(new GridView.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,200));
        return imageView;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
