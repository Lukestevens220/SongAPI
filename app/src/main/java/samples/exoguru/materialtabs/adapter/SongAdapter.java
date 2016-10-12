package samples.exoguru.materialtabs.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import samples.exoguru.materialtabs.R;
import samples.exoguru.materialtabs.model.Song;

/**
 * Created by TheAppExperts on 12/10/2016.
 */

public class SongAdapter {

    private List<Song> songs;
    private int rowLayout;
    private Context context;


    public static class SongViewHolder extends RecyclerView.ViewHolder {
        LinearLayout songsLayout;
        TextView wrapperType;
        TextView kind;
        TextView artistId;
        TextView collectionId;


        public SongViewHolder(View v) {
            super(v);
            songsLayout = (LinearLayout) v.findViewById(R.id.songs_layout);
            wrapperType = (TextView) v.findViewById(R.id.wrapper_type);
            kind = (TextView) v.findViewById(R.id.kind);
            artistId = (TextView) v.findViewById(R.id.artistId);
            collectionId = (TextView) v.findViewById(R.id.collectionId);
        }
    }

    public SongAdapter(List<Song> songs, int rowLayout, Context context) {
        this.songs = songs;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_song, viewGroup, false);
        return new SongViewHolder(v);
    }


    @Override
    public void onBindViewHolder(SongViewHolder viewHolder, final int position) {
        Song song = songs.get(position);
        SongViewHolder holder = viewHolder;
        holder.wrapperType.setText(song.getWrapperType());
        holder.kind.setText(song.getKind());
        holder.artistId.setText(song.getArtistId().toString());
        holder.collectionId.setText(song.getCollectionId().toString());
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }
}
}
}
