package Homeworks.homework23;

public class Main {
    public static void main(String[] args) {
        Fiz fiz = new Fiz();
        Legal legal = new Legal();
        IndividualEntrepreneur individualEntrepreneur = new IndividualEntrepreneur();


        fiz.accountInfo();
        fiz.accountBalance(1000);
        fiz.cashWithdrawal(1000, 500);
        fiz.refill(200, 50);

        legal.accountInfo();
        legal.accountBalance(500);
        legal.cashWithdrawal(2000, 1900);
        legal.refill(2000, 500);

        individualEntrepreneur.accountInfo();
        individualEntrepreneur.accountBalance(2002);
        individualEntrepreneur.cashWithdrawal(2000, 500);
        individualEntrepreneur.refill(1000, 1015);

    }
}
//
//    Что нужно сделать
//
//        1. Создайте классы, представляющие клиентов банка: абстрактный класс Client, классы для физических лиц,
//        юридических лиц и индивидуальных предпринимателей.
//
//        У каждого клиента есть сумма денег на счету (число). Деньги можно положить на счёт,
//        снять и вернуть остаток на счёте. Каждый класс должен содержать метод, который выводит информацию
//        в консоль о счёте: условие пополнения, условие снятия и баланс.
//
//        2. Реализуйте методы, при которых:
//
//        У физических лиц пополнение и снятие происходит без комиссии.
//
//        У юридических лиц — снятие с комиссией 1%.
//
//        У ИП — пополнение с комиссией 1%, если сумма меньше 1000 $. И с комиссией 0,5%, если сумма больше либо равна 1000 $.
