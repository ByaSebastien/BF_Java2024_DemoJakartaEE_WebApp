package be.bstorm.tb_java2024_demojakartaee_webapp.utils;

import be.bstorm.tb_java2024_demojakartaee_webapp.entities.Owner;
import be.bstorm.tb_java2024_demojakartaee_webapp.entities.Plane;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.PlaneRepository;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.impls.PlaneRepositoryImpl;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DataInitializer implements ServletContextListener {

    private final PlaneRepository planeRepository;

    public DataInitializer() {
        this.planeRepository = new PlaneRepositoryImpl();
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        Plane plane1 = new Plane(
                "123",
                5
                );
        Plane plane2 = new Plane(
                "456",
                5
        );
        Plane plane3 = new Plane(
                "789",
                5
        );

        planeRepository.save(plane1);
        planeRepository.save(plane2);
        planeRepository.save(plane3);
    }
}
