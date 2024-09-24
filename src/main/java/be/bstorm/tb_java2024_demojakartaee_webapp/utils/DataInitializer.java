package be.bstorm.tb_java2024_demojakartaee_webapp.utils;

import be.bstorm.tb_java2024_demojakartaee_webapp.entities.Owner;
import be.bstorm.tb_java2024_demojakartaee_webapp.entities.Plane;
import be.bstorm.tb_java2024_demojakartaee_webapp.entities.PlaneType;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.PlaneRepository;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.PlaneTypeRepository;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.impls.PlaneRepositoryImpl;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.impls.PlaneTypeRepositoryImpl;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DataInitializer implements ServletContextListener {

    private final PlaneRepository planeRepository;
    private final PlaneTypeRepository planeTypeRepository;

    public DataInitializer() {
        this.planeRepository = new PlaneRepositoryImpl();
        this.planeTypeRepository = new PlaneTypeRepositoryImpl();
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        PlaneType planeType1 = new PlaneType(
                "OOCNA",
                "Boeing",
                1000,
                5
        );
        PlaneType planeType2 = new PlaneType(
                "PTG",
                "Boeing",
                500,
                2
        );
        PlaneType planeType3 = new PlaneType(
                "trolilol",
                "Boeing",
                15000,
                200
        );

        Plane plane1 = new Plane(
                "123456",
                25,
                null,
                planeType1
        );Plane plane2 = new Plane(
                "654321",
                60,
                null,
                planeType2
        );Plane plane3 = new Plane(
                "456789",
                5,
                null,
                planeType3
        );

        planeRepository.save(plane1);
        planeRepository.save(plane2);
        planeRepository.save(plane3);

    }
}
