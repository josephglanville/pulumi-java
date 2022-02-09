// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCloudLinkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCloudLinkArgs Empty = new GetCloudLinkArgs();

    @InputImport(name="cloudLinkName", required=true)
    private final String cloudLinkName;

    public String getCloudLinkName() {
        return this.cloudLinkName;
    }

    @InputImport(name="privateCloudName", required=true)
    private final String privateCloudName;

    public String getPrivateCloudName() {
        return this.privateCloudName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetCloudLinkArgs(
        String cloudLinkName,
        String privateCloudName,
        String resourceGroupName) {
        this.cloudLinkName = Objects.requireNonNull(cloudLinkName, "expected parameter 'cloudLinkName' to be non-null");
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetCloudLinkArgs() {
        this.cloudLinkName = null;
        this.privateCloudName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudLinkName;
        private String privateCloudName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudLinkName = defaults.cloudLinkName;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setCloudLinkName(String cloudLinkName) {
            this.cloudLinkName = Objects.requireNonNull(cloudLinkName);
            return this;
        }

        public Builder setPrivateCloudName(String privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetCloudLinkArgs build() {
            return new GetCloudLinkArgs(cloudLinkName, privateCloudName, resourceGroupName);
        }
    }
}
