

public class Box<T extends Fruit> {
    private T[] obj;

    public Box(T[] obj) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }
    public void getWeight(T[] obj){
        if (obj instanceof Apple[]){
            System.out.println(obj.length*Apple.waight);
            Main.boxWaight=(obj.length*Apple.waight);
        }else if (obj instanceof Orange[]){
            System.out.println(obj.length*Orange.waight);
            Main.boxWaight=(obj.length*Orange.waight);
        }
    }
    public boolean compare(Box<?> ob) {
        if (this == ob) {
            return true;
        }else return false;

    }
}
