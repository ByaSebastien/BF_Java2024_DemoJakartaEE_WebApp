package be.bstorm.tb_java2024_demojakartaee_webapp.utils;

import be.bstorm.tb_java2024_demojakartaee_webapp.entities.*;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.PlaneRepository;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.PlaneTypeRepository;
import be.bstorm.tb_java2024_demojakartaee_webapp.repositories.impls.BaseRepositoryImpl;
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
        );
        Plane plane2 = new Plane(
                "654321",
                60,
                null,
                planeType2
        );
        Plane plane3 = new Plane(
                "456789",
                5,
                null,
                planeType3
        );

        plane1 = planeRepository.save(plane1);
        plane2 = planeRepository.save(plane2);
        plane3 = planeRepository.save(plane3);

        BaseRepositoryImpl<Pilot, Long> pilotRepository = new BaseRepositoryImpl<>(Pilot.class);
        BaseRepositoryImpl<PilotPlaneType, PilotPlaneType.PilotPlaneTypeId> pilotPlaneTypeRepository = new BaseRepositoryImpl<>(PilotPlaneType.class);

        Pilot pilot1 = pilotRepository.save(new Pilot(
                "test",
                "test",
                "123",
                new Address("test", "test", "test"),
                "123"
        ));

        PilotPlaneType ppt = pilotPlaneTypeRepository.save(new PilotPlaneType(
                0,
                pilot1,
                plane1.getPlaneType()
        ));

        PilotPlaneType pptResult = pilotPlaneTypeRepository.findById(
                new PilotPlaneType.PilotPlaneTypeId(
                        pilot1.getId(),
                        plane1.getPlaneType().getId())
        ).orElse(null);

        System.out.println(pptResult);
    }
}
