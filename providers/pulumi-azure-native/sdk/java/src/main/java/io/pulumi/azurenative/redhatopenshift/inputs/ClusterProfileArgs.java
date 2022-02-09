// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterProfileArgs Empty = new ClusterProfileArgs();

    @InputImport(name="domain")
    private final @Nullable Input<String> domain;

    public Input<String> getDomain() {
        return this.domain == null ? Input.empty() : this.domain;
    }

    @InputImport(name="pullSecret")
    private final @Nullable Input<String> pullSecret;

    public Input<String> getPullSecret() {
        return this.pullSecret == null ? Input.empty() : this.pullSecret;
    }

    @InputImport(name="resourceGroupId")
    private final @Nullable Input<String> resourceGroupId;

    public Input<String> getResourceGroupId() {
        return this.resourceGroupId == null ? Input.empty() : this.resourceGroupId;
    }

    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ClusterProfileArgs(
        @Nullable Input<String> domain,
        @Nullable Input<String> pullSecret,
        @Nullable Input<String> resourceGroupId,
        @Nullable Input<String> version) {
        this.domain = domain;
        this.pullSecret = pullSecret;
        this.resourceGroupId = resourceGroupId;
        this.version = version;
    }

    private ClusterProfileArgs() {
        this.domain = Input.empty();
        this.pullSecret = Input.empty();
        this.resourceGroupId = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domain;
        private @Nullable Input<String> pullSecret;
        private @Nullable Input<String> resourceGroupId;
        private @Nullable Input<String> version;

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

        public Builder setDomain(@Nullable Input<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = Input.ofNullable(domain);
            return this;
        }

        public Builder setPullSecret(@Nullable Input<String> pullSecret) {
            this.pullSecret = pullSecret;
            return this;
        }

        public Builder setPullSecret(@Nullable String pullSecret) {
            this.pullSecret = Input.ofNullable(pullSecret);
            return this;
        }

        public Builder setResourceGroupId(@Nullable Input<String> resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public Builder setResourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = Input.ofNullable(resourceGroupId);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public ClusterProfileArgs build() {
            return new ClusterProfileArgs(domain, pullSecret, resourceGroupId, version);
        }
    }
}
