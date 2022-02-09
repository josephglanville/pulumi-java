// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceEndpointPropertiesFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceEndpointPropertiesFormatArgs Empty = new ServiceEndpointPropertiesFormatArgs();

    @InputImport(name="locations")
    private final @Nullable Input<List<String>> locations;

    public Input<List<String>> getLocations() {
        return this.locations == null ? Input.empty() : this.locations;
    }

    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public ServiceEndpointPropertiesFormatArgs(
        @Nullable Input<List<String>> locations,
        @Nullable Input<String> service) {
        this.locations = locations;
        this.service = service;
    }

    private ServiceEndpointPropertiesFormatArgs() {
        this.locations = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEndpointPropertiesFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> locations;
        private @Nullable Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEndpointPropertiesFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
    	      this.service = defaults.service;
        }

        public Builder setLocations(@Nullable Input<List<String>> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = Input.ofNullable(locations);
            return this;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public ServiceEndpointPropertiesFormatArgs build() {
            return new ServiceEndpointPropertiesFormatArgs(locations, service);
        }
    }
}
