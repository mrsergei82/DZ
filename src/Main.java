public class Main{
    public static float boxWaight =0;
    public static void main(String[] args) {
        Apple A1 = new Apple();
        Apple A2 = new Apple();
        Apple A3 = new Apple();
        Apple A4 = new Apple();
        Apple A5 = new Apple();
        Apple A6 = new Apple();
        Apple[] apples = {A1,A2,null};
        Apple[] apples1 = {A4,A5,A6};

        Orange O1 = new Orange();
        Orange O2 = new Orange();
        Orange[] oranges = {O1,O2,null};
        Box<Apple> appleBox = new Box<Apple>(apples);
        System.out.println(appleBox.getClass().getName());
        appleBox.getWeight();
        Box<Fruit> orangeBox = new Box<>(oranges);
        orangeBox.getWeight();
        Box<Apple> appleBox1 = new Box<>(apples1);

        orangeBox.compare(appleBox);
        System.out.println(appleBox.compare(orangeBox));
        appleBox.compare(orangeBox);
        System.out.println(orangeBox.compare(appleBox));

        appleBox.peresipanie(appleBox1);

    }
}
