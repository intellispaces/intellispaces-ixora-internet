package intellispaces.ixora.internet;

import java.net.URI;

public interface Uris {

  static Uri get(String string) {
    return new UriHandleImpl(URI.create(string));
  }
}
