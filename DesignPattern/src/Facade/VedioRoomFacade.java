package Facade;

// 總控管理客廳影視設備
public class VedioRoomFacade {
    Television tv = new Television();
    Stereo stereo = new Stereo();
    PlayStation4 ps = new PlayStation4();
    KTVsystem ktv = new KTVsystem();

    public void setSound(int soundLevel) {
        if (tv.isPowerOn()) {
            tv.setSound(soundLevel);
        }
        if (stereo.isPowerOn()) {
            stereo.setSound(soundLevel);
        }
    }

    public void turnOffAll() {
        stereo.powerOff();
        ktv.powerOff();
        ps.powerOff();
        tv.powerOff();
    }

    public void showAllStatus() {
        tv.showStatus();
        stereo.showStatus();
        ps.showStatus();
        ktv.showStatus();
    }

    public void readyPlayMovie(String cd) {
        ps.powerOn();
        ps.putCD(cd);
        tv.powerOn();
        tv.switchSource("ps");
        stereo.powerOn();
        stereo.setSound(50);
    }

    public void playMovie() {
        if (ps.isPowerOn()) {
            ps.play();
        }
    }

    public void watchTV() {
        tv.powerOn();
        tv.switchSource("txBox");
    }

    public void switchChannel(int channel) {
        tv.switchChannel(channel);
    }

    public void showTV() {
        tv.showTV();
    }

    public void readyKTV() {
        stereo.powerOn();
        ktv.powerOn();
        tv.powerOn();
        stereo.setSound(50);
        tv.switchSource("ktv");
    }

    public void selectSong(String song) {
        if (ktv.isPowerOn()) {
            ktv.selectSong(song);
        }
    }

    public void playSong() {
        if (ktv.isPowerOn()) {
            ktv.playSong();
        }
    }
}
