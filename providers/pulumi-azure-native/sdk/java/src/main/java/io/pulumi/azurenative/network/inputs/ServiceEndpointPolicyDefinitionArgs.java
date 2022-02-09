// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceEndpointPolicyDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceEndpointPolicyDefinitionArgs Empty = new ServiceEndpointPolicyDefinitionArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    @InputImport(name="serviceResources")
    private final @Nullable Input<List<String>> serviceResources;

    public Input<List<String>> getServiceResources() {
        return this.serviceResources == null ? Input.empty() : this.serviceResources;
    }

    public ServiceEndpointPolicyDefinitionArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<String> service,
        @Nullable Input<List<String>> serviceResources) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.service = service;
        this.serviceResources = serviceResources;
    }

    private ServiceEndpointPolicyDefinitionArgs() {
        this.description = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.service = Input.empty();
        this.serviceResources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEndpointPolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<String> service;
        private @Nullable Input<List<String>> serviceResources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEndpointPolicyDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.service = defaults.service;
    	      this.serviceResources = defaults.serviceResources;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setServiceResources(@Nullable Input<List<String>> serviceResources) {
            this.serviceResources = serviceResources;
            return this;
        }

        public Builder setServiceResources(@Nullable List<String> serviceResources) {
            this.serviceResources = Input.ofNullable(serviceResources);
            return this;
        }

        public ServiceEndpointPolicyDefinitionArgs build() {
            return new ServiceEndpointPolicyDefinitionArgs(description, id, name, service, serviceResources);
        }
    }
}
