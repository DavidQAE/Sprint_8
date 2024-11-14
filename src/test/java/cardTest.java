import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class cardTest {
    private String name;


    public cardTest(String name) {
        this.name = name;

    }

    @Parameterized.Parameters
    public static Object[] getSumData() {
        return new Object[][]{
                {"Тимофей  Луговой"},
                {" Тимофей Луговой "},
                {"Тимофей Луговооооооооооой"},
                {"ТимофейЛуговой"},
                {"Влад Кузнецов"},// передали тестовые данные
        };

    }
    @DisplayName("Test all card validation with parametrized test")
    @Test
    public void testName() {
        Account account = new Account(name);
        assertTrue(account.checkNameToEmboss());

    }

}