package org.example;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface todoService {

    @GET("v1/{id}")
    Call<todo> get(@Path("id") String id);
}
