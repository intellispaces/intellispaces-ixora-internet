package intellispaces.ixora.internet;

import intellispaces.jaquarius.annotation.Channel;
import intellispaces.jaquarius.annotation.Ontology;
import intellispaces.ixora.data.collection.ListDomain;

@Ontology
public interface UriOntology {

  @Channel("3fe84a44-7f40-4df9-95d1-f1d857c1a5b8")
  String joinUrl(String baseUrl, String endpoint);

  @Channel("f613bc2a-3a2a-4a8a-b184-80480aa819d5")
  ListDomain<String> uriStringToQueryParam(String uri, String paramName);

  @Channel("9bf5861b-1af9-4f83-a39f-5c44d9e451d0")
  ListDomain<String> splitUriPath(String path);
}
