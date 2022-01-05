package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;

@Service
public interface CarService {
    public List<Car> getCar(Integer carCount);
}
