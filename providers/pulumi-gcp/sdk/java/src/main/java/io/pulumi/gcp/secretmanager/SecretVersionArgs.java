// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretVersionArgs Empty = new SecretVersionArgs();

    /**
     * The current state of the SecretVersion.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Secret Manager secret resource
     * 
     */
    @Import(name="secret", required=true)
      private final Output<String> secret;

    public Output<String> getSecret() {
        return this.secret;
    }

    /**
     * The secret data. Must be no larger than 64KiB.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="secretData", required=true)
      private final Output<String> secretData;

    public Output<String> getSecretData() {
        return this.secretData;
    }

    public SecretVersionArgs(
        @Nullable Output<Boolean> enabled,
        Output<String> secret,
        Output<String> secretData) {
        this.enabled = enabled;
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
        this.secretData = Objects.requireNonNull(secretData, "expected parameter 'secretData' to be non-null");
    }

    private SecretVersionArgs() {
        this.enabled = Output.empty();
        this.secret = Output.empty();
        this.secretData = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private Output<String> secret;
        private Output<String> secretData;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.secret = defaults.secret;
    	      this.secretData = defaults.secretData;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder secret(Output<String> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public Builder secret(String secret) {
            this.secret = Output.of(Objects.requireNonNull(secret));
            return this;
        }
        public Builder secretData(Output<String> secretData) {
            this.secretData = Objects.requireNonNull(secretData);
            return this;
        }
        public Builder secretData(String secretData) {
            this.secretData = Output.of(Objects.requireNonNull(secretData));
            return this;
        }        public SecretVersionArgs build() {
            return new SecretVersionArgs(enabled, secret, secretData);
        }
    }
}
