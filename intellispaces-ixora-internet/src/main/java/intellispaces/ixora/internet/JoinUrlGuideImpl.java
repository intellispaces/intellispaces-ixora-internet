package intellispaces.ixora.internet;

import intellispaces.framework.core.annotation.Guide;
import intellispaces.framework.core.annotation.Mapper;

@Guide
public class JoinUrlGuideImpl implements JoinUrlGuide {

  @Mapper
  @Override
  public String joinUrl(String baseUrl, String endpoint) {
    if (baseUrl == null) {
      return endpoint;
    } else {
      if (endpoint == null) {
        return baseUrl;
      }
    }

    if (baseUrl.endsWith("/")) {
      if (endpoint.startsWith("/")) {
        return baseUrl + endpoint.substring(1);
      } else {
        return baseUrl + endpoint;
      }
    } else {
      if (endpoint.startsWith("/")) {
        return baseUrl + endpoint;
      } else {
        return baseUrl + "/" + endpoint;
      }
    }
  }
}
