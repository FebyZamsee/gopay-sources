package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import o.ActivityResultContracts;
import o.DropDownListView;
import o.MenuPopupWindow;
import o.drawVerticalDivider;
import o.setIcon;
import o.setListNavigationCallbacks;
import o.setSelectedNavigationItem;

public class JobInfoSchedulerService extends JobService {
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        setSelectedNavigationItem.asInterface(getApplicationContext());
        setIcon.RemoteActionCompatParcelizer read = setIcon.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(string).read(ActivityResultContracts.PickVisualMedia.ImageAndVideo.asBinder.RemoteActionCompatParcelizer(i));
        if (string2 != null) {
            read.asBinder(Base64.decode(string2, 0));
        }
        setListNavigationCallbacks setlistnavigationcallbacks = setSelectedNavigationItem.onTransact;
        if (setlistnavigationcallbacks != null) {
            drawVerticalDivider drawverticaldivider = setlistnavigationcallbacks.RemoteActionCompatParcelizer().asInterface;
            drawverticaldivider.asBinder.execute(new MenuPopupWindow.MenuDropDownListView.Api17Impl(drawverticaldivider, read.asBinder(), i2, new DropDownListView.ResolveHoverRunnable(this, jobParameters)));
            return true;
        }
        throw new IllegalStateException("Not initialized!");
    }
}
