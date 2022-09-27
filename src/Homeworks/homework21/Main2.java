package Homeworks.homework21;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        List<Product> availableIngredients = getAvailableIngredients();

        Burger burger = new Burger();

        System.out.println("The burger cost $" + burger.price + ". Do you want to add more ingredient? Print yes or no:");
        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();

        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("Which ingredient do you want to add? Print number or ingredient name:");

            for (Product ingredient : availableIngredients) {
                System.out.println(ingredient.id + " - " + ingredient.name + " - $" + ingredient.price + ".");
            }

            Scanner scanner1 = new Scanner(System.in);

            String ingredientKey = scanner1.nextLine();


            Product selectedIngredient = findIngredient(ingredientKey, availableIngredients);

            if (selectedIngredient == null) {
                System.out.println("You print wrong ingredient!");
            } else {
                if (findIngredient(selectedIngredient.getName(), burger.ingredients) == null) {

                    burger.addIngredient(selectedIngredient);
                    burger.price += selectedIngredient.price;

                    System.out.println("You add " + selectedIngredient.getName() + ". Now burger costs - $" + burger.price);
                } else {
                    System.out.println("You already add this ingredient!");
                }

            }

            System.out.println("Do you want add more ingredients? Yes or no:");
            Scanner scanner2 = new Scanner(System.in);

            answer = scanner2.nextLine();

        }
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Good choice! Your burger costs - $" + burger.price + ".");
        } else {
            System.out.println("You print wrong answer!");
        }
    }


    public static List<Product> getAvailableIngredients() {
        List<Product> products = Arrays.asList(
                new Product(1, "sauce", 10),
                new Product(2, "cheese", 20),
                new Product(3, "cutlet", 30)
        );
        return products;
    }

    public static Product findIngredient(String key, List<Product> ingredients) {
        for (Product ingredient : ingredients) {
            if (ingredient.getId().toString().equalsIgnoreCase(key) || ingredient.getName().equalsIgnoreCase(key)) {
                return ingredient;
            }
        }
        return null;
    }


}
