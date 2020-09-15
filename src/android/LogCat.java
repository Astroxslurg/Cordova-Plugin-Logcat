package org.apache.cordova.logcat;
import java.io.File;
import java.io.IOException;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import android.os.Environment;
import android.util.Log;

public class LogCat extends CordovaPlugin {
	protected void pluginInitialize() {}

  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if (action.equals("log")) {
      Log.d("cordova", args.getString(0));
      return true;
    } else {
      return false;
    }
  }
}