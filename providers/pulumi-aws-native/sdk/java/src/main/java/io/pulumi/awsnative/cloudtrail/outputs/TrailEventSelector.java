// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudtrail.outputs;

import io.pulumi.awsnative.cloudtrail.enums.TrailEventSelectorReadWriteType;
import io.pulumi.awsnative.cloudtrail.outputs.TrailDataResource;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TrailEventSelector {
    private final @Nullable List<TrailDataResource> dataResources;
    private final @Nullable List<String> excludeManagementEventSources;
    private final @Nullable Boolean includeManagementEvents;
    private final @Nullable TrailEventSelectorReadWriteType readWriteType;

    @OutputCustomType.Constructor({"dataResources","excludeManagementEventSources","includeManagementEvents","readWriteType"})
    private TrailEventSelector(
        @Nullable List<TrailDataResource> dataResources,
        @Nullable List<String> excludeManagementEventSources,
        @Nullable Boolean includeManagementEvents,
        @Nullable TrailEventSelectorReadWriteType readWriteType) {
        this.dataResources = dataResources;
        this.excludeManagementEventSources = excludeManagementEventSources;
        this.includeManagementEvents = includeManagementEvents;
        this.readWriteType = readWriteType;
    }

    public List<TrailDataResource> getDataResources() {
        return this.dataResources == null ? List.of() : this.dataResources;
    }
    public List<String> getExcludeManagementEventSources() {
        return this.excludeManagementEventSources == null ? List.of() : this.excludeManagementEventSources;
    }
    public Optional<Boolean> getIncludeManagementEvents() {
        return Optional.ofNullable(this.includeManagementEvents);
    }
    public Optional<TrailEventSelectorReadWriteType> getReadWriteType() {
        return Optional.ofNullable(this.readWriteType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailEventSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TrailDataResource> dataResources;
        private @Nullable List<String> excludeManagementEventSources;
        private @Nullable Boolean includeManagementEvents;
        private @Nullable TrailEventSelectorReadWriteType readWriteType;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailEventSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataResources = defaults.dataResources;
    	      this.excludeManagementEventSources = defaults.excludeManagementEventSources;
    	      this.includeManagementEvents = defaults.includeManagementEvents;
    	      this.readWriteType = defaults.readWriteType;
        }

        public Builder setDataResources(@Nullable List<TrailDataResource> dataResources) {
            this.dataResources = dataResources;
            return this;
        }

        public Builder setExcludeManagementEventSources(@Nullable List<String> excludeManagementEventSources) {
            this.excludeManagementEventSources = excludeManagementEventSources;
            return this;
        }

        public Builder setIncludeManagementEvents(@Nullable Boolean includeManagementEvents) {
            this.includeManagementEvents = includeManagementEvents;
            return this;
        }

        public Builder setReadWriteType(@Nullable TrailEventSelectorReadWriteType readWriteType) {
            this.readWriteType = readWriteType;
            return this;
        }

        public TrailEventSelector build() {
            return new TrailEventSelector(dataResources, excludeManagementEventSources, includeManagementEvents, readWriteType);
        }
    }
}