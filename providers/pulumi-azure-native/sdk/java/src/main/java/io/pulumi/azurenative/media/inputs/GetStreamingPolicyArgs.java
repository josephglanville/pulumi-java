// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStreamingPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStreamingPolicyArgs Empty = new GetStreamingPolicyArgs();

    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="streamingPolicyName", required=true)
    private final String streamingPolicyName;

    public String getStreamingPolicyName() {
        return this.streamingPolicyName;
    }

    public GetStreamingPolicyArgs(
        String accountName,
        String resourceGroupName,
        String streamingPolicyName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.streamingPolicyName = Objects.requireNonNull(streamingPolicyName, "expected parameter 'streamingPolicyName' to be non-null");
    }

    private GetStreamingPolicyArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.streamingPolicyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;
        private String streamingPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.streamingPolicyName = defaults.streamingPolicyName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setStreamingPolicyName(String streamingPolicyName) {
            this.streamingPolicyName = Objects.requireNonNull(streamingPolicyName);
            return this;
        }

        public GetStreamingPolicyArgs build() {
            return new GetStreamingPolicyArgs(accountName, resourceGroupName, streamingPolicyName);
        }
    }
}
