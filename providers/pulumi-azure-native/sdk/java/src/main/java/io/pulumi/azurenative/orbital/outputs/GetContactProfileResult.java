// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.outputs;

import io.pulumi.azurenative.orbital.outputs.ContactProfileLinkResponse;
import io.pulumi.azurenative.orbital.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContactProfileResult {
    private final @Nullable String autoTrackingConfiguration;
    private final String etag;
    private final @Nullable String eventHubUri;
    private final String id;
    private final List<ContactProfileLinkResponse> links;
    private final String location;
    private final @Nullable Double minimumElevationDegrees;
    private final @Nullable String minimumViableContactDuration;
    private final String name;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"autoTrackingConfiguration","etag","eventHubUri","id","links","location","minimumElevationDegrees","minimumViableContactDuration","name","systemData","tags","type"})
    private GetContactProfileResult(
        @Nullable String autoTrackingConfiguration,
        String etag,
        @Nullable String eventHubUri,
        String id,
        List<ContactProfileLinkResponse> links,
        String location,
        @Nullable Double minimumElevationDegrees,
        @Nullable String minimumViableContactDuration,
        String name,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.autoTrackingConfiguration = autoTrackingConfiguration;
        this.etag = Objects.requireNonNull(etag);
        this.eventHubUri = eventHubUri;
        this.id = Objects.requireNonNull(id);
        this.links = Objects.requireNonNull(links);
        this.location = Objects.requireNonNull(location);
        this.minimumElevationDegrees = minimumElevationDegrees;
        this.minimumViableContactDuration = minimumViableContactDuration;
        this.name = Objects.requireNonNull(name);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getAutoTrackingConfiguration() {
        return Optional.ofNullable(this.autoTrackingConfiguration);
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getEventHubUri() {
        return Optional.ofNullable(this.eventHubUri);
    }
    public String getId() {
        return this.id;
    }
    public List<ContactProfileLinkResponse> getLinks() {
        return this.links;
    }
    public String getLocation() {
        return this.location;
    }
    public Optional<Double> getMinimumElevationDegrees() {
        return Optional.ofNullable(this.minimumElevationDegrees);
    }
    public Optional<String> getMinimumViableContactDuration() {
        return Optional.ofNullable(this.minimumViableContactDuration);
    }
    public String getName() {
        return this.name;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String autoTrackingConfiguration;
        private String etag;
        private @Nullable String eventHubUri;
        private String id;
        private List<ContactProfileLinkResponse> links;
        private String location;
        private @Nullable Double minimumElevationDegrees;
        private @Nullable String minimumViableContactDuration;
        private String name;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoTrackingConfiguration = defaults.autoTrackingConfiguration;
    	      this.etag = defaults.etag;
    	      this.eventHubUri = defaults.eventHubUri;
    	      this.id = defaults.id;
    	      this.links = defaults.links;
    	      this.location = defaults.location;
    	      this.minimumElevationDegrees = defaults.minimumElevationDegrees;
    	      this.minimumViableContactDuration = defaults.minimumViableContactDuration;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAutoTrackingConfiguration(@Nullable String autoTrackingConfiguration) {
            this.autoTrackingConfiguration = autoTrackingConfiguration;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setEventHubUri(@Nullable String eventHubUri) {
            this.eventHubUri = eventHubUri;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLinks(List<ContactProfileLinkResponse> links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMinimumElevationDegrees(@Nullable Double minimumElevationDegrees) {
            this.minimumElevationDegrees = minimumElevationDegrees;
            return this;
        }

        public Builder setMinimumViableContactDuration(@Nullable String minimumViableContactDuration) {
            this.minimumViableContactDuration = minimumViableContactDuration;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetContactProfileResult build() {
            return new GetContactProfileResult(autoTrackingConfiguration, etag, eventHubUri, id, links, location, minimumElevationDegrees, minimumViableContactDuration, name, systemData, tags, type);
        }
    }
}
