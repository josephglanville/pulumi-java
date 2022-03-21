// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PlacementPolicyResponse {
    /**
     * The type of placement.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private PlacementPolicyResponse(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * The type of placement.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlacementPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PlacementPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public PlacementPolicyResponse build() {
            return new PlacementPolicyResponse(type);
        }
    }
}
