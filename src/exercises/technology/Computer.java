package exercises.technology;

public class Computer {
    private String ID;
    private int processorSpeed;
    private int screenSize;
    private boolean hasKeyboard;

    public int getProcessorSpeed() {
        return processorSpeed;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public boolean HasKeyboard() {
        return hasKeyboard;
    }

    public Computer(int processorSpeed, int screenSize, boolean hasKeyboard) {
        this.ID= AbstractEntity.createID();
        this.processorSpeed = processorSpeed;
        this.screenSize = screenSize;
        this.hasKeyboard = hasKeyboard;
    }

    public boolean isSlow(){
        return processorSpeed < 500;
    }
    public boolean hasLargeDisplay(){
        return screenSize > 1000;
    }
}
