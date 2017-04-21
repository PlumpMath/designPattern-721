package simpleFactoryPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		Chart.getChart(XMLUtil.getChartType());
//		List<String> list = new ArrayList<String>(); 
//		list.add("aa");
//		list.add("aa");
//		list.add("aa");
//		HashMap<String,Integer> value = new HashMap<String,Integer>();
//		for(String a:list){
//			value.put(a, value.get(a) == null?1:value.get(a) + 1);
//			System.out.println(value.get(a));
//		}
	}
	
}
