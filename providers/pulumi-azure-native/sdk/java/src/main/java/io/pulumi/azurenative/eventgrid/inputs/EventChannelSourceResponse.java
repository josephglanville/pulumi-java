// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the source of an event channel.
 * 
 */
public final class EventChannelSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventChannelSourceResponse Empty = new EventChannelSourceResponse();

    /**
     * The identifier of the resource that's the source of the events.
     * This represents a unique resource in the partner's resource model.
     * 
     */
    @InputImport(name="source")
      private final @Nullable String source;

    public Optional<String> getSource() {
        return this.source == null ? Optional.empty() : Optional.ofNullable(this.source);
    }

    public EventChannelSourceResponse(@Nullable String source) {
        this.source = source;
    }

    private EventChannelSourceResponse() {
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventChannelSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String source;

        public Builder() {
    	      // Empty
        }

        public Builder(EventChannelSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
        }

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }
        public EventChannelSourceResponse build() {
            return new EventChannelSourceResponse(source);
        }
    }
}
