package tw.getyourprice.luckyone;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

/**
 * Created by Laptop on 06.11.2015.
 */
public class HttpCommunication {

    public HttpCommunication( String _url){
        url = _url;
    }

    private String url;

    RequestQueue qu = Volley.newRequestQueue(LoginActivity.getAppContext());


     public void sendMessage(JSONObject jasonBody, Response.Listener<String> rl,Response.ErrorListener errorl){

         String absoluteURL = url +  jasonBody;
         // Request a string response from the provided URL.
         StringRequest stringRequest = new StringRequest(Request.Method.GET, absoluteURL, rl, errorl);
         // Add the request to the RequestQueue.
         qu.add(stringRequest);

     }







}
