// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs Empty = new ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs();

    /**
     * Basic configuration for building and running the App Runner service. Use this parameter to quickly launch an App Runner service without providing an apprunner.yaml file in the source code repository (or ignoring the file if it exists). See Code Configuration Values below for more details.
     * 
     */
    @Import(name="codeConfigurationValues")
      private final @Nullable Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesGetArgs> codeConfigurationValues;

    public Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesGetArgs> getCodeConfigurationValues() {
        return this.codeConfigurationValues == null ? Output.empty() : this.codeConfigurationValues;
    }

    /**
     * The source of the App Runner configuration. Valid values: `REPOSITORY`, `API`. Values are interpreted as follows:
     * 
     */
    @Import(name="configurationSource", required=true)
      private final Output<String> configurationSource;

    public Output<String> getConfigurationSource() {
        return this.configurationSource;
    }

    public ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs(
        @Nullable Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesGetArgs> codeConfigurationValues,
        Output<String> configurationSource) {
        this.codeConfigurationValues = codeConfigurationValues;
        this.configurationSource = Objects.requireNonNull(configurationSource, "expected parameter 'configurationSource' to be non-null");
    }

    private ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs() {
        this.codeConfigurationValues = Output.empty();
        this.configurationSource = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesGetArgs> codeConfigurationValues;
        private Output<String> configurationSource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfigurationValues = defaults.codeConfigurationValues;
    	      this.configurationSource = defaults.configurationSource;
        }

        public Builder codeConfigurationValues(@Nullable Output<ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesGetArgs> codeConfigurationValues) {
            this.codeConfigurationValues = codeConfigurationValues;
            return this;
        }
        public Builder codeConfigurationValues(@Nullable ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValuesGetArgs codeConfigurationValues) {
            this.codeConfigurationValues = Output.ofNullable(codeConfigurationValues);
            return this;
        }
        public Builder configurationSource(Output<String> configurationSource) {
            this.configurationSource = Objects.requireNonNull(configurationSource);
            return this;
        }
        public Builder configurationSource(String configurationSource) {
            this.configurationSource = Output.of(Objects.requireNonNull(configurationSource));
            return this;
        }        public ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs build() {
            return new ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs(codeConfigurationValues, configurationSource);
        }
    }
}
