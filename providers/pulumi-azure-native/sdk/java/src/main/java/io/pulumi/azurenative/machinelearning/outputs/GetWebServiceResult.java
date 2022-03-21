// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.azurenative.machinelearning.outputs.WebServicePropertiesForGraphResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetWebServiceResult {
    /**
     * Specifies the resource ID.
     * 
     */
    private final String id;
    /**
     * Specifies the location of the resource.
     * 
     */
    private final String location;
    /**
     * Specifies the name of the resource.
     * 
     */
    private final String name;
    /**
     * Contains the property payload that describes the web service.
     * 
     */
    private final WebServicePropertiesForGraphResponse properties;
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Specifies the type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWebServiceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") WebServicePropertiesForGraphResponse properties,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Specifies the resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Specifies the location of the resource.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Specifies the name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Contains the property payload that describes the web service.
     * 
    */
    public WebServicePropertiesForGraphResponse getProperties() {
        return this.properties;
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Specifies the type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private WebServicePropertiesForGraphResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(WebServicePropertiesForGraphResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWebServiceResult build() {
            return new GetWebServiceResult(id, location, name, properties, tags, type);
        }
    }
}
