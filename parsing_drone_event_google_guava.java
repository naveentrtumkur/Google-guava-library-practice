// This function is used to parse the drone event to check whether the input is having battery low criteria being met or not.
// If yes then the appropriate string would be set and returned.

package rules;

import java.util.List;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class ParseInputEvent {
	CharSequence seq = "battery low";
	
	private String parsedStr;
	
	public String getParsedStr() {
		return this.parsedStr;
	}
	
	public void setParsedStr(String val)
	{
		System.out.println("Input === " +val);
		 List<String> name = Lists.newArrayList(val);
		    
		       if(Iterables.filter(name, Predicates.containsPattern("battery low")) != null)
		    parsedStr = "battery low";
		       else
		    	   parsedStr = "";
		    
		    System.out.println(parsedStr);
		    
		    //assertThat(result, containsInAnyOrder("Jane", "Adam"));

		/*if(val.matches((String) seq))
		{
			System.out.println("*** Battery low parsing match ***");
			parsedStr = (String) seq;
		}*/
	}
	
	
	

}

