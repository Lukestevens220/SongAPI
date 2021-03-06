package samples.exoguru.materialtabs.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by TheAppExperts on 12/10/2016.
 */

public class Song {
        @SerializedName("wrapper_type")
        private String wrapperType;
        @SerializedName("kind")
        private String kind;
        @SerializedName("artistId")
        private Integer artistId;
        @SerializedName("collectionId")
        private Integer collectionId;
        @SerializedName("trackId")
        private Integer trackId;
        @SerializedName("artistName")
        private String artistName;
        @SerializedName("collectionName")
        private String collectionName;
        @SerializedName("trackName")
        private String trackName;
        @SerializedName("collectionCensoredName")
        private String collectionCensoredName;
        @SerializedName("trackCensoredName")
        private String trackCensoredName;
        @SerializedName("artistViewUrl")
        private String artistViewUrl;
        @SerializedName("collectionViewUrl")
        private String collectionViewUrl;
        @SerializedName("trackViewUrl")
        private String trackViewUrl;
        @SerializedName("previewUrl")
        private String previewUrl;
        @SerializedName("artworkUrl30")
        private String artworkUrl30;
        @SerializedName("artworkUrl60")
        private String artworkUrl60;
        @SerializedName("artworkUrl100")
        private String artworkUrl100;
        @SerializedName("collectionPrice")
        private Double collectionPrice;
        @SerializedName("trackPrice")
        private Double trackPrice;
        @SerializedName("releaseDate")
        private String releaseDate;
        @SerializedName("collectionExplicitness")
        private String collectionExplicitness;
        @SerializedName("trackExplicitness")
        private String trackExplicitness;
        @SerializedName("discCount")
        private Integer discCount;
        @SerializedName("discNumber")
        private Integer discNumber;
        @SerializedName("trackCount")
        private Integer trackCount;
        @SerializedName("trackNumber")
        private Integer trackNumber;
        @SerializedName("trackTimeMillis")
        private Integer trackTimeMillis;
        @SerializedName("country")
        private String country;
        @SerializedName("currency")
        private String currency;
        @SerializedName("primaryGenreName")
        private String primaryGenreName;
        @SerializedName("isStreamable")
        private Boolean isStreamable;
        @SerializedName("contentAdvisoryRating")
        private String contentAdvisoryRating;

        /**
         *
         * @return
         * The wrapperType
         */
        public String getWrapperType() {
            return wrapperType;
        }

        /**
         *
         * @param wrapperType
         * The wrapperType
         */
        public void setWrapperType(String wrapperType) {
            this.wrapperType = wrapperType;
        }

        /**
         *
         * @return
         * The kind
         */
        public String getKind() {
            return kind;
        }

        /**
         *
         * @param kind
         * The kind
         */
        public void setKind(String kind) {
            this.kind = kind;
        }

        /**
         *
         * @return
         * The artistId
         */
        public Integer getArtistId() {
            return artistId;
        }

        /**
         *
         * @param artistId
         * The artistId
         */
        public void setArtistId(Integer artistId) {
            this.artistId = artistId;
        }

        /**
         *
         * @return
         * The collectionId
         */
        public Integer getCollectionId() {
            return collectionId;
        }

        /**
         *
         * @param collectionId
         * The collectionId
         */
        public void setCollectionId(Integer collectionId) {
            this.collectionId = collectionId;
        }

        /**
         *
         * @return
         * The trackId
         */
        public Integer getTrackId() {
            return trackId;
        }

        /**
         *
         * @param trackId
         * The trackId
         */
        public void setTrackId(Integer trackId) {
            this.trackId = trackId;
        }

        /**
         *
         * @return
         * The artistName
         */
        public String getArtistName() {
            return artistName;
        }

        /**
         *
         * @param artistName
         * The artistName
         */
        public void setArtistName(String artistName) {
            this.artistName = artistName;
        }

        /**
         *
         * @return
         * The collectionName
         */
        public String getCollectionName() {
            return collectionName;
        }

