// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.subscription.outputs;

import io.pulumi.azurenative.subscription.outputs.PutAliasResponsePropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAliasResult {
    /**
     * Fully qualified ID for the alias resource.
     * 
     */
    private final String id;
    /**
     * Alias ID.
     * 
     */
    private final String name;
    /**
     * Put Alias response properties.
     * 
     */
    private final PutAliasResponsePropertiesResponse properties;
    /**
     * Resource type, Microsoft.Subscription/aliases.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAliasResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") PutAliasResponsePropertiesResponse properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * Fully qualified ID for the alias resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Alias ID.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Put Alias response properties.
     * 
    */
    public PutAliasResponsePropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Resource type, Microsoft.Subscription/aliases.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private PutAliasResponsePropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(PutAliasResponsePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAliasResult build() {
            return new GetAliasResult(id, name, properties, type);
        }
    }
}
