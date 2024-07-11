package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D6_findTheLowestTempStateName {

	public static void main(String[] args) {
		// storing map   NY -----45    PA-----40
		Map<String,Integer>  statetem=new HashMap<>();
		statetem.put("NY",45);
		statetem.put("NJ",50);
		statetem.put("PA",40);
		statetem.put("TX",60);
		statetem.put("CT",51);
		statetem.put("VA",47);
		
		
		
		Set<String> keys =statetem.keySet();
		
		String lowestTemState = null;
		int lowestTemp = 45;
		
		//System.out.println(statetem.get("VA"));
		
		for(String k:keys) {
			if(statetem.get(k)<lowestTemp) {
				lowestTemp=statetem.get(k);
				lowestTemState=k;
			}
		}
		
		System.out.println(lowestTemState+"-"+lowestTemp);
		
	}

}
