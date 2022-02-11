// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ClientIPConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SessionAffinityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SessionAffinityConfigArgs Empty = new SessionAffinityConfigArgs();

    @InputImport(name="clientIP")
    private final @Nullable Input<ClientIPConfigArgs> clientIP;

    public Input<ClientIPConfigArgs> getClientIP() {
        return this.clientIP == null ? Input.empty() : this.clientIP;
    }

    public SessionAffinityConfigArgs(@Nullable Input<ClientIPConfigArgs> clientIP) {
        this.clientIP = clientIP;
    }

    private SessionAffinityConfigArgs() {
        this.clientIP = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SessionAffinityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClientIPConfigArgs> clientIP;

        public Builder() {
    	      // Empty
        }

        public Builder(SessionAffinityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientIP = defaults.clientIP;
        }

        public Builder setClientIP(@Nullable Input<ClientIPConfigArgs> clientIP) {
            this.clientIP = clientIP;
            return this;
        }

        public Builder setClientIP(@Nullable ClientIPConfigArgs clientIP) {
            this.clientIP = Input.ofNullable(clientIP);
            return this;
        }

        public SessionAffinityConfigArgs build() {
            return new SessionAffinityConfigArgs(clientIP);
        }
    }
}
