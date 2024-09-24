package be.bstorm.tb_java2024_demojakartaee_webapp.servlets.plane;

import be.bstorm.tb_java2024_demojakartaee_webapp.entities.Plane;
import be.bstorm.tb_java2024_demojakartaee_webapp.models.dtos.plane.PlaneDTO;
import be.bstorm.tb_java2024_demojakartaee_webapp.services.PlaneService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/plane")
public class PlaneIndexServlet extends HttpServlet {

    @Inject
    private PlaneService planeService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<PlaneDTO> planes = planeService.getAll().stream()
                .map(PlaneDTO::fromEntiy)
                .collect(Collectors.toList());
        req.setAttribute("planes", planes);
        req.getRequestDispatcher("/WEB-INF/pages/plane/planeIndex.jsp").forward(req, resp);
    }
}
