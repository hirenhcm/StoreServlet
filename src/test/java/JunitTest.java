import static org.junit.jupiter.api.Assertions.assertEquals;

import com.sample.GameService;
import com.sample.model.GameType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitTest {
    private GameService gameService;
    @BeforeEach                                         
    public void setUp() throws Exception {
        gameService = new GameService();
    }

    @Test
    void testPositive() {
        assertEquals(2, gameService.getAvailableBrands(GameType.FPS).size(), "Getting let size 2");
    }

    @Test
    void justAnExample() {
        assertEquals(1, gameService.getAvailableBrands(GameType.STRATAGY).size(), "Getting let size 2");
    }
}
