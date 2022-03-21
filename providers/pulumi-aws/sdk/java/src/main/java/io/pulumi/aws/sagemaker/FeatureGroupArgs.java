// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs;
import io.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs;
import io.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupArgs Empty = new FeatureGroupArgs();

    /**
     * A free-form description of a Feature Group.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the feature that stores the EventTime of a Record in a Feature Group.
     * 
     */
    @Import(name="eventTimeFeatureName", required=true)
      private final Output<String> eventTimeFeatureName;

    public Output<String> getEventTimeFeatureName() {
        return this.eventTimeFeatureName;
    }

    /**
     * A list of Feature names and types. See Feature Definition Below.
     * 
     */
    @Import(name="featureDefinitions", required=true)
      private final Output<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions;

    public Output<List<FeatureGroupFeatureDefinitionArgs>> getFeatureDefinitions() {
        return this.featureDefinitions;
    }

    /**
     * The name of the Feature Group. The name must be unique within an AWS Region in an AWS account.
     * 
     */
    @Import(name="featureGroupName", required=true)
      private final Output<String> featureGroupName;

    public Output<String> getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * The Offline Feature Store Configuration. See Offline Store Config Below.
     * 
     */
    @Import(name="offlineStoreConfig")
      private final @Nullable Output<FeatureGroupOfflineStoreConfigArgs> offlineStoreConfig;

    public Output<FeatureGroupOfflineStoreConfigArgs> getOfflineStoreConfig() {
        return this.offlineStoreConfig == null ? Output.empty() : this.offlineStoreConfig;
    }

    /**
     * The Online Feature Store Configuration. See Online Store Config Below.
     * 
     */
    @Import(name="onlineStoreConfig")
      private final @Nullable Output<FeatureGroupOnlineStoreConfigArgs> onlineStoreConfig;

    public Output<FeatureGroupOnlineStoreConfigArgs> getOnlineStoreConfig() {
        return this.onlineStoreConfig == null ? Output.empty() : this.onlineStoreConfig;
    }

    /**
     * The name of the Feature whose value uniquely identifies a Record defined in the Feature Store. Only the latest record per identifier value will be stored in the Online Store.
     * 
     */
    @Import(name="recordIdentifierFeatureName", required=true)
      private final Output<String> recordIdentifierFeatureName;

    public Output<String> getRecordIdentifierFeatureName() {
        return this.recordIdentifierFeatureName;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the Offline Store if an `offline_store_config` is provided.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Map of resource tags for the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public FeatureGroupArgs(
        @Nullable Output<String> description,
        Output<String> eventTimeFeatureName,
        Output<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions,
        Output<String> featureGroupName,
        @Nullable Output<FeatureGroupOfflineStoreConfigArgs> offlineStoreConfig,
        @Nullable Output<FeatureGroupOnlineStoreConfigArgs> onlineStoreConfig,
        Output<String> recordIdentifierFeatureName,
        Output<String> roleArn,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.eventTimeFeatureName = Objects.requireNonNull(eventTimeFeatureName, "expected parameter 'eventTimeFeatureName' to be non-null");
        this.featureDefinitions = Objects.requireNonNull(featureDefinitions, "expected parameter 'featureDefinitions' to be non-null");
        this.featureGroupName = Objects.requireNonNull(featureGroupName, "expected parameter 'featureGroupName' to be non-null");
        this.offlineStoreConfig = offlineStoreConfig;
        this.onlineStoreConfig = onlineStoreConfig;
        this.recordIdentifierFeatureName = Objects.requireNonNull(recordIdentifierFeatureName, "expected parameter 'recordIdentifierFeatureName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private FeatureGroupArgs() {
        this.description = Output.empty();
        this.eventTimeFeatureName = Output.empty();
        this.featureDefinitions = Output.empty();
        this.featureGroupName = Output.empty();
        this.offlineStoreConfig = Output.empty();
        this.onlineStoreConfig = Output.empty();
        this.recordIdentifierFeatureName = Output.empty();
        this.roleArn = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> eventTimeFeatureName;
        private Output<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions;
        private Output<String> featureGroupName;
        private @Nullable Output<FeatureGroupOfflineStoreConfigArgs> offlineStoreConfig;
        private @Nullable Output<FeatureGroupOnlineStoreConfigArgs> onlineStoreConfig;
        private Output<String> recordIdentifierFeatureName;
        private Output<String> roleArn;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.eventTimeFeatureName = defaults.eventTimeFeatureName;
    	      this.featureDefinitions = defaults.featureDefinitions;
    	      this.featureGroupName = defaults.featureGroupName;
    	      this.offlineStoreConfig = defaults.offlineStoreConfig;
    	      this.onlineStoreConfig = defaults.onlineStoreConfig;
    	      this.recordIdentifierFeatureName = defaults.recordIdentifierFeatureName;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder eventTimeFeatureName(Output<String> eventTimeFeatureName) {
            this.eventTimeFeatureName = Objects.requireNonNull(eventTimeFeatureName);
            return this;
        }
        public Builder eventTimeFeatureName(String eventTimeFeatureName) {
            this.eventTimeFeatureName = Output.of(Objects.requireNonNull(eventTimeFeatureName));
            return this;
        }
        public Builder featureDefinitions(Output<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions) {
            this.featureDefinitions = Objects.requireNonNull(featureDefinitions);
            return this;
        }
        public Builder featureDefinitions(List<FeatureGroupFeatureDefinitionArgs> featureDefinitions) {
            this.featureDefinitions = Output.of(Objects.requireNonNull(featureDefinitions));
            return this;
        }
        public Builder featureDefinitions(FeatureGroupFeatureDefinitionArgs... featureDefinitions) {
            return featureDefinitions(List.of(featureDefinitions));
        }
        public Builder featureGroupName(Output<String> featureGroupName) {
            this.featureGroupName = Objects.requireNonNull(featureGroupName);
            return this;
        }
        public Builder featureGroupName(String featureGroupName) {
            this.featureGroupName = Output.of(Objects.requireNonNull(featureGroupName));
            return this;
        }
        public Builder offlineStoreConfig(@Nullable Output<FeatureGroupOfflineStoreConfigArgs> offlineStoreConfig) {
            this.offlineStoreConfig = offlineStoreConfig;
            return this;
        }
        public Builder offlineStoreConfig(@Nullable FeatureGroupOfflineStoreConfigArgs offlineStoreConfig) {
            this.offlineStoreConfig = Output.ofNullable(offlineStoreConfig);
            return this;
        }
        public Builder onlineStoreConfig(@Nullable Output<FeatureGroupOnlineStoreConfigArgs> onlineStoreConfig) {
            this.onlineStoreConfig = onlineStoreConfig;
            return this;
        }
        public Builder onlineStoreConfig(@Nullable FeatureGroupOnlineStoreConfigArgs onlineStoreConfig) {
            this.onlineStoreConfig = Output.ofNullable(onlineStoreConfig);
            return this;
        }
        public Builder recordIdentifierFeatureName(Output<String> recordIdentifierFeatureName) {
            this.recordIdentifierFeatureName = Objects.requireNonNull(recordIdentifierFeatureName);
            return this;
        }
        public Builder recordIdentifierFeatureName(String recordIdentifierFeatureName) {
            this.recordIdentifierFeatureName = Output.of(Objects.requireNonNull(recordIdentifierFeatureName));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public FeatureGroupArgs build() {
            return new FeatureGroupArgs(description, eventTimeFeatureName, featureDefinitions, featureGroupName, offlineStoreConfig, onlineStoreConfig, recordIdentifierFeatureName, roleArn, tags);
        }
    }
}
