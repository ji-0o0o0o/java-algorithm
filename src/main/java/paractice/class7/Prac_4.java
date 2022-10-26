package paractice.class7;

class MyTv{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int save;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    boolean getIsPowerOn() {
        return isPowerOn;
    }
    public void setChannel(int channel) {
        if(!(channel < MIN_CHANNEL|| channel > MAX_CHANNEL)){
            save = this.channel;//채널 바꾸기 전에 저장해야한다.
            this.channel = channel;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setVol(int volume) {
        if(!(volume < MIN_VOLUME || channel > MAX_VOLUME)) {
            this.volume = volume;
        }
    }

    public int getVol() {
        return volume;
    }

    public void gotoPrevChannel() {
       setChannel(save);
    }
}

public class Prac_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println(t.getChannel());
        t.setVol(20);
        System.out.println(t.getVol());

        t.setChannel(10);
        System.out.println(t.getChannel());
        t.setChannel(20);
        System.out.println(t.getChannel());
        t.gotoPrevChannel();
        System.out.println(t.getChannel());
        t.gotoPrevChannel();
        System.out.println(t.getChannel());
    }
}
