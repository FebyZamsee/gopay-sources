package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zba();
    private final PasswordRequestOptions zba;
    private final GoogleIdTokenRequestOptions zbb;
    private final String zbc;
    private final boolean zbd;

    public static final class Builder {
        private PasswordRequestOptions zba;
        private GoogleIdTokenRequestOptions zbb;
        private String zbc;
        private boolean zbd;

        public Builder() {
            PasswordRequestOptions.Builder builder = PasswordRequestOptions.builder();
            builder.setSupported(false);
            this.zba = builder.build();
            GoogleIdTokenRequestOptions.Builder builder2 = GoogleIdTokenRequestOptions.builder();
            builder2.setSupported(false);
            this.zbb = builder2.build();
        }

        public final BeginSignInRequest build() {
            return new BeginSignInRequest(this.zba, this.zbb, this.zbc, this.zbd);
        }

        public final Builder setAutoSelectEnabled(boolean z) {
            this.zbd = z;
            return this;
        }

        public final Builder setGoogleIdTokenRequestOptions(GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        public final Builder setPasswordRequestOptions(PasswordRequestOptions passwordRequestOptions) {
            this.zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }

        public final Builder zba(String str) {
            this.zbc = str;
            return this;
        }
    }

    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zbe();
        private final boolean zba;
        private final String zbb;
        private final String zbc;
        private final boolean zbd;
        private final String zbe;
        private final List<String> zbf;

        public static final class Builder {
            private boolean zba = false;
            private String zbb = null;
            private String zbc = null;
            private boolean zbd = true;
            private String zbe = null;
            private List<String> zbf = null;

            public final Builder associateLinkedAccounts(String str, List<String> list) {
                this.zbe = (String) Preconditions.checkNotNull(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.zbf = list;
                return this;
            }

            public final GoogleIdTokenRequestOptions build() {
                return new GoogleIdTokenRequestOptions(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf);
            }

            public final Builder setFilterByAuthorizedAccounts(boolean z) {
                this.zbd = z;
                return this;
            }

            public final Builder setNonce(String str) {
                this.zbc = str;
                return this;
            }

            public final Builder setServerClientId(String str) {
                this.zbb = Preconditions.checkNotEmpty(str);
                return this;
            }

            public final Builder setSupported(boolean z) {
                this.zba = z;
                return this;
            }
        }

        GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, List<String> list) {
            this.zba = z;
            if (z) {
                Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zbb = str;
            this.zbc = str2;
            this.zbd = z2;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.zbf = arrayList;
            this.zbe = str3;
        }

        public static Builder builder() {
            return new Builder();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.zba != googleIdTokenRequestOptions.zba || !Objects.equal(this.zbb, googleIdTokenRequestOptions.zbb) || !Objects.equal(this.zbc, googleIdTokenRequestOptions.zbc) || this.zbd != googleIdTokenRequestOptions.zbd || !Objects.equal(this.zbe, googleIdTokenRequestOptions.zbe) || !Objects.equal(this.zbf, googleIdTokenRequestOptions.zbf)) {
                return false;
            }
            return true;
        }

        public final boolean filterByAuthorizedAccounts() {
            return this.zbd;
        }

        public final List<String> getIdTokenDepositionScopes() {
            return this.zbf;
        }

        public final String getLinkedServiceId() {
            return this.zbe;
        }

        public final String getNonce() {
            return this.zbc;
        }

        public final String getServerClientId() {
            return this.zbb;
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zba), this.zbb, this.zbc, Boolean.valueOf(this.zbd), this.zbe, this.zbf);
        }

        public final boolean isSupported() {
            return this.zba;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
            SafeParcelWriter.writeString(parcel, 3, getNonce(), false);
            SafeParcelWriter.writeBoolean(parcel, 4, filterByAuthorizedAccounts());
            SafeParcelWriter.writeString(parcel, 5, getLinkedServiceId(), false);
            SafeParcelWriter.writeStringList(parcel, 6, getIdTokenDepositionScopes(), false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zbf();
        private final boolean zba;

        public static final class Builder {
            private boolean zba = false;

            public final PasswordRequestOptions build() {
                return new PasswordRequestOptions(this.zba);
            }

            public final Builder setSupported(boolean z) {
                this.zba = z;
                return this;
            }
        }

        PasswordRequestOptions(boolean z) {
            this.zba = z;
        }

        public static Builder builder() {
            return new Builder();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof PasswordRequestOptions) && this.zba == ((PasswordRequestOptions) obj).zba) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zba));
        }

        public final boolean isSupported() {
            return this.zba;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z) {
        this.zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
        this.zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.zbc = str;
        this.zbd = z;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zba(BeginSignInRequest beginSignInRequest) {
        Preconditions.checkNotNull(beginSignInRequest);
        Builder builder = builder();
        builder.setGoogleIdTokenRequestOptions(beginSignInRequest.getGoogleIdTokenRequestOptions());
        builder.setPasswordRequestOptions(beginSignInRequest.getPasswordRequestOptions());
        builder.setAutoSelectEnabled(beginSignInRequest.zbd);
        String str = beginSignInRequest.zbc;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!Objects.equal(this.zba, beginSignInRequest.zba) || !Objects.equal(this.zbb, beginSignInRequest.zbb) || !Objects.equal(this.zbc, beginSignInRequest.zbc) || this.zbd != beginSignInRequest.zbd) {
            return false;
        }
        return true;
    }

    public final GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zbb;
    }

    public final PasswordRequestOptions getPasswordRequestOptions() {
        return this.zba;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbc, Boolean.valueOf(this.zbd));
    }

    public final boolean isAutoSelectEnabled() {
        return this.zbd;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPasswordRequestOptions(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getGoogleIdTokenRequestOptions(), i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isAutoSelectEnabled());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
