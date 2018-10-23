package beer.tests;

import beer.compiler.BeerSemantic;
import org.junit.Test;

import java.io.IOException;

import static beer.compiler.SymbolType.PILSEN;
import static org.junit.Assert.assertEquals;

public class MainTest extends AbstractTest {
    @Test
    public void testBasicVariableDeclarationAndSum() throws IOException {
        String code = "taca-le pau \r\n" +
                "    pilsen a = 1; \r\n" +
                "    pilsen b = 1; \r\n" +
                "    pilsen c = a + b; \r\n" +
                "fecha conta";

        BeerSemantic semantic = this.walkAndGetBeerSemantic(code);

        assertEquals(PILSEN, semantic.lookup("a").type);
        assertEquals(PILSEN, semantic.lookup("b").type);
        assertEquals(PILSEN, semantic.lookup("c").type);
        // @todo test values
        // @todo test the generated source code
    }
}
