
// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст
class Person {
    private String Name;
    private String Position;
    private String Email;
    private String TelNumber;
    private double Salary;
    private int Age;

    // Конструктор класса должен заполнять эти поля при создании объекта
    Person(String Name , String Position, String Email, String TelNumber, double Salary, int Age) {
        this.Name = Name;
        this.Position = Position;
        this.Email = Email;
        this.TelNumber = TelNumber;
        this.Salary = Salary;
        this.Age = Age;
    }
    int GetAge() {
        return Age;
    }
    // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль
    void Show() {
                System.out.println(Name + " | " + Position + " | " +  Email + " | " + TelNumber + " | " + Salary + " | " + Age + " |");
    }
}

public class Task1 {

    public static void main(String[] args) {

        // Создать массив из 5 сотрудников
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov V.A.", "Operator", "ivanov@gmail.com", "1239654", 35000, 30);
        persArray[1] = new Person("Petrov K.L.", "Engineer", "petrov@gmail.com", "1234459", 40000, 35);
        persArray[2] = new Person("Sidorov G.N.", "Driver", "sidorov@gmail.com", "1235798", 45000, 41);
        persArray[3] = new Person("Dubinin V.P.", "Manager", "dubinin@gmail.com", "1236657", 50000, 45);
        persArray[4] = new Person("Izotov E.T.", "Trader", "izotov@gmail.com", "1233214", 53000, 47);

        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет
        System.out.println("Name" + "        | " + "Position" + "    | " +  "Email" + "       | " + "TelNumber" + "  | " + "Salary" + "   | " + "Age" + " |");
        for(Person item : persArray) {
            if(item.GetAge() > 40) item.Show();

        }
    }
}


