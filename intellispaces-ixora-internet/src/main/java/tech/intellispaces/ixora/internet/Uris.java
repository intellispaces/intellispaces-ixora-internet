package tech.intellispaces.ixora.internet;

import java.net.URI;

public interface Uris {

  static UriHandle get(String string) {
    return new JavaUriHandleImpl(URI.create(string));
  }
}
