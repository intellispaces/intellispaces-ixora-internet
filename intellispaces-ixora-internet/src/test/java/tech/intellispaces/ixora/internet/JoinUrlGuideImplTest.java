package tech.intellispaces.ixora.internet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.intellispaces.jaquarius.annotation.Preprocessing;
import tech.intellispaces.jaquarius.system.Modules;

/**
 * Tests for {@link JoinUrlGuideImpl}.
 */
@Preprocessing(JoinUrlGuideImpl.class)
public class JoinUrlGuideImplTest extends AbstractJoinUrlGuideTest {

  @Override
  JoinUrlGuide getGuide() {
    return new JoinUrlGuideImpl();
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
  public void testJoinUrl() {
    super.testJoinUrl();
  }
}
