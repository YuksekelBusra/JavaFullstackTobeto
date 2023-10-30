package org.example;


import org.example.business.CarManager;
import org.example.core.DatabaseLogger;
import org.example.core.FileLogger;
import org.example.core.Logger;
import org.example.core.MailLogger;
import org.example.dataAccess.HibernateProductDao;
import org.example.dataAccess.JdbcProductDao;
import org.example.entities.Car;



    public class Main {
        public static void main(String[] args) throws Exception{
            Car car1 = new Car(1,"Renault Symbol",2015,"Renault",300000,11,true);

            Logger[] loggers= {new DatabaseLogger(),new FileLogger()};

            CarManager carManager = new CarManager(new HibernateProductDao(),loggers);

            carManager.add(car1);
            carManager.update(car1);

            System.out.println("Model : " + car1.getCarModelName());
        }
    }
