import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Foods {
        private ArrayList<Food> breakfasts = new ArrayList<Food>();
        private ArrayList<Food> lunch = new ArrayList<Food>();
        private ArrayList<Food> dinner = new ArrayList<Food>();

        Food proteinShake = new Food("protein shake", "proteins", 4);
        Food oatmeal = new Food("oatmeal", "carbs", 4);
        Food banana = new Food("banana", "carbs", 2);
        Food ricePorridge = new Food("rice porridge", "carbs", 3);
        Food apple = new Food("apple", "carbs", 4);
        Food roastedChicken = new Food("roasted chicken", "proteins", 4);
        Food cookedRice = new Food("cooked rice", "carbs", 3);
        Food salad = new Food("salad", "carbs", 4);
        Food tuna = new Food("tuna", "proteins", 4);
        Food omlete = new Food("omlete", "proteins", 4);
        Food sunnySideUp = new Food("sunny-side up", "proteins", 4);
        Food toast = new Food("toast", "carbs", 2);
        Food avocado = new Food("avocado", "fats", 4);
        Food chickenHam = new Food("chicken ham", "proteins", 4);
        Food turkeyHam = new Food("turkey ham", "proteins", 4);
        Food cookedEgg = new Food("cooked egg", "proteins", 4);
        Food cookedQuinoa = new Food("cooked quinoa", "carbs", 4);
        Food sweetpotato = new Food("sweet potato", "carbs", 4);
        Food cucumber = new Food("cucumber", "carbs", 4);
        Food tomato = new Food("tomato", "carbs", 3);
        Food oliveOil = new Food("olive oil", "fats", 4);
        Food lenseedOil = new Food("lenseed oil", "fats", 4);
        Food olive = new Food("olive", "fats", 4);
        Food coconutOil = new Food("coconut oil", "fats", 4);
        Food roastedTurkey = new Food("roasted turkey", "proteins", 4);

        public Foods() {
            breakfasts.add(proteinShake);
            breakfasts.add(oatmeal);
            breakfasts.add(banana);
            breakfasts.add(ricePorridge);
            breakfasts.add(apple);
            breakfasts.add(omlete);
            breakfasts.add(sunnySideUp);
            breakfasts.add(toast);
            breakfasts.add(avocado);
            breakfasts.add(chickenHam);
            breakfasts.add(turkeyHam);
            breakfasts.add(cookedEgg);
            breakfasts.add(cucumber);
            breakfasts.add(tomato);
            breakfasts.add(oliveOil);

            lunch.add(roastedChicken);
            lunch.add(cookedRice);
            lunch.add(salad);
            lunch.add(tuna);
            lunch.add(chickenHam);
            lunch.add(turkeyHam);
            lunch.add(cookedQuinoa);
            lunch.add(sweetpotato);
            lunch.add(coconutOil);
            lunch.add(lenseedOil);
            lunch.add(olive);
            lunch.add(oliveOil);
            lunch.add(roastedTurkey);

            dinner.add(roastedChicken);
            dinner.add(roastedTurkey);
            dinner.add(turkeyHam);
            dinner.add(chickenHam);
            dinner.add(tuna);
            dinner.add(cookedQuinoa);
            dinner.add(sweetpotato);
            dinner.add(coconutOil);
            dinner.add(lenseedOil);
            dinner.add(olive);
            dinner.add(oliveOil);
            dinner.add(roastedTurkey);
        }

        public Food getABreakfast(int bmiType) {
            Random rand = new Random();
            Predicate<Food> byBmi = food -> food.getBmiType() <= bmiType;
            List<Food> foods = breakfasts.stream().filter(byBmi).collect(Collectors.toList());
            int randomNumber = rand.nextInt(foods.size());
            Food selectedBreakfast = foods.get(randomNumber);
            return selectedBreakfast;


        }
    }