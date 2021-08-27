package ua.com.alevel.services;

import ua.com.alevel.dao.EmployerDAO;
import ua.com.alevel.entity.Employer;

public class EmployerService {

    private EmployerDAO dao = new EmployerDAO();

    public void create(Employer employer) {
        dao.create(employer);
    }

    public void update(Employer employer) {
        dao.update(employer);
    }

    public void delete(String id) { dao.delete(id); }

    public Employer findById(String id) {
        return dao.findById(id);
    }

    public Employer[] findAll() {
        return dao.findAll();
    }
}
