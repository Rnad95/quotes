package quotes;

public class quote {
    private String author;
    private String url;
    private String body;


    public quote(String author, String url, String body) {
        this.author = author;
        this.url = url;
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }
    public String getURL() {
        return url;
    }
    public String getBody() {
        return body;
    }


    @Override
    public String toString() {
        return "quote " +
                "author=" + author +" " +
                ", body=" + body + " " +
                '}';
    }
}
