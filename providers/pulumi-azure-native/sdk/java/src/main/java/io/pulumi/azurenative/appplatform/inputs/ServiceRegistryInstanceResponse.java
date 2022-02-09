// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServiceRegistryInstanceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceRegistryInstanceResponse Empty = new ServiceRegistryInstanceResponse();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    public ServiceRegistryInstanceResponse(
        String name,
        String status) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private ServiceRegistryInstanceResponse() {
        this.name = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRegistryInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceRegistryInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public ServiceRegistryInstanceResponse build() {
            return new ServiceRegistryInstanceResponse(name, status);
        }
    }
}
