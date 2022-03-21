// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetClusterNodePoolUpgradeSetting extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodePoolUpgradeSetting Empty = new GetClusterNodePoolUpgradeSetting();

    @Import(name="maxSurge", required=true)
      private final Integer maxSurge;

    public Integer getMaxSurge() {
        return this.maxSurge;
    }

    @Import(name="maxUnavailable", required=true)
      private final Integer maxUnavailable;

    public Integer getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public GetClusterNodePoolUpgradeSetting(
        Integer maxSurge,
        Integer maxUnavailable) {
        this.maxSurge = Objects.requireNonNull(maxSurge, "expected parameter 'maxSurge' to be non-null");
        this.maxUnavailable = Objects.requireNonNull(maxUnavailable, "expected parameter 'maxUnavailable' to be non-null");
    }

    private GetClusterNodePoolUpgradeSetting() {
        this.maxSurge = null;
        this.maxUnavailable = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolUpgradeSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxSurge;
        private Integer maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolUpgradeSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder maxSurge(Integer maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }
        public Builder maxUnavailable(Integer maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }        public GetClusterNodePoolUpgradeSetting build() {
            return new GetClusterNodePoolUpgradeSetting(maxSurge, maxUnavailable);
        }
    }
}
