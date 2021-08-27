package ua.com.alevel.db;

import ua.com.alevel.entity.Employer;

import java.util.Arrays;
import java.util.Random;

public class EmployerDB {

    private Employer[] employers = new Employer[10];
    private int size = 0;

    public void create(Employer newEmp) {
        newEmp.setId(generateId());
        if (size == employers.length) {
            employers = Arrays.copyOf(employers, employers.length + 10);
        }
        for (int i = 0; i < employers.length; i++) {
            if (employers[i] == null) {
                employers[i] = newEmp;
                size++;
                break;
            }
        }
    }

    public void update(Employer updatedEmp) {
        for (int i = 0; i < size; i++) {
            if ((employers[i].getId() != null) && (employers[i].getId().equals(updatedEmp.getId()))) {
                employers[i].setName(updatedEmp.getName());
                employers[i].setAge(updatedEmp.getAge());
                break;
            }
        }
    }

    public void delete(String empId) {
        for (int i = 0; i < size; i++) {
            if (((employers[i].getId() != null)) && (employers[i].getId().equals(empId))) {
                employers[i] = null;
                for (int j = i + 1; j < employers.length; j++) {
                    employers[j - 1] = employers[j];
                    employers[j] = null;
                }
                break;
            }
        }
    }

    public Employer findEmployerById(String id) {
        Employer employer = Arrays.stream(employers).filter(emp -> emp.getId().equals(id)).findFirst().get();
        return employer;
    }

    public Employer[] findAll() {
        return employers;
    }

    private String generateId() {
        String string = "0123456789";
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            int number = random.nextInt(10);
            stringBuffer.append(string.charAt(number));
        }
        String employerId = stringBuffer.toString();

        for (int i = 0; i < size; i++) {
            if ((employers[i].getId() != null) && (employers[i].getId().equals(employerId))) {
                return generateId();
            }
        }
        return employerId;
    }
}
