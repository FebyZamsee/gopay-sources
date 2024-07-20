package com.pichillilorenzo.flutter_inappwebview.content_blocker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ContentBlockerTrigger {
    private List<String> ifDomain = new ArrayList();
    private List<String> ifTopUrl = new ArrayList();
    private List<String> loadType = new ArrayList();
    private List<ContentBlockerTriggerResourceType> resourceType = new ArrayList();
    private List<String> unlessDomain = new ArrayList();
    private List<String> unlessTopUrl = new ArrayList();
    private String urlFilter;
    private Boolean urlFilterIsCaseSensitive;
    private Pattern urlFilterPatternCompiled;

    public ContentBlockerTrigger(String str, Boolean bool, List<ContentBlockerTriggerResourceType> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
        boolean z = false;
        Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        this.urlFilterIsCaseSensitive = valueOf;
        this.urlFilter = str;
        this.urlFilterPatternCompiled = Pattern.compile(str, valueOf.booleanValue() ? 0 : 2);
        this.resourceType = list == null ? this.resourceType : list;
        list2 = list2 == null ? this.ifDomain : list2;
        this.ifDomain = list2;
        this.unlessDomain = list3 == null ? this.unlessDomain : list3;
        if (!(!list2.isEmpty() && !this.unlessDomain.isEmpty())) {
            list4 = list4 == null ? this.loadType : list4;
            this.loadType = list4;
            if (list4.size() <= 2) {
                list5 = list5 == null ? this.ifTopUrl : list5;
                this.ifTopUrl = list5;
                this.unlessTopUrl = list6 == null ? this.unlessTopUrl : list6;
                if (!list5.isEmpty() && !this.unlessTopUrl.isEmpty()) {
                    z = true;
                }
                if (z) {
                    throw new AssertionError();
                }
                return;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public static ContentBlockerTrigger fromMap(Map<String, Object> map) {
        String str = (String) map.get("url-filter");
        Boolean bool = (Boolean) map.get("url-filter-is-case-sensitive");
        List<String> list = (List) map.get("resource-type");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String fromValue : list) {
                arrayList.add(ContentBlockerTriggerResourceType.fromValue(fromValue));
            }
        } else {
            arrayList.addAll(Arrays.asList(ContentBlockerTriggerResourceType.values()));
        }
        return new ContentBlockerTrigger(str, bool, arrayList, (List) map.get("if-domain"), (List) map.get("unless-domain"), (List) map.get("load-type"), (List) map.get("if-top-url"), (List) map.get("unless-top-url"));
    }

    public String getUrlFilter() {
        return this.urlFilter;
    }

    public void setUrlFilter(String str) {
        this.urlFilter = str;
    }

    public Pattern getUrlFilterPatternCompiled() {
        return this.urlFilterPatternCompiled;
    }

    public void setUrlFilterPatternCompiled(Pattern pattern) {
        this.urlFilterPatternCompiled = pattern;
    }

    public Boolean getUrlFilterIsCaseSensitive() {
        return this.urlFilterIsCaseSensitive;
    }

    public void setUrlFilterIsCaseSensitive(Boolean bool) {
        this.urlFilterIsCaseSensitive = bool;
    }

    public List<ContentBlockerTriggerResourceType> getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(List<ContentBlockerTriggerResourceType> list) {
        this.resourceType = list;
    }

    public List<String> getIfDomain() {
        return this.ifDomain;
    }

    public void setIfDomain(List<String> list) {
        this.ifDomain = list;
    }

    public List<String> getUnlessDomain() {
        return this.unlessDomain;
    }

    public void setUnlessDomain(List<String> list) {
        this.unlessDomain = list;
    }

    public List<String> getLoadType() {
        return this.loadType;
    }

    public void setLoadType(List<String> list) {
        this.loadType = list;
    }

    public List<String> getIfTopUrl() {
        return this.ifTopUrl;
    }

    public void setIfTopUrl(List<String> list) {
        this.ifTopUrl = list;
    }

    public List<String> getUnlessTopUrl() {
        return this.unlessTopUrl;
    }

    public void setUnlessTopUrl(List<String> list) {
        this.unlessTopUrl = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContentBlockerTrigger contentBlockerTrigger = (ContentBlockerTrigger) obj;
        if (this.urlFilter.equals(contentBlockerTrigger.urlFilter) && this.urlFilterPatternCompiled.equals(contentBlockerTrigger.urlFilterPatternCompiled) && this.urlFilterIsCaseSensitive.equals(contentBlockerTrigger.urlFilterIsCaseSensitive) && this.resourceType.equals(contentBlockerTrigger.resourceType) && this.ifDomain.equals(contentBlockerTrigger.ifDomain) && this.unlessDomain.equals(contentBlockerTrigger.unlessDomain) && this.loadType.equals(contentBlockerTrigger.loadType) && this.ifTopUrl.equals(contentBlockerTrigger.ifTopUrl)) {
            return this.unlessTopUrl.equals(contentBlockerTrigger.unlessTopUrl);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.urlFilter.hashCode();
        int hashCode2 = this.urlFilterPatternCompiled.hashCode();
        int hashCode3 = this.urlFilterIsCaseSensitive.hashCode();
        int hashCode4 = this.resourceType.hashCode();
        int hashCode5 = this.ifDomain.hashCode();
        int hashCode6 = this.unlessDomain.hashCode();
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + this.loadType.hashCode()) * 31) + this.ifTopUrl.hashCode()) * 31) + this.unlessTopUrl.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContentBlockerTrigger{urlFilter='");
        sb.append(this.urlFilter);
        sb.append("', urlFilterPatternCompiled=");
        sb.append(this.urlFilterPatternCompiled);
        sb.append(", urlFilterIsCaseSensitive=");
        sb.append(this.urlFilterIsCaseSensitive);
        sb.append(", resourceType=");
        sb.append(this.resourceType);
        sb.append(", ifDomain=");
        sb.append(this.ifDomain);
        sb.append(", unlessDomain=");
        sb.append(this.unlessDomain);
        sb.append(", loadType=");
        sb.append(this.loadType);
        sb.append(", ifTopUrl=");
        sb.append(this.ifTopUrl);
        sb.append(", unlessTopUrl=");
        sb.append(this.unlessTopUrl);
        sb.append('}');
        return sb.toString();
    }
}
