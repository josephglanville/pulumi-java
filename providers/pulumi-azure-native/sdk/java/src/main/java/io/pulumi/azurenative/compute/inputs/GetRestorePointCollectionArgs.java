// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRestorePointCollectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRestorePointCollectionArgs Empty = new GetRestorePointCollectionArgs();

    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="restorePointCollectionName", required=true)
    private final String restorePointCollectionName;

    public String getRestorePointCollectionName() {
        return this.restorePointCollectionName;
    }

    public GetRestorePointCollectionArgs(
        @Nullable String expand,
        String resourceGroupName,
        String restorePointCollectionName) {
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorePointCollectionName = Objects.requireNonNull(restorePointCollectionName, "expected parameter 'restorePointCollectionName' to be non-null");
    }

    private GetRestorePointCollectionArgs() {
        this.expand = null;
        this.resourceGroupName = null;
        this.restorePointCollectionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRestorePointCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String resourceGroupName;
        private String restorePointCollectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRestorePointCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorePointCollectionName = defaults.restorePointCollectionName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRestorePointCollectionName(String restorePointCollectionName) {
            this.restorePointCollectionName = Objects.requireNonNull(restorePointCollectionName);
            return this;
        }

        public GetRestorePointCollectionArgs build() {
            return new GetRestorePointCollectionArgs(expand, resourceGroupName, restorePointCollectionName);
        }
    }
}
