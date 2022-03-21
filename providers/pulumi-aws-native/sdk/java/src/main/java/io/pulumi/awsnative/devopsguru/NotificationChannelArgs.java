// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru;

import io.pulumi.awsnative.devopsguru.inputs.NotificationChannelConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class NotificationChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationChannelArgs Empty = new NotificationChannelArgs();

    @Import(name="config", required=true)
      private final Output<NotificationChannelConfigArgs> config;

    public Output<NotificationChannelConfigArgs> getConfig() {
        return this.config;
    }

    public NotificationChannelArgs(Output<NotificationChannelConfigArgs> config) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
    }

    private NotificationChannelArgs() {
        this.config = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<NotificationChannelConfigArgs> config;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
        }

        public Builder config(Output<NotificationChannelConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder config(NotificationChannelConfigArgs config) {
            this.config = Output.of(Objects.requireNonNull(config));
            return this;
        }        public NotificationChannelArgs build() {
            return new NotificationChannelArgs(config);
        }
    }
}
