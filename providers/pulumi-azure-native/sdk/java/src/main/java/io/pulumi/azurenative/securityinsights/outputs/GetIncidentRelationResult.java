// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIncidentRelationResult {
    private final @Nullable String etag;
    private final String id;
    private final String name;
    private final String relatedResourceId;
    private final String relatedResourceKind;
    private final String relatedResourceName;
    private final String relatedResourceType;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","relatedResourceId","relatedResourceKind","relatedResourceName","relatedResourceType","systemData","type"})
    private GetIncidentRelationResult(
        @Nullable String etag,
        String id,
        String name,
        String relatedResourceId,
        String relatedResourceKind,
        String relatedResourceName,
        String relatedResourceType,
        SystemDataResponse systemData,
        String type) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.relatedResourceId = Objects.requireNonNull(relatedResourceId);
        this.relatedResourceKind = Objects.requireNonNull(relatedResourceKind);
        this.relatedResourceName = Objects.requireNonNull(relatedResourceName);
        this.relatedResourceType = Objects.requireNonNull(relatedResourceType);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getRelatedResourceId() {
        return this.relatedResourceId;
    }
    public String getRelatedResourceKind() {
        return this.relatedResourceKind;
    }
    public String getRelatedResourceName() {
        return this.relatedResourceName;
    }
    public String getRelatedResourceType() {
        return this.relatedResourceType;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIncidentRelationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String name;
        private String relatedResourceId;
        private String relatedResourceKind;
        private String relatedResourceName;
        private String relatedResourceType;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIncidentRelationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.relatedResourceId = defaults.relatedResourceId;
    	      this.relatedResourceKind = defaults.relatedResourceKind;
    	      this.relatedResourceName = defaults.relatedResourceName;
    	      this.relatedResourceType = defaults.relatedResourceType;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRelatedResourceId(String relatedResourceId) {
            this.relatedResourceId = Objects.requireNonNull(relatedResourceId);
            return this;
        }

        public Builder setRelatedResourceKind(String relatedResourceKind) {
            this.relatedResourceKind = Objects.requireNonNull(relatedResourceKind);
            return this;
        }

        public Builder setRelatedResourceName(String relatedResourceName) {
            this.relatedResourceName = Objects.requireNonNull(relatedResourceName);
            return this;
        }

        public Builder setRelatedResourceType(String relatedResourceType) {
            this.relatedResourceType = Objects.requireNonNull(relatedResourceType);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetIncidentRelationResult build() {
            return new GetIncidentRelationResult(etag, id, name, relatedResourceId, relatedResourceKind, relatedResourceName, relatedResourceType, systemData, type);
        }
    }
}
