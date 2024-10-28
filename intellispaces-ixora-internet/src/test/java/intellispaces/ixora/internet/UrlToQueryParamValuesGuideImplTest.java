package intellispaces.ixora.internet;

import intellispaces.jaquarius.annotation.Preprocessing;
import intellispaces.jaquarius.system.Modules;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link UrlToQueryParamValuesGuideImpl}.
 */
@Preprocessing(UrlToQueryParamValuesGuideImpl.class)
public class UrlToQueryParamValuesGuideImplTest extends AbstractUrlToQueryParamValuesGuideTest {

  @Override
  UrlToQueryParamValuesGuide getGuide() {
    return new UrlToQueryParamValuesGuideImpl();
  }

  @BeforeEach
  public void init() {
    Modules.get(UrlToQueryParamValuesGuideImpl.class).start();
  }

  @AfterEach
  public void deinit() {
    Modules.current().stop();
  }

  @Test
  public void testUrlToQueryParamValues() {
    super.testUrlToQueryParamValues();
  }
}
