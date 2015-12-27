public class McDonaldBuilder implements IMealBuilder{

	protected Meal meal=new Meal();
	@Override
	public void BuildBurger() {
		// TODO Auto-generated method stub
		IFood food = new McDonaldBurger();
        meal.addFood(food);
	}

	@Override
	public void BuildChips() {
		// TODO Auto-generated method stub
		IFood food = new McDonaldChips();
        meal.addFood(food);
	}

	@Override
	public void BuildDrink() {
		// TODO Auto-generated method stub
		IFood food = new McDonaldDrink();
        meal.addFood(food);
	}

	@Override
	public Meal GetMeal() {
		// TODO Auto-generated method stub
		return meal;
	}
}
