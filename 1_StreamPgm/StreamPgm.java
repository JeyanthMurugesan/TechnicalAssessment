/*Convert string to uppercase and join them with comma using Stream and Collectors*/
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPgm {
	public static void main(String[] args) { 
	List<String> GivenValues = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
	String ValuesResult = GivenValues.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", ")); 
	System.out.println("Printing the ValuesResult with upper case and comma:" +ValuesResult);    }
}

-------------------------------------------------------------------------------------------------------------------
/*Convert string to uppercase and join them with comma using Stream and Collectors*/
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPgm {
	public static void main(String[] args) { 
	List<String> GivenValues = Arrays.asList("abc", "ABCD", "an", "apple", "bcd", "jk");
	String ValuesResult = GivenValues.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
	System.out.println("Printing the ValuesResult with upper case and comma:" +ValuesResult);    }
}

-------------------------------------------------------------------------------------------------------------------
/*Convert string to uppercase and join them with comma using Stream and Collectors*/
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class StreamPgm {
	public static void main(String[] args) { 
	List<String> GivenValues = Arrays.asList("neurogine", "group", "malaysia");
	String ValuesResult = GivenValues.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
	System.out.println("Printing the ValuesResult with upper case and comma:" +ValuesResult);    }
}

--------------------------------------------------------------------------------------------------------------------
/*Create a list with String more than 2 characters and count number of String which starts with "a" and count empty string.
Example of Strings given: "abc", "an", "", "apple", "bcd", "", "jk" */
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPgm {
	public static void main(String[] args) { 
	List<String> givenValues = Arrays.asList("abc", "an", "", "apple", "bcd", "", "jk"); 
	
	//String more than 2 characters 
	long moreThan2Characters = givenValues.stream() 
	filter(x -> x.length()>2).count();
	System.out.printf("More Than 2 Characters: String List %s has more than 2 characters is %d %n", givenValues, moreThan2Characters);
	 
    //String starts with "a"
	long startsWitha =  givenValues.stream().filter(x -> x.startsWith("a")).count();
	System.out.printf("Count num of String starts with 'a': String List %s start with 'a' is %d %n", givenValues, startsWitha);
	
	//Count empty string
	long emptyString =  givenValues.stream().filter(x -> x.isEmpty()).count();
	System.out.printf("Count empty string: String List %s has empty string values is %d %n", givenValues, emptyString);
	}
}

----------------------------------------------------------------------------------------------------------------------