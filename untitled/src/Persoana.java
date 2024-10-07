public class Persoana implements Om {
    public String nume;
    public Persoana(String nume){
        this.nume=nume;
    }
    public void saluta() {
        System.out.println("Salut, sunt " + nume + "!");
    }

    public void invata(){
        System.out.println(nume+ " invata!");
    }
}
