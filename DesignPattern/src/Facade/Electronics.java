package Facade;

public abstract class Electronics {
    private boolean power = false;

    public void powerOn() {
        this.power = true;
    }

    public void powerOff() {
        this.power = false;
    }

    public boolean isPowerOn() {
        return power;
    }

    protected void showStatus() {
        if (power) {
            System.out.println(this.getClass().getSimpleName() + "運作中");
        } else {
            System.out.println(this.getClass().getCanonicalName() + "沒開電");
        }
    }
}

class KTVsystem extends Electronics {
    private String song;

    public void selectSong(String song) {
        this.song = song;
    }

    public void playSong() {
        System.out.println(this.getClass().getSimpleName() + "播放 " + song);
    }
}

class PlayStation4 extends Electronics {
    private String cd;

    public void putCD(String cd) {
        this.cd = cd;
    }

    public String getCD() {
        return this.cd;
    }

    public void play() {
        System.out.println(this.getClass().getSimpleName() + "播放 " + cd);
    }

    @Override
    public void showStatus() {
        super.showStatus();
        if (isPowerOn()) {
            System.out.println(this.getClass().getSimpleName() + "目前cd: " + cd);
        }
    }
}

class Stereo extends Electronics {
    private int sound = 50;

    public void setSound(int sound) {
        this.sound = sound;
    }

    public int getSound() {
        return sound;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        if (isPowerOn()) {
            System.out.println(this.getClass().getSimpleName() + "音量: " + sound);
        }
    }
}

class Television extends Electronics {
    private int sound = 50;
    private String source = "tvBox";
    private int channel = 9;

    public void switchSource(String source) {
        this.source = source;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }

    public void switchChannel(int channel) {
        this.channel = channel;
    }

    public void showTV() {
        System.out.println("目前頻道: " + channel);
    }

    @Override
    public void showStatus() {
        super.showStatus();
        if (isPowerOn()) {
            System.out.println(this.getClass().getSimpleName() + "音量: " + sound);

            if (source.equals("tvBox")) {
                System.out.println(", 頻道: " + channel);
            }

            if (source.equals("ktv")) {
                System.out.println(", KTV ing...");
            }

            if (source.equals("ps")) {
                System.out.println(", ps畫面...");
            }
        }
    }

    public int getSound() {
        return sound;
    }

    public String getSource() {
        return source;
    }

    public int getChannel() {
        return channel;
    }
}
