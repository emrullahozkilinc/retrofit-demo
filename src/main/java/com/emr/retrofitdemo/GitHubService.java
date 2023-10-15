package com.emr.retrofitdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import java.util.List;

public interface GitHubService {
    @GET("todoss/{id}")
    Call<List<Todos>> listRepos(@Path("id") Long id);
}
