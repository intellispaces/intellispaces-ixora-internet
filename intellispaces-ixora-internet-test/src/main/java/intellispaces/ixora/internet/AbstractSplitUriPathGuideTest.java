package intellispaces.ixora.internet;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractSplitUriPathGuideTest {

  abstract SplitUriPathGuide getGuide();

  public void testSplitUriPath() {
    SplitUriPathGuide guide = getGuide();

    assertThat(guide.splitUriPath(null)).isNull();
    assertThat(guide.splitUriPath("").nativeList()).containsExactly("");
    assertThat(guide.splitUriPath("/").nativeList()).containsExactly("");
    assertThat(guide.splitUriPath("/b").nativeList()).containsExactly("b");
    assertThat(guide.splitUriPath("/a/b").nativeList()).containsExactly("a", "b");
    assertThat(guide.splitUriPath("/a/b/").nativeList()).containsExactly("a", "b");
    assertThat(guide.splitUriPath("/a//b/").nativeList()).containsExactly("a", "", "b");


  }
}
