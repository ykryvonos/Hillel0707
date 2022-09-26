package Homeworks.homework21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static Homeworks.homework21.BurgerConstructor.burgerConstructor;

public class Main {
    public static void main(String[] args) {
        BurgerConstructor burgerConstructor = new BurgerConstructor();
        burgerConstructor();
    }
}


//    Пользователю должно быть предложены выбрать доп. ингредиенты для бургера(стоимость бургера - 50)
//    с указанием цен! (Соус - 10, Сыр - 20, котлета - 30,). После того, как пользователь ввёл доп. ингредиенты
//    в консоль(или название или номер), спросить хочет ли пользователь добавить 2-й ингредиент, если он вводит "нет",
//    тогда вывести в консоль стоимость бургера с доп. ингредиентом(-ами)!
