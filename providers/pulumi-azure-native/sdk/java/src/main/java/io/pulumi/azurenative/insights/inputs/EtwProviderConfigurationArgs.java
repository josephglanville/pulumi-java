// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.EtwEventConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EtwProviderConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EtwProviderConfigurationArgs Empty = new EtwProviderConfigurationArgs();

    @InputImport(name="events", required=true)
      private final Input<List<EtwEventConfigurationArgs>> events;

    public Input<List<EtwEventConfigurationArgs>> getEvents() {
        return this.events;
    }

    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    public EtwProviderConfigurationArgs(
        Input<List<EtwEventConfigurationArgs>> events,
        Input<String> id) {
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private EtwProviderConfigurationArgs() {
        this.events = Input.empty();
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EtwProviderConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<EtwEventConfigurationArgs>> events;
        private Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(EtwProviderConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.id = defaults.id;
        }

        public Builder setEvents(Input<List<EtwEventConfigurationArgs>> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setEvents(List<EtwEventConfigurationArgs> events) {
            this.events = Input.of(Objects.requireNonNull(events));
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }
        public EtwProviderConfigurationArgs build() {
            return new EtwProviderConfigurationArgs(events, id);
        }
    }
}
