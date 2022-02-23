// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloudLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudLinkArgs Empty = new CloudLinkArgs();

    /**
     * Name of the cloud link resource
     * 
     */
    @InputImport(name="cloudLinkName")
      private final @Nullable Input<String> cloudLinkName;

    public Input<String> getCloudLinkName() {
        return this.cloudLinkName == null ? Input.empty() : this.cloudLinkName;
    }

    /**
     * Identifier of the other private cloud participating in the link.
     * 
     */
    @InputImport(name="linkedCloud")
      private final @Nullable Input<String> linkedCloud;

    public Input<String> getLinkedCloud() {
        return this.linkedCloud == null ? Input.empty() : this.linkedCloud;
    }

    /**
     * The name of the private cloud.
     * 
     */
    @InputImport(name="privateCloudName", required=true)
      private final Input<String> privateCloudName;

    public Input<String> getPrivateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public CloudLinkArgs(
        @Nullable Input<String> cloudLinkName,
        @Nullable Input<String> linkedCloud,
        Input<String> privateCloudName,
        Input<String> resourceGroupName) {
        this.cloudLinkName = cloudLinkName;
        this.linkedCloud = linkedCloud;
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private CloudLinkArgs() {
        this.cloudLinkName = Input.empty();
        this.linkedCloud = Input.empty();
        this.privateCloudName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudLinkName;
        private @Nullable Input<String> linkedCloud;
        private Input<String> privateCloudName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudLinkName = defaults.cloudLinkName;
    	      this.linkedCloud = defaults.linkedCloud;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setCloudLinkName(@Nullable Input<String> cloudLinkName) {
            this.cloudLinkName = cloudLinkName;
            return this;
        }

        public Builder setCloudLinkName(@Nullable String cloudLinkName) {
            this.cloudLinkName = Input.ofNullable(cloudLinkName);
            return this;
        }

        public Builder setLinkedCloud(@Nullable Input<String> linkedCloud) {
            this.linkedCloud = linkedCloud;
            return this;
        }

        public Builder setLinkedCloud(@Nullable String linkedCloud) {
            this.linkedCloud = Input.ofNullable(linkedCloud);
            return this;
        }

        public Builder setPrivateCloudName(Input<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder setPrivateCloudName(String privateCloudName) {
            this.privateCloudName = Input.of(Objects.requireNonNull(privateCloudName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public CloudLinkArgs build() {
            return new CloudLinkArgs(cloudLinkName, linkedCloud, privateCloudName, resourceGroupName);
        }
    }
}
