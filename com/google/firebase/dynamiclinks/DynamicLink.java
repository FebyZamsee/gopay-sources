package com.google.firebase.dynamiclinks;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl;
import io.flutter.plugins.firebase.analytics.Constants;

public final class DynamicLink {
    private final Bundle builderParameters;

    DynamicLink(Bundle bundle) {
        this.builderParameters = bundle;
    }

    public final Uri getUri() {
        return FirebaseDynamicLinksImpl.createDynamicLink(this.builderParameters);
    }

    public static final class Builder {
        private final Bundle builderParameters;
        private final Bundle fdlParameters;
        private final FirebaseDynamicLinksImpl firebaseDynamicLinksImpl;

        public Builder(FirebaseDynamicLinksImpl firebaseDynamicLinksImpl2) {
            this.firebaseDynamicLinksImpl = firebaseDynamicLinksImpl2;
            Bundle bundle = new Bundle();
            this.builderParameters = bundle;
            bundle.putString("apiKey", firebaseDynamicLinksImpl2.getFirebaseApp().getOptions().getApiKey());
            Bundle bundle2 = new Bundle();
            this.fdlParameters = bundle2;
            bundle.putBundle(Constants.PARAMETERS, bundle2);
        }

        public final Builder setLongLink(Uri uri) {
            this.builderParameters.putParcelable("dynamicLink", uri);
            return this;
        }

        public final Builder setLink(Uri uri) {
            this.fdlParameters.putParcelable("link", uri);
            return this;
        }

        public final Builder setDomainUriPrefix(String str) {
            if (str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$") || str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
                this.builderParameters.putString("domain", str.replace("https://", ""));
            }
            this.builderParameters.putString("domainUriPrefix", str);
            return this;
        }

        public final Builder setAndroidParameters(AndroidParameters androidParameters) {
            this.fdlParameters.putAll(androidParameters.parameters);
            return this;
        }

        public final Builder setIosParameters(IosParameters iosParameters) {
            this.fdlParameters.putAll(iosParameters.parameters);
            return this;
        }

        public final Builder setGoogleAnalyticsParameters(GoogleAnalyticsParameters googleAnalyticsParameters) {
            this.fdlParameters.putAll(googleAnalyticsParameters.parameters);
            return this;
        }

        public final Builder setItunesConnectAnalyticsParameters(ItunesConnectAnalyticsParameters itunesConnectAnalyticsParameters) {
            this.fdlParameters.putAll(itunesConnectAnalyticsParameters.parameters);
            return this;
        }

        public final Builder setSocialMetaTagParameters(SocialMetaTagParameters socialMetaTagParameters) {
            this.fdlParameters.putAll(socialMetaTagParameters.parameters);
            return this;
        }

        public final Builder setNavigationInfoParameters(NavigationInfoParameters navigationInfoParameters) {
            this.fdlParameters.putAll(navigationInfoParameters.parameters);
            return this;
        }

        public final DynamicLink buildDynamicLink() {
            FirebaseDynamicLinksImpl.verifyDomainUriPrefix(this.builderParameters);
            return new DynamicLink(this.builderParameters);
        }

        public final Task<ShortDynamicLink> buildShortDynamicLink(int i) {
            verifyApiKey();
            this.builderParameters.putInt("suffix", i);
            return this.firebaseDynamicLinksImpl.createShortDynamicLink(this.builderParameters);
        }

        private void verifyApiKey() {
            if (this.builderParameters.getString("apiKey") == null) {
                throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
            }
        }
    }

    public static final class AndroidParameters {
        final Bundle parameters;

        private AndroidParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        public static final class Builder {
            private final Bundle parameters;

            public Builder() {
                if (FirebaseApp.getInstance() != null) {
                    Bundle bundle = new Bundle();
                    this.parameters = bundle;
                    bundle.putString("apn", FirebaseApp.getInstance().getApplicationContext().getPackageName());
                    return;
                }
                throw new IllegalStateException("FirebaseApp not initialized.");
            }

            public Builder(String str) {
                Bundle bundle = new Bundle();
                this.parameters = bundle;
                bundle.putString("apn", str);
            }

            public final Builder setFallbackUrl(Uri uri) {
                this.parameters.putParcelable("afl", uri);
                return this;
            }

            public final Builder setMinimumVersion(int i) {
                this.parameters.putInt("amv", i);
                return this;
            }

            public final AndroidParameters build() {
                return new AndroidParameters(this.parameters);
            }
        }
    }

