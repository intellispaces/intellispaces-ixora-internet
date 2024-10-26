package intellispaces.ixora.internet;

import intellispaces.framework.core.IntellispacesFramework;
import intellispaces.framework.core.annotation.Preprocessing;
import intellispaces.framework.core.system.Modules;
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
    IntellispacesFramework.loadModule(UrlToQueryParamValuesGuideImpl.class);
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
