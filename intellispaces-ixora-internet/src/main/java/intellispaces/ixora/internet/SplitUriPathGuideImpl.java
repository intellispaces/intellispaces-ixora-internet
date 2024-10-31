package intellispaces.ixora.internet;

import intellispaces.ixora.data.collection.List;
import intellispaces.ixora.data.collection.Lists;
import intellispaces.jaquarius.annotation.Guide;
import intellispaces.jaquarius.annotation.Mapper;

import java.util.Arrays;

@Guide
public class SplitUriPathGuideImpl implements SplitUriPathGuide {
  private static final String SLASH = "/";

  @Mapper
  @Override
  public List<String> splitUriPath(String uriPath) {
    if (uriPath == null) {
      return null;
    }
    String path = uriPath.startsWith(SLASH) ? uriPath.substring(1) : uriPath;
    path = path.endsWith(SLASH) ? path.substring(0, path.length() - 1) : path;
    return Lists.of(Arrays.asList(path.split(SLASH)), String.class);
  }
}
