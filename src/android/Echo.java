package com.mexyon.calendar;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;

public class Echo extends CordovaPlugin {
    public static final String ACTION_SHOW_ECHO = "showEcho";
    
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            if (ACTION_SHOW_ECHO.equals(action)) { 
				if(args.getString(0) !=null){
						callbackContext.success(args.getString(0));
						return true;
					}else{
						callbackContext.error("Invalid action");
						return false;
					}
             
               //this.cordova.getActivity().startActivity(calIntent);
               
            }
        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
            callbackContext.error(e.getMessage());
            return false;
        } 
    }
}