// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReplicaResponse {
    /**
     * The canonical IDs of the location to replicate data. For example: `"us-east1"`.
     * 
     */
    private final String location;

    @CustomType.Constructor
    private ReplicaResponse(@CustomType.Parameter("location") String location) {
        this.location = location;
    }

    /**
     * The canonical IDs of the location to replicate data. For example: `"us-east1"`.
     * 
    */
    public String getLocation() {
        return this.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }        public ReplicaResponse build() {
            return new ReplicaResponse(location);
        }
    }
}
