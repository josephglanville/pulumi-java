// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTreeInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTreeInfoArgs Empty = new ServiceTreeInfoArgs();

    @Import(name="componentId")
      private final @Nullable Output<String> componentId;

    public Output<String> getComponentId() {
        return this.componentId == null ? Output.empty() : this.componentId;
    }

    @Import(name="serviceId")
      private final @Nullable Output<String> serviceId;

    public Output<String> getServiceId() {
        return this.serviceId == null ? Output.empty() : this.serviceId;
    }

    public ServiceTreeInfoArgs(
        @Nullable Output<String> componentId,
        @Nullable Output<String> serviceId) {
        this.componentId = componentId;
        this.serviceId = serviceId;
    }

    private ServiceTreeInfoArgs() {
        this.componentId = Output.empty();
        this.serviceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTreeInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> componentId;
        private @Nullable Output<String> serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTreeInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentId = defaults.componentId;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder componentId(@Nullable Output<String> componentId) {
            this.componentId = componentId;
            return this;
        }
        public Builder componentId(@Nullable String componentId) {
            this.componentId = Output.ofNullable(componentId);
            return this;
        }
        public Builder serviceId(@Nullable Output<String> serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Builder serviceId(@Nullable String serviceId) {
            this.serviceId = Output.ofNullable(serviceId);
            return this;
        }        public ServiceTreeInfoArgs build() {
            return new ServiceTreeInfoArgs(componentId, serviceId);
        }
    }
}
