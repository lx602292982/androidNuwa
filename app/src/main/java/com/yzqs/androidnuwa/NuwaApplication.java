package com.yzqs.androidnuwa;

import android.app.Application;
import android.content.Context;
import android.os.Environment;

import cn.jiajixin.nuwa.Nuwa;

/**
 * 作者：lixiang on 2016/10/19 17:15
 * 邮箱：xiang.li@spreadwin.com
 */
public class NuwaApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Nuwa.init(this);
        Nuwa.loadPatch(this, Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));
    }
}
