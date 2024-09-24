package be.bstorm.tb_java2024_demojakartaee_webapp.models.dtos.plane;

import be.bstorm.tb_java2024_demojakartaee_webapp.entities.Plane;

import java.util.Objects;

public class PlaneDTO {

    private String plateNumber;
    private String typeName;

    public PlaneDTO(String plateNumber, String typeName) {
        this.plateNumber = plateNumber;
        this.typeName = typeName;
    }

    public static PlaneDTO fromEntiy(Plane plane) {
        return new PlaneDTO(plane.getPlateNumber(), plane.getPlaneType().getName());
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return "PlaneDTO{" +
                "planeNumber='" + plateNumber + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaneDTO planeDTO = (PlaneDTO) o;
        return Objects.equals(plateNumber, planeDTO.plateNumber) && Objects.equals(typeName, planeDTO.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber, typeName);
    }
}
