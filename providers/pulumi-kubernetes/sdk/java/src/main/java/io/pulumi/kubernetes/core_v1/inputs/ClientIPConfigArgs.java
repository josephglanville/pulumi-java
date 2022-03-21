// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ClientIPConfig represents the configurations of Client IP based session affinity.
 * 
 */
public final class ClientIPConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientIPConfigArgs Empty = new ClientIPConfigArgs();

    /**
     * timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).
     * 
     */
    @Import(name="timeoutSeconds")
      private final @Nullable Output<Integer> timeoutSeconds;

    public Output<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Output.empty() : this.timeoutSeconds;
    }

    public ClientIPConfigArgs(@Nullable Output<Integer> timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    private ClientIPConfigArgs() {
        this.timeoutSeconds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientIPConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientIPConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = Output.ofNullable(timeoutSeconds);
            return this;
        }        public ClientIPConfigArgs build() {
            return new ClientIPConfigArgs(timeoutSeconds);
        }
    }
}
