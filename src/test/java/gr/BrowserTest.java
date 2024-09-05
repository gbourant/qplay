package gr;


import com.microsoft.playwright.BrowserContext;
import io.quarkiverse.playwright.InjectPlaywright;
import io.quarkiverse.playwright.WithPlaywright;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
@WithPlaywright
public class BrowserTest {

    @InjectPlaywright
    BrowserContext context;

    @Test
    public void test(){
        assertNotNull(context);
    }


}
