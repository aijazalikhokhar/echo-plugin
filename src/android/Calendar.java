package org.devgirl.calendar;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;

public class Calendar extends CordovaPlugin {
    public static final String ACTION_ADD_CALENDAR_ENTRY = "addCalendarEntry";
    
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            if (ACTION_ADD_CALENDAR_ENTRY.equals(action)) { 
                JSONObject arg_object = args.getJSONObject(0);
                
                    if(arg_object.getString("title") !=null){
						callbackContext.success(arg_object.getString("title"));
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