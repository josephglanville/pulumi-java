// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class GetClusterNodeConfigEphemeralStorageConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodeConfigEphemeralStorageConfig Empty = new GetClusterNodeConfigEphemeralStorageConfig();

    @InputImport(name="localSsdCount", required=true)
      private final Integer localSsdCount;

    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }

    public GetClusterNodeConfigEphemeralStorageConfig(Integer localSsdCount) {
        this.localSsdCount = Objects.requireNonNull(localSsdCount, "expected parameter 'localSsdCount' to be non-null");
    }

    private GetClusterNodeConfigEphemeralStorageConfig() {
        this.localSsdCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigEphemeralStorageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer localSsdCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodeConfigEphemeralStorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        public Builder setLocalSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }
        public GetClusterNodeConfigEphemeralStorageConfig build() {
            return new GetClusterNodeConfigEphemeralStorageConfig(localSsdCount);
        }
    }
}
