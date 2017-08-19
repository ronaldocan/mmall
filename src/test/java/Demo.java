
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Administrator on 2017/8/13.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
//        FileManager a = new FileManager("d://d.txt", new char[]{'\n'});
//        FileManager b = new FileManager("d://c.txt", new char[]{'\n',' '});
//        FileWriter c = new FileWriter("d://a.txt");
//        String aWord = null;
//        String bWord = null;
//        while((aWord = a.nextWord()) != null){
//            c.write(aWord + "\t");
//            bWord = b.nextWord();
//            if(bWord != null)
//                c.write(bWord + "\t");
//        }
//        while((bWord = b.nextWord()) != null){
//            c.write(bWord + "\t");
//        }
//        c.close();
        String str = "哈哈嗖嗖嗖wssw123";
        HashMap<String, Integer> map = getCounts(str);
        System.out.println(map.get("cn"));
        System.out.println(map.get("eng"));
        System.out.println(map.get("num"));
        doubleNum(1237);
        System.out.println(getAge(8));
    }
    public static void doubleNum(int n)
    {
        System.out.println(n);
        if(n<=5000)
            doubleNum(n*2);
        System.out.println(n);
    }
    public static int getAge(int t){
        if(t == 1) return 10;
        return  getAge(t-1) + 2;
    }
    private static HashMap<String,Integer> getCounts(String tar){
        HashMap<String, Integer> counts = new HashMap<>();
        int numberCounts = 0;
        int cnCounts = 0;
        int engCounts = 0;

        for (char c : tar.toCharArray())
        {
            if(c>= '0' && c<='9')
                numberCounts++;
            else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                engCounts++;
            else
                cnCounts++;
        }
        counts.put("num", numberCounts);
        counts.put("cn", cnCounts);
        counts.put("eng", engCounts);
        return counts;
    }
}
class FileManager{

    String[] words = null;
    int pos = 0;
    public FileManager(String filename,char[] seperators) throws Exception{
        File f = new File(filename);
        FileReader reader = new FileReader(f);
        char[] buf = new char[(int)f.length()];
        int len = reader.read(buf);
        String results = new String(buf,0,len);
        String regex = null;
        regex = "" + seperators[0];
        if(seperators.length >1 ){
            regex = "" + seperators[0] + "| ";
        }else{
            regex = "" + seperators[0];
        }
        words = results.split(regex);

    }

    public String nextWord(){
        if(pos == words.length)
            return null;
        return words[pos++];
    }

}
