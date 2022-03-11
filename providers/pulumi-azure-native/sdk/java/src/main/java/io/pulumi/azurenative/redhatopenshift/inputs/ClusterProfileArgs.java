// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ClusterProfile represents a cluster profile.
 * 
 */
public final class ClusterProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterProfileArgs Empty = new ClusterProfileArgs();

    /**
     * The domain for the cluster (immutable).
     * 
     */
    @InputImport(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Output.empty() : this.domain;
    }

    /**
     * The pull secret for the cluster (immutable).
     * 
     */
    @InputImport(name="pullSecret")
      private final @Nullable Output<String> pullSecret;

    public Output<String> getPullSecret() {
        return this.pullSecret == null ? Output.empty() : this.pullSecret;
    }

    /**
     * The ID of the cluster resource group (immutable).
     * 
     */
    @InputImport(name="resourceGroupId")
      private final @Nullable Output<String> resourceGroupId;

    public Output<String> getResourceGroupId() {
        return this.resourceGroupId == null ? Output.empty() : this.resourceGroupId;
    }

    /**
     * The version of the cluster (immutable).
     * 
     */
    @InputImport(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ClusterProfileArgs(
        @Nullable Output<String> domain,
        @Nullable Output<String> pullSecret,
        @Nullable Output<String> resourceGroupId,
        @Nullable Output<String> version) {
        this.domain = domain;
        this.pullSecret = pullSecret;
        this.resourceGroupId = resourceGroupId;
        this.version = version;
    }

    private ClusterProfileArgs() {
        this.domain = Output.empty();
        this.pullSecret = Output.empty();
        this.resourceGroupId = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domain;
        private @Nullable Output<String> pullSecret;
        private @Nullable Output<String> resourceGroupId;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.pullSecret = defaults.pullSecret;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.version = defaults.version;
        }

        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder domain(@Nullable String domain) {
            this.domain = Output.ofNullable(domain);
            return this;
        }

        public Builder pullSecret(@Nullable Output<String> pullSecret) {
            this.pullSecret = pullSecret;
            return this;
        }

        public Builder pullSecret(@Nullable String pullSecret) {
            this.pullSecret = Output.ofNullable(pullSecret);
            return this;
        }

        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = Output.ofNullable(resourceGroupId);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public ClusterProfileArgs build() {
            return new ClusterProfileArgs(domain, pullSecret, resourceGroupId, version);
        }
    }
}
