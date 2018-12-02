package adapterPattern;

public class AudioPlayer implements MediaPlayer{
	MediaAdapter ma;
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		else if(audioType.equalsIgnoreCase("Vlc") || audioType.equalsIgnoreCase("Mp4")) {
			ma = new MediaAdapter(audioType);
			ma.play(audioType, fileName);
		}
		else System.out.println("invalid media " + audioType + "formate not supported");
	}

}
