package adapterPattern;

public class MediaAdapter implements MediaPlayer{
	AdvancedMediaPlayer advmp;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("Vlc")) {
			advmp = new VlcPlayer();
		}
		else if(audioType.equalsIgnoreCase("Mp4")) {
			advmp = new Mp4Player();
		}
	}
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("Vlc")) {
			advmp.playVlc(fileName);
		}
		else if(audioType.equalsIgnoreCase("Mp4")) {
			advmp.playMP4(fileName);
		}
	}
	
}
