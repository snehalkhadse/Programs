package StringManipulation;

public class StringManipulationConcept {

	public static void main(String[] args) 
	{
		String str="This is my Java code and I am so happy";
		System.out.println(str.length());
		
		
		int len=str.length();
		int li=0;
		System.out.println(li);
		
		int hi=len-1;
		System.out.println(hi);
		
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(37));
		//System.out.println(str.charAt(38));
		
		System.out.println(str.indexOf('T'));
		System.out.println(str.length());
		System.out.println(str.indexOf('s'));		

		System.out.println(str.indexOf("s",str.indexOf('s')+1));
		
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("Hell0"));  //-1
		
		String msg="welcome admin";
		if (msg.indexOf("admin")==8)
		{
			System.out.println("correct message");
		}
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		//trim
		String s="  hello world  ";
		System.out.println(s.trim());
		
		String text="  1234";
		System.out.println(text.trim());
		
		//replace
		String dob="01-01-1990";
		System.out.println(dob.replace('-', '/'));
		
		String s1="hello Java & happy with Java";
		System.out.println(s1.replace("Java","python"));
		
		
		//contains
		String s2="welcome admin";
		System.out.println(s2.contains("admin"));
		
		if(s2.contains("admin"))
		{
			System.out.println("correct mesg");
		}
		
		
		//concatination
		String s11="hello";
		String s12="selenium";
		
		System.out.println(s11.concat(s12).concat("test automation"));
		
		//comparision
		String s3="this is my java code";
		String s4="this is my Java code";
		
		System.out.println(s3.equals(s4));
		
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//substring
		String s5="this is my order id 1234";
		System.out.println(s5.equals(11));
		System.out.println(s5.substring(0,9));
		
		System.out.println(s5.substring(s5.indexOf("id")+3,s5.length()));
		
		//split
		String test="Java;Python;JavaScript;Ruby";
		
		String arr[]=test.split(";");
		
		System.out.println(arr[0]);
		for(String e:arr)
		{
			System.out.println(e);
		}
		
		String userData="Tom;peter;30;London;Uk;99999;IBM";
		String user[]=userData.split(":");
		
		for(int i=0;i<user.length;i++)
		{
			System.out.println(user[i]);
		}
		
		
		String data="xXtestingXxXxJavaxXselenium";
		String dataArr[]=data.split("xX");
		
		System.out.println("0th value:"+dataArr[0]);
		System.out.println("first value:"+dataArr[1]);
		System.out.println("second value:"+dataArr[2]);
		System.out.println("third value:"+dataArr[3]);
		
		String x="100";
		System.out.println(x+100);
		
		
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		String y="200A";
		System.out.println(y+20);
		
		//int p=Integer.parseInt(y);
		//System.out.println(p+20);
		
		String ds="12.33";
		System.out.println(ds+100);
		
		Double d=Double.parseDouble(ds);
		System.out.println(d+100);
		
		//string to double
		
		//int to string
		int total=1000;
		System.out.println(total+20);
		System.out.println(total+""+20);
		
		
		String tt=String.valueOf(total);
		System.out.println(tt+20);
	
	}	

}
