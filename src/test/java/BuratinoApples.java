import java.sql.SQLOutput;

public class BuratinoApples {
    public static void main(String[] args) {
       int buratinoApples = 15;// Сколько яблок было у Буратино
       int applesTaken = 5;// Сколько яблок отобрал Карабас Барабас
                int Remaining = buratinoApples - applesTaken;//Сколько яблок осталось у буратино
       System.out.println("У буратино было "+buratinoApples+" яблок");
       System.out.println(applesTaken+" яблок отобрал Карабас Барабас");
       System.out.println(Remaining+" яблок осталось у Буратино");
    }
}
