package intellispaces.ixora.internet;

/**
 * Abstract test for {@link JoinUrlGuide} implementations.
 */
public abstract class AbstractJoinUrlGuideTest {

  abstract JoinUrlGuide getGuide();

  public void testJoinUrl() {
    JoinUrlGuide guide = getGuide();

    assertThat(guide.joinUrl(null, null)).isNull();
    assertThat(guide.joinUrl("http://localhost", null)).isEqualTo("http://localhost");
    assertThat(guide.joinUrl(null, "test")).isEqualTo("test");

    assertThat(guide.joinUrl("http://localhost", "test")).isEqualTo("http://localhost/test");
    assertThat(guide.joinUrl("http://localhost", "/test")).isEqualTo("http://localhost/test");
  }
}
