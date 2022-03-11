// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerWebhookConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerWebhookConfigArgs Empty = new TriggerWebhookConfigArgs();

    /**
     * Secrets to decrypt using Cloud Key Management Service.
     * Structure is documented below.
     * 
     */
    @InputImport(name="secret", required=true)
      private final Output<String> secret;

    public Output<String> getSecret() {
        return this.secret;
    }

    /**
     * - 
     * Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public TriggerWebhookConfigArgs(
        Output<String> secret,
        @Nullable Output<String> state) {
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
        this.state = state;
    }

    private TriggerWebhookConfigArgs() {
        this.secret = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerWebhookConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> secret;
        private @Nullable Output<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerWebhookConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secret = defaults.secret;
    	      this.state = defaults.state;
        }

        public Builder secret(Output<String> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder secret(String secret) {
            this.secret = Output.of(Objects.requireNonNull(secret));
            return this;
        }

        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public TriggerWebhookConfigArgs build() {
            return new TriggerWebhookConfigArgs(secret, state);
        }
    }
}
