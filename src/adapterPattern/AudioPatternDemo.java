package adapterPattern;

public class AudioPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer ap = new AudioPlayer();
		ap.play("mp3", "beyond the horizon.mp3");
		ap.play("mp4", "alone.mp4");
		ap.play("vlc", "far far away.vlc");
		ap.play("avi", "mind me.avi");
	}

}
