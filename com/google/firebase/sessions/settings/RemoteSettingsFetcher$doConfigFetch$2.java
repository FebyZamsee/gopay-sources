package com.google.firebase.sessions.settings;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AsyncLayoutInflater;
import o.BiometricManager;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;
import o.getLayoutResource;
import o.setContentInsetsAbsolute;
import org.json.JSONObject;

final class RemoteSettingsFetcher$doConfigFetch$2 extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $headerOptions;
    final /* synthetic */ Function2<String, TooltipCompatHandler<? super Unit>, Object> $onFailure;
    final /* synthetic */ Function2<JSONObject, TooltipCompatHandler<? super Unit>, Object> $onSuccess;
    int label;
    final /* synthetic */ RemoteSettingsFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteSettingsFetcher$doConfigFetch$2(RemoteSettingsFetcher remoteSettingsFetcher, Map<String, String> map, Function2<? super JSONObject, ? super TooltipCompatHandler<? super Unit>, ? extends Object> function2, Function2<? super String, ? super TooltipCompatHandler<? super Unit>, ? extends Object> function22, TooltipCompatHandler<? super RemoteSettingsFetcher$doConfigFetch$2> tooltipCompatHandler) {
        super(2, tooltipCompatHandler);
        this.this$0 = remoteSettingsFetcher;
        this.$headerOptions = map;
        this.$onSuccess = function2;
        this.$onFailure = function22;
    }

    public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.this$0, this.$headerOptions, this.$onSuccess, this.$onFailure, tooltipCompatHandler);
    }

    public final Object invoke(BiometricManager.Authenticators authenticators, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) create(authenticators, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
    }

    public final Object invokeSuspend(Object obj) {
        TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1 || i == 2) {
                try {
                    if (obj instanceof setContentInsetsAbsolute.onTransact) {
                        throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
                    }
                } catch (Exception e) {
                    Function2<String, TooltipCompatHandler<? super Unit>, Object> function2 = this.$onFailure;
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.toString();
                    }
                    this.label = 3;
                    if (function2.invoke(message, this) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                        return tooltipCompatHandler$$ExternalSyntheticLambda1;
                    }
                }
            } else if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (obj instanceof setContentInsetsAbsolute.onTransact) {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
        } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
            URLConnection openConnection = this.this$0.settingsUrl().openConnection();
            Intrinsics.onTransact((Object) openConnection);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry next : this.$headerOptions.entrySet()) {
                httpsURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                AsyncLayoutInflater.read read = new AsyncLayoutInflater.read();
                while (true) {
                    T readLine = bufferedReader.readLine();
                    read.onTransact = readLine;
                    if (readLine == null) {
                        break;
                    }
                    sb.append((String) read.onTransact);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb.toString());
                Function2<JSONObject, TooltipCompatHandler<? super Unit>, Object> function22 = this.$onSuccess;
                this.label = 1;
                if (function22.invoke(jSONObject, this) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                    return tooltipCompatHandler$$ExternalSyntheticLambda1;
                }
            } else {
                Function2<String, TooltipCompatHandler<? super Unit>, Object> function23 = this.$onFailure;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Bad response code: ");
                sb2.append(responseCode);
                String obj2 = sb2.toString();
                this.label = 2;
                if (function23.invoke(obj2, this) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                    return tooltipCompatHandler$$ExternalSyntheticLambda1;
                }
            }
        } else {
            throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
        }
        return Unit.asInterface;
    }
}
