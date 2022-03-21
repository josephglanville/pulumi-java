// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iap_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityAwareProxyClientArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityAwareProxyClientArgs Empty = new IdentityAwareProxyClientArgs();

    @Import(name="brandId", required=true)
      private final Output<String> brandId;

    public Output<String> getBrandId() {
        return this.brandId;
    }

    /**
     * Human-friendly name given to the OAuth client.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public IdentityAwareProxyClientArgs(
        Output<String> brandId,
        @Nullable Output<String> displayName,
        @Nullable Output<String> project) {
        this.brandId = Objects.requireNonNull(brandId, "expected parameter 'brandId' to be non-null");
        this.displayName = displayName;
        this.project = project;
    }

    private IdentityAwareProxyClientArgs() {
        this.brandId = Output.empty();
        this.displayName = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityAwareProxyClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> brandId;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityAwareProxyClientArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brandId = defaults.brandId;
    	      this.displayName = defaults.displayName;
    	      this.project = defaults.project;
        }

        public Builder brandId(Output<String> brandId) {
            this.brandId = Objects.requireNonNull(brandId);
            return this;
        }
        public Builder brandId(String brandId) {
            this.brandId = Output.of(Objects.requireNonNull(brandId));
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public IdentityAwareProxyClientArgs build() {
            return new IdentityAwareProxyClientArgs(brandId, displayName, project);
        }
    }
}
