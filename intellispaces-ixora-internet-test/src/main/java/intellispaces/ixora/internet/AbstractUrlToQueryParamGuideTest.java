package intellispaces.ixora.internet;

/**
 * Tests for {@link UriToQueryParamGuide} implementations.
 */
public abstract class AbstractUrlToQueryParamGuideTest {

  abstract UriToQueryParamGuide getGuide();

  abstract Uri getUri(String string);

  public void testUrlToQueryParamValues() {
    UriToQueryParamGuide guide = getGuide();

    assertThat(guide.uriToQueryParam(null, null)).isNull();
    assertThat(guide.uriToQueryParam(getUri("http://localhost:8080/test?param1=value1"), null)).isNull();
    assertThat(guide.uriToQueryParam(null, "param1")).isNull();

    assertThat(guide.uriToQueryParam(getUri("http://localhost:8080/test?param2=value2"), "param1").nativeList()).isEmpty();
    assertThat(guide.uriToQueryParam(getUri("http://localhost:8080/test?param1=value1"), "param1").nativeList())
        .contains("value1");
    assertThat(guide.uriToQueryParam(getUri("http://localhost:8080/test?param1=value1&param2=value2"), "param1").nativeList())
        .contains("value1");
    assertThat(guide.uriToQueryParam(getUri("http://localhost:8080/test?param1=value1&param1=value2"), "param1").nativeList())
        .contains("value1", "value2");

    assertThat(guide.uriToQueryParam(getUri("/test?param2=value2"), "param1").nativeList()).isEmpty();
    assertThat(guide.uriToQueryParam(getUri("/test?param1=value1"), "param1").nativeList())
        .contains("value1");
    assertThat(guide.uriToQueryParam(getUri("/test?param1=value1&param2=value2"), "param1").nativeList())
        .contains("value1");
    assertThat(guide.uriToQueryParam(getUri("/test?param1=value1&param1=value2"), "param1").nativeList())
        .contains("value1", "value2");
  }
}
