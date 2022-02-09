// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notebooks;

import io.pulumi.azurenative.notebooks.inputs.NotebookResourceSystemDataArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotebookProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotebookProxyArgs Empty = new NotebookProxyArgs();

    @InputImport(name="hostname")
    private final @Nullable Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname == null ? Input.empty() : this.hostname;
    }

    @InputImport(name="publicDns")
    private final @Nullable Input<String> publicDns;

    public Input<String> getPublicDns() {
        return this.publicDns == null ? Input.empty() : this.publicDns;
    }

    @InputImport(name="publicNetworkAccess")
    private final @Nullable Input<String> publicNetworkAccess;

    public Input<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceName")
    private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    @InputImport(name="secondaryAppId")
    private final @Nullable Input<String> secondaryAppId;

    public Input<String> getSecondaryAppId() {
        return this.secondaryAppId == null ? Input.empty() : this.secondaryAppId;
    }

    @InputImport(name="systemData")
    private final @Nullable Input<NotebookResourceSystemDataArgs> systemData;

    public Input<NotebookResourceSystemDataArgs> getSystemData() {
        return this.systemData == null ? Input.empty() : this.systemData;
    }

    public NotebookProxyArgs(
        @Nullable Input<String> hostname,
        @Nullable Input<String> publicDns,
        @Nullable Input<String> publicNetworkAccess,
        @Nullable Input<String> region,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<String> secondaryAppId,
        @Nullable Input<NotebookResourceSystemDataArgs> systemData) {
        this.hostname = hostname;
        this.publicDns = publicDns;
        this.publicNetworkAccess = publicNetworkAccess;
        this.region = region;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.secondaryAppId = secondaryAppId;
        this.systemData = systemData;
    }

    private NotebookProxyArgs() {
        this.hostname = Input.empty();
        this.publicDns = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.region = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.secondaryAppId = Input.empty();
        this.systemData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hostname;
        private @Nullable Input<String> publicDns;
        private @Nullable Input<String> publicNetworkAccess;
        private @Nullable Input<String> region;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<String> secondaryAppId;
        private @Nullable Input<NotebookResourceSystemDataArgs> systemData;

        public Builder() {
    	      // Empty
        }

        public Builder(NotebookProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.publicDns = defaults.publicDns;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.region = defaults.region;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.secondaryAppId = defaults.secondaryAppId;
    	      this.systemData = defaults.systemData;
        }

        public Builder setHostname(@Nullable Input<String> hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = Input.ofNullable(hostname);
            return this;
        }

        public Builder setPublicDns(@Nullable Input<String> publicDns) {
            this.publicDns = publicDns;
            return this;
        }

        public Builder setPublicDns(@Nullable String publicDns) {
            this.publicDns = Input.ofNullable(publicDns);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<String> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
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

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setSecondaryAppId(@Nullable Input<String> secondaryAppId) {
            this.secondaryAppId = secondaryAppId;
            return this;
        }

        public Builder setSecondaryAppId(@Nullable String secondaryAppId) {
            this.secondaryAppId = Input.ofNullable(secondaryAppId);
            return this;
        }

        public Builder setSystemData(@Nullable Input<NotebookResourceSystemDataArgs> systemData) {
            this.systemData = systemData;
            return this;
        }

        public Builder setSystemData(@Nullable NotebookResourceSystemDataArgs systemData) {
            this.systemData = Input.ofNullable(systemData);
            return this;
        }

        public NotebookProxyArgs build() {
            return new NotebookProxyArgs(hostname, publicDns, publicNetworkAccess, region, resourceGroupName, resourceName, secondaryAppId, systemData);
        }
    }
}
