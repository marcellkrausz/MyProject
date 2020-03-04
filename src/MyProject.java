import jdk.nashorn.internal.ir.LexicalContext;
import jdk.nashorn.internal.ir.LexicalContextNode;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MyProject {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name:");
        String name = sc.next();

        System.out.println("Age:");
        int age = sc.nextInt();

        System.out.println("Weight:");
        int weight = sc.nextInt();

        System.out.println("Height in cm:");
        double height = sc.nextDouble();


        Trainee myTrainee1 = new Trainee(1, name, age, weight, height);
        System.out.println("BMI:" + myTrainee1.getBmi());

        int bmiType = 0;
        if (myTrainee1.getBmi() < 18) {
            bmiType = 4;
            System.out.println("You are skinny!");
        }
        if (18.5 < myTrainee1.getBmi() && myTrainee1.getBmi() < 25) {
            bmiType = 3;
            System.out.println("Your weight is normal!");
        }
        if (25 < myTrainee1.getBmi() && myTrainee1.getBmi() < 30) {
            bmiType = 2;
            System.out.println("You are overweight!");
        } else {
            bmiType = 1;
            System.out.println("You are a pig!");
        }

        Foods foods = new Foods();
        Food hereIsYourBreakfast = foods.getABreakfast(bmiType);
        System.out.println(hereIsYourBreakfast.getFoodName());

//        Food proteinShake = new Food("protein shake", "proteins", 4);
//        Food oatmeal = new Food("oatmeal", "carbs", 4);
//        Food banana = new Food("banana", "carbs", 2);
//        Food ricePorridge = new Food("rice porridge", "carbs", 3);
//        Food apple = new Food("apple", "carbs", 4);
//        Food roastedChicken = new Food("roasted chicken", "proteins", 4);
//        Food cookedRice = new Food("cooked rice", "carbs", 3);
//        Food salad = new Food("salad", "carbs", 4);
//        Food tuna = new Food("tuna", "proteins", 4);
//        Food omlete = new Food("omlete", "proteins", 4);
//        Food sunnySideUp = new Food("sunny-side up", "proteins", 4);
//        Food toast = new Food("toast", "carbs", 2);
//        Food avocado = new Food("avocado","fats",4);
//        Food chickenHam = new Food("chicken ham","proteins",4);
//        Food turkeyHam = new Food("turkey ham","proteins",4);
//        Food cookedEgg =new Food("cooked egg","proteins",4);
//        Food cookedQuinoa = new Food("cooked quinoa","carbs",4);
//        Food sweetpotato = new Food("sweet potato","carbs",4);
//        Food cucumber = new Food("cucumber","carbs",4);
//        Food tomato = new Food("tomato","carbs",3);
//        Food oliveOil = new Food("olive oil","fats",4);
//        Food lenseedOil = new Food("lenseed oil","fats",4);
//        Food olive = new Food("olive","fats",4);
//        Food coconutOil = new Food("coconut oil","fats",4);
//        Food roastedTurkey = new Food("roasted turkey","proteins",4);
//
//
//
//
////foodtype helyett más a listába meglehet adni az étkezést
//        List<Food> breakfasts = new ArrayList<>();
//        breakfasts.add(proteinShake);
//        breakfasts.add(oatmeal);
//        breakfasts.add(banana);
//        breakfasts.add(ricePorridge);
//        breakfasts.add(apple);
//        breakfasts.add(omlete);
//        breakfasts.add(sunnySideUp);
//        breakfasts.add(toast);
//        breakfasts.add(avocado);
//        breakfasts.add(chickenHam);
//        breakfasts.add(turkeyHam);
//        breakfasts.add(cookedEgg);
//        breakfasts.add(cucumber);
//        breakfasts.add(tomato);
//        breakfasts.add(oliveOil);
//
//        List<Food> lunch = new ArrayList<>();
//        lunch.add(roastedChicken);
//        lunch.add(cookedRice);
//        lunch.add(salad);
//        lunch.add(tuna);
//        lunch.add(chickenHam);
//        lunch.add(turkeyHam);
//        lunch.add(cookedQuinoa);
//        lunch.add(sweetpotato);
//        lunch.add(coconutOil);
//        lunch.add(lenseedOil);
//        lunch.add(olive);
//        lunch.add(oliveOil);
//        lunch.add(roastedTurkey);
//
//        List<Food> dinner= new ArrayList<>();
//        dinner.add(roastedChicken);
//        dinner.add(roastedTurkey);
//        dinner.add(turkeyHam);
//        dinner.add(chickenHam);
//        dinner.add(tuna);
//        dinner.add(cookedQuinoa);
//        dinner.add(sweetpotato);
//        dinner.add(coconutOil);
//        dinner.add(lenseedOil);
//        dinner.add(olive);
//        dinner.add(oliveOil);
//        dinner.add(roastedTurkey);
    }
}




