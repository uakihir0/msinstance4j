package msinstance4j;


import msinstance4j.entity.Error;

/**
 * @author u_akihir0
 */
public class MastodonInstancesException extends RuntimeException {

    private Error error;
    private int statusCode;

    public MastodonInstancesException(Exception e) {
        super(e);
    }

    public MastodonInstancesException(Error error, int statusCode) {
        this.statusCode = statusCode;
        this.error = error;
    }
}
