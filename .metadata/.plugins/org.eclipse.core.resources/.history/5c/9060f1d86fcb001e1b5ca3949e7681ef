
package model.countriesdb;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "spa",
    "cat",
    "eus",
    "glc"
})

public class Languages {

    @JsonProperty("spa")
    private String spa;
    @JsonProperty("cat")
    private String cat;
    @JsonProperty("eus")
    private String eus;
    @JsonProperty("glc")
    private String glc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("spa")
    public String getSpa() {
        return spa;
    }

    @JsonProperty("spa")
    public void setSpa(String spa) {
        this.spa = spa;
    }

    @JsonProperty("cat")
    public String getCat() {
        return cat;
    }

    @JsonProperty("cat")
    public void setCat(String cat) {
        this.cat = cat;
    }

    @JsonProperty("eus")
    public String getEus() {
        return eus;
    }

    @JsonProperty("eus")
    public void setEus(String eus) {
        this.eus = eus;
    }

    @JsonProperty("glc")
    public String getGlc() {
        return glc;
    }

    @JsonProperty("glc")
    public void setGlc(String glc) {
        this.glc = glc;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    @JsonProperty("languages")
    private Languages languages;

    // Getter method for accessing the Languages object
    public Languages getLanguages() {
        return languages;
    }
}

