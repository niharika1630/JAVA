public class grade{
    public static void main(String[] args) {
        int marks=82;
        String grade=(marks>=90)?"A":
        (marks>=75)?"B":
        (marks>=50)?"c":"F";
        System.out.println("grade"+grade);
        
    }
}