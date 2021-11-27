package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.userService;

import java.util.List;

@Controller
public class CarController {

    @GetMapping (value = "/cars")
    public String carTable(@RequestParam(value = "count", required = false,
                            defaultValue = "5") int count, ModelMap model) {
        userService service = new userService();
        List<Car> cars = service.getCarList(count);

        model.addAttribute("carTable", cars);
        return "cars";

    }
}
