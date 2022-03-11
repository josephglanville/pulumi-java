// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateServiceAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateServiceAccountArgs Empty = new InstanceTemplateServiceAccountArgs();

    /**
     * The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * 
     */
    @InputImport(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Output.empty() : this.email;
    }

    /**
     * A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * 
     */
    @InputImport(name="scopes", required=true)
      private final Output<List<String>> scopes;

    public Output<List<String>> getScopes() {
        return this.scopes;
    }

    public InstanceTemplateServiceAccountArgs(
        @Nullable Output<String> email,
        Output<List<String>> scopes) {
        this.email = email;
        this.scopes = Objects.requireNonNull(scopes, "expected parameter 'scopes' to be non-null");
    }

    private InstanceTemplateServiceAccountArgs() {
        this.email = Output.empty();
        this.scopes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> email;
        private Output<List<String>> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateServiceAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(@Nullable String email) {
            this.email = Output.ofNullable(email);
            return this;
        }

        public Builder scopes(Output<List<String>> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public Builder scopes(List<String> scopes) {
            this.scopes = Output.of(Objects.requireNonNull(scopes));
            return this;
        }
        public InstanceTemplateServiceAccountArgs build() {
            return new InstanceTemplateServiceAccountArgs(email, scopes);
        }
    }
}
