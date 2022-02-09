// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.engagementfabric;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelArgs Empty = new ChannelArgs();

    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    @InputImport(name="channelFunctions")
    private final @Nullable Input<List<String>> channelFunctions;

    public Input<List<String>> getChannelFunctions() {
        return this.channelFunctions == null ? Input.empty() : this.channelFunctions;
    }

    @InputImport(name="channelName")
    private final @Nullable Input<String> channelName;

    public Input<String> getChannelName() {
        return this.channelName == null ? Input.empty() : this.channelName;
    }

    @InputImport(name="channelType", required=true)
    private final Input<String> channelType;

    public Input<String> getChannelType() {
        return this.channelType;
    }

    @InputImport(name="credentials")
    private final @Nullable Input<Map<String,String>> credentials;

    public Input<Map<String,String>> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ChannelArgs(
        Input<String> accountName,
        @Nullable Input<List<String>> channelFunctions,
        @Nullable Input<String> channelName,
        Input<String> channelType,
        @Nullable Input<Map<String,String>> credentials,
        Input<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.channelFunctions = channelFunctions;
        this.channelName = channelName;
        this.channelType = Objects.requireNonNull(channelType, "expected parameter 'channelType' to be non-null");
        this.credentials = credentials;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ChannelArgs() {
        this.accountName = Input.empty();
        this.channelFunctions = Input.empty();
        this.channelName = Input.empty();
        this.channelType = Input.empty();
        this.credentials = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<List<String>> channelFunctions;
        private @Nullable Input<String> channelName;
        private Input<String> channelType;
        private @Nullable Input<Map<String,String>> credentials;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.channelFunctions = defaults.channelFunctions;
    	      this.channelName = defaults.channelName;
    	      this.channelType = defaults.channelType;
    	      this.credentials = defaults.credentials;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setChannelFunctions(@Nullable Input<List<String>> channelFunctions) {
            this.channelFunctions = channelFunctions;
            return this;
        }

        public Builder setChannelFunctions(@Nullable List<String> channelFunctions) {
            this.channelFunctions = Input.ofNullable(channelFunctions);
            return this;
        }

        public Builder setChannelName(@Nullable Input<String> channelName) {
            this.channelName = channelName;
            return this;
        }

        public Builder setChannelName(@Nullable String channelName) {
            this.channelName = Input.ofNullable(channelName);
            return this;
        }

        public Builder setChannelType(Input<String> channelType) {
            this.channelType = Objects.requireNonNull(channelType);
            return this;
        }

        public Builder setChannelType(String channelType) {
            this.channelType = Input.of(Objects.requireNonNull(channelType));
            return this;
        }

        public Builder setCredentials(@Nullable Input<Map<String,String>> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable Map<String,String> credentials) {
            this.credentials = Input.ofNullable(credentials);
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

        public ChannelArgs build() {
            return new ChannelArgs(accountName, channelFunctions, channelName, channelType, credentials, resourceGroupName);
        }
    }
}
