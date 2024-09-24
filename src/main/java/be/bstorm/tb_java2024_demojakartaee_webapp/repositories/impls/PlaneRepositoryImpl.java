package be.bstorm.tb_java2024_demojakartaee_webapp.repositories.impls;

import be.bstorm.tb_java2024_demojakartaee_webapp.entities.Plane;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.PlaneRepository;
import jakarta.enterprise.context.SessionScoped;
import jakarta.persistence.EntityManager;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PlaneRepositoryImpl extends BaseRepositoryImpl<Plane, Long> implements PlaneRepository, Serializable {

    public PlaneRepositoryImpl() {
        super(Plane.class);
    }

    @Override
    public List<Plane> findAll() {
        try (EntityManager em = emf.createEntityManager()) {
            return em.createQuery("SELECT p FROM Plane p join p.planeType", Plane.class)
                    .getResultList();
        }
    }
}
