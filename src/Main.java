public class Main{
    public static float boxWaight =0;
    public static void main(String[] args) {

        Apple A1 = new Apple();
        Apple A2 = new Apple();
        Apple A3 = new Apple();
        Apple[] apples = new Apple[3];
        apples[0]=A1;
        apples[1]=A2;
        apples[2]=A3;
        Orange O1 = new Orange();
        Orange[] oranges = new Orange[1];
        oranges[0] = O1;
        Box<Apple> appleBox = new Box<Apple>(apples);
        appleBox.getWeight(apples);
        Box<Fruit> orangeBox = new Box<>(oranges);
        orangeBox.getWeight(oranges);

        orangeBox.compare(appleBox);
        System.out.println(appleBox.compare(orangeBox));
        appleBox.compare(orangeBox);
        System.out.println(orangeBox.compare(appleBox));
    }
}
