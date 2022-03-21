// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentActiveDirectoryConfigurationArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentComputeFarmConfigurationArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentLicenseServiceConfigurationArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentSharedFileSystemConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The configuration of the studio component, based on component type.</p>
 * 
 */
public final class StudioComponentConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioComponentConfigurationArgs Empty = new StudioComponentConfigurationArgs();

    @Import(name="activeDirectoryConfiguration")
      private final @Nullable Output<StudioComponentActiveDirectoryConfigurationArgs> activeDirectoryConfiguration;

    public Output<StudioComponentActiveDirectoryConfigurationArgs> getActiveDirectoryConfiguration() {
        return this.activeDirectoryConfiguration == null ? Output.empty() : this.activeDirectoryConfiguration;
    }

    @Import(name="computeFarmConfiguration")
      private final @Nullable Output<StudioComponentComputeFarmConfigurationArgs> computeFarmConfiguration;

    public Output<StudioComponentComputeFarmConfigurationArgs> getComputeFarmConfiguration() {
        return this.computeFarmConfiguration == null ? Output.empty() : this.computeFarmConfiguration;
    }

    @Import(name="licenseServiceConfiguration")
      private final @Nullable Output<StudioComponentLicenseServiceConfigurationArgs> licenseServiceConfiguration;

    public Output<StudioComponentLicenseServiceConfigurationArgs> getLicenseServiceConfiguration() {
        return this.licenseServiceConfiguration == null ? Output.empty() : this.licenseServiceConfiguration;
    }

    @Import(name="sharedFileSystemConfiguration")
      private final @Nullable Output<StudioComponentSharedFileSystemConfigurationArgs> sharedFileSystemConfiguration;

    public Output<StudioComponentSharedFileSystemConfigurationArgs> getSharedFileSystemConfiguration() {
        return this.sharedFileSystemConfiguration == null ? Output.empty() : this.sharedFileSystemConfiguration;
    }

    public StudioComponentConfigurationArgs(
        @Nullable Output<StudioComponentActiveDirectoryConfigurationArgs> activeDirectoryConfiguration,
        @Nullable Output<StudioComponentComputeFarmConfigurationArgs> computeFarmConfiguration,
        @Nullable Output<StudioComponentLicenseServiceConfigurationArgs> licenseServiceConfiguration,
        @Nullable Output<StudioComponentSharedFileSystemConfigurationArgs> sharedFileSystemConfiguration) {
        this.activeDirectoryConfiguration = activeDirectoryConfiguration;
        this.computeFarmConfiguration = computeFarmConfiguration;
        this.licenseServiceConfiguration = licenseServiceConfiguration;
        this.sharedFileSystemConfiguration = sharedFileSystemConfiguration;
    }

    private StudioComponentConfigurationArgs() {
        this.activeDirectoryConfiguration = Output.empty();
        this.computeFarmConfiguration = Output.empty();
        this.licenseServiceConfiguration = Output.empty();
        this.sharedFileSystemConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StudioComponentActiveDirectoryConfigurationArgs> activeDirectoryConfiguration;
        private @Nullable Output<StudioComponentComputeFarmConfigurationArgs> computeFarmConfiguration;
        private @Nullable Output<StudioComponentLicenseServiceConfigurationArgs> licenseServiceConfiguration;
        private @Nullable Output<StudioComponentSharedFileSystemConfigurationArgs> sharedFileSystemConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryConfiguration = defaults.activeDirectoryConfiguration;
    	      this.computeFarmConfiguration = defaults.computeFarmConfiguration;
    	      this.licenseServiceConfiguration = defaults.licenseServiceConfiguration;
    	      this.sharedFileSystemConfiguration = defaults.sharedFileSystemConfiguration;
        }

        public Builder activeDirectoryConfiguration(@Nullable Output<StudioComponentActiveDirectoryConfigurationArgs> activeDirectoryConfiguration) {
            this.activeDirectoryConfiguration = activeDirectoryConfiguration;
            return this;
        }
        public Builder activeDirectoryConfiguration(@Nullable StudioComponentActiveDirectoryConfigurationArgs activeDirectoryConfiguration) {
            this.activeDirectoryConfiguration = Output.ofNullable(activeDirectoryConfiguration);
            return this;
        }
        public Builder computeFarmConfiguration(@Nullable Output<StudioComponentComputeFarmConfigurationArgs> computeFarmConfiguration) {
            this.computeFarmConfiguration = computeFarmConfiguration;
            return this;
        }
        public Builder computeFarmConfiguration(@Nullable StudioComponentComputeFarmConfigurationArgs computeFarmConfiguration) {
            this.computeFarmConfiguration = Output.ofNullable(computeFarmConfiguration);
            return this;
        }
        public Builder licenseServiceConfiguration(@Nullable Output<StudioComponentLicenseServiceConfigurationArgs> licenseServiceConfiguration) {
            this.licenseServiceConfiguration = licenseServiceConfiguration;
            return this;
        }
        public Builder licenseServiceConfiguration(@Nullable StudioComponentLicenseServiceConfigurationArgs licenseServiceConfiguration) {
            this.licenseServiceConfiguration = Output.ofNullable(licenseServiceConfiguration);
            return this;
        }
        public Builder sharedFileSystemConfiguration(@Nullable Output<StudioComponentSharedFileSystemConfigurationArgs> sharedFileSystemConfiguration) {
            this.sharedFileSystemConfiguration = sharedFileSystemConfiguration;
            return this;
        }
        public Builder sharedFileSystemConfiguration(@Nullable StudioComponentSharedFileSystemConfigurationArgs sharedFileSystemConfiguration) {
            this.sharedFileSystemConfiguration = Output.ofNullable(sharedFileSystemConfiguration);
            return this;
        }        public StudioComponentConfigurationArgs build() {
            return new StudioComponentConfigurationArgs(activeDirectoryConfiguration, computeFarmConfiguration, licenseServiceConfiguration, sharedFileSystemConfiguration);
        }
    }
}
