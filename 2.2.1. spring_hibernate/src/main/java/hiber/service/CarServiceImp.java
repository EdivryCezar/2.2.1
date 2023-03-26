package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CarServiceImp implements CarService {

    private CarDao carDao;
    @Transactional
    @Override
    public List<Car> listAllCars(){
        return carDao.listAllCars();
    }
}
