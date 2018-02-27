// Import the required libraries from guava jar file.

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

// Import the required java libraries.
import java.util.List;

//Create your class and begin working with it.
public class Drone{
    public static void main(String[] args)
    {

 List<String> list = Lists.newArrayList("Google", "Guava","Naveen","Hello");

//This rule is made a constant by using final keyword.
final Predicate<String> startWithG = new Predicate<String>() {
    @Override
    public boolean apply(final String stringValue) {
        return stringValue.startsWith("G");
    }
};

//Use Iterable object and filter based on your rule.
Iterable<String> iterable =  Iterables.filter(list, startWithG);

// Convert the result to an arrayList and print the required result.
ArrayList<String> resultList = Lists.newArrayList(iterable);

System.out.println(resultList);
