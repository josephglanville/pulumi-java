// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.DataTransferConfigEmailPreferencesArgs;
import io.pulumi.gcp.bigquery.inputs.DataTransferConfigScheduleOptionsArgs;
import io.pulumi.gcp.bigquery.inputs.DataTransferConfigSensitiveParamsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataTransferConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataTransferConfigArgs Empty = new DataTransferConfigArgs();

    /**
     * The number of days to look back to automatically refresh the data.
     * For example, if dataRefreshWindowDays = 10, then every day BigQuery
     * reingests data for [today-10, today-1], rather than ingesting data for
     * just [today-1]. Only valid if the data source supports the feature.
     * Set the value to 0 to use the default value.
     * 
     */
    @InputImport(name="dataRefreshWindowDays")
      private final @Nullable Input<Integer> dataRefreshWindowDays;

    public Input<Integer> getDataRefreshWindowDays() {
        return this.dataRefreshWindowDays == null ? Input.empty() : this.dataRefreshWindowDays;
    }

    /**
     * The data source id. Cannot be changed once the transfer config is created.
     * 
     */
    @InputImport(name="dataSourceId", required=true)
      private final Input<String> dataSourceId;

    public Input<String> getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * The BigQuery target dataset id.
     * 
     */
    @InputImport(name="destinationDatasetId")
      private final @Nullable Input<String> destinationDatasetId;

    public Input<String> getDestinationDatasetId() {
        return this.destinationDatasetId == null ? Input.empty() : this.destinationDatasetId;
    }

    /**
     * When set to true, no runs are scheduled for a given transfer.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * The user specified display name for the transfer config.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Email notifications will be sent according to these preferences to the
     * email address of the user who owns this transfer config.
     * Structure is documented below.
     * 
     */
    @InputImport(name="emailPreferences")
      private final @Nullable Input<DataTransferConfigEmailPreferencesArgs> emailPreferences;

    public Input<DataTransferConfigEmailPreferencesArgs> getEmailPreferences() {
        return this.emailPreferences == null ? Input.empty() : this.emailPreferences;
    }

    /**
     * The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Pub/Sub topic where notifications will be sent after transfer runs
     * associated with this transfer config finish.
     * 
     */
    @InputImport(name="notificationPubsubTopic")
      private final @Nullable Input<String> notificationPubsubTopic;

    public Input<String> getNotificationPubsubTopic() {
        return this.notificationPubsubTopic == null ? Input.empty() : this.notificationPubsubTopic;
    }

    /**
     * Parameters specific to each data source. For more information see the bq tab in the 'Setting up a data transfer'
     * section for each data source. For example the parameters for Cloud Storage transfers are listed here:
     * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
     */
    @InputImport(name="params", required=true)
      private final Input<Map<String,String>> params;

    public Input<Map<String,String>> getParams() {
        return this.params;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Data transfer schedule. If the data source does not support a custom
     * schedule, this should be empty. If it is empty, the default value for
     * the data source will be used. The specified times are in UTC. Examples
     * of valid format: 1st,3rd monday of month 15:30, every wed,fri of jan,
     * jun 13:15, and first sunday of quarter 00:00. See more explanation
     * about the format here:
     * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
     * NOTE: the granularity should be at least 8 hours, or less frequent.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * Options customizing the data transfer schedule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="scheduleOptions")
      private final @Nullable Input<DataTransferConfigScheduleOptionsArgs> scheduleOptions;

    public Input<DataTransferConfigScheduleOptionsArgs> getScheduleOptions() {
        return this.scheduleOptions == null ? Input.empty() : this.scheduleOptions;
    }

    /**
     * Different parameters are configured primarily using the the `params` field on this
     * resource. This block contains the parameters which contain secrets or passwords so that they can be marked
     * sensitive and hidden from plan output. The name of the field, eg: secret_access_key, will be the key
     * in the `params` map in the api request.
     * Credentials may not be specified in both locations and will cause an error. Changing from one location
     * to a different credential configuration in the config will require an apply to update state.
     * Structure is documented below.
     * 
     */
    @InputImport(name="sensitiveParams")
      private final @Nullable Input<DataTransferConfigSensitiveParamsArgs> sensitiveParams;

    public Input<DataTransferConfigSensitiveParamsArgs> getSensitiveParams() {
        return this.sensitiveParams == null ? Input.empty() : this.sensitiveParams;
    }

    /**
     * Service account email. If this field is set, transfer config will
     * be created with this service account credentials. It requires that
     * requesting user calling this API has permissions to act as this service account.
     * 
     */
    @InputImport(name="serviceAccountName")
      private final @Nullable Input<String> serviceAccountName;

    public Input<String> getServiceAccountName() {
        return this.serviceAccountName == null ? Input.empty() : this.serviceAccountName;
    }

    public DataTransferConfigArgs(
        @Nullable Input<Integer> dataRefreshWindowDays,
        Input<String> dataSourceId,
        @Nullable Input<String> destinationDatasetId,
        @Nullable Input<Boolean> disabled,
        Input<String> displayName,
        @Nullable Input<DataTransferConfigEmailPreferencesArgs> emailPreferences,
        @Nullable Input<String> location,
        @Nullable Input<String> notificationPubsubTopic,
        Input<Map<String,String>> params,
        @Nullable Input<String> project,
        @Nullable Input<String> schedule,
        @Nullable Input<DataTransferConfigScheduleOptionsArgs> scheduleOptions,
        @Nullable Input<DataTransferConfigSensitiveParamsArgs> sensitiveParams,
        @Nullable Input<String> serviceAccountName) {
        this.dataRefreshWindowDays = dataRefreshWindowDays;
        this.dataSourceId = Objects.requireNonNull(dataSourceId, "expected parameter 'dataSourceId' to be non-null");
        this.destinationDatasetId = destinationDatasetId;
        this.disabled = disabled;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.emailPreferences = emailPreferences;
        this.location = location;
        this.notificationPubsubTopic = notificationPubsubTopic;
        this.params = Objects.requireNonNull(params, "expected parameter 'params' to be non-null");
        this.project = project;
        this.schedule = schedule;
        this.scheduleOptions = scheduleOptions;
        this.sensitiveParams = sensitiveParams;
        this.serviceAccountName = serviceAccountName;
    }

    private DataTransferConfigArgs() {
        this.dataRefreshWindowDays = Input.empty();
        this.dataSourceId = Input.empty();
        this.destinationDatasetId = Input.empty();
        this.disabled = Input.empty();
        this.displayName = Input.empty();
        this.emailPreferences = Input.empty();
        this.location = Input.empty();
        this.notificationPubsubTopic = Input.empty();
        this.params = Input.empty();
        this.project = Input.empty();
        this.schedule = Input.empty();
        this.scheduleOptions = Input.empty();
        this.sensitiveParams = Input.empty();
        this.serviceAccountName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> dataRefreshWindowDays;
        private Input<String> dataSourceId;
        private @Nullable Input<String> destinationDatasetId;
        private @Nullable Input<Boolean> disabled;
        private Input<String> displayName;
        private @Nullable Input<DataTransferConfigEmailPreferencesArgs> emailPreferences;
        private @Nullable Input<String> location;
        private @Nullable Input<String> notificationPubsubTopic;
        private Input<Map<String,String>> params;
        private @Nullable Input<String> project;
        private @Nullable Input<String> schedule;
        private @Nullable Input<DataTransferConfigScheduleOptionsArgs> scheduleOptions;
        private @Nullable Input<DataTransferConfigSensitiveParamsArgs> sensitiveParams;
        private @Nullable Input<String> serviceAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRefreshWindowDays = defaults.dataRefreshWindowDays;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.destinationDatasetId = defaults.destinationDatasetId;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.emailPreferences = defaults.emailPreferences;
    	      this.location = defaults.location;
    	      this.notificationPubsubTopic = defaults.notificationPubsubTopic;
    	      this.params = defaults.params;
    	      this.project = defaults.project;
    	      this.schedule = defaults.schedule;
    	      this.scheduleOptions = defaults.scheduleOptions;
    	      this.sensitiveParams = defaults.sensitiveParams;
    	      this.serviceAccountName = defaults.serviceAccountName;
        }

        public Builder setDataRefreshWindowDays(@Nullable Input<Integer> dataRefreshWindowDays) {
            this.dataRefreshWindowDays = dataRefreshWindowDays;
            return this;
        }

        public Builder setDataRefreshWindowDays(@Nullable Integer dataRefreshWindowDays) {
            this.dataRefreshWindowDays = Input.ofNullable(dataRefreshWindowDays);
            return this;
        }

        public Builder setDataSourceId(Input<String> dataSourceId) {
            this.dataSourceId = Objects.requireNonNull(dataSourceId);
            return this;
        }

        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = Input.of(Objects.requireNonNull(dataSourceId));
            return this;
        }

        public Builder setDestinationDatasetId(@Nullable Input<String> destinationDatasetId) {
            this.destinationDatasetId = destinationDatasetId;
            return this;
        }

        public Builder setDestinationDatasetId(@Nullable String destinationDatasetId) {
            this.destinationDatasetId = Input.ofNullable(destinationDatasetId);
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEmailPreferences(@Nullable Input<DataTransferConfigEmailPreferencesArgs> emailPreferences) {
            this.emailPreferences = emailPreferences;
            return this;
        }

        public Builder setEmailPreferences(@Nullable DataTransferConfigEmailPreferencesArgs emailPreferences) {
            this.emailPreferences = Input.ofNullable(emailPreferences);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setNotificationPubsubTopic(@Nullable Input<String> notificationPubsubTopic) {
            this.notificationPubsubTopic = notificationPubsubTopic;
            return this;
        }

        public Builder setNotificationPubsubTopic(@Nullable String notificationPubsubTopic) {
            this.notificationPubsubTopic = Input.ofNullable(notificationPubsubTopic);
            return this;
        }

        public Builder setParams(Input<Map<String,String>> params) {
            this.params = Objects.requireNonNull(params);
            return this;
        }

        public Builder setParams(Map<String,String> params) {
            this.params = Input.of(Objects.requireNonNull(params));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSchedule(@Nullable Input<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable String schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setScheduleOptions(@Nullable Input<DataTransferConfigScheduleOptionsArgs> scheduleOptions) {
            this.scheduleOptions = scheduleOptions;
            return this;
        }

        public Builder setScheduleOptions(@Nullable DataTransferConfigScheduleOptionsArgs scheduleOptions) {
            this.scheduleOptions = Input.ofNullable(scheduleOptions);
            return this;
        }

        public Builder setSensitiveParams(@Nullable Input<DataTransferConfigSensitiveParamsArgs> sensitiveParams) {
            this.sensitiveParams = sensitiveParams;
            return this;
        }

        public Builder setSensitiveParams(@Nullable DataTransferConfigSensitiveParamsArgs sensitiveParams) {
            this.sensitiveParams = Input.ofNullable(sensitiveParams);
            return this;
        }

        public Builder setServiceAccountName(@Nullable Input<String> serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        public Builder setServiceAccountName(@Nullable String serviceAccountName) {
            this.serviceAccountName = Input.ofNullable(serviceAccountName);
            return this;
        }
        public DataTransferConfigArgs build() {
            return new DataTransferConfigArgs(dataRefreshWindowDays, dataSourceId, destinationDatasetId, disabled, displayName, emailPreferences, location, notificationPubsubTopic, params, project, schedule, scheduleOptions, sensitiveParams, serviceAccountName);
        }
    }
}
