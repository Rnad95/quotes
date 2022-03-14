package quotes;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class favqs {
    private String author;
    private String body;
    favqs[] sample;
    favqs[] ArrOfObj = new favqs[138];
    HashMap<String,String> qoute = new HashMap<>();
    File file;

//    private String qotd_date;
    private quote quote;


    public favqs() {
//        author = "";
        body = "";
    }

    // ***************** Adding Lab 09 ************************************/
    public favqs(quote qotd) {
        this.quote = qotd;
//        this.qotd_date = qotd_date;
    }

//    public String getQotd_date() {
//        return qotd_date;
//    }

    public quote getQotd() {
        return quote;
    }

    public  void ReadFromAPI() throws IOException {
        URL url = new URL("https://favqs.com/api/qotd");
        HttpURLConnection quoteURLConnection= (HttpURLConnection)  url.openConnection();
        quoteURLConnection.setRequestMethod("GET");

        InputStreamReader quoteInputStreamReader = new InputStreamReader(quoteURLConnection.getInputStream());
        BufferedReader quoteBufferReader = new BufferedReader(quoteInputStreamReader);
        String quoteData = quoteBufferReader.readLine();
        System.out.println(quoteData);
        Gson gson = new Gson();
        favqs qotd = gson.fromJson(quoteData, favqs.class);
        System.out.println(qotd.toString());
    }

    // ********************************************************************/

    public favqs(File path) {
        file = new File(path+"");

    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public void print(){
               for (int i = 0; i < sample.length; i++) {
               System.out.println("author"+sample[i].author);
               System.out.println("body"+sample[i].body);
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
//
    public  void APIRead() throws IOException {
        ArrayList<favqs> qo = new ArrayList();
        System.out.println("                     ===================== Start ======================");

        try {
            URL url = new URL("https://favqs.com/api/qotd");
            HttpURLConnection quoteURLConnection= (HttpURLConnection)  url.openConnection();

            quoteURLConnection.setRequestMethod("GET");
            InputStreamReader quoteInputStreamReader = new InputStreamReader(quoteURLConnection.getInputStream());
            BufferedReader quoteBufferReader = new BufferedReader(quoteInputStreamReader);

            String quoteData = quoteBufferReader.readLine();
            Gson gson = new Gson();
            favqs qotd = gson.fromJson(quoteData, favqs.class);
            System.out.println("                     ================== online Quotes =================");
            System.out.println(qotd);

            File qotdFile = new File("qotd.json");

            try (FileWriter qotdFileWriter = new FileWriter(qotdFile,true)) {
                gson.toJson(qotd, qotdFileWriter);
                System.out.println("                     ================= Adding to file =================");
                System.out.println("                     ==================================================");
//                 BufferedWriter buffer = new BufferedWriter(qotdFileWriter);
//                 PrintWriter p = new PrintWriter(buffer);
//                p.println(qotd);


                // If internet is not connected
            }} catch (IOException err) {
            OfflineRead();
        }

    }
    public void OfflineRead() throws IOException {
try{
        System.out.println("Internet is not connected, Reading from Json file");

        BufferedReader buffer = new BufferedReader(new FileReader("qotd.json"));
        String s = null;
        int index = 0;
        s=buffer.readLine();
        s= s.replaceAll("null,","");
        String[]  StrQo = new String[100];
        StrQo = s.split("\"quote\":");

        Random rand = new Random();
        int random =rand.nextInt(StrQo.length - 1 + 1) + 1;
        System.out.println("                     ================= Rendering Qoute ================");
        System.out.println("                     =============== Offline Random Quotes ==============");
        System.out.println(random);
        System.out.println(StrQo[random]);
        Gson gson = new Gson();
        favqs q = new favqs();
        File qotdFile = new File("qotd.json");

        System.out.println("                     =============================================");

    }catch (Exception er){
        System.out.println(er.getMessage());
    }


}
    public void ReadGson(){
        System.out.println("Please Enter the name of the file without .json extension: ");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
       try{

           BufferedReader buffer = new BufferedReader(new FileReader("qoutes.json"));

           Gson gson = new Gson();
           favqs[] sample = gson.fromJson(buffer, favqs[].class);

           favqs q = new favqs();
           for (int i = 0; i <sample.length ; i++) {
               String author = sample[i].author;
               String body = sample[i].body;
               if (author.contains("author")) {
                   this.author = author.substring(author.indexOf("\"author"));
               }
               if (body.contains("body")) {
                   this.body = body.substring(body.indexOf("\"body"));
//                   qoute.put(body,author);
                   q.author=author;
                   q.body =body;
//                   ArrOfObj[i]= new Quote(q.author,q.body);
                   System.out.println(q.body);
               }
           }
           this.sample = sample;
       }
       catch (Exception err){
           System.out.println(err.getMessage());
       }

    }
    public void shuffleQoute(){
        List<String> keysList = new ArrayList<>(sample.length);

        int size = sample.length;
        int RandId = new Random().nextInt(size);

        System.out.println(sample[RandId]);
    }
    @Override
    public String toString() {
        return "favqs{" +
                "qotd=" + quote +
                '}';
    }
}
