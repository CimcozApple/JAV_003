public class Task_003 {
    static int generateSomeMoneyInMyPocket() {
        int money = (int) (Math.random() * 100) + 1;
        return money;
    }

    static void buyFireDrink(int amountOfMoney) {
        System.out.println("You have only " + amountOfMoney + " UAH");
        if (amountOfMoney >= 7 && amountOfMoney <= 29) {
            System.out.println("You can buy only 'Obolon' - 7 UAH, sorry, you should work better!");
        } else if (amountOfMoney >= 30 && amountOfMoney <= 44) {
            System.out.println("You can buy 'Chernigivske' - 30 UAH");
        } else if (amountOfMoney >= 45 && amountOfMoney <= 54) {
            System.out.println("You can buy 'Stella Artua' - 45 UAH");
        } else if (amountOfMoney >= 55 && amountOfMoney <= 64) {
            System.out.println("You can buy 'Leffe' - 55 UAH");
        } else if (amountOfMoney >= 65) {
            System.out.println("Welcome to our VIP lounge bar, you can buy any kind of beer, even 'Hoegaarden' - 65 UAH");
        } else {
            System.out.println("Get out of here!");
        }
    }

    public static void main(String[] args) {
        buyFireDrink(generateSomeMoneyInMyPocket());
    }
}