package be.bstorm.tb_java2024_demojakartaee_webapp.repositories.impls;

import be.bstorm.tb_java2024_demojakartaee_webapp.entities.Plane;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.PlaneRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class PlaneRepositoryImpl extends BaseRepositoryImpl<Plane,Long> implements PlaneRepository, Serializable {

    public PlaneRepositoryImpl() {
        super(Plane.class);
    }
}
