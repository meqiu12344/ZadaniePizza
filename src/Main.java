public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();
        PizzaBuilder margaritta_pizzabuilder = new MargarittaPizzaBuilder();

        // Hawajska
        waiter.setPizzaBuilder( hawaiian_pizzabuilder );
        waiter.constructPizza();
        Pizza hawaiianPizza = waiter.getPizza();
        System.out.println("Hawajska = " + hawaiianPizza);

        // Ostra
        waiter.setPizzaBuilder(spicy_pizzabuilder);
        waiter.constructPizza();
        Pizza hotPizza = waiter.getPizza();
        System.out.println("Ostra = " + hotPizza);

        // Margarita
        waiter.setPizzaBuilder(margaritta_pizzabuilder);
        waiter.constructPizza();
        Pizza margatitaPizza = waiter.getPizza();
        System.out.println("Margarita = " + margatitaPizza);
    }
}