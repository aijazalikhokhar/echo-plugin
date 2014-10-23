package com.mexyon.echo;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

public class Echo extends CordovaPlugin {
    public static final String ACTION_SHOW_ECHO = "showEcho";
    
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            if (ACTION_SHOW_ECHO.equals(action)) { 
				if(args.getString(0) != null){
					Toast.makeText(this.cordova.getActivity(), args.getString(0), 1).show();
					callbackContext.success(args.getString(0));
					return true;
				}
			}
			callbackContext.error("Invalid action");
			return false;
        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
            callbackContext.error("Eroory: "+e.getMessage());
            return false;
        } 
    }
}