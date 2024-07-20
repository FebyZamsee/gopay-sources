package com.pichillilorenzo.flutter_inappwebview.content_blocker;

public class ContentBlocker {
    private ContentBlockerAction action;
    private ContentBlockerTrigger trigger;

    public ContentBlocker(ContentBlockerTrigger contentBlockerTrigger, ContentBlockerAction contentBlockerAction) {
        this.trigger = contentBlockerTrigger;
        this.action = contentBlockerAction;
    }

    public ContentBlockerTrigger getTrigger() {
        return this.trigger;
    }

    public void setTrigger(ContentBlockerTrigger contentBlockerTrigger) {
        this.trigger = contentBlockerTrigger;
    }

    public ContentBlockerAction getAction() {
        return this.action;
    }

    public void setAction(ContentBlockerAction contentBlockerAction) {
        this.action = contentBlockerAction;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContentBlocker contentBlocker = (ContentBlocker) obj;
        if (!this.trigger.equals(contentBlocker.trigger)) {
            return false;
        }
        return this.action.equals(contentBlocker.action);
    }

    public int hashCode() {
        return (this.trigger.hashCode() * 31) + this.action.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContentBlocker{trigger=");
        sb.append(this.trigger);
        sb.append(", action=");
        sb.append(this.action);
        sb.append('}');
        return sb.toString();
    }
}
