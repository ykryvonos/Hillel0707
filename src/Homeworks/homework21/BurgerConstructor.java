package Homeworks.homework21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class BurgerConstructor {

    public static void burgerConstructor() {
        HashMap<String, String> arrayIngredients = new HashMap<String, String>();
        arrayIngredients.put("sauce", "1");
        arrayIngredients.put("cheese", "2");
        arrayIngredients.put("cutlet", "3");

        HashMap<String, String> addIngredients = new HashMap<String, String>();

        Price price = new Price();
        int finalPrice = price.burgerPrice;

        System.out.println("The burger cost $" + finalPrice + ". Do you want to add more ingredient? Print yes or no:");
        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();


        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("Which ingredient do you want to add: 1 - sauce ($" + price.saucePrice + "), 2 - cheese ($" + price.cheesePrice + ")," +
                    " 3- cutlet ($" + price.cutletPrice + "). Print number or ingredient name:");
            Scanner scanner1 = new Scanner(System.in);

            String ingredient = scanner1.nextLine();

            for (Map.Entry<String, String> entry : arrayIngredients.entrySet()) {

                String keyMap = entry.getKey();
                String valueMap = entry.getValue();
//              entry.getKey().equalsIgnoreCase(keyMap) || entry.getValue().equalsIgnoreCase(valueMap


                if (addIngredients.containsKey(keyMap)) {
                    System.out.println("You already add this ingredient!");
                } else if (addIngredients.containsValue(valueMap)) {
                    System.out.println("You already add this ingredient!");
                } else {
                    addIngredients.put(keyMap, valueMap);

                    switch (ingredient) {
                        case "1", "sauce" -> {
                            finalPrice += price.saucePrice;
                            System.out.println("You add sauce. Now burger costs - $" + finalPrice + ".");
                        }
                        case "2", "cheese" -> {
                            finalPrice += price.cheesePrice;
                            System.out.println("You add cheese. Now burger costs - $" + finalPrice + ".");
                        }
                        case "3", "cutlet" -> {
                            finalPrice += price.cutletPrice;
                            System.out.println("You add cutlet. Now burger costs - $" + finalPrice + ".");
                        }
                        default -> {
                            System.out.println("You print wrong ingredient!");
                        }
                    }
                }
                break;

            }


            System.out.println("Do you want add more ingredients? Yes or no:");
            Scanner scanner2 = new Scanner(System.in);

            answer = scanner2.nextLine();
        }

        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Good choice! Your burger costs - $" + finalPrice + ".");
        } else {
            System.out.println("You print wrong answer!");
        }

    }
}

