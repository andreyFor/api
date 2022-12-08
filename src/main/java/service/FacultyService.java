package service;


import entity.Faculty;
import org.springframework.stereotype.Service;
import repository.FacultyRepository;


import java.util.Collection;

@Service
public class FacultyService {
    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty getFaculty(Long id) {
        return facultyRepository.findById(id).orElse(null);
    }

    public Faculty updateFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> getAll() {
        return facultyRepository.findAll();
    }

    public Collection<Faculty> findFacultiesByName(String name) {
        return facultyRepository.findAllByNameIgnoreCase(name);
    }

    public Collection<Faculty> findFacultiesByColor(String color) {
        return facultyRepository.findAllByColorIgnoreCase(color);
    }
}