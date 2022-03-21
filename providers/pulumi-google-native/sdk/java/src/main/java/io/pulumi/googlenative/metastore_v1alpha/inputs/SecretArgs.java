// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A securely stored value.
 * 
 */
public final class SecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * The relative resource name of a Secret Manager secret version, in the following form:projects/{project_number}/secrets/{secret_id}/versions/{version_id}.
     * 
     */
    @Import(name="cloudSecret")
      private final @Nullable Output<String> cloudSecret;

    public Output<String> getCloudSecret() {
        return this.cloudSecret == null ? Output.empty() : this.cloudSecret;
    }

    public SecretArgs(@Nullable Output<String> cloudSecret) {
        this.cloudSecret = cloudSecret;
    }

    private SecretArgs() {
        this.cloudSecret = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSecret = defaults.cloudSecret;
        }

        public Builder cloudSecret(@Nullable Output<String> cloudSecret) {
            this.cloudSecret = cloudSecret;
            return this;
        }
        public Builder cloudSecret(@Nullable String cloudSecret) {
            this.cloudSecret = Output.ofNullable(cloudSecret);
            return this;
        }        public SecretArgs build() {
            return new SecretArgs(cloudSecret);
        }
    }
}
