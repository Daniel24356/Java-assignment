package Collections;

import java.util.HashMap;
import java.util.Map;

public class collectionImplementation implements Ibudget {
    Map<String, Integer> budgets = new HashMap<>();

    @Override
    public void addBudget(String budget) {
        budgets.put("shopping", 70000);
    }

    @Override
    public void seeBudget() {
        for (Map.Entry<String, Integer> budget : budgets.entrySet()) {
            System.out.print(budget.getKey() + ":");
            System.out.println(budget.getValue());
        }
    }

    @Override
    public void deleteBudget(String budget) {
        budgets.remove(budget);
    }

}


