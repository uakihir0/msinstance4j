package msinstance4j.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author u_akihir0
 */
public class Instance implements Serializable {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;

    // DateString
    @SerializedName("added_at")
    private String addedAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("checked_at")
    private String checkedAt;

    @SerializedName("uptime")
    private Long uptime;
    @SerializedName("up")
    private Boolean up;
    @SerializedName("dead")
    private Boolean dead;

    @SerializedName("version")
    private String version;

    @SerializedName("ipv6")
    private Boolean ipv6;

    @SerializedName("https_score")
    private Integer httpsScore;
    @SerializedName("https_rank")
    private String httpsRank;

    @SerializedName("obs_score")
    private Integer obsScore;
    @SerializedName("obs_rank")
    private String obsRank;


    @SerializedName("users")
    private String users;
    @SerializedName("statuses")
    private String statuses;
    @SerializedName("connections")
    private String connections;

    @SerializedName("open_registrations")
    private Boolean openRegistrations;

    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("thumbnail_proxy")
    private String thumbnailProxy;
    @SerializedName("active_users")
    private Long activeUsers;

    @SerializedName("info")
    private InstanceInfo info;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(String addedAt) {
        this.addedAt = addedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCheckedAt() {
        return checkedAt;
    }

    public void setCheckedAt(String checkedAt) {
        this.checkedAt = checkedAt;
    }

    public Long getUptime() {
        return uptime;
    }

    public void setUptime(Long uptime) {
        this.uptime = uptime;
    }

    public Boolean getUp() {
        return up;
    }

    public void setUp(Boolean up) {
        this.up = up;
    }

    public Boolean getDead() {
        return dead;
    }

    public void setDead(Boolean dead) {
        this.dead = dead;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getIpv6() {
        return ipv6;
    }

    public void setIpv6(Boolean ipv6) {
        this.ipv6 = ipv6;
    }

    public Integer getHttpsScore() {
        return httpsScore;
    }

    public void setHttpsScore(Integer httpsScore) {
        this.httpsScore = httpsScore;
    }

    public String getHttpsRank() {
        return httpsRank;
    }

    public void setHttpsRank(String httpsRank) {
        this.httpsRank = httpsRank;
    }

    public Integer getObsScore() {
        return obsScore;
    }

    public void setObsScore(Integer obsScore) {
        this.obsScore = obsScore;
    }

    public String getObsRank() {
        return obsRank;
    }

    public void setObsRank(String obsRank) {
        this.obsRank = obsRank;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }

    public String getConnections() {
        return connections;
    }

    public void setConnections(String connections) {
        this.connections = connections;
    }

    public Boolean getOpenRegistrations() {
        return openRegistrations;
    }

    public void setOpenRegistrations(Boolean openRegistrations) {
        this.openRegistrations = openRegistrations;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getThumbnailProxy() {
        return thumbnailProxy;
    }

    public void setThumbnailProxy(String thumbnailProxy) {
        this.thumbnailProxy = thumbnailProxy;
    }

    public Long getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(Long activeUsers) {
        this.activeUsers = activeUsers;
    }

    public InstanceInfo getInfo() {
        return info;
    }

    public void setInfo(InstanceInfo info) {
        this.info = info;
    }
}
