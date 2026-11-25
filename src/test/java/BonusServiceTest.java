
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // Подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // Сравниваем ожидаемый и фактический результат:
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // Подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // Сравниваем ожидаемый и фактический результат:
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // Подготавливаем данные:
        long amount = 100;
        boolean registered = false;
        long expected = 1;

        // Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // Сравниваем результаты:
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        // Подготавливаем данные:
        long amount = 100_000;
        boolean registered = false;
        long expected = 500;

        // Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // Сравниваем результаты:
        Assertions.assertEquals(expected, actual);
    }
}
