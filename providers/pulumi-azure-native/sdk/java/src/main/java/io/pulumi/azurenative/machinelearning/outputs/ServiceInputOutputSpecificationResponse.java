// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.azurenative.machinelearning.outputs.TableSpecificationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceInputOutputSpecificationResponse {
    /**
     * The description of the Swagger schema.
     * 
     */
    private final @Nullable String description;
    /**
     * Specifies a collection that contains the column schema for each input or output of the web service. For more information, see the Swagger specification.
     * 
     */
    private final Map<String,TableSpecificationResponse> properties;
    /**
     * The title of your Swagger schema.
     * 
     */
    private final @Nullable String title;
    /**
     * The type of the entity described in swagger. Always 'object'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ServiceInputOutputSpecificationResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("properties") Map<String,TableSpecificationResponse> properties,
        @CustomType.Parameter("title") @Nullable String title,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.properties = properties;
        this.title = title;
        this.type = type;
    }

    /**
     * The description of the Swagger schema.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Specifies a collection that contains the column schema for each input or output of the web service. For more information, see the Swagger specification.
     * 
    */
    public Map<String,TableSpecificationResponse> getProperties() {
        return this.properties;
    }
    /**
     * The title of your Swagger schema.
     * 
    */
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }
    /**
     * The type of the entity described in swagger. Always 'object'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceInputOutputSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private Map<String,TableSpecificationResponse> properties;
        private @Nullable String title;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceInputOutputSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder properties(Map<String,TableSpecificationResponse> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ServiceInputOutputSpecificationResponse build() {
            return new ServiceInputOutputSpecificationResponse(description, properties, title, type);
        }
    }
}
