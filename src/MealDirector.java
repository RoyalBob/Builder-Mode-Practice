public class MealDirector{
	
    private IMealBuilder _builder;
    public MealDirector( IMealBuilder builder )
    {
    	_builder = builder;
    }
    public Meal CreateMeal()
    {
    	_builder.BuildBurger();
    	_builder.BuildChips();
    	_builder.BuildDrink();
    	
    	return _builder.GetMeal(); 
    }
}