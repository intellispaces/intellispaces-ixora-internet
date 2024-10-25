package intellispaces.ixora.internet;

import intellispaces.framework.core.annotation.Channel;
import intellispaces.framework.core.annotation.Ontology;

@Ontology
public interface UriOntology {

  @Channel("3fe84a44-7f40-4df9-95d1-f1d857c1a5b8")
  String joinUrl(String baseUrl, String endpoint);
}