        /**
         *
         * @param collectionName
         * The collectionName
         */
        public void setCollectionName(String collectionName) {
            this.collectionName = collectionName;
        }

        /**
         *
         * @return
         * The trackName
         */
        public String getTrackName() {
            return trackName;
        }

        /**
         *
         * @param trackName
         * The trackName
         */
        public void setTrackName(String trackName) {
            this.trackName = trackName;
        }

        /**
         *
         * @return
         * The collectionCensoredName
         */
        public String getCollectionCensoredName() {
            return collectionCensoredName;
        }

        /**
         *
         * @param collectionCensoredName
         * The collectionCensoredName
         */
        public void setCollectionCensoredName(String collectionCensoredName) {
            this.collectionCensoredName = collectionCensoredName;
        }

        /**
         *
         * @return
         * The trackCensoredName
         */
        public String getTrackCensoredName() {
            return trackCensoredName;
        }

        /**
         *
         * @param trackCensoredName
         * The trackCensoredName
         */
        public void setTrackCensoredName(String trackCensoredName) {
            this.trackCensoredName = trackCensoredName;
        }

        /**
         *
         * @return
         * The artistViewUrl
         */
        public String getArtistViewUrl() {
            return artistViewUrl;
        }

        /**
         *
         * @param artistViewUrl
         * The artistViewUrl
         */
        public void setArtistViewUrl(String artistViewUrl) {
            this.artistViewUrl = artistViewUrl;
        }

        /**
         *
         * @return
         * The collectionViewUrl
         */
        public String getCollectionViewUrl() {
            return collectionViewUrl;
        }

        /**
         *
         * @param collectionViewUrl
         * The collectionViewUrl
         */
        public void setCollectionViewUrl(String collectionViewUrl) {
            this.collectionViewUrl = collectionViewUrl;
        }

        /**
         *
         * @return
         * The trackViewUrl
         */
        public String getTrackViewUrl() {
            return trackViewUrl;
        }

        /**
         *
         * @param trackViewUrl
         * The trackViewUrl
         */
        public void setTrackViewUrl(String trackViewUrl) {
            this.trackViewUrl = trackViewUrl;
        }

        /**
         *
         * @return
         * The previewUrl
         */
        public String getPreviewUrl() {
            return previewUrl;
        }

