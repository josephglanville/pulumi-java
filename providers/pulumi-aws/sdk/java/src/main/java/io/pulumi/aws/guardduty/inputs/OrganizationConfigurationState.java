// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationConfigurationState Empty = new OrganizationConfigurationState();

    /**
     * When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
     * 
     */
    @Import(name="autoEnable")
      private final @Nullable Output<Boolean> autoEnable;

    public Output<Boolean> getAutoEnable() {
        return this.autoEnable == null ? Output.empty() : this.autoEnable;
    }

    /**
     * Configuration for the collected datasources.
     * 
     */
    @Import(name="datasources")
      private final @Nullable Output<OrganizationConfigurationDatasourcesGetArgs> datasources;

    public Output<OrganizationConfigurationDatasourcesGetArgs> getDatasources() {
        return this.datasources == null ? Output.empty() : this.datasources;
    }

    /**
     * The detector ID of the GuardDuty account.
     * 
     */
    @Import(name="detectorId")
      private final @Nullable Output<String> detectorId;

    public Output<String> getDetectorId() {
        return this.detectorId == null ? Output.empty() : this.detectorId;
    }

    public OrganizationConfigurationState(
        @Nullable Output<Boolean> autoEnable,
        @Nullable Output<OrganizationConfigurationDatasourcesGetArgs> datasources,
        @Nullable Output<String> detectorId) {
        this.autoEnable = autoEnable;
        this.datasources = datasources;
        this.detectorId = detectorId;
    }

    private OrganizationConfigurationState() {
        this.autoEnable = Output.empty();
        this.datasources = Output.empty();
        this.detectorId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoEnable;
        private @Nullable Output<OrganizationConfigurationDatasourcesGetArgs> datasources;
        private @Nullable Output<String> detectorId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoEnable = defaults.autoEnable;
    	      this.datasources = defaults.datasources;
    	      this.detectorId = defaults.detectorId;
        }

        public Builder autoEnable(@Nullable Output<Boolean> autoEnable) {
            this.autoEnable = autoEnable;
            return this;
        }
        public Builder autoEnable(@Nullable Boolean autoEnable) {
            this.autoEnable = Output.ofNullable(autoEnable);
            return this;
        }
        public Builder datasources(@Nullable Output<OrganizationConfigurationDatasourcesGetArgs> datasources) {
            this.datasources = datasources;
            return this;
        }
        public Builder datasources(@Nullable OrganizationConfigurationDatasourcesGetArgs datasources) {
            this.datasources = Output.ofNullable(datasources);
            return this;
        }
        public Builder detectorId(@Nullable Output<String> detectorId) {
            this.detectorId = detectorId;
            return this;
        }
        public Builder detectorId(@Nullable String detectorId) {
            this.detectorId = Output.ofNullable(detectorId);
            return this;
        }        public OrganizationConfigurationState build() {
            return new OrganizationConfigurationState(autoEnable, datasources, detectorId);
        }
    }
}
