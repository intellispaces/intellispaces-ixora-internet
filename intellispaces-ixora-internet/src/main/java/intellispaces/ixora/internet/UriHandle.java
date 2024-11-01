package intellispaces.ixora.internet;

import intellispaces.jaquarius.annotation.Mapper;
import intellispaces.jaquarius.annotation.ObjectHandle;

import java.net.URI;

@ObjectHandle(UriDomain.class)
public abstract class UriHandle implements UnmovableUri {
  private final URI uri;

  public UriHandle(URI uri) {
    this.uri = uri;
  }

  @Mapper
  @Override
  public String path() {
    return uri.getPath();
  }

  @Mapper
  @Override
  public String query() {
    return uri.getQuery();
  }

  @Mapper
  @Override
  public String toString() {
    return uri.toString();
  }
}
