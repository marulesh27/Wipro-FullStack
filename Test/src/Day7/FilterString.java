package Day7;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class FilterString {
	public static void main(String [] args) {
		List<String>a =new ArrayList<String>();
		a.add("admin");
		a.add("user");
		a.add("owner");
		a.add("customer");
		List<String>l=a.stream()
		     .filter(s->s.contains("e"))
		     .collect(Collectors.toList());
		System.out.println(a);
		System.out.println(l);
		
	}

}
