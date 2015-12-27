import java.util.ArrayList;
import java.util.List;

public class Meal
{
	private  List<IFood> foodList=new ArrayList<IFood>();
	public void addFood( IFood food )
	{
	    foodList.add(food);
	}
	public void Show()
	{
	    for (int i=0; i<foodList.size(); i++)
	    {
	        foodList.get(i).Make();
	    }
	} 
}
