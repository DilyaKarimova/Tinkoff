import org.junit.jupiter.api.Test;
import ru.itpark.СashbackService;

import static org.junit.jupiter.api.Assertions.assertEquals;


class СashbackServiceTest {

    @Test
    void calculateCashback() {
        {
            СashbackService cashbackService = new СashbackService();
            int cashback = cashbackService.calculateCashback
                    (2000, 0, 0);
            assertEquals(20, cashback);
        }

        {
            СashbackService cashbackService = new СashbackService();
            int cashback = cashbackService.calculateCashback
                    (0, 5000, 0);
            assertEquals(250, cashback);
        }

        {
            СashbackService cashbackService = new СashbackService();
            int cashback = cashbackService.calculateCashback
                    (0, 0, 8_000);
            assertEquals(2_400, cashback);
        }
        {
            СashbackService cashbackService = new СashbackService();
            int cashback = cashbackService.calculateCashback
                    (0, 0, 1_300_000);
            assertEquals(3_000, cashback);
        }

    }
}