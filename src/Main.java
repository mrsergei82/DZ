public class Main{
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
        Box<Fruit> appleBox = new Box<Fruit>();
        appleBox.getWeight(apples);
        Box<Fruit> orangeBox = new Box<>();
        orangeBox.getWeight(oranges);
        //orangeBox.compare(appleBox);
        //appleBox.compare(orangeBox);





    }
}
