// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.aws.eks.inputs.IdentityProviderConfigOidcGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityProviderConfigState extends io.pulumi.resources.ResourceArgs {

    public static final IdentityProviderConfigState Empty = new IdentityProviderConfigState();

    /**
     * Amazon Resource Name (ARN) of the EKS Identity Provider Configuration.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Name of the EKS Cluster.
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName == null ? Output.empty() : this.clusterName;
    }

    /**
     * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * 
     */
    @Import(name="oidc")
      private final @Nullable Output<IdentityProviderConfigOidcGetArgs> oidc;

    public Output<IdentityProviderConfigOidcGetArgs> getOidc() {
        return this.oidc == null ? Output.empty() : this.oidc;
    }

    /**
     * Status of the EKS Identity Provider Configuration.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public IdentityProviderConfigState(
        @Nullable Output<String> arn,
        @Nullable Output<String> clusterName,
        @Nullable Output<IdentityProviderConfigOidcGetArgs> oidc,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.clusterName = clusterName;
        this.oidc = oidc;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private IdentityProviderConfigState() {
        this.arn = Output.empty();
        this.clusterName = Output.empty();
        this.oidc = Output.empty();
        this.status = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProviderConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> clusterName;
        private @Nullable Output<IdentityProviderConfigOidcGetArgs> oidc;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityProviderConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clusterName = defaults.clusterName;
    	      this.oidc = defaults.oidc;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Output.ofNullable(clusterName);
            return this;
        }
        public Builder oidc(@Nullable Output<IdentityProviderConfigOidcGetArgs> oidc) {
            this.oidc = oidc;
            return this;
        }
        public Builder oidc(@Nullable IdentityProviderConfigOidcGetArgs oidc) {
            this.oidc = Output.ofNullable(oidc);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public IdentityProviderConfigState build() {
            return new IdentityProviderConfigState(arn, clusterName, oidc, status, tags, tagsAll);
        }
    }
}
