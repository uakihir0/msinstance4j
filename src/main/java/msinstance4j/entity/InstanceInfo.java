package msinstance4j.entity;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author u_akihir0
 */
public class InstanceInfo implements Serializable {


    @SerializedName("short_description")
    private String shortDescription;
    @SerializedName("full_description")
    private String fullDescription;
    @SerializedName("topic")
    private String topic;

    @SerializedName("languages")
    private String[] languages;

    @SerializedName("other_languages_accepted")
    private Boolean otherLanguagesAccepted;
    @SerializedName("federates_with")
    private String federatesWith;
    @SerializedName("prohibited_content")
    private String[] prohibitedContent;
    @SerializedName("categories")
    private String[] categories;

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Boolean getOtherLanguagesAccepted() {
        return otherLanguagesAccepted;
    }

    public void setOtherLanguagesAccepted(Boolean otherLanguagesAccepted) {
        this.otherLanguagesAccepted = otherLanguagesAccepted;
    }

    public String getFederatesWith() {
        return federatesWith;
    }

    public void setFederatesWith(String federatesWith) {
        this.federatesWith = federatesWith;
    }

    public String[] getProhibitedContent() {
        return prohibitedContent;
    }

    public void setProhibitedContent(String[] prohibitedContent) {
        this.prohibitedContent = prohibitedContent;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }
}
