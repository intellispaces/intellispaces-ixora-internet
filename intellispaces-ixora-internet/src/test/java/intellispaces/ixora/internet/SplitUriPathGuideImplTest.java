package intellispaces.ixora.internet;

import intellispaces.jaquarius.annotation.Preprocessing;
import intellispaces.jaquarius.system.Modules;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    Modules.get(JoinUrlGuideImpl.class).start();
  }

  @AfterEach
  public void deinit() {
    Modules.current().stop();
  }

  @Test
  @Override
  public void testSplitUriPath() {
    super.testSplitUriPath();
  }
}
