// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceServiceAccountGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceServiceAccountGetArgs Empty = new InstanceServiceAccountGetArgs();

    /**
     * The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Output.empty() : this.email;
    }

    /**
     * A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    @Import(name="scopes", required=true)
      private final Output<List<String>> scopes;

    public Output<List<String>> getScopes() {
        return this.scopes;
    }

    public InstanceServiceAccountGetArgs(
        @Nullable Output<String> email,
        Output<List<String>> scopes) {
        this.email = email;
        this.scopes = Objects.requireNonNull(scopes, "expected parameter 'scopes' to be non-null");
    }

    private InstanceServiceAccountGetArgs() {
        this.email = Output.empty();
        this.scopes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceServiceAccountGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> email;
        private Output<List<String>> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceServiceAccountGetArgs defaults) {
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
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }        public InstanceServiceAccountGetArgs build() {
            return new InstanceServiceAccountGetArgs(email, scopes);
        }
    }
}
