package intellispaces.ixora.internet;

import intellispaces.common.base.text.TextFunctions;
import intellispaces.common.base.type.Pair;
import intellispaces.common.base.type.Pairs;
import intellispaces.jaquarius.annotation.Guide;
import intellispaces.jaquarius.annotation.Mapper;
import intellispaces.jaquarius.exception.TraverseException;
import intellispaces.ixora.data.collection.List;
import intellispaces.ixora.data.collection.Lists;

import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Guide
public class UrlToQueryParamValuesGuideImpl implements UrlToQueryParamValuesGuide {

  @Mapper
  @Override
  public List<String> urlToQueryParamValues(String url, String paramName) {
    if (url == null || paramName == null) {
      return null;
    }
    String query = getQuery(url);
    if (TextFunctions.isNullOrBlank(query)) {
      return null;
    }

    java.util.List<String> values = Arrays.stream(query.split("&"))
        .map(this::decode)
        .filter(p -> paramName.equals(p.value1()))
        .map(Pair::value2)
        .toList();
    return Lists.of(values, String.class);
  }

  private String getQuery(String url) {
    try {
      return new URI(url).getQuery();
    } catch (Exception e) {
      throw TraverseException.withCauseAndMessage(e, "Could not parse URL {0}", url);
    }
  }

  private Pair<String, String> decode(String pair) {
    int ind = pair.indexOf("=");
    String key = (ind > 0 ? pair.substring(0, ind) : pair);
    String value = (ind > 0 && pair.length() > ind + 1 ? pair.substring(ind + 1) : null);
    return Pairs.get(
        URLDecoder.decode(key, StandardCharsets.UTF_8),
        value != null ? URLDecoder.decode(value, StandardCharsets.UTF_8) : value
    );
  }
}
