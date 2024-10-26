package intellispaces.ixora.internet;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link UrlToQueryParamValuesGuide} implementations.
 */
public abstract class AbstractUrlToQueryParamValuesGuideTest {

  abstract UrlToQueryParamValuesGuide getGuide();

  public void testUrlToQueryParamValues() {
    UrlToQueryParamValuesGuide guide = getGuide();

    assertThat(guide.urlToQueryParamValues(null, null)).isNull();
    assertThat(guide.urlToQueryParamValues("http://localhost:8080/test?param1=value1", null)).isNull();
    assertThat(guide.urlToQueryParamValues(null, "param1")).isNull();

    assertThat(guide.urlToQueryParamValues("http://localhost:8080/test?param2=value2", "param1").nativeList()).isEmpty();
    assertThat(guide.urlToQueryParamValues("http://localhost:8080/test?param1=value1", "param1").nativeList())
        .contains("value1");
    assertThat(guide.urlToQueryParamValues("http://localhost:8080/test?param1=value1&param2=value2", "param1").nativeList())
        .contains("value1");
    assertThat(guide.urlToQueryParamValues("http://localhost:8080/test?param1=value1&param1=value2", "param1").nativeList())
        .contains("value1", "value2");

    assertThat(guide.urlToQueryParamValues("/test?param2=value2", "param1").nativeList()).isEmpty();
    assertThat(guide.urlToQueryParamValues("/test?param1=value1", "param1").nativeList())
        .contains("value1");
    assertThat(guide.urlToQueryParamValues("/test?param1=value1&param2=value2", "param1").nativeList())
        .contains("value1");
    assertThat(guide.urlToQueryParamValues("/test?param1=value1&param1=value2", "param1").nativeList())
        .contains("value1", "value2");

  }
}
