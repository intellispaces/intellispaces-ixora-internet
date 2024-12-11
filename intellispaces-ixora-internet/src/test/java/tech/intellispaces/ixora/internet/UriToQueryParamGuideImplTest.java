package tech.intellispaces.ixora.internet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.intellispaces.jaquarius.annotation.Preprocessing;
import tech.intellispaces.jaquarius.system.Modules;

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
    Modules.load(UriToQueryParamGuideImpl.class).start();
  }

  @AfterEach
  public void deinit() {
    Modules.unload();
  }

  @Test
  public void testUrlToQueryParamValues() {
    super.testUrlToQueryParamValues();
  }
}
