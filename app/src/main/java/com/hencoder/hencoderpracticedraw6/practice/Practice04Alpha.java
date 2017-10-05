package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.hencoder.hencoderpracticedraw6.R;

public class Practice04Alpha extends RelativeLayout {
  Button animateBt;
  ImageView imageView;

  public Practice04Alpha(Context context) {
    super(context);
  }

  public Practice04Alpha(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice04Alpha(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();

    animateBt = (Button) findViewById(R.id.animateBt);
    imageView = (ImageView) findViewById(R.id.imageView);

    animateBt.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(final View v) {
        Object tag = v.getTag();
        int tagInt = 0;
        try {
          tagInt = (int) tag;
        } catch (Exception ignored) {
        }
        switch (tagInt % 2) {
          case 0:
            imageView.animate().alpha(0f);
            break;

          case 1:
            imageView.animate().alphaBy(1.0f);
            break;
        }
        v.setTag(++tagInt);
      }
    });
  }
}