    public static final class IosParameters {
        final Bundle parameters;

        private IosParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        public static final class Builder {
            private final Bundle parameters;

            public Builder(String str) {
                Bundle bundle = new Bundle();
                this.parameters = bundle;
                bundle.putString("ibi", str);
            }

            public final Builder setFallbackUrl(Uri uri) {
                this.parameters.putParcelable("ifl", uri);
                return this;
            }

            public final Builder setCustomScheme(String str) {
                this.parameters.putString("ius", str);
                return this;
            }

            public final Builder setIpadFallbackUrl(Uri uri) {
                this.parameters.putParcelable("ipfl", uri);
                return this;
            }

            public final Builder setIpadBundleId(String str) {
                this.parameters.putString("ipbi", str);
                return this;
            }

            public final Builder setAppStoreId(String str) {
                this.parameters.putString("isi", str);
                return this;
            }

            public final Builder setMinimumVersion(String str) {
                this.parameters.putString("imv", str);
                return this;
            }

            public final IosParameters build() {
                return new IosParameters(this.parameters);
            }
        }
    }

    public static final class GoogleAnalyticsParameters {
        Bundle parameters;

        private GoogleAnalyticsParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        public static final class Builder {
            private final Bundle parameters = new Bundle();

            public final Builder setSource(String str) {
                this.parameters.putString("utm_source", str);
                return this;
            }

            public final Builder setMedium(String str) {
                this.parameters.putString("utm_medium", str);
                return this;
            }

            public final Builder setCampaign(String str) {
                this.parameters.putString("utm_campaign", str);
                return this;
            }

            public final Builder setTerm(String str) {
                this.parameters.putString("utm_term", str);
                return this;
            }

            public final Builder setContent(String str) {
                this.parameters.putString("utm_content", str);
                return this;
            }

            public final GoogleAnalyticsParameters build() {
                return new GoogleAnalyticsParameters(this.parameters);
            }
        }
    }

    public static final class ItunesConnectAnalyticsParameters {
        final Bundle parameters;

        private ItunesConnectAnalyticsParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        public static final class Builder {
            private final Bundle parameters = new Bundle();

            public final Builder setProviderToken(String str) {
                this.parameters.putString("pt", str);
                return this;
            }

            public final Builder setAffiliateToken(String str) {
                this.parameters.putString("at", str);
                return this;
            }

            public final Builder setCampaignToken(String str) {
                this.parameters.putString("ct", str);
                return this;
            }

            public final ItunesConnectAnalyticsParameters build() {
                return new ItunesConnectAnalyticsParameters(this.parameters);
            }
        }
    }

    public static final class SocialMetaTagParameters {
        final Bundle parameters;

        private SocialMetaTagParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        public static final class Builder {
            private final Bundle parameters = new Bundle();

            public final Builder setTitle(String str) {
                this.parameters.putString("st", str);
                return this;
            }

            public final Builder setDescription(String str) {
                this.parameters.putString("sd", str);
                return this;
            }

            public final Builder setImageUrl(Uri uri) {
                this.parameters.putParcelable("si", uri);
                return this;
            }

            public final SocialMetaTagParameters build() {
                return new SocialMetaTagParameters(this.parameters);
            }
        }
    }

    public static final class NavigationInfoParameters {
        final Bundle parameters;

        private NavigationInfoParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        public static final class Builder {
            private final Bundle parameters = new Bundle();

            public final Builder setForcedRedirectEnabled(boolean z) {
                this.parameters.putInt("efr", z ? 1 : 0);
                return this;
            }

            public final NavigationInfoParameters build() {
                return new NavigationInfoParameters(this.parameters);
            }
        }
    }
}
