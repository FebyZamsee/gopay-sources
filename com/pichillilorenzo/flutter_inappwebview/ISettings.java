package com.pichillilorenzo.flutter_inappwebview;

import java.util.Map;

public interface ISettings<T> {
    Map<String, Object> getRealSettings(T t);

    ISettings<T> parse(Map<String, Object> map);

    Map<String, Object> toMap();
}
