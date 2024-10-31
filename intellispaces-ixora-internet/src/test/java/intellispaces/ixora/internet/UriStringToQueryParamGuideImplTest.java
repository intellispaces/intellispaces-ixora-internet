package intellispaces.ixora.internet;

import intellispaces.jaquarius.annotation.Preprocessing;
import intellispaces.jaquarius.system.Modules;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link UriStringToQueryParamGuideImpl}.
 */
@Preprocessing(UriStringToQueryParamGuideImpl.class)
public class UriStringToQueryParamGuideImplTest extends AbstractUrlToQueryParamValuesGuideTest {

  @Override
  UriStringToQueryParamGuide getGuide() {
    return new UriStringToQueryParamGuideImpl();
  }

  @BeforeEach
  public void init() {
    Modules.get(UriStringToQueryParamGuideImpl.class).start();
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
