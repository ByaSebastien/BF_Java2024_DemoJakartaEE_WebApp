package be.bstorm.tb_java2024_demojakartaee_webapp.repositories.impls;

import be.bstorm.tb_java2024_demojakartaee_webapp.entities.PlaneType;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.PlaneTypeRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class PlaneTypeRepositoryImpl extends BaseRepositoryImpl<PlaneType, Long> implements PlaneTypeRepository, Serializable {

    public PlaneTypeRepositoryImpl() {
        super(PlaneType.class);
    }
}
