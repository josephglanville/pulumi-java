// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNotificationChannelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNotificationChannelArgs Empty = new GetNotificationChannelArgs();

    /**
     * The display name for this notification channel.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Labels (corresponding to the
     * NotificationChannelDescriptor schema) to filter the notification channels by.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The type of the notification channel.
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * User-provided key-value labels to filter by.
     * 
     */
    @InputImport(name="userLabels")
      private final @Nullable Map<String,String> userLabels;

    public Map<String,String> getUserLabels() {
        return this.userLabels == null ? Map.of() : this.userLabels;
    }

    public GetNotificationChannelArgs(
        @Nullable String displayName,
        @Nullable Map<String,String> labels,
        @Nullable String project,
        @Nullable String type,
        @Nullable Map<String,String> userLabels) {
        this.displayName = displayName;
        this.labels = labels;
        this.project = project;
        this.type = type;
        this.userLabels = userLabels;
    }

    private GetNotificationChannelArgs() {
        this.displayName = null;
        this.labels = Map.of();
        this.project = null;
        this.type = null;
        this.userLabels = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable Map<String,String> labels;
        private @Nullable String project;
        private @Nullable String type;
        private @Nullable Map<String,String> userLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
    	      this.userLabels = defaults.userLabels;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUserLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = userLabels;
            return this;
        }
        public GetNotificationChannelArgs build() {
            return new GetNotificationChannelArgs(displayName, labels, project, type, userLabels);
        }
    }
}
