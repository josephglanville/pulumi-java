// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The AS2 agreement error settings.
 * 
 */
public final class AS2ErrorSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AS2ErrorSettingsArgs Empty = new AS2ErrorSettingsArgs();

    /**
     * The value indicating whether to resend message If MDN is not received.
     * 
     */
    @Import(name="resendIfMDNNotReceived", required=true)
      private final Output<Boolean> resendIfMDNNotReceived;

    public Output<Boolean> getResendIfMDNNotReceived() {
        return this.resendIfMDNNotReceived;
    }

    /**
     * The value indicating whether to suspend duplicate message.
     * 
     */
    @Import(name="suspendDuplicateMessage", required=true)
      private final Output<Boolean> suspendDuplicateMessage;

    public Output<Boolean> getSuspendDuplicateMessage() {
        return this.suspendDuplicateMessage;
    }

    public AS2ErrorSettingsArgs(
        Output<Boolean> resendIfMDNNotReceived,
        Output<Boolean> suspendDuplicateMessage) {
        this.resendIfMDNNotReceived = Objects.requireNonNull(resendIfMDNNotReceived, "expected parameter 'resendIfMDNNotReceived' to be non-null");
        this.suspendDuplicateMessage = Objects.requireNonNull(suspendDuplicateMessage, "expected parameter 'suspendDuplicateMessage' to be non-null");
    }

    private AS2ErrorSettingsArgs() {
        this.resendIfMDNNotReceived = Codegen.empty();
        this.suspendDuplicateMessage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2ErrorSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> resendIfMDNNotReceived;
        private Output<Boolean> suspendDuplicateMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2ErrorSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resendIfMDNNotReceived = defaults.resendIfMDNNotReceived;
    	      this.suspendDuplicateMessage = defaults.suspendDuplicateMessage;
        }

        public Builder resendIfMDNNotReceived(Output<Boolean> resendIfMDNNotReceived) {
            this.resendIfMDNNotReceived = Objects.requireNonNull(resendIfMDNNotReceived);
            return this;
        }
        public Builder resendIfMDNNotReceived(Boolean resendIfMDNNotReceived) {
            this.resendIfMDNNotReceived = Output.of(Objects.requireNonNull(resendIfMDNNotReceived));
            return this;
        }
        public Builder suspendDuplicateMessage(Output<Boolean> suspendDuplicateMessage) {
            this.suspendDuplicateMessage = Objects.requireNonNull(suspendDuplicateMessage);
            return this;
        }
        public Builder suspendDuplicateMessage(Boolean suspendDuplicateMessage) {
            this.suspendDuplicateMessage = Output.of(Objects.requireNonNull(suspendDuplicateMessage));
            return this;
        }        public AS2ErrorSettingsArgs build() {
            return new AS2ErrorSettingsArgs(resendIfMDNNotReceived, suspendDuplicateMessage);
        }
    }
}
