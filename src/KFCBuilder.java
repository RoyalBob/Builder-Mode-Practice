public class KFCBuilder implements IMealBuilder
{
	protected Meal meal=new Meal();
	@Override
	public void BuildBurger() {
		// TODO Auto-generated method stub
		IFood food = new KFCBurger();
        meal.addFood(food);
	}

	@Override
	public void BuildChips() {
		// TODO Auto-generated method stub
		IFood food = new KFCChips();
        meal.addFood(food);
	}

	@Override
	public void BuildDrink() {
		// TODO Auto-generated method stub
		IFood food = new KFCDrink();
        meal.addFood(food);
	}

	@Override
	public Meal GetMeal() {
		// TODO Auto-generated method stub
		return meal;
	}
}
