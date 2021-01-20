package id.desialpra.githubuser.api

import id.desialpra.githubuser.data.model.DetailUserResponse
import id.desialpra.githubuser.data.model.User
import id.desialpra.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token caf0a6f9fdf2ae9688b1a96add5524e8b7faa0cc")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token caf0a6f9fdf2ae9688b1a96add5524e8b7faa0cc")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token caf0a6f9fdf2ae9688b1a96add5524e8b7faa0cc")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token caf0a6f9fdf2ae9688b1a96add5524e8b7faa0cc")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}