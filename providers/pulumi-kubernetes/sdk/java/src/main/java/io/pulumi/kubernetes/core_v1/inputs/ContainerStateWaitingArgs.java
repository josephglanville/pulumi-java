// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerStateWaiting is a waiting state of a container.
 * 
 */
public final class ContainerStateWaitingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerStateWaitingArgs Empty = new ContainerStateWaitingArgs();

    /**
     * Message regarding why the container is not yet running.
     * 
     */
    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * (brief) reason the container is not yet running.
     * 
     */
    @InputImport(name="reason")
      private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    public ContainerStateWaitingArgs(
        @Nullable Input<String> message,
        @Nullable Input<String> reason) {
        this.message = message;
        this.reason = reason;
    }

    private ContainerStateWaitingArgs() {
        this.message = Input.empty();
        this.reason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateWaitingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> message;
        private @Nullable Input<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateWaitingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }
        public ContainerStateWaitingArgs build() {
            return new ContainerStateWaitingArgs(message, reason);
        }
    }
}
