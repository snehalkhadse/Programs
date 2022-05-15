package CollectionConcept;

import java.util.Vector;

public class Vector2DConcept {

	public static void main(String[] args) 
	{
		Vector<String>langvector=new Vector<String>();
		langvector.add("Java");
		langvector.add("python");
		langvector.add("Rubby");
		langvector.add("JavaScript");
		langvector.add("c#");
		
		
		Vector osvector=new Vector();
		osvector.add(langvector);
		
		for(int i=0;i<langvector.size();i++)
		{
			String str=(String)((Vector)osvector.get(0)).get(i); 
			System.out.println(str);
			
		}
	}

}
