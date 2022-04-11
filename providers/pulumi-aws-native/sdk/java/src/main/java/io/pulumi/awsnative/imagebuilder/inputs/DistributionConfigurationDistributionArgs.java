// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs;
import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs;
import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationLaunchTemplateConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The distributions of the distribution configuration.
 * 
 */
public final class DistributionConfigurationDistributionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionArgs Empty = new DistributionConfigurationDistributionArgs();

    /**
     * The specific AMI settings (for example, launch permissions, AMI tags).
     * 
     */
    @Import(name="amiDistributionConfiguration")
      private final @Nullable Output<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs> amiDistributionConfiguration;

    public Output<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs> getAmiDistributionConfiguration() {
        return this.amiDistributionConfiguration == null ? Codegen.empty() : this.amiDistributionConfiguration;
    }

    /**
     * Container distribution settings for encryption, licensing, and sharing in a specific Region.
     * 
     */
    @Import(name="containerDistributionConfiguration")
      private final @Nullable Output<DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs> containerDistributionConfiguration;

    public Output<DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs> getContainerDistributionConfiguration() {
        return this.containerDistributionConfiguration == null ? Codegen.empty() : this.containerDistributionConfiguration;
    }

    /**
     * A group of launchTemplateConfiguration settings that apply to image distribution.
     * 
     */
    @Import(name="launchTemplateConfigurations")
      private final @Nullable Output<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> launchTemplateConfigurations;

    public Output<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> getLaunchTemplateConfigurations() {
        return this.launchTemplateConfigurations == null ? Codegen.empty() : this.launchTemplateConfigurations;
    }

    /**
     * The License Manager Configuration to associate with the AMI in the specified Region.
     * 
     */
    @Import(name="licenseConfigurationArns")
      private final @Nullable Output<List<String>> licenseConfigurationArns;

    public Output<List<String>> getLicenseConfigurationArns() {
        return this.licenseConfigurationArns == null ? Codegen.empty() : this.licenseConfigurationArns;
    }

    /**
     * region
     * 
     */
    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    public DistributionConfigurationDistributionArgs(
        @Nullable Output<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs> amiDistributionConfiguration,
        @Nullable Output<DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs> containerDistributionConfiguration,
        @Nullable Output<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> launchTemplateConfigurations,
        @Nullable Output<List<String>> licenseConfigurationArns,
        Output<String> region) {
        this.amiDistributionConfiguration = amiDistributionConfiguration;
        this.containerDistributionConfiguration = containerDistributionConfiguration;
        this.launchTemplateConfigurations = launchTemplateConfigurations;
        this.licenseConfigurationArns = licenseConfigurationArns;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private DistributionConfigurationDistributionArgs() {
        this.amiDistributionConfiguration = Codegen.empty();
        this.containerDistributionConfiguration = Codegen.empty();
        this.launchTemplateConfigurations = Codegen.empty();
        this.licenseConfigurationArns = Codegen.empty();
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs> amiDistributionConfiguration;
        private @Nullable Output<DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs> containerDistributionConfiguration;
        private @Nullable Output<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> launchTemplateConfigurations;
        private @Nullable Output<List<String>> licenseConfigurationArns;
        private Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiDistributionConfiguration = defaults.amiDistributionConfiguration;
    	      this.containerDistributionConfiguration = defaults.containerDistributionConfiguration;
    	      this.launchTemplateConfigurations = defaults.launchTemplateConfigurations;
    	      this.licenseConfigurationArns = defaults.licenseConfigurationArns;
    	      this.region = defaults.region;
        }

        public Builder amiDistributionConfiguration(@Nullable Output<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs> amiDistributionConfiguration) {
            this.amiDistributionConfiguration = amiDistributionConfiguration;
            return this;
        }
        public Builder amiDistributionConfiguration(@Nullable DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs amiDistributionConfiguration) {
            this.amiDistributionConfiguration = Codegen.ofNullable(amiDistributionConfiguration);
            return this;
        }
        public Builder containerDistributionConfiguration(@Nullable Output<DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs> containerDistributionConfiguration) {
            this.containerDistributionConfiguration = containerDistributionConfiguration;
            return this;
        }
        public Builder containerDistributionConfiguration(@Nullable DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs containerDistributionConfiguration) {
            this.containerDistributionConfiguration = Codegen.ofNullable(containerDistributionConfiguration);
            return this;
        }
        public Builder launchTemplateConfigurations(@Nullable Output<List<DistributionConfigurationLaunchTemplateConfigurationArgs>> launchTemplateConfigurations) {
            this.launchTemplateConfigurations = launchTemplateConfigurations;
            return this;
        }
        public Builder launchTemplateConfigurations(@Nullable List<DistributionConfigurationLaunchTemplateConfigurationArgs> launchTemplateConfigurations) {
            this.launchTemplateConfigurations = Codegen.ofNullable(launchTemplateConfigurations);
            return this;
        }
        public Builder launchTemplateConfigurations(DistributionConfigurationLaunchTemplateConfigurationArgs... launchTemplateConfigurations) {
            return launchTemplateConfigurations(List.of(launchTemplateConfigurations));
        }
        public Builder licenseConfigurationArns(@Nullable Output<List<String>> licenseConfigurationArns) {
            this.licenseConfigurationArns = licenseConfigurationArns;
            return this;
        }
        public Builder licenseConfigurationArns(@Nullable List<String> licenseConfigurationArns) {
            this.licenseConfigurationArns = Codegen.ofNullable(licenseConfigurationArns);
            return this;
        }
        public Builder licenseConfigurationArns(String... licenseConfigurationArns) {
            return licenseConfigurationArns(List.of(licenseConfigurationArns));
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }        public DistributionConfigurationDistributionArgs build() {
            return new DistributionConfigurationDistributionArgs(amiDistributionConfiguration, containerDistributionConfiguration, launchTemplateConfigurations, licenseConfigurationArns, region);
        }
    }
}
