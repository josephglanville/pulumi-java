// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waf.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProtectionCapabilitiesProtectionCapabilityCollectionItemCollaborativeWeight {
    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    private final String displayName;
    /**
     * @return The unique key of protection capability to filter by.
     * 
     */
    private final String key;
    /**
     * @return The weight of contributing protection capability.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private GetProtectionCapabilitiesProtectionCapabilityCollectionItemCollaborativeWeight(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("weight") Integer weight) {
        this.displayName = displayName;
        this.key = key;
        this.weight = weight;
    }

    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The unique key of protection capability to filter by.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The weight of contributing protection capability.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProtectionCapabilitiesProtectionCapabilityCollectionItemCollaborativeWeight defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String key;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProtectionCapabilitiesProtectionCapabilityCollectionItemCollaborativeWeight defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.key = defaults.key;
    	      this.weight = defaults.weight;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public GetProtectionCapabilitiesProtectionCapabilityCollectionItemCollaborativeWeight build() {
            return new GetProtectionCapabilitiesProtectionCapabilityCollectionItemCollaborativeWeight(displayName, key, weight);
        }
    }
}
