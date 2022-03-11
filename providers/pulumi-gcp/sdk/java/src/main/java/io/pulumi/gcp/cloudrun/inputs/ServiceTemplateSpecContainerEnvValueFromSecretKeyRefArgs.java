// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs Empty = new ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs();

    /**
     * The Cloud Secret Manager secret version.
     * Can be 'latest' for the latest value or an integer for a specific version.
     * 
     */
    @InputImport(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Volume's name.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs(
        Output<String> key,
        Output<String> name) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs() {
        this.key = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs build() {
            return new ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs(key, name);
        }
    }
}
