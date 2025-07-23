interface MealPlan {
    String getPlanDetails();
}

class VegetarianMeal implements MealPlan {
    public String getPlanDetails() {
        return "Vegetarian Meal Plan";
    }
}

class VeganMeal implements MealPlan {
    public String getPlanDetails() {
        return "Vegan Meal Plan";
    }
}

class KetoMeal implements MealPlan {
    public String getPlanDetails() {
        return "Keto Meal Plan";
    }
}

class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    void showPlan() {
        System.out.println(plan.getPlanDetails());
    }

    public static <T extends MealPlan> void generatePlan(T meal) {
        System.out.println("Generated: " + meal.getPlanDetails());
    }
}

public class MealPlanTest {
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        Meal.generatePlan(veg);

        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        veganMeal.showPlan();
    }
}
