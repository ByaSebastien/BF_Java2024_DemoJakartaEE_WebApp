package be.bstorm.tb_java2024_demojakartaee_webapp.services.impls;

import be.bstorm.tb_java2024_demojakartaee_webapp.entities.Plane;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.PlaneRepository;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.impls.PlaneRepositoryImpl;
import be.bstorm.tb_java2024_demojakartaee_webapp.services.PlaneService;
import jakarta.inject.Inject;

import java.util.List;

public class PlaneServiceImpl implements PlaneService {

    @Inject
    private PlaneRepository planeRepository;

    @Override
    public List<Plane> getAll() {
        return planeRepository.findAll();
    }
}
