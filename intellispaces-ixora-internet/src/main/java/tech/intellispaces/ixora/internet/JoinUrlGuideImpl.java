package tech.intellispaces.ixora.internet;

import tech.intellispaces.jaquarius.annotation.Guide;
import tech.intellispaces.jaquarius.annotation.Mapper;

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
