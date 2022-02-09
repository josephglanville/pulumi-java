// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterProfileResponse Empty = new ClusterProfileResponse();

    @InputImport(name="domain")
    private final @Nullable String domain;

    public Optional<String> getDomain() {
        return this.domain == null ? Optional.empty() : Optional.ofNullable(this.domain);
    }

    @InputImport(name="pullSecret")
    private final @Nullable String pullSecret;

    public Optional<String> getPullSecret() {
        return this.pullSecret == null ? Optional.empty() : Optional.ofNullable(this.pullSecret);
    }

    @InputImport(name="resourceGroupId")
    private final @Nullable String resourceGroupId;

    public Optional<String> getResourceGroupId() {
        return this.resourceGroupId == null ? Optional.empty() : Optional.ofNullable(this.resourceGroupId);
    }

    @InputImport(name="version")
    private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ClusterProfileResponse(
        @Nullable String domain,
        @Nullable String pullSecret,
        @Nullable String resourceGroupId,
        @Nullable String version) {
        this.domain = domain;
        this.pullSecret = pullSecret;
        this.resourceGroupId = resourceGroupId;
        this.version = version;
    }

    private ClusterProfileResponse() {
        this.domain = null;
        this.pullSecret = null;
        this.resourceGroupId = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domain;
        private @Nullable String pullSecret;
        private @Nullable String resourceGroupId;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.pullSecret = defaults.pullSecret;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.version = defaults.version;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setPullSecret(@Nullable String pullSecret) {
            this.pullSecret = pullSecret;
            return this;
        }

        public Builder setResourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public ClusterProfileResponse build() {
            return new ClusterProfileResponse(domain, pullSecret, resourceGroupId, version);
        }
    }
}
