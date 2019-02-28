package msinstance4j.internal;

import msinstance4j.entity.Instances;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static msinstance4j.internal.InternalUtility.proceed;

/**
 * @author u_akihir0
 */
public class InstancesResource {

    private final String bearerToken;

    public InstancesResource(String accessToken) {
        this.bearerToken = InternalUtility.getBearerToken(accessToken);
    }

    /**
     * インスタンスリストを取得
     */
    public Instances listInstances(
            Integer count,
            Boolean includeDead,
            Boolean includeDown,
            Boolean includeClosed,
            String language,
            String sortBy,
            String sortOrder) {

        return proceed(Instances.class, () -> {

            HttpRequestBuilder builder = new HttpRequestBuilder()
                    .target("https://instances.social")
                    .path("/api/1.0/instances/list");

            setProperty(builder, "include_dead", includeDead);
            setProperty(builder, "include_down", includeDown);
            setProperty(builder, "include_closed", includeClosed);

            setProperty(builder, "count", count);
            setProperty(builder, "language", language);

            setProperty(builder, "sort_by", sortBy);
            setProperty(builder, "sort_order", sortOrder);

            return builder
                    .request(HttpMediaType.APPLICATION_JSON)
                    .header("Authorization", this.bearerToken)
                    .get();
        });
    }


    /**
     * インスタンスリストを検索
     */
    public Instances searchInstances(
            Integer count,
            String query) {

        return proceed(Instances.class, () -> {

            HttpRequestBuilder builder = new HttpRequestBuilder()
                    .target("https://instances.social")
                    .path("/api/1.0/instances/search");

            setProperty(builder, "count", count);
            setProperty(builder, "q", query);

            return builder
                    .request(HttpMediaType.APPLICATION_JSON)
                    .header("Authorization", this.bearerToken)
                    .get();
        });
    }

    private void setProperty(HttpRequestBuilder builder, String key, Object obj) {
        if (obj != null) {
            builder.query(key, obj.toString());
        }
    }
}
