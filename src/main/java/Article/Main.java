package Article;


public class Main {
    public static void main(String[] args) {

        Article article = new Article(6, "2024-12-12 12:12:12");
        System.out.println(article.id);

        Article article2 = new Article(1, "2024-12-12 12:12:12");
        System.out.println(article2.id);

    }
}

class Article {
    static int lastId;

    int id;
    String regDate;

    static {
        lastId = 0;
    }

    Article() {
        this(lastId + 1, "2024-12-12 12:12:12");
        lastId++;
    }

    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }
}
