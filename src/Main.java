public class Main {
    public static void main(String[] args) {

        int amount = 15794; //стоимость билета
        int step = 20; // количество рублей для одной бонусной мили
        int bonus;
        if (amount >= (step)) {
            bonus = amount / step;
        } else {
            bonus = 0;
        }
        System.out.println("начислено бонусов " + (bonus));

    }
}

