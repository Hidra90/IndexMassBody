package main;

import java.util.Scanner;

public class StartProgram {

    public static void main(String[] args) {
        Person person = EnterPerson("", 0.0, 0);
        double indexMassBody = formulaIndexMass(person.getHeight(), person.getWeight());
        System.out.println(person + " index mass body = " + indexMassBody);

    }

    static Person EnterPerson (String name, double height, int weight) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(name, height, weight);
        System.out.print("Input name : ");
        person.name = scanner.nextLine();
        System.out.print("Input height in meters : ");
        person.height = scanner.nextDouble();
        System.out.print("Input weight in kg : ");
        person.weight = scanner.nextInt();

        return person;
    }

    static double formulaIndexMass (double height, int weight) {
        return weight / (height * height);
    }
}
