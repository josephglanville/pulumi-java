// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLabArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLabArgs Empty = new GetLabArgs();

    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    @InputImport(name="labAccountName", required=true)
    private final String labAccountName;

    public String getLabAccountName() {
        return this.labAccountName;
    }

    @InputImport(name="labName", required=true)
    private final String labName;

    public String getLabName() {
        return this.labName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetLabArgs(
        @Nullable String expand,
        String labAccountName,
        String labName,
        String resourceGroupName) {
        this.expand = expand;
        this.labAccountName = Objects.requireNonNull(labAccountName, "expected parameter 'labAccountName' to be non-null");
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetLabArgs() {
        this.expand = null;
        this.labAccountName = null;
        this.labName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLabArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String labAccountName;
        private String labName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLabArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.labAccountName = defaults.labAccountName;
    	      this.labName = defaults.labName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setLabAccountName(String labAccountName) {
            this.labAccountName = Objects.requireNonNull(labAccountName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetLabArgs build() {
            return new GetLabArgs(expand, labAccountName, labName, resourceGroupName);
        }
    }
}
