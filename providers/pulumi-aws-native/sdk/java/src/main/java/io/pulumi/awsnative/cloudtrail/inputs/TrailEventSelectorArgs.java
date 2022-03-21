// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudtrail.inputs;

import io.pulumi.awsnative.cloudtrail.enums.TrailEventSelectorReadWriteType;
import io.pulumi.awsnative.cloudtrail.inputs.TrailDataResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The type of email sending events to publish to the event destination.
 * 
 */
public final class TrailEventSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrailEventSelectorArgs Empty = new TrailEventSelectorArgs();

    @Import(name="dataResources")
      private final @Nullable Output<List<TrailDataResourceArgs>> dataResources;

    public Output<List<TrailDataResourceArgs>> getDataResources() {
        return this.dataResources == null ? Output.empty() : this.dataResources;
    }

    /**
     * An optional list of service event sources from which you do not want management events to be logged on your trail. In this release, the list can be empty (disables the filter), or it can filter out AWS Key Management Service events by containing "kms.amazonaws.com". By default, ExcludeManagementEventSources is empty, and AWS KMS events are included in events that are logged to your trail.
     * 
     */
    @Import(name="excludeManagementEventSources")
      private final @Nullable Output<List<String>> excludeManagementEventSources;

    public Output<List<String>> getExcludeManagementEventSources() {
        return this.excludeManagementEventSources == null ? Output.empty() : this.excludeManagementEventSources;
    }

    /**
     * Specify if you want your event selector to include management events for your trail.
     * 
     */
    @Import(name="includeManagementEvents")
      private final @Nullable Output<Boolean> includeManagementEvents;

    public Output<Boolean> getIncludeManagementEvents() {
        return this.includeManagementEvents == null ? Output.empty() : this.includeManagementEvents;
    }

    /**
     * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.
     * 
     */
    @Import(name="readWriteType")
      private final @Nullable Output<TrailEventSelectorReadWriteType> readWriteType;

    public Output<TrailEventSelectorReadWriteType> getReadWriteType() {
        return this.readWriteType == null ? Output.empty() : this.readWriteType;
    }

    public TrailEventSelectorArgs(
        @Nullable Output<List<TrailDataResourceArgs>> dataResources,
        @Nullable Output<List<String>> excludeManagementEventSources,
        @Nullable Output<Boolean> includeManagementEvents,
        @Nullable Output<TrailEventSelectorReadWriteType> readWriteType) {
        this.dataResources = dataResources;
        this.excludeManagementEventSources = excludeManagementEventSources;
        this.includeManagementEvents = includeManagementEvents;
        this.readWriteType = readWriteType;
    }

    private TrailEventSelectorArgs() {
        this.dataResources = Output.empty();
        this.excludeManagementEventSources = Output.empty();
        this.includeManagementEvents = Output.empty();
        this.readWriteType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailEventSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<TrailDataResourceArgs>> dataResources;
        private @Nullable Output<List<String>> excludeManagementEventSources;
        private @Nullable Output<Boolean> includeManagementEvents;
        private @Nullable Output<TrailEventSelectorReadWriteType> readWriteType;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailEventSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataResources = defaults.dataResources;
    	      this.excludeManagementEventSources = defaults.excludeManagementEventSources;
    	      this.includeManagementEvents = defaults.includeManagementEvents;
    	      this.readWriteType = defaults.readWriteType;
        }

        public Builder dataResources(@Nullable Output<List<TrailDataResourceArgs>> dataResources) {
            this.dataResources = dataResources;
            return this;
        }
        public Builder dataResources(@Nullable List<TrailDataResourceArgs> dataResources) {
            this.dataResources = Output.ofNullable(dataResources);
            return this;
        }
        public Builder dataResources(TrailDataResourceArgs... dataResources) {
            return dataResources(List.of(dataResources));
        }
        public Builder excludeManagementEventSources(@Nullable Output<List<String>> excludeManagementEventSources) {
            this.excludeManagementEventSources = excludeManagementEventSources;
            return this;
        }
        public Builder excludeManagementEventSources(@Nullable List<String> excludeManagementEventSources) {
            this.excludeManagementEventSources = Output.ofNullable(excludeManagementEventSources);
            return this;
        }
        public Builder excludeManagementEventSources(String... excludeManagementEventSources) {
            return excludeManagementEventSources(List.of(excludeManagementEventSources));
        }
        public Builder includeManagementEvents(@Nullable Output<Boolean> includeManagementEvents) {
            this.includeManagementEvents = includeManagementEvents;
            return this;
        }
        public Builder includeManagementEvents(@Nullable Boolean includeManagementEvents) {
            this.includeManagementEvents = Output.ofNullable(includeManagementEvents);
            return this;
        }
        public Builder readWriteType(@Nullable Output<TrailEventSelectorReadWriteType> readWriteType) {
            this.readWriteType = readWriteType;
            return this;
        }
        public Builder readWriteType(@Nullable TrailEventSelectorReadWriteType readWriteType) {
            this.readWriteType = Output.ofNullable(readWriteType);
            return this;
        }        public TrailEventSelectorArgs build() {
            return new TrailEventSelectorArgs(dataResources, excludeManagementEventSources, includeManagementEvents, readWriteType);
        }
    }
}
