public class Main {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = " Андрей";
        person1.age = 19;


        Person person2 = new Person();
        person2.name = " Александр";
        person2.age = 20;
        int year1 =  person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("первому человеку до пенсиии " + year1+" лет");
        System.out.println("второму человеку до пенсии " + year2+ " лет");
    }
}
class Person{
    String name;
    int age;
    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }
    void speak(){ // void это возвращает ничто
        for(int i = 0; i<3; i++) {
            System.out.println("Меня зовут" + name + ",мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("привет");
    }
}