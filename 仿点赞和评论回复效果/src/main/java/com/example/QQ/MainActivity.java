package com.example.QQ;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.wx.goodview.GoodView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    //https://github.com/zltdujing/GoodView-master
    private GoodView goodView;
    private ImageView good, good2, collection, bookmark;
    private boolean goodFlag, good2Flag, collectionFlag, bookmarkFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        good = (ImageView) findViewById(R.id.good);
        good2 = (ImageView) findViewById(R.id.good2);

        collection = (ImageView) findViewById(R.id.collection);
        bookmark = (ImageView) findViewById(R.id.bookmark);
        goodView = new GoodView(this);
        good.setOnClickListener(this);
        good2.setOnClickListener(this);
        collection.setOnClickListener(this);
        bookmark.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.good:
                if (!goodFlag)
                {
                    goodView.setText("+1");
                    good.setImageResource(R.mipmap.good_checked);
                    goodView.show(good);
                    goodFlag = true;
                } else
                {
                    good.setImageResource(R.mipmap.good);
                    goodFlag = false;
                }
                break;
            case R.id.good2:
                if (!good2Flag)
                {
                    goodView.setImage(R.mipmap.good_checked);
                    good2.setImageResource(R.mipmap.good_checked);
                    goodView.show(good2);
                    good2Flag = true;
                } else
                {
                    good2.setImageResource(R.mipmap.good);
                    good2Flag = false;
                }
                break;
            case R.id.collection:
                if (!collectionFlag)
                {
                    collection.setImageResource(R.mipmap.collection_checked);
                    goodView.setTextInfo("收藏成功", Color.parseColor(("#f66467")), 12);
                    goodView.show(collection);
                    collectionFlag = true;
                } else
                {
                    collectionFlag = false;
                    collection.setImageResource(R.mipmap.collection);
                }
                break;
            case R.id.bookmark:
                if (!bookmarkFlag)
                {
                    bookmark.setImageResource(R.mipmap.bookmark_checked);
                    goodView.setTextInfo("收藏成功", Color.parseColor(("#ff941A")), 12);
                    goodView.show(bookmark);
                    bookmarkFlag = true;
                } else
                {
                    bookmarkFlag = false;
                    bookmark.setImageResource(R.mipmap.bookmark);
                }
                break;
        }
    }
}
