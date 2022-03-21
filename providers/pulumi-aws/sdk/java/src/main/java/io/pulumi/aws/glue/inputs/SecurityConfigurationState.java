// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final SecurityConfigurationState Empty = new SecurityConfigurationState();

    /**
     * Configuration block containing encryption configuration. Detailed below.
     * 
     */
    @Import(name="encryptionConfiguration")
      private final @Nullable Output<SecurityConfigurationEncryptionConfigurationGetArgs> encryptionConfiguration;

    public Output<SecurityConfigurationEncryptionConfigurationGetArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Output.empty() : this.encryptionConfiguration;
    }

    /**
     * Name of the security configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public SecurityConfigurationState(
        @Nullable Output<SecurityConfigurationEncryptionConfigurationGetArgs> encryptionConfiguration,
        @Nullable Output<String> name) {
        this.encryptionConfiguration = encryptionConfiguration;
        this.name = name;
    }

    private SecurityConfigurationState() {
        this.encryptionConfiguration = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecurityConfigurationEncryptionConfigurationGetArgs> encryptionConfiguration;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.name = defaults.name;
        }

        public Builder encryptionConfiguration(@Nullable Output<SecurityConfigurationEncryptionConfigurationGetArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }
        public Builder encryptionConfiguration(@Nullable SecurityConfigurationEncryptionConfigurationGetArgs encryptionConfiguration) {
            this.encryptionConfiguration = Output.ofNullable(encryptionConfiguration);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public SecurityConfigurationState build() {
            return new SecurityConfigurationState(encryptionConfiguration, name);
        }
    }
}
