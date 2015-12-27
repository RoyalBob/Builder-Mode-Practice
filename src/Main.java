public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMealBuilder builder1 = new KFCBuilder();
        MealDirector director1 = new MealDirector(builder1);
        director1.CreateMeal().Show();;

        IMealBuilder builder2 = new McDonaldBuilder();
        MealDirector director2 = new MealDirector(builder2);
        director2.CreateMeal().Show();
	}

}
