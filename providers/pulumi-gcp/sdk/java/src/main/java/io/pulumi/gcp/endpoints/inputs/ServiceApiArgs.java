// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.endpoints.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.endpoints.inputs.ServiceApiMethodArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceApiArgs Empty = new ServiceApiArgs();

    @InputImport(name="methods")
      private final @Nullable Output<List<ServiceApiMethodArgs>> methods;

    public Output<List<ServiceApiMethodArgs>> getMethods() {
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

    public ServiceApiArgs(
        @Nullable Output<List<ServiceApiMethodArgs>> methods,
        @Nullable Output<String> name,
        @Nullable Output<String> syntax,
        @Nullable Output<String> version) {
        this.methods = methods;
        this.name = name;
        this.syntax = syntax;
        this.version = version;
    }

    private ServiceApiArgs() {
        this.methods = Output.empty();
        this.name = Output.empty();
        this.syntax = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServiceApiMethodArgs>> methods;
        private @Nullable Output<String> name;
        private @Nullable Output<String> syntax;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.name = defaults.name;
    	      this.syntax = defaults.syntax;
    	      this.version = defaults.version;
        }

        public Builder methods(@Nullable Output<List<ServiceApiMethodArgs>> methods) {
            this.methods = methods;
            return this;
        }

        public Builder methods(@Nullable List<ServiceApiMethodArgs> methods) {
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
        public ServiceApiArgs build() {
            return new ServiceApiArgs(methods, name, syntax, version);
        }
    }
}
