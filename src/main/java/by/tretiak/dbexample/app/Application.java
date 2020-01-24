package by.tretiak.dbexample.app;

import by.tretiak.dbexample.models.Car;
import by.tretiak.dbexample.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();

        Session session = null;
        session = sessionFactory.getCurrentSession();

        session.beginTransaction();
        /*
         * User user = new User("Ilia", "Tretiak");
         * Car car = new Car("BMW", user);
         * session.save(user);
         * session.save(car);
         */
        User user = session.get(User.class, 1);

        System.out.println(user.getCars());

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
