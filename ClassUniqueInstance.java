public enum ClassUniqueInstance {
    INSTANCE(1);
    private int click;

    ClassUniqueInstance(int click) {
        this.click = click;
    }
    public ClassUniqueInstance getInstance(){
        return INSTANCE;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }
}
