package chapter2;

public class DrumKit {
	boolean topHat = true;
	boolean snare = true;

	void playshare() {
		System.out.println("bang bang ba-bang");
	}

	void playTopHat() {
		System.out.println("ding dind da-ding");
	}
}

class DrumKitTestDrive {
	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		d.playshare();
		d.playTopHat();
		d.snare = false;
		if (d.snare == true) {
			d.playshare();
		}
	}
}
