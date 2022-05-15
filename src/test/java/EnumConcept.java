import java.util.EnumSet;
import java.util.Iterator;

public class EnumConcept {
	enum lang{
		JAVA,CSHARP,JAVASCRIPT,
		PYTHON,RUBBY}
	
	public static void main(String[] args)
	{
		EnumSet<lang>langs=EnumSet.allOf(lang.class);
		System.out.println(langs);
		
		EnumSet<lang>l=EnumSet.noneOf(lang.class);//empty enum set
		System.out.println(l);
		
		//range(e1,e2)
		EnumSet<lang>enumrange=EnumSet.range(lang.JAVA,lang.JAVASCRIPT);
		System.out.println(enumrange);
		
		
		//of
		EnumSet<lang>csharpEnum=EnumSet.of(lang.CSHARP);
		System.out.println(csharpEnum);
		
		EnumSet<lang>multiEnum=EnumSet.of(lang.JAVA,lang.RUBBY);
		System.out.println(multiEnum);
		
		//add addall

		EnumSet<lang>lang1=EnumSet.allOf(lang.class);
		EnumSet<lang>lang2=EnumSet.noneOf(lang.class);
		lang2.add(lang.JAVASCRIPT);
		lang2.addAll(lang1);
		System.out.println(lang2);
		
		//iterate
		EnumSet<lang>fulllang=EnumSet.allOf(lang.class);
		Iterator<lang>it=fulllang.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			System.out.print(",");
			
		}
		
		//remove removeAll
		EnumSet<lang>newlang=EnumSet.allOf(lang.class);
		System.out.println(newlang);
		
		boolean b=newlang.remove(lang.CSHARP);
		System.out.println(b);
		System.out.println(newlang);
		
		boolean b1=newlang.removeAll(newlang);
		System.out.println(b1);
		System.out.println(newlang);
		
	}

}
