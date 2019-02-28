package msinstance4j.internal;

import com.google.gson.Gson;
import msinstance4j.MastodonInstancesException;
import msinstance4j.entity.Error;
import net.socialhub.http.HttpException;
import net.socialhub.http.HttpResponse;
import net.socialhub.http.HttpResponseCode;

/**
 * @author u_akihir0
 */
public class InternalUtility {

    private final static Gson gson = new Gson();

    private InternalUtility() {
    }

    static String getBearerToken(String accessToken) {
        return "Bearer " + accessToken;
    }

    static Gson getGsonInstance() {
        return gson;
    }

    static void proceed(RequestInterface function) {
        try {
            HttpResponse response = function.proceed();
            if (response.getStatusCode() == HttpResponseCode.OK) {
                return;
            }

            Error error = gson.fromJson(response.asString(), Error.class);
            throw new MastodonInstancesException(error, response.getStatusCode());
        } catch (HttpException e) {
            throw new MastodonInstancesException(e);
        }
    }

    static <T> T proceed(Class<T> clazz, RequestInterface function) {
        try {
            HttpResponse response = function.proceed();

            if (response.getStatusCode() == HttpResponseCode.OK) {
                return gson.fromJson(response.asString(), clazz);
            }

            Error error = gson.fromJson(response.asString(), Error.class);
            throw new MastodonInstancesException(error, response.getStatusCode());
        } catch (HttpException e) {
            throw new MastodonInstancesException(e);
        }
    }

    interface RequestInterface<T> {
        HttpResponse proceed() throws HttpException;
    }
}
