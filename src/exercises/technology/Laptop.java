package exercises.technology;

public class Laptop extends Computer {
    public Laptop(int processorSpeed, int screenSize, boolean hasKeyboard, int videoCardSpeed) {
        super(processorSpeed, screenSize, hasKeyboard);
        this.videoCardSpeed = videoCardSpeed;
    }

    private int videoCardSpeed;

    public boolean isFastEnoughForDOTA(){
        return videoCardSpeed > 300;
    }


}
