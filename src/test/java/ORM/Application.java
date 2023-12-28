package ORM;

import org.example.ORM.hibernate.HibernateSessionService;

public class Application {
    public static void main(String[] args) {
        HibernateSessionService service = new HibernateSessionService();
        service.exec();
    }
}
