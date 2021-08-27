package ua.com.alevel.controller;

import ua.com.alevel.entity.Employer;
import ua.com.alevel.services.EmployerService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployerController {

    private EmployerService employerService = new EmployerService();

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select option: ");
        String opt;
        try {
            navigation();
            while ((opt = reader.readLine()) != null) {
                crud(opt, reader);
                opt = reader.readLine();
                if (opt.equals("0")) {
                    System.exit(0);
                }
                crud(opt, reader);
            }
        } catch (IOException e) {
            System.out.println("error: = " + e.getMessage());
        }
    }

    private void navigation() {
        System.out.println("\n1 - create employer" +
                "\n2 - update employer" +
                "\n3 - delete employer" +
                "\n4 - find employer by ID" +
                "\n5 - find all employers" +
                "\n0 - Exit" +
                "\nYour option ->");
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1":
                create(reader);
                break;
            case "2":
                update(reader);
                break;
            case "3":
                delete(reader);
                break;
            case "4":
                findById(reader);
                break;
            case "5":
                findAll(reader);
                break;
        }
        navigation();
    }

    private void create(BufferedReader reader) {
        System.out.println("EmployerController.create");
        try {
            System.out.println("Please, enter employer name");
            String name = reader.readLine();
            System.out.println("Please, enter employer age");
            String ageString = reader.readLine();
            System.out.println("Please, enter employer position");
            String position = reader.readLine();
            int age = Integer.parseInt(ageString.trim());
            Employer employer = new Employer();
            employer.setAge(age);
            employer.setName(name);
            employer.setPosition(position);
            employerService.create(employer);
        } catch (IOException e) {
            System.out.println("error: = " + e.getMessage());
        }
    }

    private void update(BufferedReader reader) {
        System.out.println("EmployerController.update");
        try {
            System.out.println("Please, enter employer id");
            String id = reader.readLine();
            System.out.println("Please, enter the name");
            String name = reader.readLine();
            System.out.println("Please, enter the age");
            String ageString = reader.readLine();
            System.out.println("Please, enter the position");
            String position = reader.readLine();
            int age = Integer.parseInt(ageString.trim());
            Employer employer = new Employer();
            employer.setId(id);
            employer.setAge(age);
            employer.setName(name);
            employer.setPosition(position);
            employerService.update(employer);
        } catch (IOException e) {
            System.out.println("error: = " + e.getMessage());
        }
    }

    private void delete(BufferedReader reader) {
        System.out.println("Employer.delete");
        try {
            System.out.println("Please, enter employer id");
            String id = reader.readLine();
            employerService.delete(id);
        } catch (IOException e) {
            System.out.println("error: = " + e.getMessage());
        }
    }

    private void findById(BufferedReader reader) {
        System.out.println("EmployerController.findById");
        try {
            System.out.println("Please, enter employer id");
            String id = reader.readLine();
            Employer employer = employerService.findById(id);
            System.out.println("Employer = " + employer);
        } catch (IOException e) {
            System.out.println("error: = " + e.getMessage());
        }
    }

    private void findAll(BufferedReader reader) {
        System.out.println("EmployerController.findAll");
        Employer[] employers = employerService.findAll();

        for (Employer employer : employers) {
            if (employer == null) return;
            System.out.println(employer);
        }
    }
}
