package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.hencoder.hencoderpracticedraw6.R;

public class Practice05MultiProperties extends ConstraintLayout {
  Button animateBt;
  ImageView imageView;

  public Practice05MultiProperties(Context context) {
    super(context);
  }

  public Practice05MultiProperties(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice05MultiProperties(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();

    animateBt = (Button) findViewById(R.id.animateBt);
    imageView = (ImageView) findViewById(R.id.imageView);
    imageView.setScaleX(0);
    imageView.setScaleY(0);
    imageView.setAlpha(0f);
    animateBt.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Object tag = v.getTag();
        int tagInt = 0;
        try {
          tagInt = (int) tag;
        } catch (Exception ignored) {
        }
        switch (tagInt % 2) {
          case 0:
            imageView.animate().translationX(500).rotation(360).scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
            break;

          case 1:
            imageView.animate().translationXBy(-500).rotationBy(-360).scaleXBy(-1.0f).scaleYBy(-1.0f).alphaBy(-1.0f);
            break;
        }
        v.setTag(++tagInt);
      }
    });
  }
}
