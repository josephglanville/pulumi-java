// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventChannelSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventChannelSourceArgs Empty = new EventChannelSourceArgs();

    @InputImport(name="source")
    private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    public EventChannelSourceArgs(@Nullable Input<String> source) {
        this.source = source;
    }

    private EventChannelSourceArgs() {
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventChannelSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(EventChannelSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
        }

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public EventChannelSourceArgs build() {
            return new EventChannelSourceArgs(source);
        }
    }
}
