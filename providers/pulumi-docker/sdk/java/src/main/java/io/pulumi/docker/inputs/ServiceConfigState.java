// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceConfigState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceConfigState Empty = new ServiceConfigState();

    /**
     * Base64-url-safe-encoded config data
     * 
     */
    @Import(name="data")
      private final @Nullable Output<String> data;

    public Output<String> getData() {
        return this.data == null ? Output.empty() : this.data;
    }

    /**
     * User-defined name of the config
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public ServiceConfigState(
        @Nullable Output<String> data,
        @Nullable Output<String> name) {
        this.data = data;
        this.name = name;
    }

    private ServiceConfigState() {
        this.data = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> data;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.name = defaults.name;
        }

        public Builder data(@Nullable Output<String> data) {
            this.data = data;
            return this;
        }
        public Builder data(@Nullable String data) {
            this.data = Output.ofNullable(data);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public ServiceConfigState build() {
            return new ServiceConfigState(data, name);
        }
    }
}
