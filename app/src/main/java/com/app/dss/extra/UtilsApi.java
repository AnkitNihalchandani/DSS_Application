package com.app.dss.extra;

public class UtilsApi {
    public static final String BASE_URL_API = "http://192.168.29.79/DSS/";
    public static final String BASE_URL_APINgo = "http://192.168.29.79/DSS/";

    //  Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
