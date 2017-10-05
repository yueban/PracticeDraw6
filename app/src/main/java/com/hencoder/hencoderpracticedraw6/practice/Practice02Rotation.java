package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
  Button animateBt;
  ImageView imageView;

  public Practice02Rotation(Context context) {
    super(context);
  }

  public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
        switch (tagInt % 6) {
          case 0:
            imageView.animate().rotation(180);
            break;

          case 1:
            imageView.animate().rotationBy(-180);
            break;

          case 2:
            imageView.animate().rotationX(180);

            break;

          case 3:
            imageView.animate().rotationXBy(-180);
            break;

          case 4:
            imageView.animate().rotationY(180);
            break;

          case 5:
            imageView.animate().rotationYBy(-180);
            break;
        }
        v.setTag(++tagInt);
      }
    });
  }
}