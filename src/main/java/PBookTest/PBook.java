package PBookTest;

import java.util.HashMap;

public class PBook {
	String name;
	String num;
	
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	public boolean isEmpty() {
		if(map.isEmpty())
			return true;
		else return false;
	}
	public void addNumber(String name, String num)
	{
		String add = null;
		if(map.containsKey(name))
		{
			add=map.get(name)+"; "+num;
    		map.put(name, add);
		}
		else{
			map.put(name, num);
		}
	}
	
	
	public String getNumber(String name) {
		return map.get(name);
		}
	
}