// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class OrganizationConfigurationDatasourcesS3LogsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationConfigurationDatasourcesS3LogsGetArgs Empty = new OrganizationConfigurationDatasourcesS3LogsGetArgs();

    /**
     * When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
     * 
     */
    @Import(name="autoEnable", required=true)
      private final Output<Boolean> autoEnable;

    public Output<Boolean> getAutoEnable() {
        return this.autoEnable;
    }

    public OrganizationConfigurationDatasourcesS3LogsGetArgs(Output<Boolean> autoEnable) {
        this.autoEnable = Objects.requireNonNull(autoEnable, "expected parameter 'autoEnable' to be non-null");
    }

    private OrganizationConfigurationDatasourcesS3LogsGetArgs() {
        this.autoEnable = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConfigurationDatasourcesS3LogsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> autoEnable;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConfigurationDatasourcesS3LogsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoEnable = defaults.autoEnable;
        }

        public Builder autoEnable(Output<Boolean> autoEnable) {
            this.autoEnable = Objects.requireNonNull(autoEnable);
            return this;
        }
        public Builder autoEnable(Boolean autoEnable) {
            this.autoEnable = Output.of(Objects.requireNonNull(autoEnable));
            return this;
        }        public OrganizationConfigurationDatasourcesS3LogsGetArgs build() {
            return new OrganizationConfigurationDatasourcesS3LogsGetArgs(autoEnable);
        }
    }
}
