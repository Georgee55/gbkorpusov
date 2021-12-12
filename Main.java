public class Main {
    public static void main (String[] arg) {
        Employee[] empArray = new Employee[5];
            empArray[0] = new Employee("Vadim", "Boss", "124125@masf.ru", "88005553535", 100, 13);
            empArray[1] = new Employee("Marat", "Boss", "asgag@masf.ru", "88005553535", 100, 40);
            empArray[2] = new Employee("Sanya", "Boss", "17rgjd@masf.ru", "894613064+2", 100, 41);
            empArray[3] = new Employee("Misha", "Boss", "3udxsa@masf.ru", "8942164164", 100, 39);
            empArray[4] = new Employee("Max", "Boss", "634dsa@masf.ru", "89051879521", 100, 25);

            for(int i = 0; i < empArray.length; i++){
            if (empArray[i].age >= 40){
                System.out.println(empArray[i].getInfo());
            }
        }
    }
}
