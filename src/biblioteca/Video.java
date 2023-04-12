package biblioteca;

public class Video {
    String tipDeVideo;

    public Video (String tipDeVideo) {
        this.tipDeVideo = tipDeVideo;
    }

    @Override
    public String toString() {
        return tipDeVideo;
    }
}
