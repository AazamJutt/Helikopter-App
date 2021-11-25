package com.example.helikopter;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HelikopterAdapter extends ArrayAdapter {
    Activity context;
    String[] arr;
    public HelikopterAdapter(Activity context, String[] n) {
        super(context, R.layout.heli_view, n);
        this.context = context;
        arr = n;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View heliView = inflater.inflate(R.layout.heli_view,null,false);
        final MediaPlayer mp = MediaPlayer.create(context, R.raw.helikopter);
        heliView.findViewById(R.id.listenBtn).setOnClickListener(v->{
            mp.start();
        });
        heliView.findViewById(R.id.shareBtn).setOnClickListener(v->{
            String lyrics = "Helikopter, helikopter\n" +
                    "Para kofer, para kofer\n" +
                    "Helikopter, helikopter\n" +
                    "Saljem ako treba\n" +
                    "Para kofer, para kofer\n" +
                    "Da bacas sa neba\n" +
                    "Helikopter, helikopter\n" +
                    "Kol'ko treba zlata\n" +
                    "Samo da od doma otvoris mi vrata\n" +
                    "Majko moja, kakva je\n" +
                    "Stvorena je za mene\n" +
                    "Majko moja, vidi je\n" +
                    "Vrh ljepote, takva je\n" +
                    "Ne postoji blago to\n" +
                    "A ni cijena ta\n" +
                    "Na koju ne pristajem\n" +
                    "Da je imam ja\n" +
                    "Helikopter, helikopter\n" +
                    "Para kofer, para kofer\n" +
                    "Helikopter, helikopter\n" +
                    "Saljem ako treba\n" +
                    "Kao da je dragi Bog\n" +
                    "Bas za sebe stvorio\n" +
                    "Moje oko nikad ljepsu\n" +
                    "Od nje nije vidjelo\n" +
                    "Helikopter, helikopter\n" +
                    "Para kofer, para kofer\n" +
                    "Helikopter, helikopter\n" +
                    "Saljem ako treba";
            /*Create an ACTION_SEND Intent*/
            Intent intent = new Intent(android.content.Intent.ACTION_SEND);
            /*This will be the actual content you wish you share.*/
            String shareBody = "Here is the share content body";
            /*The type of the content is text, obviously.*/
            intent.setType("text/plain");
            /*Applying information Subject and Body.*/
            intent.putExtra(android.content.Intent.EXTRA_TEXT, lyrics);
            /*Fire!*/
            context.startActivity(intent);
        });
        return heliView;
    }
}