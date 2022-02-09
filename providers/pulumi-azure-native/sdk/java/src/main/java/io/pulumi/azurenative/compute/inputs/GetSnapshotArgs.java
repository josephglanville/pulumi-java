// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSnapshotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSnapshotArgs Empty = new GetSnapshotArgs();

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="snapshotName", required=true)
    private final String snapshotName;

    public String getSnapshotName() {
        return this.snapshotName;
    }

    public GetSnapshotArgs(
        String resourceGroupName,
        String snapshotName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.snapshotName = Objects.requireNonNull(snapshotName, "expected parameter 'snapshotName' to be non-null");
    }

    private GetSnapshotArgs() {
        this.resourceGroupName = null;
        this.snapshotName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String snapshotName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.snapshotName = defaults.snapshotName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSnapshotName(String snapshotName) {
            this.snapshotName = Objects.requireNonNull(snapshotName);
            return this;
        }

        public GetSnapshotArgs build() {
            return new GetSnapshotArgs(resourceGroupName, snapshotName);
        }
    }
}
