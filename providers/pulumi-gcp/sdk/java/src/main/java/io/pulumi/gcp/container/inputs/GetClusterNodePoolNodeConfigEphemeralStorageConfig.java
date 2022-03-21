// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetClusterNodePoolNodeConfigEphemeralStorageConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodePoolNodeConfigEphemeralStorageConfig Empty = new GetClusterNodePoolNodeConfigEphemeralStorageConfig();

    @Import(name="localSsdCount", required=true)
      private final Integer localSsdCount;

    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }

    public GetClusterNodePoolNodeConfigEphemeralStorageConfig(Integer localSsdCount) {
        this.localSsdCount = Objects.requireNonNull(localSsdCount, "expected parameter 'localSsdCount' to be non-null");
    }

    private GetClusterNodePoolNodeConfigEphemeralStorageConfig() {
        this.localSsdCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfigEphemeralStorageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer localSsdCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNodeConfigEphemeralStorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        public Builder localSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }        public GetClusterNodePoolNodeConfigEphemeralStorageConfig build() {
            return new GetClusterNodePoolNodeConfigEphemeralStorageConfig(localSsdCount);
        }
    }
}
