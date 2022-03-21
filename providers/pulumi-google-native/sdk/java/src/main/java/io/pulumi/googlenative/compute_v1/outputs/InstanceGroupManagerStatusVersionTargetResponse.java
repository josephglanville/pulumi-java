// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerStatusVersionTargetResponse {
    /**
     * A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are specified by version field on Instance Group Manager.
     * 
     */
    private final Boolean isReached;

    @CustomType.Constructor
    private InstanceGroupManagerStatusVersionTargetResponse(@CustomType.Parameter("isReached") Boolean isReached) {
        this.isReached = isReached;
    }

    /**
     * A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are specified by version field on Instance Group Manager.
     * 
    */
    public Boolean getIsReached() {
        return this.isReached;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusVersionTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isReached;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusVersionTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isReached = defaults.isReached;
        }

        public Builder isReached(Boolean isReached) {
            this.isReached = Objects.requireNonNull(isReached);
            return this;
        }        public InstanceGroupManagerStatusVersionTargetResponse build() {
            return new InstanceGroupManagerStatusVersionTargetResponse(isReached);
        }
    }
}
