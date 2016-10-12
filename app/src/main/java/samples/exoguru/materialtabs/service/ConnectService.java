package samples.exoguru.materialtabs.service;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import samples.exoguru.materialtabs.Observable.Song_API;

import static samples.exoguru.materialtabs.constant.Constants.BASE_URL;

/**
 * Created by TheAppExperts on 12/10/2016.
 */

public class ConnectService {

    private static Retrofit retrofit = null;
    private static OkHttpClient okHttpClient;

    public static Song_API getConnectionService(){
        okHttpClient = buildClient();
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    //    .client(okHttpClient)
                    .build();
        }
        return retrofit.create(Song_API.class);
    }

    public static OkHttpClient buildClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
//
/*        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        //  builder.addNetworkInterceptor(new ResponseCacheInterceptor());
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        builder.addInterceptor(interceptor).build();
        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Response response = chain.proceed(chain.request());
                // Do anything with response here
                //if we ant to grab a specific cookie or something..
                return response;
            }
        });

        builder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                //this is where we will add whatever we want to our request headers.
                Request request = chain.request().newBuilder().addHeader("Accept", "application/json").build();
                return chain.proceed(request);*/
        //    }
        //       });
        return  client;

    }
}
