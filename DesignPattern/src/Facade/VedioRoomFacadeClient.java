package Facade;

import org.junit.Test;

public class VedioRoomFacadeClient {
    VedioRoomFacade remoteControl = new VedioRoomFacade();

    @Test
    public void test() {
        System.out.println("~~~~~~~~~外觀~~~~~~~~");

        System.out.println("看電影 ----------");
        remoteControl.readyPlayMovie("Three idiot");
        remoteControl.playMovie();
        remoteControl.showAllStatus();

        System.out.println("看完了 ----------");
        remoteControl.turnOffAll();
        remoteControl.showAllStatus();

        System.out.println("看電視 ------------------------");
        remoteControl.watchTV();
        remoteControl.switchChannel(50);
        remoteControl.showAllStatus();
        System.out.println("看完了 ----------");
        remoteControl.turnOffAll();
        remoteControl.showAllStatus();

        System.out.println("唱歌 ------------------------------------------");
        remoteControl.readyKTV();
        remoteControl.playSong();
        remoteControl.showAllStatus();
        System.out.println("唱完了 ----------");
        remoteControl.turnOffAll();
        remoteControl.showAllStatus();
    }
}
