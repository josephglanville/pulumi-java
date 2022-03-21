// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfgurationSetDeliveryOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfgurationSetDeliveryOptionsArgs Empty = new ConfgurationSetDeliveryOptionsArgs();

    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is `Require`, messages are only delivered if a TLS connection can be established. If the value is `Optional`, messages can be delivered in plain text if a TLS connection can't be established. Valid values: `Require` or `Optional`. Defaults to `Optional`.
     * 
     */
    @Import(name="tlsPolicy")
      private final @Nullable Output<String> tlsPolicy;

    public Output<String> getTlsPolicy() {
        return this.tlsPolicy == null ? Output.empty() : this.tlsPolicy;
    }

    public ConfgurationSetDeliveryOptionsArgs(@Nullable Output<String> tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
    }

    private ConfgurationSetDeliveryOptionsArgs() {
        this.tlsPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfgurationSetDeliveryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> tlsPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfgurationSetDeliveryOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tlsPolicy = defaults.tlsPolicy;
        }

        public Builder tlsPolicy(@Nullable Output<String> tlsPolicy) {
            this.tlsPolicy = tlsPolicy;
            return this;
        }
        public Builder tlsPolicy(@Nullable String tlsPolicy) {
            this.tlsPolicy = Output.ofNullable(tlsPolicy);
            return this;
        }        public ConfgurationSetDeliveryOptionsArgs build() {
            return new ConfgurationSetDeliveryOptionsArgs(tlsPolicy);
        }
    }
}
