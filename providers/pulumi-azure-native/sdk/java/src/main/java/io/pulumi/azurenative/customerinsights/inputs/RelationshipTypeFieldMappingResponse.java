// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RelationshipTypeFieldMappingResponse extends io.pulumi.resources.InvokeArgs {

    public static final RelationshipTypeFieldMappingResponse Empty = new RelationshipTypeFieldMappingResponse();

    @InputImport(name="profileFieldName", required=true)
    private final String profileFieldName;

    public String getProfileFieldName() {
        return this.profileFieldName;
    }

    @InputImport(name="relatedProfileKeyProperty", required=true)
    private final String relatedProfileKeyProperty;

    public String getRelatedProfileKeyProperty() {
        return this.relatedProfileKeyProperty;
    }

    public RelationshipTypeFieldMappingResponse(
        String profileFieldName,
        String relatedProfileKeyProperty) {
        this.profileFieldName = Objects.requireNonNull(profileFieldName, "expected parameter 'profileFieldName' to be non-null");
        this.relatedProfileKeyProperty = Objects.requireNonNull(relatedProfileKeyProperty, "expected parameter 'relatedProfileKeyProperty' to be non-null");
    }

    private RelationshipTypeFieldMappingResponse() {
        this.profileFieldName = null;
        this.relatedProfileKeyProperty = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipTypeFieldMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String profileFieldName;
        private String relatedProfileKeyProperty;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipTypeFieldMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileFieldName = defaults.profileFieldName;
    	      this.relatedProfileKeyProperty = defaults.relatedProfileKeyProperty;
        }

        public Builder setProfileFieldName(String profileFieldName) {
            this.profileFieldName = Objects.requireNonNull(profileFieldName);
            return this;
        }

        public Builder setRelatedProfileKeyProperty(String relatedProfileKeyProperty) {
            this.relatedProfileKeyProperty = Objects.requireNonNull(relatedProfileKeyProperty);
            return this;
        }

        public RelationshipTypeFieldMappingResponse build() {
            return new RelationshipTypeFieldMappingResponse(profileFieldName, relatedProfileKeyProperty);
        }
    }
}
