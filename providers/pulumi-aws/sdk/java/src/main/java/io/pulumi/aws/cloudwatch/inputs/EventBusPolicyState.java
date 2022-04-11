// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventBusPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final EventBusPolicyState Empty = new EventBusPolicyState();

    /**
     * The event bus to set the permissions on. If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    @Import(name="eventBusName")
      private final @Nullable Output<String> eventBusName;

    public Output<String> getEventBusName() {
        return this.eventBusName == null ? Codegen.empty() : this.eventBusName;
    }

    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    public EventBusPolicyState(
        @Nullable Output<String> eventBusName,
        @Nullable Output<String> policy) {
        this.eventBusName = eventBusName;
        this.policy = policy;
    }

    private EventBusPolicyState() {
        this.eventBusName = Codegen.empty();
        this.policy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventBusPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eventBusName;
        private @Nullable Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(EventBusPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventBusName = defaults.eventBusName;
    	      this.policy = defaults.policy;
        }

        public Builder eventBusName(@Nullable Output<String> eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public Builder eventBusName(@Nullable String eventBusName) {
            this.eventBusName = Codegen.ofNullable(eventBusName);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }        public EventBusPolicyState build() {
            return new EventBusPolicyState(eventBusName, policy);
        }
    }
}
