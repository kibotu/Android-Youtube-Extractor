package at.huber.youtubeExtractor;

import android.content.Context;
import android.util.SparseArray;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
public abstract class YouTubeUriExtractor extends YouTubeExtractor {

    public YouTubeUriExtractor(@NonNull Context con) {
        super(con);
    }

    @Override
    protected void onExtractionComplete(@Nullable SparseArray<YtFile> ytFiles, @Nullable VideoMeta videoMeta) {
        onUrisAvailable(videoMeta.getVideoId(), videoMeta.getTitle(), ytFiles);
    }

    public abstract void onUrisAvailable(String videoId, String videoTitle, @Nullable SparseArray<YtFile> ytFiles);
}