        /**
         *
         * @param previewUrl
         * The previewUrl
         */
        public void setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
        }

        /**
         *
         * @return
         * The artworkUrl30
         */
        public String getArtworkUrl30() {
            return artworkUrl30;
        }

        /**
         *
         * @param artworkUrl30
         * The artworkUrl30
         */
        public void setArtworkUrl30(String artworkUrl30) {
            this.artworkUrl30 = artworkUrl30;
        }

        /**
         *
         * @return
         * The artworkUrl60
         */
        public String getArtworkUrl60() {
            return artworkUrl60;
        }

        /**
         *
         * @param artworkUrl60
         * The artworkUrl60
         */
        public void setArtworkUrl60(String artworkUrl60) {
            this.artworkUrl60 = artworkUrl60;
        }

        /**
         *
         * @return
         * The artworkUrl100
         */
        public String getArtworkUrl100() {
            return artworkUrl100;
        }

        /**
         *
         * @param artworkUrl100
         * The artworkUrl100
         */
        public void setArtworkUrl100(String artworkUrl100) {
            this.artworkUrl100 = artworkUrl100;
        }

        /**
         *
         * @return
         * The collectionPrice
         */
        public Double getCollectionPrice() {
            return collectionPrice;
        }

        /**
         *
         * @param collectionPrice
         * The collectionPrice
         */
        public void setCollectionPrice(Double collectionPrice) {
            this.collectionPrice = collectionPrice;
        }

        /**
         *
         * @return
         * The trackPrice
         */
        public Double getTrackPrice() {
            return trackPrice;
        }

        /**
         *
         * @param trackPrice
         * The trackPrice
         */
        public void setTrackPrice(Double trackPrice) {
            this.trackPrice = trackPrice;
        }

        /**
         *
         * @return
         * The releaseDate
         */
        public String getReleaseDate() {
            return releaseDate;
        }

        /**
         *
         * @param releaseDate
         * The releaseDate
         */
        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        /**
         *
         * @return
         * The collectionExplicitness
         */
        public String getCollectionExplicitness() {
            return collectionExplicitness;
        }

        /**
         *
         * @param collectionExplicitness
         * The collectionExplicitness
         */
        public void setCollectionExplicitness(String collectionExplicitness) {
            this.collectionExplicitness = collectionExplicitness;
        }

        /**
         *
         * @return
         * The trackExplicitness
         */
        public String getTrackExplicitness() {
            return trackExplicitness;
        }

        /**
         *
         * @param trackExplicitness
         * The trackExplicitness
         */
        public void setTrackExplicitness(String trackExplicitness) {
            this.trackExplicitness = trackExplicitness;
        }

        /**
         *
         * @return
         * The discCount
         */
        public Integer getDiscCount() {
            return discCount;
        }

        /**
         *
         * @param discCount
         * The discCount
         */
        public void setDiscCount(Integer discCount) {
            this.discCount = discCount;
        }

        /**
         *
         * @return
         * The discNumber
         */
        public Integer getDiscNumber() {
            return discNumber;
        }

        /**
         *
         * @param discNumber
         * The discNumber
         */
        public void setDiscNumber(Integer discNumber) {
            this.discNumber = discNumber;
        }

        /**
         *
         * @return
         * The trackCount
         */
        public Integer getTrackCount() {
            return trackCount;
        }

        /**
         *
         * @param trackCount
         * The trackCount
         */
        public void setTrackCount(Integer trackCount) {
            this.trackCount = trackCount;
        }

        /**
         *
         * @return
         * The trackNumber
         */
        public Integer getTrackNumber() {
            return trackNumber;
        }

        /**
         *
         * @param trackNumber
         * The trackNumber
         */
        public void setTrackNumber(Integer trackNumber) {
            this.trackNumber = trackNumber;
        }

        /**
         *
         * @return
         * The trackTimeMillis
         */
        public Integer getTrackTimeMillis() {
            return trackTimeMillis;
        }

        /**
         *
         * @param trackTimeMillis
         * The trackTimeMillis
         */
        public void setTrackTimeMillis(Integer trackTimeMillis) {
            this.trackTimeMillis = trackTimeMillis;
        }

        /**
         *
         * @return
         * The country
         */
        public String getCountry() {
            return country;
        }

        /**
         *
         * @param country
         * The country
         */
        public void setCountry(String country) {
            this.country = country;
        }

        /**
         *
         * @return
         * The currency
         */
        public String getCurrency() {
            return currency;
        }

        /**
         *
         * @param currency
         * The currency
         */
        public void setCurrency(String currency) {
            this.currency = currency;
        }

        /**
         *
         * @return
         * The primaryGenreName
         */
        public String getPrimaryGenreName() {
            return primaryGenreName;
        }

        /**
         *
         * @param primaryGenreName
         * The primaryGenreName
         */
        public void setPrimaryGenreName(String primaryGenreName) {
            this.primaryGenreName = primaryGenreName;
        }

        /**
         *
         * @return
         * The isStreamable
         */
        public Boolean getIsStreamable() {
            return isStreamable;
        }

        /**
         *
         * @param isStreamable
         * The isStreamable
         */
        public void setIsStreamable(Boolean isStreamable) {
            this.isStreamable = isStreamable;
        }

        /**
         *
         * @return
         * The contentAdvisoryRating
         */
        public String getContentAdvisoryRating() {
            return contentAdvisoryRating;
        }

        /**
         *
         * @param contentAdvisoryRating
         * The contentAdvisoryRating
         */
        public void setContentAdvisoryRating(String contentAdvisoryRating) {
            this.contentAdvisoryRating = contentAdvisoryRating;
        }

    }

