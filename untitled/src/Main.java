public class Main {
    public static void main(String[] args) {
        Persoana p = new Persoana("Andreea");
        p.saluta();
        p.invata();
        p = new Student("Ana");
        p.saluta();
        p.invata();
        p = new Student("Bianca");
        p.saluta();
        p.invata();
        p=new Masterand("Elena");
        p.saluta();
        p.invata();
        Om o = new Persoana("Dalia");
        //o.saluta();
        o.invata();
    }
}