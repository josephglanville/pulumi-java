// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDataCollectionRuleAssociationResult {
    private final @Nullable String dataCollectionRuleId;
    private final @Nullable String description;
    private final String etag;
    private final String id;
    private final String name;
    private final String provisioningState;
    private final String type;

    @OutputCustomType.Constructor({"dataCollectionRuleId","description","etag","id","name","provisioningState","type"})
    private GetDataCollectionRuleAssociationResult(
        @Nullable String dataCollectionRuleId,
        @Nullable String description,
        String etag,
        String id,
        String name,
        String provisioningState,
        String type) {
        this.dataCollectionRuleId = dataCollectionRuleId;
        this.description = description;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getDataCollectionRuleId() {
        return Optional.ofNullable(this.dataCollectionRuleId);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getEtag() {
        return this.etag;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionRuleAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataCollectionRuleId;
        private @Nullable String description;
        private String etag;
        private String id;
        private String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCollectionRuleAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCollectionRuleId = defaults.dataCollectionRuleId;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setDataCollectionRuleId(@Nullable String dataCollectionRuleId) {
            this.dataCollectionRuleId = dataCollectionRuleId;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetDataCollectionRuleAssociationResult build() {
            return new GetDataCollectionRuleAssociationResult(dataCollectionRuleId, description, etag, id, name, provisioningState, type);
        }
    }
}
