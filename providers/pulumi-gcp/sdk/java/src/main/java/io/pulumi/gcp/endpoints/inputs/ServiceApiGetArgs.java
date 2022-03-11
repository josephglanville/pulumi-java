// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.endpoints.inputs.ServiceApiMethodGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceApiGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceApiGetArgs Empty = new ServiceApiGetArgs();

    @InputImport(name="methods")
      private final @Nullable Output<List<ServiceApiMethodGetArgs>> methods;

    public Output<List<ServiceApiMethodGetArgs>> getMethods() {
        return this.methods == null ? Output.empty() : this.methods;
    }

    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @InputImport(name="syntax")
      private final @Nullable Output<String> syntax;

    public Output<String> getSyntax() {
        return this.syntax == null ? Output.empty() : this.syntax;
    }

    @InputImport(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ServiceApiGetArgs(
        @Nullable Output<List<ServiceApiMethodGetArgs>> methods,
        @Nullable Output<String> name,
        @Nullable Output<String> syntax,
        @Nullable Output<String> version) {
        this.methods = methods;
        this.name = name;
        this.syntax = syntax;
        this.version = version;
    }

    private ServiceApiGetArgs() {
        this.methods = Output.empty();
        this.name = Output.empty();
        this.syntax = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceApiGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServiceApiMethodGetArgs>> methods;
        private @Nullable Output<String> name;
        private @Nullable Output<String> syntax;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceApiGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.name = defaults.name;
    	      this.syntax = defaults.syntax;
    	      this.version = defaults.version;
        }

        public Builder methods(@Nullable Output<List<ServiceApiMethodGetArgs>> methods) {
            this.methods = methods;
            return this;
        }

        public Builder methods(@Nullable List<ServiceApiMethodGetArgs> methods) {
            this.methods = Output.ofNullable(methods);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder syntax(@Nullable Output<String> syntax) {
            this.syntax = syntax;
            return this;
        }

        public Builder syntax(@Nullable String syntax) {
            this.syntax = Output.ofNullable(syntax);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public ServiceApiGetArgs build() {
            return new ServiceApiGetArgs(methods, name, syntax, version);
        }
    }
}
