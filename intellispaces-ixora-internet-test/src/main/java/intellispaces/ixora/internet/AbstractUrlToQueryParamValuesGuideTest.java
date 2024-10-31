package intellispaces.ixora.internet;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link UriStringToQueryParamGuide} implementations.
 */
public abstract class AbstractUrlToQueryParamValuesGuideTest {

  abstract UriStringToQueryParamGuide getGuide();

  public void testUrlToQueryParamValues() {
    UriStringToQueryParamGuide guide = getGuide();

    assertThat(guide.uriStringToQueryParam(null, null)).isNull();
    assertThat(guide.uriStringToQueryParam("http://localhost:8080/test?param1=value1", null)).isNull();
    assertThat(guide.uriStringToQueryParam(null, "param1")).isNull();

    assertThat(guide.uriStringToQueryParam("http://localhost:8080/test?param2=value2", "param1").nativeList()).isEmpty();
    assertThat(guide.uriStringToQueryParam("http://localhost:8080/test?param1=value1", "param1").nativeList())
        .contains("value1");
    assertThat(guide.uriStringToQueryParam("http://localhost:8080/test?param1=value1&param2=value2", "param1").nativeList())
        .contains("value1");
    assertThat(guide.uriStringToQueryParam("http://localhost:8080/test?param1=value1&param1=value2", "param1").nativeList())
        .contains("value1", "value2");

    assertThat(guide.uriStringToQueryParam("/test?param2=value2", "param1").nativeList()).isEmpty();
    assertThat(guide.uriStringToQueryParam("/test?param1=value1", "param1").nativeList())
        .contains("value1");
    assertThat(guide.uriStringToQueryParam("/test?param1=value1&param2=value2", "param1").nativeList())
        .contains("value1");
    assertThat(guide.uriStringToQueryParam("/test?param1=value1&param1=value2", "param1").nativeList())
        .contains("value1", "value2");

  }
}
