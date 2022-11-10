public class Main {

    public static void flowerCout(Flower[] flowers) {

        for (byte i = 0; i < flowers.length; i++) {
            System.out.println(flowers[i].toString());
        }
    }

    public static void makeBouqet(Flower[] bouqet) {
float sum=0f;
        System.out.println(("Состав букета:"));
        var min=bouqet[0].getLifeSpan();
        for (byte i = 0; i < bouqet.length; i++) {
            sum=sum+bouqet[i].getPrice();
            if (min>bouqet[i].getLifeSpan()){
                min=bouqet[i].getLifeSpan();
            }
            System.out.println(bouqet[i].toString());
        }
        sum+=sum*0.1f;
        System.out.println("Сумма букета: "+sum);
        System.out.println(("Годность букета: " + min + " дней"));

    }

    public static void main(String[] args) {

       final byte dlina;
        dlina = 4;
        Flower[] flowers = new Flower[dlina];
        flowers[0] = new Flower("Роза", "Красный", "Голландия", 35.59f);
        flowers[1] = new Flower("Хризантема", null, "", 15f);
        flowers[2]= new Flower("Пион", "", "Анлия", 69f,1);
        flowers[3]= new Flower("Гипосфила", "", "Турция", 19.5f,10);
        System.out.println(flowers[0].getLifeSpan());
        flowerCout(flowers);

        final byte col;
        col = 4;
        Flower[] bouqet= new Flower[col];
        bouqet[0]=flowers[0];
        bouqet[1]=flowers[0];
        bouqet[2]=flowers[0];
        bouqet[3]=flowers[3];
        makeBouqet(bouqet);

    }
}
