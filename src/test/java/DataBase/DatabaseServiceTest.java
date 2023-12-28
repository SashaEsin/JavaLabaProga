package DataBase;

import org.example.DataBase.DatabaseService;
import org.junit.jupiter.api.Test;

public class DatabaseServiceTest {
    @Test
    public void test() {
        DatabaseService databaseService = new DatabaseService();
        databaseService.exec();
    }
}
