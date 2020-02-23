package com.example.myapplication;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class kulintangMusic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulintang_music);

        Button btn1 = (Button) this.findViewById(R.id.button);
        Button btn2 = (Button) this.findViewById(R.id.button2);
        Button btn3 = (Button) this.findViewById(R.id.button3);
        Button btn4 = (Button) this.findViewById(R.id.button4);
        Button btn5 = (Button) this.findViewById(R.id.button5);
        Button btn6 = (Button) this.findViewById(R.id.button6);
        Button btn7 = (Button) this.findViewById(R.id.button7);
        Button btn8 = (Button) this.findViewById(R.id.button8);

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.sound1);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.sound2);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.sound3);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.sound4);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.sound5);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.sound6);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.sound7);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.sound8);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mediaPlay("sound1",mp1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mediaPlay("sound2",mp2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mediaPlay("sound3",mp3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mediaPlay("sound4",mp4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mediaPlay("sound5",mp5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mediaPlay("sound6",mp6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mediaPlay("sound7",mp7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                mediaPlay("sound8",mp8);
            }
        });


    }
    public void mediaPlay(String a, MediaPlayer mp){
        if (mp.isPlaying()) {
            mp.stop();
        }

        try {
            mp.reset();
            AssetFileDescriptor afd;
            afd = getAssets().openFd(a);
            mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mp.prepare();
            mp.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
