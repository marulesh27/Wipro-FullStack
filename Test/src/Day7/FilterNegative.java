package Day7;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class FilterNegative {
	public static void main(String [] args) {
		List<Integer>a =new ArrayList<Integer>();
		a.add(-4);
		a.add(7);
		a.add(-54);
		a.add(6);
		List<Integer>l=a.stream()
		     .filter(x->x<0)
		     .collect(Collectors.toList());
		System.out.println(a);
		System.out.println(l);
		
	}

}
