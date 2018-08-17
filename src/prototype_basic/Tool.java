public abstract class Tool {

    Graphic prototype;

    public abstract void manipulate();

    public void setPrototype(Graphic graphic) {
        prototype = graphic;
    }
}