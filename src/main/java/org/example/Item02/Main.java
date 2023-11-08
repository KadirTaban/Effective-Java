package org.example.Item02;

public class Main {
    public static void main(String[] args) {

        // Telescoping constructor pattern
        NutritionFacts nutritionFacts = new NutritionFacts(1,2,3,4,3,3);

        //JavaBeans Pattern
        NutritionFacts2 nutritionFacts2 = new NutritionFacts2();
         nutritionFacts2.setCalories(1);
         nutritionFacts2.setCarbohydrate(3);
         nutritionFacts2.setFat(23);
         nutritionFacts2.setServings(3);
         nutritionFacts2.setSodium(3);
         nutritionFacts2.setServingSize(12);

        //Builder Pattern

        /*
        This client code is easy to write and, more importantly, easy to read. The Builder
        pattern simulates named optional parameters as found in Python and Scala.
        The Builder pattern is well suited to class hierarchies. The Builder pattern is a good choice when designing
        classes whose constructors or static factories would have more than a handful of parameters.
        */

        NutritionFacts3 cocaCola = new NutritionFacts3.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();


    }
}
