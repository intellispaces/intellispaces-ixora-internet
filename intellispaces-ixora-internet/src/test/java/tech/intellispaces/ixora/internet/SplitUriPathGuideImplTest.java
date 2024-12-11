package tech.intellispaces.ixora.internet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.intellispaces.jaquarius.annotation.Preprocessing;
import tech.intellispaces.jaquarius.system.Modules;

/**
 * Tests for {@link SplitUriPathGuideImpl} class.
 */
@Preprocessing(SplitUriPathGuideImpl.class)
public class SplitUriPathGuideImplTest extends AbstractSplitUriPathGuideTest {

  @Override
  SplitUriPathGuide getGuide() {
    return new SplitUriPathGuideImpl();
  }

  @BeforeEach
  public void init() {
    Modules.load(JoinUrlGuideImpl.class).start();
  }

  @AfterEach
  public void deinit() {
    Modules.unload();
  }

  @Test
  @Override
  public void testSplitUriPath() {
    super.testSplitUriPath();
  }
}
