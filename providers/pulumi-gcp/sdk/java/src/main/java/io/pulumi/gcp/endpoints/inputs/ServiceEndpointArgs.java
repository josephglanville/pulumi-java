// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceEndpointArgs Empty = new ServiceEndpointArgs();

    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> getAddress() {
        return this.address == null ? Output.empty() : this.address;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public ServiceEndpointArgs(
        @Nullable Output<String> address,
        @Nullable Output<String> name) {
        this.address = address;
        this.name = name;
    }

    private ServiceEndpointArgs() {
        this.address = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.name = defaults.name;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Output.ofNullable(address);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public ServiceEndpointArgs build() {
            return new ServiceEndpointArgs(address, name);
        }
    }
}
