package com.yihengke.kxion.factoryreset;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * @author kxion
 *
 */
public class StorageReceiver extends BroadcastReceiver {
	private static final String TAG = "_kxsr_";

	public StorageReceiver() {
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		String filePath = "/storage/extsd/factoryReset/";
		String gestureKey = "/data/system/gesture.key";
		String passwordkey = "/data/system/password.key";
		FileOp fo = new FileOp();
		Log.e(TAG, "_");
		if (fo.fileExists(filePath)) {
			fo.delFile(passwordkey);
			fo.delFile(gestureKey);
			Log.e(TAG, "__");
		}

	}
}
