// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvFromGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvFromGetArgs Empty = new ServiceTemplateSpecContainerEnvFromGetArgs();

    /**
     * The ConfigMap to select from.
     * Structure is documented below.
     * 
     */
    @Import(name="configMapRef")
      private final @Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs> configMapRef;

    public Output<ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs> getConfigMapRef() {
        return this.configMapRef == null ? Output.empty() : this.configMapRef;
    }

    /**
     * An optional identifier to prepend to each key in the ConfigMap.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * The Secret to select from.
     * Structure is documented below.
     * 
     */
    @Import(name="secretRef")
      private final @Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefGetArgs> secretRef;

    public Output<ServiceTemplateSpecContainerEnvFromSecretRefGetArgs> getSecretRef() {
        return this.secretRef == null ? Output.empty() : this.secretRef;
    }

    public ServiceTemplateSpecContainerEnvFromGetArgs(
        @Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs> configMapRef,
        @Nullable Output<String> prefix,
        @Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefGetArgs> secretRef) {
        this.configMapRef = configMapRef;
        this.prefix = prefix;
        this.secretRef = secretRef;
    }

    private ServiceTemplateSpecContainerEnvFromGetArgs() {
        this.configMapRef = Output.empty();
        this.prefix = Output.empty();
        this.secretRef = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFromGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs> configMapRef;
        private @Nullable Output<String> prefix;
        private @Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefGetArgs> secretRef;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvFromGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapRef = defaults.configMapRef;
    	      this.prefix = defaults.prefix;
    	      this.secretRef = defaults.secretRef;
        }

        public Builder configMapRef(@Nullable Output<ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs> configMapRef) {
            this.configMapRef = configMapRef;
            return this;
        }
        public Builder configMapRef(@Nullable ServiceTemplateSpecContainerEnvFromConfigMapRefGetArgs configMapRef) {
            this.configMapRef = Output.ofNullable(configMapRef);
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }
        public Builder secretRef(@Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefGetArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public Builder secretRef(@Nullable ServiceTemplateSpecContainerEnvFromSecretRefGetArgs secretRef) {
            this.secretRef = Output.ofNullable(secretRef);
            return this;
        }        public ServiceTemplateSpecContainerEnvFromGetArgs build() {
            return new ServiceTemplateSpecContainerEnvFromGetArgs(configMapRef, prefix, secretRef);
        }
    }
}
