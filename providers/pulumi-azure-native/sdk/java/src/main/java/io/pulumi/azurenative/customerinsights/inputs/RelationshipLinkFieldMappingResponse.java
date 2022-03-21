// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The fields mapping for Relationships.
 * 
 */
public final class RelationshipLinkFieldMappingResponse extends io.pulumi.resources.InvokeArgs {

    public static final RelationshipLinkFieldMappingResponse Empty = new RelationshipLinkFieldMappingResponse();

    /**
     * The field name on the Interaction Type.
     * 
     */
    @Import(name="interactionFieldName", required=true)
      private final String interactionFieldName;

    public String getInteractionFieldName() {
        return this.interactionFieldName;
    }

    /**
     * Link type.
     * 
     */
    @Import(name="linkType")
      private final @Nullable String linkType;

    public Optional<String> getLinkType() {
        return this.linkType == null ? Optional.empty() : Optional.ofNullable(this.linkType);
    }

    /**
     * The field name on the Relationship metadata.
     * 
     */
    @Import(name="relationshipFieldName", required=true)
      private final String relationshipFieldName;

    public String getRelationshipFieldName() {
        return this.relationshipFieldName;
    }

    public RelationshipLinkFieldMappingResponse(
        String interactionFieldName,
        @Nullable String linkType,
        String relationshipFieldName) {
        this.interactionFieldName = Objects.requireNonNull(interactionFieldName, "expected parameter 'interactionFieldName' to be non-null");
        this.linkType = linkType;
        this.relationshipFieldName = Objects.requireNonNull(relationshipFieldName, "expected parameter 'relationshipFieldName' to be non-null");
    }

    private RelationshipLinkFieldMappingResponse() {
        this.interactionFieldName = null;
        this.linkType = null;
        this.relationshipFieldName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipLinkFieldMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interactionFieldName;
        private @Nullable String linkType;
        private String relationshipFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipLinkFieldMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interactionFieldName = defaults.interactionFieldName;
    	      this.linkType = defaults.linkType;
    	      this.relationshipFieldName = defaults.relationshipFieldName;
        }

        public Builder interactionFieldName(String interactionFieldName) {
            this.interactionFieldName = Objects.requireNonNull(interactionFieldName);
            return this;
        }
        public Builder linkType(@Nullable String linkType) {
            this.linkType = linkType;
            return this;
        }
        public Builder relationshipFieldName(String relationshipFieldName) {
            this.relationshipFieldName = Objects.requireNonNull(relationshipFieldName);
            return this;
        }        public RelationshipLinkFieldMappingResponse build() {
            return new RelationshipLinkFieldMappingResponse(interactionFieldName, linkType, relationshipFieldName);
        }
    }
}
