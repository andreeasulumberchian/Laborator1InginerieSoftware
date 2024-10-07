public class Student extends Persoana {
    public Student(String nume){
        super(nume);
    }
    @Override
    public void saluta(){
        System.out.println("Hei, sunt " + nume + "!");
    }
}
