package exercises.technology;

public class SmartPhone extends Computer {
    public SmartPhone(int processorSpeed, int screenSize, boolean hasKeyboard, int numberOfApps) {
        super(processorSpeed, screenSize, hasKeyboard);
        this.numberOfApps = numberOfApps;
    }

    private int numberOfApps;

    public void installApp(){
        this.numberOfApps = this.numberOfApps + 1;
    }

    public int getNumberOfApps(){
        return this.numberOfApps;
    }
}
