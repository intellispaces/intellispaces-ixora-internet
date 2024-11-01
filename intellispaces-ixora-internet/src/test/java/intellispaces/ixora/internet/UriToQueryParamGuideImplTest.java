package intellispaces.ixora.internet;

import intellispaces.jaquarius.annotation.Preprocessing;
import intellispaces.jaquarius.system.Modules;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link UriToQueryParamGuideImpl}.
 */
@Preprocessing(UriToQueryParamGuideImpl.class)
public class UriToQueryParamGuideImplTest extends AbstractUrlToQueryParamGuideTest {

  @Override
  UriToQueryParamGuide getGuide() {
    return new UriToQueryParamGuideImpl();
  }

  @Override
  Uri getUri(String string) {
    return Uris.get(string);
  }

  @BeforeEach
  public void init() {
    Modules.get(UriToQueryParamGuideImpl.class).start();
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
