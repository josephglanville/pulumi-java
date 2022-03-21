// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup;

import io.pulumi.awsnative.backup.inputs.ReportDeliveryChannelPropertiesArgs;
import io.pulumi.awsnative.backup.inputs.ReportPlanTagArgs;
import io.pulumi.awsnative.backup.inputs.ReportSettingPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReportPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportPlanArgs Empty = new ReportPlanArgs();

    /**
     * A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
     * 
     */
    @Import(name="reportDeliveryChannel", required=true)
      private final Output<ReportDeliveryChannelPropertiesArgs> reportDeliveryChannel;

    public Output<ReportDeliveryChannelPropertiesArgs> getReportDeliveryChannel() {
        return this.reportDeliveryChannel;
    }

    /**
     * An optional description of the report plan with a maximum of 1,024 characters.
     * 
     */
    @Import(name="reportPlanDescription")
      private final @Nullable Output<String> reportPlanDescription;

    public Output<String> getReportPlanDescription() {
        return this.reportPlanDescription == null ? Output.empty() : this.reportPlanDescription;
    }

    /**
     * The unique name of the report plan. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * 
     */
    @Import(name="reportPlanName")
      private final @Nullable Output<String> reportPlanName;

    public Output<String> getReportPlanName() {
        return this.reportPlanName == null ? Output.empty() : this.reportPlanName;
    }

    /**
     * Metadata that you can assign to help organize the report plans that you create. Each tag is a key-value pair.
     * 
     */
    @Import(name="reportPlanTags")
      private final @Nullable Output<List<ReportPlanTagArgs>> reportPlanTags;

    public Output<List<ReportPlanTagArgs>> getReportPlanTags() {
        return this.reportPlanTags == null ? Output.empty() : this.reportPlanTags;
    }

    /**
     * Identifies the report template for the report. Reports are built using a report template.
     * 
     */
    @Import(name="reportSetting", required=true)
      private final Output<ReportSettingPropertiesArgs> reportSetting;

    public Output<ReportSettingPropertiesArgs> getReportSetting() {
        return this.reportSetting;
    }

    public ReportPlanArgs(
        Output<ReportDeliveryChannelPropertiesArgs> reportDeliveryChannel,
        @Nullable Output<String> reportPlanDescription,
        @Nullable Output<String> reportPlanName,
        @Nullable Output<List<ReportPlanTagArgs>> reportPlanTags,
        Output<ReportSettingPropertiesArgs> reportSetting) {
        this.reportDeliveryChannel = Objects.requireNonNull(reportDeliveryChannel, "expected parameter 'reportDeliveryChannel' to be non-null");
        this.reportPlanDescription = reportPlanDescription;
        this.reportPlanName = reportPlanName;
        this.reportPlanTags = reportPlanTags;
        this.reportSetting = Objects.requireNonNull(reportSetting, "expected parameter 'reportSetting' to be non-null");
    }

    private ReportPlanArgs() {
        this.reportDeliveryChannel = Output.empty();
        this.reportPlanDescription = Output.empty();
        this.reportPlanName = Output.empty();
        this.reportPlanTags = Output.empty();
        this.reportSetting = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ReportDeliveryChannelPropertiesArgs> reportDeliveryChannel;
        private @Nullable Output<String> reportPlanDescription;
        private @Nullable Output<String> reportPlanName;
        private @Nullable Output<List<ReportPlanTagArgs>> reportPlanTags;
        private Output<ReportSettingPropertiesArgs> reportSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reportDeliveryChannel = defaults.reportDeliveryChannel;
    	      this.reportPlanDescription = defaults.reportPlanDescription;
    	      this.reportPlanName = defaults.reportPlanName;
    	      this.reportPlanTags = defaults.reportPlanTags;
    	      this.reportSetting = defaults.reportSetting;
        }

        public Builder reportDeliveryChannel(Output<ReportDeliveryChannelPropertiesArgs> reportDeliveryChannel) {
            this.reportDeliveryChannel = Objects.requireNonNull(reportDeliveryChannel);
            return this;
        }
        public Builder reportDeliveryChannel(ReportDeliveryChannelPropertiesArgs reportDeliveryChannel) {
            this.reportDeliveryChannel = Output.of(Objects.requireNonNull(reportDeliveryChannel));
            return this;
        }
        public Builder reportPlanDescription(@Nullable Output<String> reportPlanDescription) {
            this.reportPlanDescription = reportPlanDescription;
            return this;
        }
        public Builder reportPlanDescription(@Nullable String reportPlanDescription) {
            this.reportPlanDescription = Output.ofNullable(reportPlanDescription);
            return this;
        }
        public Builder reportPlanName(@Nullable Output<String> reportPlanName) {
            this.reportPlanName = reportPlanName;
            return this;
        }
        public Builder reportPlanName(@Nullable String reportPlanName) {
            this.reportPlanName = Output.ofNullable(reportPlanName);
            return this;
        }
        public Builder reportPlanTags(@Nullable Output<List<ReportPlanTagArgs>> reportPlanTags) {
            this.reportPlanTags = reportPlanTags;
            return this;
        }
        public Builder reportPlanTags(@Nullable List<ReportPlanTagArgs> reportPlanTags) {
            this.reportPlanTags = Output.ofNullable(reportPlanTags);
            return this;
        }
        public Builder reportPlanTags(ReportPlanTagArgs... reportPlanTags) {
            return reportPlanTags(List.of(reportPlanTags));
        }
        public Builder reportSetting(Output<ReportSettingPropertiesArgs> reportSetting) {
            this.reportSetting = Objects.requireNonNull(reportSetting);
            return this;
        }
        public Builder reportSetting(ReportSettingPropertiesArgs reportSetting) {
            this.reportSetting = Output.of(Objects.requireNonNull(reportSetting));
            return this;
        }        public ReportPlanArgs build() {
            return new ReportPlanArgs(reportDeliveryChannel, reportPlanDescription, reportPlanName, reportPlanTags, reportSetting);
        }
    }
}
