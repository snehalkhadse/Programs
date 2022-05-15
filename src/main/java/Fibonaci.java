import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class Fibonaci {
    public static void main(String[] args) {
        /*int n = 10;
        int t1 = 0, t2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(t1);

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println("___________");
        String str = "selenium";
        int len = str.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        System.out.println("___________");


        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "F"));

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(l1.equals(l2));

        Collections.sort(l3);
        System.out.println(l1.equals(l3));

        ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

        ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

        l4.removeAll(l5);
        System.out.println(l4);

        l5.removeAll(l4);
        System.out.println(l5);

        ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("java", "python", "C++", "rubby", "js"));
        ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("java", "python", "C++", "rubby", "php"));

        lang1.retainAll(lang2);
        System.out.println(lang1);

        System.out.println("___________");

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 2, 3, 1, 4, 5, 6, 1, 7, 8, 9, 7));

        LinkedHashSet<Integer> linkhashset = new LinkedHashSet<Integer>(numbers);

        ArrayList<Integer> numberwithoutduplicate = new ArrayList<Integer>(linkhashset);

        System.out.println(numberwithoutduplicate);

        System.out.println("___________");

        String str1 = "radar1";
        String revStr = "";
        int strlength = str1.length();
        for (int i = strlength - 1; i >= 0; i--) {
            revStr = revStr + str1.charAt(i);

        }
        if (str1.toLowerCase().equals(revStr.toLowerCase()))
        {
            System.out.println("string is palindrom ");
        } else {
            System.out.println("string is  not palindrom ");
        }
        System.out.println("___________");

        String text = "Java is a fun programming language";

        // split string from space
        String[] result = text.split(" ");


        System.out.print("result = ");
        for (String str2 : result) {
           System.out.print(str2 + ", ");
        }
        System.out.println("___________");

        String line="java is a fun programming language";
        int strv=line.length();
        System.out.println(strv);
        char ch = 'N';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println(ch + " is vowel");
        }
        else
        {
            System.out.println(ch + " is consonant");
        }

        System.out.println("Browser window iterator");

       /* WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");// parent window

        driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
        //child window

        Set<String> handles = driver.getWindowHandles();
        Iterator<String>it=handles.iterator();
        String parentwindowId=it.next();
        System.out.println("parentwindowId is:"+parentwindowId);

        String childWindowId = it.next();
        System.out.println("child window id : " + childWindowId);


        driver.switchTo().window(childWindowId);
        String childwindowtitle=driver.getTitle();
        System.out.println("child window title:"+childwindowtitle);
        driver.close();

        driver.switchTo().window(parentwindowId);
        String parentwindowtitle=driver.getTitle();
        System.out.println("parentwindow title:"+parentwindowtitle);
        driver.quit();*/

        System.out.println("reverse char");
        String s = "This is string  in java";
        String sA[] = s.split(" ");
        //char chA[]=s.toCharArray();
        for (int i = sA.length - 1; i >= 0; i--) {
            System.out.print(sA[i] + " ");
        }

        System.out.println("count of string value");
        String sh[] = {"a", "b", "v", "b", "e"};
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (String temp : sh)
            if (hm.get(temp) != null) {
                hm.put(temp, hm.get(temp) + 1);
            } else {
                hm.put(temp, 1);
            }
        System.out.println(hm);


        System.out.println("amstrong no prog 153");
        int n = 371, origino, remainder, result = 0;
        origino = n;
        while (origino != 0) {
            remainder = origino % 10;
            result += Math.pow(remainder, 3);
            origino /= 10;
        }
        if (result == n) {
            System.out.println("amstrong no");
        } else {
            System.out.println(" not amstrong no");
        }


       /* System.out.println("duplicate char");
        String ss = "thiss";

        char[] ch = ss.toCharArray();
        HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();

        for (Character c : ch) {
            if (hm1.get(c) != null) {
                hm1.put(c, hm.get(c) + 1);
            } else {
                hm1.put(c, 1);
            }
        }
        System.out.println(hm1);*/


//        char[] characters = ss.toCharArray(); // build HashMap with character and number of times they appear in String
//
//        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
//        for (Character ch : characters) {
//            if (charMap.containsKey(ch)) {
//                charMap.put(ch, charMap.get(ch) + 1);
//            } else {
//                charMap.put(ch, 1);
//            }
//        }
//        System.out.println(charMap);

        System.out.println("print duplicate no");
        int[] no={1,2,3,4,5,6,4,3};

        Set<Integer>list=new HashSet<Integer>();
       for(Integer input:no)
       if(list.add(input)==false)
        {
            System.out.println(input);
        }

        System.out.println("print duplicate name");
       String[]names={"java","pearl","python","java"};
       Set<String>list1=new HashSet<String>();
       for(String e:names)
       {
          if(list1.add(e)==false)
          {
              System.out.println(e);
          }
       }


    }
}



