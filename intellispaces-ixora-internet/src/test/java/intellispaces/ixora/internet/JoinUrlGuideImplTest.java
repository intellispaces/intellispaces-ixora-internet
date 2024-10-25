package intellispaces.ixora.internet;

import intellispaces.framework.core.IntellispacesFramework;
import intellispaces.framework.core.annotation.Preprocessing;
import intellispaces.framework.core.system.Modules;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link JoinUrlGuideImpl}.
 */
@Preprocessing(JoinUrlGuideImpl.class)
public class JoinUrlGuideImplTest extends AbstractJoinUrlGuideTest {

  @BeforeEach
  public void init() {
    IntellispacesFramework.loadModule(JoinUrlGuideImpl.class);
  }

  @AfterEach
  public void deinit() {
    Modules.current().stop();
  }

  @Override
  JoinUrlGuide getGuide() {
    return new JoinUrlGuideImpl();
  }

  @Test
  public void testJoinUrl() {
    super.testJoinUrl();
  }
}
