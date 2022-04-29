// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegistryConnectionMetadataAggregator {
    /**
     * @return The description of the aggregator.
     * 
     */
    private final String description;
    /**
     * @return The identifier of the aggregator.
     * 
     */
    private final String identifier;
    /**
     * @return The identifying key for the object.
     * 
     */
    private final String key;
    /**
     * @return Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * 
     */
    private final String name;
    /**
     * @return Specific Connection Type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRegistryConnectionMetadataAggregator(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("identifier") String identifier,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.identifier = identifier;
        this.key = key;
        this.name = name;
        this.type = type;
    }

    /**
     * @return The description of the aggregator.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The identifier of the aggregator.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return The identifying key for the object.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specific Connection Type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryConnectionMetadataAggregator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String identifier;
        private String key;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryConnectionMetadataAggregator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.identifier = defaults.identifier;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRegistryConnectionMetadataAggregator build() {
            return new GetRegistryConnectionMetadataAggregator(description, identifier, key, name, type);
        }
    }
}
