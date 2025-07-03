public class Main {
    public static void main(String[] args) {
        {
            int amount = 15794; //стоимость билета
            int a = 20; // количество рублей для одной бонусной мили
            int bonus;

            if (amount >= (a))
                bonus = amount / a;
            else bonus = 0;

            System.out.println("начислено бонусов " + (bonus));
        }
    }
}

