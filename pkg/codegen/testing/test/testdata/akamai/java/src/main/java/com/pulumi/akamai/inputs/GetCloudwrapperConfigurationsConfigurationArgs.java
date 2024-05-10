// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudwrapperConfigurationsConfigurationLocationArgs;
import com.pulumi.akamai.inputs.GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudwrapperConfigurationsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudwrapperConfigurationsConfigurationArgs Empty = new GetCloudwrapperConfigurationsConfigurationArgs();

    @Import(name="capacityAlertsThreshold", required=true)
    private Output<Integer> capacityAlertsThreshold;

    public Output<Integer> capacityAlertsThreshold() {
        return this.capacityAlertsThreshold;
    }

    @Import(name="comments", required=true)
    private Output<String> comments;

    public Output<String> comments() {
        return this.comments;
    }

    @Import(name="configName", required=true)
    private Output<String> configName;

    public Output<String> configName() {
        return this.configName;
    }

    @Import(name="contractId", required=true)
    private Output<String> contractId;

    public Output<String> contractId() {
        return this.contractId;
    }

    @Import(name="id", required=true)
    private Output<Integer> id;

    public Output<Integer> id() {
        return this.id;
    }

    @Import(name="lastActivatedBy", required=true)
    private Output<String> lastActivatedBy;

    public Output<String> lastActivatedBy() {
        return this.lastActivatedBy;
    }

    @Import(name="lastActivatedDate", required=true)
    private Output<String> lastActivatedDate;

    public Output<String> lastActivatedDate() {
        return this.lastActivatedDate;
    }

    @Import(name="lastUpdatedBy", required=true)
    private Output<String> lastUpdatedBy;

    public Output<String> lastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    @Import(name="lastUpdatedDate", required=true)
    private Output<String> lastUpdatedDate;

    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    @Import(name="locations")
    private @Nullable Output<List<GetCloudwrapperConfigurationsConfigurationLocationArgs>> locations;

    public Optional<Output<List<GetCloudwrapperConfigurationsConfigurationLocationArgs>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    @Import(name="multiCdnSettings")
    private @Nullable Output<GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsArgs> multiCdnSettings;

    public Optional<Output<GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsArgs>> multiCdnSettings() {
        return Optional.ofNullable(this.multiCdnSettings);
    }

    @Import(name="notificationEmails", required=true)
    private Output<List<String>> notificationEmails;

    public Output<List<String>> notificationEmails() {
        return this.notificationEmails;
    }

    @Import(name="propertyIds", required=true)
    private Output<List<String>> propertyIds;

    public Output<List<String>> propertyIds() {
        return this.propertyIds;
    }

    @Import(name="retainIdleObjects", required=true)
    private Output<Boolean> retainIdleObjects;

    public Output<Boolean> retainIdleObjects() {
        return this.retainIdleObjects;
    }

    @Import(name="status", required=true)
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    private GetCloudwrapperConfigurationsConfigurationArgs() {}

    private GetCloudwrapperConfigurationsConfigurationArgs(GetCloudwrapperConfigurationsConfigurationArgs $) {
        this.capacityAlertsThreshold = $.capacityAlertsThreshold;
        this.comments = $.comments;
        this.configName = $.configName;
        this.contractId = $.contractId;
        this.id = $.id;
        this.lastActivatedBy = $.lastActivatedBy;
        this.lastActivatedDate = $.lastActivatedDate;
        this.lastUpdatedBy = $.lastUpdatedBy;
        this.lastUpdatedDate = $.lastUpdatedDate;
        this.locations = $.locations;
        this.multiCdnSettings = $.multiCdnSettings;
        this.notificationEmails = $.notificationEmails;
        this.propertyIds = $.propertyIds;
        this.retainIdleObjects = $.retainIdleObjects;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperConfigurationsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperConfigurationsConfigurationArgs $;

        public Builder() {
            $ = new GetCloudwrapperConfigurationsConfigurationArgs();
        }

        public Builder(GetCloudwrapperConfigurationsConfigurationArgs defaults) {
            $ = new GetCloudwrapperConfigurationsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacityAlertsThreshold(Output<Integer> capacityAlertsThreshold) {
            $.capacityAlertsThreshold = capacityAlertsThreshold;
            return this;
        }

        public Builder capacityAlertsThreshold(Integer capacityAlertsThreshold) {
            return capacityAlertsThreshold(Output.of(capacityAlertsThreshold));
        }

        public Builder comments(Output<String> comments) {
            $.comments = comments;
            return this;
        }

        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        public Builder configName(Output<String> configName) {
            $.configName = configName;
            return this;
        }

        public Builder configName(String configName) {
            return configName(Output.of(configName));
        }

        public Builder contractId(Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public Builder lastActivatedBy(Output<String> lastActivatedBy) {
            $.lastActivatedBy = lastActivatedBy;
            return this;
        }

        public Builder lastActivatedBy(String lastActivatedBy) {
            return lastActivatedBy(Output.of(lastActivatedBy));
        }

        public Builder lastActivatedDate(Output<String> lastActivatedDate) {
            $.lastActivatedDate = lastActivatedDate;
            return this;
        }

        public Builder lastActivatedDate(String lastActivatedDate) {
            return lastActivatedDate(Output.of(lastActivatedDate));
        }

        public Builder lastUpdatedBy(Output<String> lastUpdatedBy) {
            $.lastUpdatedBy = lastUpdatedBy;
            return this;
        }

        public Builder lastUpdatedBy(String lastUpdatedBy) {
            return lastUpdatedBy(Output.of(lastUpdatedBy));
        }

        public Builder lastUpdatedDate(Output<String> lastUpdatedDate) {
            $.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        public Builder lastUpdatedDate(String lastUpdatedDate) {
            return lastUpdatedDate(Output.of(lastUpdatedDate));
        }

        public Builder locations(@Nullable Output<List<GetCloudwrapperConfigurationsConfigurationLocationArgs>> locations) {
            $.locations = locations;
            return this;
        }

        public Builder locations(List<GetCloudwrapperConfigurationsConfigurationLocationArgs> locations) {
            return locations(Output.of(locations));
        }

        public Builder locations(GetCloudwrapperConfigurationsConfigurationLocationArgs... locations) {
            return locations(List.of(locations));
        }

        public Builder multiCdnSettings(@Nullable Output<GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsArgs> multiCdnSettings) {
            $.multiCdnSettings = multiCdnSettings;
            return this;
        }

        public Builder multiCdnSettings(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsArgs multiCdnSettings) {
            return multiCdnSettings(Output.of(multiCdnSettings));
        }

        public Builder notificationEmails(Output<List<String>> notificationEmails) {
            $.notificationEmails = notificationEmails;
            return this;
        }

        public Builder notificationEmails(List<String> notificationEmails) {
            return notificationEmails(Output.of(notificationEmails));
        }

        public Builder notificationEmails(String... notificationEmails) {
            return notificationEmails(List.of(notificationEmails));
        }

        public Builder propertyIds(Output<List<String>> propertyIds) {
            $.propertyIds = propertyIds;
            return this;
        }

        public Builder propertyIds(List<String> propertyIds) {
            return propertyIds(Output.of(propertyIds));
        }

        public Builder propertyIds(String... propertyIds) {
            return propertyIds(List.of(propertyIds));
        }

        public Builder retainIdleObjects(Output<Boolean> retainIdleObjects) {
            $.retainIdleObjects = retainIdleObjects;
            return this;
        }

        public Builder retainIdleObjects(Boolean retainIdleObjects) {
            return retainIdleObjects(Output.of(retainIdleObjects));
        }

        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetCloudwrapperConfigurationsConfigurationArgs build() {
            if ($.capacityAlertsThreshold == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "capacityAlertsThreshold");
            }
            if ($.comments == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "comments");
            }
            if ($.configName == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "configName");
            }
            if ($.contractId == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "contractId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "id");
            }
            if ($.lastActivatedBy == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "lastActivatedBy");
            }
            if ($.lastActivatedDate == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "lastActivatedDate");
            }
            if ($.lastUpdatedBy == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "lastUpdatedBy");
            }
            if ($.lastUpdatedDate == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "lastUpdatedDate");
            }
            if ($.notificationEmails == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "notificationEmails");
            }
            if ($.propertyIds == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "propertyIds");
            }
            if ($.retainIdleObjects == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "retainIdleObjects");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("GetCloudwrapperConfigurationsConfigurationArgs", "status");
            }
            return $;
        }
    }

}
