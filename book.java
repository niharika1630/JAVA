public class book {
    String title;
    String author;
    double price;

    public static void main(String[] args) {
        this.title=title;
        this.author=author;
        this.price=price;



    }
    void showDetails(){
        System.out.println("title:"+title);
        System.out.println("author:"+author);
        System.out.println("price:"+price);
        System.out.println(".....................");

    }
    void showDetails(String title){
        System.out.println("book title:"+title);
        System.out.println("......................");
        
    }
    
}
