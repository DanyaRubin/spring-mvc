package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarService;
import web.services.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, HttpServletRequest request) {
        String count = request.getParameter("count");
        if (count == null){
            count = "5";
        }
        int carCount = Integer.parseInt(count);
        CarService carService = new CarServiceImp();
        List<Car> messages = carService.getCar(carCount);
        model.addAttribute("messages", messages);
        return "cars";
    }

}

//    @GetMapping(value = "/cars")
//    public String printCars(ModelMap model, @RequestParam(value = "count",required = false) int carCount) {
//        CarService carService = new CarServiceImp();
//        List<Car> messages = carService.getCar(carCount);
//        model.addAttribute("messages", messages);
//        return "cars";
//    }