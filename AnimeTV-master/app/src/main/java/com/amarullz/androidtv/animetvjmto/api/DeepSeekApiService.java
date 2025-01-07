import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DeepSeekApiService {
    @GET("search")
    Call<SearchResponse> searchManga(@Query("query") String query);
}