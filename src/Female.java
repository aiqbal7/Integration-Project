public class Female extends Person{

    public Female(String name, int age){
        super(name, age);
    }

    public String getName() {
        return super.getName()+" female";
    }

}