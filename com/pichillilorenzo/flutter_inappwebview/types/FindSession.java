package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.HashMap;
import java.util.Map;

public class FindSession {
    private int highlightedResultIndex;
    private int resultCount;
    private int searchResultDisplayStyle = 2;

    public FindSession(int i, int i2) {
        this.resultCount = i;
        this.highlightedResultIndex = i2;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("resultCount", Integer.valueOf(this.resultCount));
        hashMap.put("highlightedResultIndex", Integer.valueOf(this.highlightedResultIndex));
        hashMap.put("searchResultDisplayStyle", Integer.valueOf(this.searchResultDisplayStyle));
        return hashMap;
    }

    public int getResultCount() {
        return this.resultCount;
    }

    public void setResultCount(int i) {
        this.resultCount = i;
    }

    public int getHighlightedResultIndex() {
        return this.highlightedResultIndex;
    }

    public void setHighlightedResultIndex(int i) {
        this.highlightedResultIndex = i;
    }

    public int getSearchResultDisplayStyle() {
        return this.searchResultDisplayStyle;
    }

    public void setSearchResultDisplayStyle(int i) {
        this.searchResultDisplayStyle = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FindSession findSession = (FindSession) obj;
        if (this.resultCount == findSession.resultCount && this.highlightedResultIndex == findSession.highlightedResultIndex && this.searchResultDisplayStyle == findSession.searchResultDisplayStyle) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.resultCount * 31) + this.highlightedResultIndex) * 31) + this.searchResultDisplayStyle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FindSession{resultCount=");
        sb.append(this.resultCount);
        sb.append(", highlightedResultIndex=");
        sb.append(this.highlightedResultIndex);
        sb.append(", searchResultDisplayStyle=");
        sb.append(this.searchResultDisplayStyle);
        sb.append('}');
        return sb.toString();
    }
}
