package quotes;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Quote {
    String author;
    String text;
    Quote[] sample;
//    Quote[] ArrOfObj = new Quote[138];
//    HashMap<String,String> qoute = new HashMap<>();
    File file;

    public Quote() {
        author = "";
        text = "";

    }
    public Quote(String author, String text) {
        this.author = author;
        this.text = text;

    }
    public Quote(File path) {
        file = new File(path+"");

    }
    public void print(){

               for (int i = 0; i < sample.length; i++) {
               System.out.println(sample[i]);
           }

}
public int length(){
        return sample.length;
}
//public Quote[] Read(){
//        try (Scanner sc = new Scanner(this.file)) {
//            Quote q = new Quote();
//            int i=0;
//            while (sc.hasNext()) {
//                String Str = sc.nextLine();
//                if (Str.contains("author")) {
//                    this.author = Str.substring(Str.indexOf("\"author"));
//                }
//                if (Str.contains("text")) {
//                    this.text = Str.substring(Str.indexOf("\"text"));
////                    qoute.put(text,author);
//                    q.author=author;
//                    q.text=text;
//                    ArrOfObj[i]= new Quote(q.author,q.text);
//                    i++;
//                }
//            }
//            this.ArrOfObj = ArrOfObj;
//
//        }
//        catch(FileNotFoundException err){
//            System.out.println(err.getMessage());
//        }
//        return ArrOfObj;
//    }
    public void ReadGson(){
        System.out.println("Please Enter the name of the file without .json extension: ");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
       try{
           BufferedReader buffer = new BufferedReader(new FileReader("app/src/main/resources/"+fileName+".json"));
           Gson gson = new Gson();
           Quote[] sample = gson.fromJson(buffer, Quote[].class);

           Quote q = new Quote();
           for (int i = 0; i <sample.length ; i++) {
               String author = sample[i].author;
               String text = sample[i].text;
               if (author.contains("author")) {
                   this.author = author.substring(author.indexOf("\"author"));
               }
               if (text.contains("text")) {
                   this.text = text.substring(text.indexOf("\"text"));
//                   qoute.put(text,author);
                   q.author=author;
                   q.text=text;
//                   ArrOfObj[i]= new Quote(q.author,q.text);
               }
           }
           this.sample = sample;

       }
       catch (Exception err){
           System.out.println(err.getMessage());
       }

    }
    @Override
    public String toString() {
        return
                "\n"+
               "author: "+ author + '\'' +
                "\n"+
                "text: "+text + '\'' +
                '}';
    }

    public void shuffleQoute(){
        List<String> keysList = new ArrayList<>(sample.length);

        int size = sample.length;
        int RandId = new Random().nextInt(size);

        System.out.println(sample[RandId]);
    }


}
