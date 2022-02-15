// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse {
    private final String displayName;
    private final String resourceId;
    private final String resourceType;

    @OutputCustomType.Constructor({"displayName","resourceId","resourceType"})
    private GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse(
        String displayName,
        String resourceId,
        String resourceType) {
        this.displayName = Objects.requireNonNull(displayName);
        this.resourceId = Objects.requireNonNull(resourceId);
        this.resourceType = Objects.requireNonNull(resourceType);
    }

    public String getDisplayName() {
        return this.displayName;
    }
    public String getResourceId() {
        return this.resourceId;
    }
    public String getPropResourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String resourceId;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse build() {
            return new GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResponse(displayName, resourceId, resourceType);
        }
    }
}