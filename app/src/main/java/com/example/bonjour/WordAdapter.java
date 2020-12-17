package com.example.bonjour;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.nfc.Tag;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.NumberViewHolder> {


    private ArrayList<Word> words;
    MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    public WordAdapter(ArrayList<Word> words) {
        this.words = words;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        Word title = words.get(position);
        holder.bonjour_text_view.setText(title.getSpanishTranslation());
        holder.default_text_view.setText(title.getDefaultTranslation());
        if (title.hasImage()) {
            holder.imageView.setImageResource(title.getImageResourceId());
            holder.imageView.setVisibility(View.VISIBLE);
        } else {
            holder.imageView.setVisibility(View.GONE);
        }
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Release the media player if it currently exits because we are about to play a Different File sound.
                releaseMediaPlayer();
                //Create and setup Media player for the audio resource associated with the current word.
                mMediaPlayer = MediaPlayer.create(v.getContext(), title.getmAudioResourceId());
                //Start the audio file.
                mMediaPlayer.start();
                //Set up a listener on the media player, so that we can stop and release media player
                //once the sound has finished playing.
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });



    }

    @Override
    public int getItemCount() {
        return words.size();
    }


    public class NumberViewHolder extends RecyclerView.ViewHolder {
        TextView bonjour_text_view;
        TextView default_text_view;
        ImageView imageView;
        RelativeLayout relativeLayout;


        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);
            bonjour_text_view = itemView.findViewById(R.id.bonjour_text_view);
            default_text_view = itemView.findViewById(R.id.default_text_view);
            imageView = itemView.findViewById(R.id.image);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);

        }

    }
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}
