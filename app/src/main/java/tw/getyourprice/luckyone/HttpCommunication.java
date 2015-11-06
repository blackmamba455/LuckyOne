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
    public String output = "1111111";




    RequestQueue qu = Volley.newRequestQueue(LoginActivity.getAppContext());


     public String sendMessage(JSONObject jasonBody){

         String absoluteURL = url +  jasonBody;
         // Request a string response from the provided URL.
         StringRequest stringRequest = new StringRequest(Request.Method.GET, absoluteURL,
                 new Response.Listener<String>() {
                     @Override
                     public void onResponse(String response) {
                         output = response;
                         Log.i("info", output);                                             //TODO speichert wert nicht in output variable!!!???
                     }
                 }, new Response.ErrorListener() {
             @Override
             public void onErrorResponse(VolleyError error) {
                 output = "That didn't work!";
             }
         });
         // Add the request to the RequestQueue.
         qu.add(stringRequest);

         return output;
     }


}
