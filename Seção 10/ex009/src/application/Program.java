package application;

import entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employees> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println("\nEmployee #"+ (i+1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employees emp = new Employees(id,name,salary);
            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();

        Employees emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        for (Employees e : list){
            System.out.println(e);
        }
        sc.close();
    }
    public static Integer position(List<Employees> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
    public static boolean hasId(List<Employees> list, int id) {
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}