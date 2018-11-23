import org.junit.jupiter.api.Test;
import ru.itpark.СashbackService;

class СashbackServiceTest {

    @Test
    void calculateCashback() {
        {
            СashbackService cashbackService = new СashbackService();
            int cashback = cashbackService.calculateCashback
                    (2000, 0, 0);
            System.out.println(cashback);
        }

        {
            СashbackService cashbackService = new СashbackService();
            int cashback = cashbackService.calculateCashback
                    (0, 5000, 0);
            System.out.println(cashback);
        }

        {
            СashbackService cashbackService = new СashbackService();
            int cashback = cashbackService.calculateCashback
                    (0, 0, 8_000);
            System.out.println(cashback);
        }
        {
            СashbackService cashbackService = new СashbackService();
            int cashback = cashbackService.calculateCashback
                    (0, 0, 1_300_000);
            System.out.println(cashback);
        }

    }
}