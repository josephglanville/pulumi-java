// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EventSource contains information for an event.
 * 
 */
public final class EventSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceArgs Empty = new EventSourceArgs();

    /**
     * Component from which the event is generated.
     * 
     */
    @Import(name="component")
      private final @Nullable Output<String> component;

    public Output<String> getComponent() {
        return this.component == null ? Output.empty() : this.component;
    }

    /**
     * Node name on which the event is generated.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Output.empty() : this.host;
    }

    public EventSourceArgs(
        @Nullable Output<String> component,
        @Nullable Output<String> host) {
        this.component = component;
        this.host = host;
    }

    private EventSourceArgs() {
        this.component = Output.empty();
        this.host = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> component;
        private @Nullable Output<String> host;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.component = defaults.component;
    	      this.host = defaults.host;
        }

        public Builder component(@Nullable Output<String> component) {
            this.component = component;
            return this;
        }
        public Builder component(@Nullable String component) {
            this.component = Output.ofNullable(component);
            return this;
        }
        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = Output.ofNullable(host);
            return this;
        }        public EventSourceArgs build() {
            return new EventSourceArgs(component, host);
        }
    }
}
