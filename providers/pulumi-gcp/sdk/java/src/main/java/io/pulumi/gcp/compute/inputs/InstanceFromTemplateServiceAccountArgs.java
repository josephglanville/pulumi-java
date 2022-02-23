// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromTemplateServiceAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateServiceAccountArgs Empty = new InstanceFromTemplateServiceAccountArgs();

    @InputImport(name="email")
      private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    @InputImport(name="scopes", required=true)
      private final Input<List<String>> scopes;

    public Input<List<String>> getScopes() {
        return this.scopes;
    }

    public InstanceFromTemplateServiceAccountArgs(
        @Nullable Input<String> email,
        Input<List<String>> scopes) {
        this.email = email;
        this.scopes = Objects.requireNonNull(scopes, "expected parameter 'scopes' to be non-null");
    }

    private InstanceFromTemplateServiceAccountArgs() {
        this.email = Input.empty();
        this.scopes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> email;
        private Input<List<String>> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateServiceAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder setEmail(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setScopes(Input<List<String>> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Input.of(Objects.requireNonNull(scopes));
            return this;
        }
        public InstanceFromTemplateServiceAccountArgs build() {
            return new InstanceFromTemplateServiceAccountArgs(email, scopes);
        }
    }
}
