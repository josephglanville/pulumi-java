// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationComponentMonitoringSettingComponentConfigurationMode;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationComponentConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The monitoring setting of the component.
 * 
 */
public final class ApplicationComponentMonitoringSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationComponentMonitoringSettingArgs Empty = new ApplicationComponentMonitoringSettingArgs();

    /**
     * The ARN of the compnonent.
     * 
     */
    @Import(name="componentARN")
      private final @Nullable Output<String> componentARN;

    public Output<String> getComponentARN() {
        return this.componentARN == null ? Output.empty() : this.componentARN;
    }

    /**
     * The component monitoring configuration mode.
     * 
     */
    @Import(name="componentConfigurationMode", required=true)
      private final Output<ApplicationComponentMonitoringSettingComponentConfigurationMode> componentConfigurationMode;

    public Output<ApplicationComponentMonitoringSettingComponentConfigurationMode> getComponentConfigurationMode() {
        return this.componentConfigurationMode;
    }

    /**
     * The name of the component.
     * 
     */
    @Import(name="componentName")
      private final @Nullable Output<String> componentName;

    public Output<String> getComponentName() {
        return this.componentName == null ? Output.empty() : this.componentName;
    }

    /**
     * The monitoring configuration of the component.
     * 
     */
    @Import(name="customComponentConfiguration")
      private final @Nullable Output<ApplicationComponentConfigurationArgs> customComponentConfiguration;

    public Output<ApplicationComponentConfigurationArgs> getCustomComponentConfiguration() {
        return this.customComponentConfiguration == null ? Output.empty() : this.customComponentConfiguration;
    }

    /**
     * The overwritten settings on default component monitoring configuration.
     * 
     */
    @Import(name="defaultOverwriteComponentConfiguration")
      private final @Nullable Output<ApplicationComponentConfigurationArgs> defaultOverwriteComponentConfiguration;

    public Output<ApplicationComponentConfigurationArgs> getDefaultOverwriteComponentConfiguration() {
        return this.defaultOverwriteComponentConfiguration == null ? Output.empty() : this.defaultOverwriteComponentConfiguration;
    }

    /**
     * The tier of the application component.
     * 
     */
    @Import(name="tier", required=true)
      private final Output<String> tier;

    public Output<String> getTier() {
        return this.tier;
    }

    public ApplicationComponentMonitoringSettingArgs(
        @Nullable Output<String> componentARN,
        Output<ApplicationComponentMonitoringSettingComponentConfigurationMode> componentConfigurationMode,
        @Nullable Output<String> componentName,
        @Nullable Output<ApplicationComponentConfigurationArgs> customComponentConfiguration,
        @Nullable Output<ApplicationComponentConfigurationArgs> defaultOverwriteComponentConfiguration,
        Output<String> tier) {
        this.componentARN = componentARN;
        this.componentConfigurationMode = Objects.requireNonNull(componentConfigurationMode, "expected parameter 'componentConfigurationMode' to be non-null");
        this.componentName = componentName;
        this.customComponentConfiguration = customComponentConfiguration;
        this.defaultOverwriteComponentConfiguration = defaultOverwriteComponentConfiguration;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private ApplicationComponentMonitoringSettingArgs() {
        this.componentARN = Output.empty();
        this.componentConfigurationMode = Output.empty();
        this.componentName = Output.empty();
        this.customComponentConfiguration = Output.empty();
        this.defaultOverwriteComponentConfiguration = Output.empty();
        this.tier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationComponentMonitoringSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> componentARN;
        private Output<ApplicationComponentMonitoringSettingComponentConfigurationMode> componentConfigurationMode;
        private @Nullable Output<String> componentName;
        private @Nullable Output<ApplicationComponentConfigurationArgs> customComponentConfiguration;
        private @Nullable Output<ApplicationComponentConfigurationArgs> defaultOverwriteComponentConfiguration;
        private Output<String> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationComponentMonitoringSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentARN = defaults.componentARN;
    	      this.componentConfigurationMode = defaults.componentConfigurationMode;
    	      this.componentName = defaults.componentName;
    	      this.customComponentConfiguration = defaults.customComponentConfiguration;
    	      this.defaultOverwriteComponentConfiguration = defaults.defaultOverwriteComponentConfiguration;
    	      this.tier = defaults.tier;
        }

        public Builder componentARN(@Nullable Output<String> componentARN) {
            this.componentARN = componentARN;
            return this;
        }
        public Builder componentARN(@Nullable String componentARN) {
            this.componentARN = Output.ofNullable(componentARN);
            return this;
        }
        public Builder componentConfigurationMode(Output<ApplicationComponentMonitoringSettingComponentConfigurationMode> componentConfigurationMode) {
            this.componentConfigurationMode = Objects.requireNonNull(componentConfigurationMode);
            return this;
        }
        public Builder componentConfigurationMode(ApplicationComponentMonitoringSettingComponentConfigurationMode componentConfigurationMode) {
            this.componentConfigurationMode = Output.of(Objects.requireNonNull(componentConfigurationMode));
            return this;
        }
        public Builder componentName(@Nullable Output<String> componentName) {
            this.componentName = componentName;
            return this;
        }
        public Builder componentName(@Nullable String componentName) {
            this.componentName = Output.ofNullable(componentName);
            return this;
        }
        public Builder customComponentConfiguration(@Nullable Output<ApplicationComponentConfigurationArgs> customComponentConfiguration) {
            this.customComponentConfiguration = customComponentConfiguration;
            return this;
        }
        public Builder customComponentConfiguration(@Nullable ApplicationComponentConfigurationArgs customComponentConfiguration) {
            this.customComponentConfiguration = Output.ofNullable(customComponentConfiguration);
            return this;
        }
        public Builder defaultOverwriteComponentConfiguration(@Nullable Output<ApplicationComponentConfigurationArgs> defaultOverwriteComponentConfiguration) {
            this.defaultOverwriteComponentConfiguration = defaultOverwriteComponentConfiguration;
            return this;
        }
        public Builder defaultOverwriteComponentConfiguration(@Nullable ApplicationComponentConfigurationArgs defaultOverwriteComponentConfiguration) {
            this.defaultOverwriteComponentConfiguration = Output.ofNullable(defaultOverwriteComponentConfiguration);
            return this;
        }
        public Builder tier(Output<String> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Output.of(Objects.requireNonNull(tier));
            return this;
        }        public ApplicationComponentMonitoringSettingArgs build() {
            return new ApplicationComponentMonitoringSettingArgs(componentARN, componentConfigurationMode, componentName, customComponentConfiguration, defaultOverwriteComponentConfiguration, tier);
        }
    }
}
