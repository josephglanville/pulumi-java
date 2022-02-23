// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.EtwEventConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EtwProviderConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final EtwProviderConfigurationResponse Empty = new EtwProviderConfigurationResponse();

    @InputImport(name="events", required=true)
      private final List<EtwEventConfigurationResponse> events;

    public List<EtwEventConfigurationResponse> getEvents() {
        return this.events;
    }

    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    public EtwProviderConfigurationResponse(
        List<EtwEventConfigurationResponse> events,
        String id) {
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private EtwProviderConfigurationResponse() {
        this.events = List.of();
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EtwProviderConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<EtwEventConfigurationResponse> events;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(EtwProviderConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.id = defaults.id;
        }

        public Builder setEvents(List<EtwEventConfigurationResponse> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public EtwProviderConfigurationResponse build() {
            return new EtwProviderConfigurationResponse(events, id);
        }
    }
}
