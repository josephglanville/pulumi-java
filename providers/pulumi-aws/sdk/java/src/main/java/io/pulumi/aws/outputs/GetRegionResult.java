// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionResult {
    /**
     * The region's description in this format: "Location (Region name)".
     * 
     */
    private final String description;
    /**
     * The EC2 endpoint for the selected region.
     * 
     */
    private final String endpoint;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The name of the selected region.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetRegionResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name) {
        this.description = description;
        this.endpoint = endpoint;
        this.id = id;
        this.name = name;
    }

    /**
     * The region's description in this format: "Location (Region name)".
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The EC2 endpoint for the selected region.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the selected region.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String endpoint;
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetRegionResult build() {
            return new GetRegionResult(description, endpoint, id, name);
        }
    }
}
