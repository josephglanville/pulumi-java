// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.servicemanagement_v1.enums.MonitoredResourceDescriptorLaunchStage;
import io.pulumi.googlenative.servicemanagement_v1.inputs.LabelDescriptorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An object that describes the schema of a MonitoredResource object using a type name and a set of labels. For example, the monitored resource descriptor for Google Compute Engine VM instances has a type of `"gce_instance"` and specifies the use of the labels `"instance_id"` and `"zone"` to identify particular VM instances. Different APIs can support different monitored resource types. APIs generally provide a `list` method that returns the monitored resource descriptors used by the API.
 * 
 */
public final class MonitoredResourceDescriptorArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoredResourceDescriptorArgs Empty = new MonitoredResourceDescriptorArgs();

    /**
     * Optional. A detailed description of the monitored resource type that might be used in documentation.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Optional. A concise name for the monitored resource type that might be displayed in user interfaces. It should be a Title Cased Noun Phrase, without any article or other determiners. For example, `"Google Cloud SQL Database"`.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * A set of labels used to describe instances of this monitored resource type. For example, an individual Google Cloud SQL database is identified by values for the labels `"database_id"` and `"zone"`.
     * 
     */
    @Import(name="labels", required=true)
      private final Output<List<LabelDescriptorArgs>> labels;

    public Output<List<LabelDescriptorArgs>> getLabels() {
        return this.labels;
    }

    /**
     * Optional. The launch stage of the monitored resource definition.
     * 
     */
    @Import(name="launchStage")
      private final @Nullable Output<MonitoredResourceDescriptorLaunchStage> launchStage;

    public Output<MonitoredResourceDescriptorLaunchStage> getLaunchStage() {
        return this.launchStage == null ? Codegen.empty() : this.launchStage;
    }

    /**
     * Optional. The resource name of the monitored resource descriptor: `"projects/{project_id}/monitoredResourceDescriptors/{type}"` where {type} is the value of the `type` field in this object and {project_id} is a project ID that provides API-specific context for accessing the type. APIs that do not use project information can use the resource name format `"monitoredResourceDescriptors/{type}"`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The monitored resource type. For example, the type `"cloudsql_database"` represents databases in Google Cloud SQL. For a list of types, see [Monitoring resource types](https://cloud.google.com/monitoring/api/resources) and [Logging resource types](https://cloud.google.com/logging/docs/api/v2/resource-list).
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public MonitoredResourceDescriptorArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        Output<List<LabelDescriptorArgs>> labels,
        @Nullable Output<MonitoredResourceDescriptorLaunchStage> launchStage,
        @Nullable Output<String> name,
        Output<String> type) {
        this.description = description;
        this.displayName = displayName;
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.launchStage = launchStage;
        this.name = name;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MonitoredResourceDescriptorArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.labels = Codegen.empty();
        this.launchStage = Codegen.empty();
        this.name = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoredResourceDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private Output<List<LabelDescriptorArgs>> labels;
        private @Nullable Output<MonitoredResourceDescriptorLaunchStage> launchStage;
        private @Nullable Output<String> name;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoredResourceDescriptorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.launchStage = defaults.launchStage;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder labels(Output<List<LabelDescriptorArgs>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(List<LabelDescriptorArgs> labels) {
            this.labels = Output.of(Objects.requireNonNull(labels));
            return this;
        }
        public Builder labels(LabelDescriptorArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder launchStage(@Nullable Output<MonitoredResourceDescriptorLaunchStage> launchStage) {
            this.launchStage = launchStage;
            return this;
        }
        public Builder launchStage(@Nullable MonitoredResourceDescriptorLaunchStage launchStage) {
            this.launchStage = Codegen.ofNullable(launchStage);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public MonitoredResourceDescriptorArgs build() {
            return new MonitoredResourceDescriptorArgs(description, displayName, labels, launchStage, name, type);
        }
    }
}
