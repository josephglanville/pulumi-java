// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.costmanagement.enums.FormatType;
import io.pulumi.azurenative.costmanagement.inputs.ExportDefinitionArgs;
import io.pulumi.azurenative.costmanagement.inputs.ExportDeliveryInfoArgs;
import io.pulumi.azurenative.costmanagement.inputs.ExportScheduleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExportArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportArgs Empty = new ExportArgs();

    /**
     * Has the definition for the export.
     * 
     */
    @InputImport(name="definition", required=true)
      private final Output<ExportDefinitionArgs> definition;

    public Output<ExportDefinitionArgs> getDefinition() {
        return this.definition;
    }

    /**
     * Has delivery information for the export.
     * 
     */
    @InputImport(name="deliveryInfo", required=true)
      private final Output<ExportDeliveryInfoArgs> deliveryInfo;

    public Output<ExportDeliveryInfoArgs> getDeliveryInfo() {
        return this.deliveryInfo;
    }

    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    @InputImport(name="eTag")
      private final @Nullable Output<String> eTag;

    public Output<String> getETag() {
        return this.eTag == null ? Output.empty() : this.eTag;
    }

    /**
     * Export Name.
     * 
     */
    @InputImport(name="exportName")
      private final @Nullable Output<String> exportName;

    public Output<String> getExportName() {
        return this.exportName == null ? Output.empty() : this.exportName;
    }

    /**
     * The format of the export being delivered. Currently only 'Csv' is supported.
     * 
     */
    @InputImport(name="format")
      private final @Nullable Output<Either<String,FormatType>> format;

    public Output<Either<String,FormatType>> getFormat() {
        return this.format == null ? Output.empty() : this.format;
    }

    /**
     * Has schedule information for the export.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Output<ExportScheduleArgs> schedule;

    public Output<ExportScheduleArgs> getSchedule() {
        return this.schedule == null ? Output.empty() : this.schedule;
    }

    /**
     * The scope associated with export operations. This includes '/subscriptions/{subscriptionId}/' for subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope and '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId} for Management Group scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for billingProfile scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}' for invoiceSection scope, and '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for partners.
     * 
     */
    @InputImport(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    public ExportArgs(
        Output<ExportDefinitionArgs> definition,
        Output<ExportDeliveryInfoArgs> deliveryInfo,
        @Nullable Output<String> eTag,
        @Nullable Output<String> exportName,
        @Nullable Output<Either<String,FormatType>> format,
        @Nullable Output<ExportScheduleArgs> schedule,
        Output<String> scope) {
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.deliveryInfo = Objects.requireNonNull(deliveryInfo, "expected parameter 'deliveryInfo' to be non-null");
        this.eTag = eTag;
        this.exportName = exportName;
        this.format = format;
        this.schedule = schedule;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private ExportArgs() {
        this.definition = Output.empty();
        this.deliveryInfo = Output.empty();
        this.eTag = Output.empty();
        this.exportName = Output.empty();
        this.format = Output.empty();
        this.schedule = Output.empty();
        this.scope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ExportDefinitionArgs> definition;
        private Output<ExportDeliveryInfoArgs> deliveryInfo;
        private @Nullable Output<String> eTag;
        private @Nullable Output<String> exportName;
        private @Nullable Output<Either<String,FormatType>> format;
        private @Nullable Output<ExportScheduleArgs> schedule;
        private Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.deliveryInfo = defaults.deliveryInfo;
    	      this.eTag = defaults.eTag;
    	      this.exportName = defaults.exportName;
    	      this.format = defaults.format;
    	      this.schedule = defaults.schedule;
    	      this.scope = defaults.scope;
        }

        public Builder definition(Output<ExportDefinitionArgs> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder definition(ExportDefinitionArgs definition) {
            this.definition = Output.of(Objects.requireNonNull(definition));
            return this;
        }

        public Builder deliveryInfo(Output<ExportDeliveryInfoArgs> deliveryInfo) {
            this.deliveryInfo = Objects.requireNonNull(deliveryInfo);
            return this;
        }

        public Builder deliveryInfo(ExportDeliveryInfoArgs deliveryInfo) {
            this.deliveryInfo = Output.of(Objects.requireNonNull(deliveryInfo));
            return this;
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder eTag(@Nullable String eTag) {
            this.eTag = Output.ofNullable(eTag);
            return this;
        }

        public Builder exportName(@Nullable Output<String> exportName) {
            this.exportName = exportName;
            return this;
        }

        public Builder exportName(@Nullable String exportName) {
            this.exportName = Output.ofNullable(exportName);
            return this;
        }

        public Builder format(@Nullable Output<Either<String,FormatType>> format) {
            this.format = format;
            return this;
        }

        public Builder format(@Nullable Either<String,FormatType> format) {
            this.format = Output.ofNullable(format);
            return this;
        }

        public Builder schedule(@Nullable Output<ExportScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable ExportScheduleArgs schedule) {
            this.schedule = Output.ofNullable(schedule);
            return this;
        }

        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public ExportArgs build() {
            return new ExportArgs(definition, deliveryInfo, eTag, exportName, format, schedule, scope);
        }
    }
}
