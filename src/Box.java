import java.nio.charset.StandardCharsets;

public class Box<T extends Fruit> {
    private T[] obj;

    public Box(T[] fruitArr) {
        this.obj = fruitArr;
    }
    public int F =0;

    public void getWeight(){
        for (int i=0;i<obj.length;i++){
            if (obj[i] != null){
                F++;
            }
        }
        if (obj instanceof Apple[]){
            System.out.println(F*Apple.waight);
            Main.boxWaight=(F*Apple.waight);
        }else if (obj instanceof Orange[]){
            System.out.println(F*Orange.waight);
            Main.boxWaight=(F*Orange.waight);
        }
    }
    public boolean compare(Box<?> ob) {


        if (this == ob) {
            return true;
        }else return false;

    }
    public void peresipanie(Box<?> ob){
        for (int i =0; i<F;i++){
        this.obj[i]=obj[i];
        }

    }
}
