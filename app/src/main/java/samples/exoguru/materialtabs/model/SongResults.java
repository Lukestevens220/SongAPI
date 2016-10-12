package samples.exoguru.materialtabs.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TheAppExperts on 12/10/2016.
 */

public class SongResults {

        @SerializedName("resultCount")
        private Integer resultCount;
        @SerializedName("songs")
        private List<Song> songs = new ArrayList<Song>();

        /**
         *
         * @return
         * The resultCount
         */
        public Integer getResultCount() {
            return resultCount;
        }

        /**
         *
         * @param resultCount
         * The resultCount
         */
        public void setResultCount(Integer resultCount) {
            this.resultCount = resultCount;
        }

        /**
         *
         * @return
         * The songs
         */
        public List<Song> getSongs() {
            return songs;
        }

        /**
         *
         * @param songs
         * The songs
         */
        public void setSongs(List<Song> songs) {
            this.songs = songs;
        }

    }

