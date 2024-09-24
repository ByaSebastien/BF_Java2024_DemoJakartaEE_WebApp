package be.bstorm.tb_java2024_demojakartaee_webapp.services.impls;

import be.bstorm.tb_java2024_demojakartaee_webapp.entities.Plane;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.PlaneRepository;
import be.bstorm.tb_java2024_demojakartaee_webapp.services.PlaneService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PlaneServiceImpl implements PlaneService, Serializable {

    @Inject
    private PlaneRepository planeRepository;

    public PlaneServiceImpl() {}

    @Override
    public List<Plane> getAll() {
        return planeRepository.findAll();
    }
}
