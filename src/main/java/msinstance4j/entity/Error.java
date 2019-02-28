package msinstance4j.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author u_akihir0
 */
public class Error implements Serializable {

    @SerializedName("error")
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
