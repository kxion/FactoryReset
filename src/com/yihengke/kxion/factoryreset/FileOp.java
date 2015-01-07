/**
 * 
 */
package com.yihengke.kxion.factoryreset;

import java.io.File;

import android.util.Log;

/**
 * @author kxion
 *
 */
public class FileOp {

	private static final String TAG = "_kxfo_";
	private File f;

	public FileOp() {

	}

	public boolean fileExists(String filePath) {
		boolean result = false;
		f = new File(filePath);
		if (f.exists()) {
			result = true;
			Log.e(TAG, "._");
		} else {
			result = false;
			Log.e(TAG, "!._");
		}
		return result;
	}

	public boolean delFile(String filePath) {
		boolean result = false;
		try {
			f = new File(filePath);
			if (f.exists()) {
				f.delete();
				result = true;
				Log.e(TAG, "._.");
			} else {
				result = false;
				Log.e(TAG, "!._.");
			}
		} catch (Exception e) {
			Log.e(TAG, "._.e." + e);
		}
		return result;
	}

}
