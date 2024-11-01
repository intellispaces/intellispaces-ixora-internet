package intellispaces.ixora.internet;

import intellispaces.jaquarius.annotation.Channel;
import intellispaces.jaquarius.annotation.Domain;

@Domain("a6b707b6-21e8-4fee-9d0d-ac09469a8544")
public interface UriDomain {

  @Channel("47ba7add-d4d0-4091-9fcb-04d9858129a5")
  String path();

  @Channel("bb1f65a5-03dd-4b0b-9b0a-31e38ed83e67")
  String query();

  @Channel(value = "5dc5206c-4fa5-44b6-871e-23ce3efab4cf", name = "UriToStringChannel")
  String toString();
}
