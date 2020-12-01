package animal;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString(){

        return "name: " + this.name + ", age: " + this.age + ", tale: " + this.tail;
    }
    @Override
    public boolean equals(Object o){
        if(o != null&& o.getClass()== this.getClass()){
            Animal oAnimal = (Animal) o;
            boolean compareName = oAnimal.name.equals(this.name);
            boolean compareAge = oAnimal.age == this.age;
            boolean compareTale = oAnimal.tail == this.tail;
            return compareAge&&compareName&&compareTale;
        }
        return false;
    }


    @Override
    public int hashCode(){
        int result = 37;
        result = 37 * result + ((name != null) ? name.hashCode() : 0);
        result = 37 * result + age;
        result = 37 * result + (tail ? 1 : 0);
        return result;
    }
}
