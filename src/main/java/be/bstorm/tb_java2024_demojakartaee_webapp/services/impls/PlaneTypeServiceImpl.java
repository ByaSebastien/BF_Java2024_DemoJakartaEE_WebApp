package be.bstorm.tb_java2024_demojakartaee_webapp.services.impls;

import be.bstorm.tb_java2024_demojakartaee_webapp.entities.PlaneType;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.PlaneTypeRepository;
import be.bstorm.tb_java2024_demojakartaee_webapp.services.PlaneTypeService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PlaneTypeServiceImpl implements PlaneTypeService, Serializable {

    @Inject
    private PlaneTypeRepository planeTypeRepository;

    @Override
    public List<PlaneType> getAll() {
        return planeTypeRepository.findAll();
    }
}
