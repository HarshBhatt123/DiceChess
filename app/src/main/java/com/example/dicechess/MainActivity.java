package com.example.dicechess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.animation.Animator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView i1 , i2 , i3;

    LottieAnimationView lottieAnimationView ,lottieAnimationView2 ,lottieAnimationView3;



    public void roll(View view){

        int[] images = {R.drawable.bishop,R.drawable.knight,R.drawable.king,R.drawable.queen,R.drawable.pawn,R.drawable.rook};

        Random rand = new Random();
        showDice();
        lottieAnimationView.playAnimation();
        lottieAnimationView2.playAnimation();
        lottieAnimationView3.playAnimation();


        i1.setImageResource(images[rand.nextInt(images.length)]);
        i2.setImageResource(images[rand.nextInt(images.length)]);
        i3.setImageResource(images[rand.nextInt(images.length)]);






    }

public void showDice(){
        i1.setVisibility(View.INVISIBLE);
    i2.setVisibility(View.INVISIBLE);
    i3.setVisibility(View.INVISIBLE);
    lottieAnimationView.setVisibility(View.VISIBLE);
    lottieAnimationView2.setVisibility(View.VISIBLE);
    lottieAnimationView3.setVisibility(View.VISIBLE);

}
    public void hideDice(){
        i1.setVisibility(View.VISIBLE);
        i2.setVisibility(View.VISIBLE);
        i3.setVisibility(View.VISIBLE);

        lottieAnimationView.setVisibility(View.INVISIBLE);
        lottieAnimationView2.setVisibility(View.INVISIBLE);
        lottieAnimationView3.setVisibility(View.INVISIBLE);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        lottieAnimationView = findViewById(R.id.a1);
        lottieAnimationView2 = findViewById(R.id.a2);
        lottieAnimationView3 = findViewById(R.id.a3);

        lottieAnimationView.setVisibility(View.INVISIBLE);
        lottieAnimationView2.setVisibility(View.INVISIBLE);
        lottieAnimationView3.setVisibility(View.INVISIBLE);




        lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {

            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                    hideDice();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }


        });
        lottieAnimationView2.addAnimatorListener(new Animator.AnimatorListener() {


            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                hideDice();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }


        });

        lottieAnimationView3.addAnimatorListener(new Animator.AnimatorListener() {

            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                hideDice();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }


        });



        i1 = (ImageView) findViewById(R.id.iv1);
        i2 = (ImageView) findViewById(R.id.iv2);
        i3 = (ImageView) findViewById(R.id.iv3);

    }
}