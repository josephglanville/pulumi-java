// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1alpha1.inputs.ConfigMapEnvSourceArgs;
import io.pulumi.googlenative.run_v1alpha1.inputs.SecretEnvSourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run EnvFromSource represents the source of a set of ConfigMaps
 * 
 */
public final class EnvFromSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvFromSourceArgs Empty = new EnvFromSourceArgs();

    /**
     * (Optional) The ConfigMap to select from
     * 
     */
    @Import(name="configMapRef")
      private final @Nullable Output<ConfigMapEnvSourceArgs> configMapRef;

    public Output<ConfigMapEnvSourceArgs> getConfigMapRef() {
        return this.configMapRef == null ? Output.empty() : this.configMapRef;
    }

    /**
     * (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * (Optional) The Secret to select from
     * 
     */
    @Import(name="secretRef")
      private final @Nullable Output<SecretEnvSourceArgs> secretRef;

    public Output<SecretEnvSourceArgs> getSecretRef() {
        return this.secretRef == null ? Output.empty() : this.secretRef;
    }

    public EnvFromSourceArgs(
        @Nullable Output<ConfigMapEnvSourceArgs> configMapRef,
        @Nullable Output<String> prefix,
        @Nullable Output<SecretEnvSourceArgs> secretRef) {
        this.configMapRef = configMapRef;
        this.prefix = prefix;
        this.secretRef = secretRef;
    }

    private EnvFromSourceArgs() {
        this.configMapRef = Output.empty();
        this.prefix = Output.empty();
        this.secretRef = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvFromSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigMapEnvSourceArgs> configMapRef;
        private @Nullable Output<String> prefix;
        private @Nullable Output<SecretEnvSourceArgs> secretRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvFromSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapRef = defaults.configMapRef;
    	      this.prefix = defaults.prefix;
    	      this.secretRef = defaults.secretRef;
        }

        public Builder configMapRef(@Nullable Output<ConfigMapEnvSourceArgs> configMapRef) {
            this.configMapRef = configMapRef;
            return this;
        }
        public Builder configMapRef(@Nullable ConfigMapEnvSourceArgs configMapRef) {
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
        public Builder secretRef(@Nullable Output<SecretEnvSourceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public Builder secretRef(@Nullable SecretEnvSourceArgs secretRef) {
            this.secretRef = Output.ofNullable(secretRef);
            return this;
        }        public EnvFromSourceArgs build() {
            return new EnvFromSourceArgs(configMapRef, prefix, secretRef);
        }
    }
}
