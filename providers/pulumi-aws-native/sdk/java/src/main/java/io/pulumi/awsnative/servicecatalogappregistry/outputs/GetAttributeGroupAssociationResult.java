// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAttributeGroupAssociationResult {
    /**
     * The name or the Id of the Application.
     * 
     */
    private final @Nullable String application;
    private final @Nullable String applicationArn;
    /**
     * The name or the Id of the AttributeGroup.
     * 
     */
    private final @Nullable String attributeGroup;
    private final @Nullable String attributeGroupArn;
    private final @Nullable String id;

    @CustomType.Constructor
    private GetAttributeGroupAssociationResult(
        @CustomType.Parameter("application") @Nullable String application,
        @CustomType.Parameter("applicationArn") @Nullable String applicationArn,
        @CustomType.Parameter("attributeGroup") @Nullable String attributeGroup,
        @CustomType.Parameter("attributeGroupArn") @Nullable String attributeGroupArn,
        @CustomType.Parameter("id") @Nullable String id) {
        this.application = application;
        this.applicationArn = applicationArn;
        this.attributeGroup = attributeGroup;
        this.attributeGroupArn = attributeGroupArn;
        this.id = id;
    }

    /**
     * The name or the Id of the Application.
     * 
    */
    public Optional<String> getApplication() {
        return Optional.ofNullable(this.application);
    }
    public Optional<String> getApplicationArn() {
        return Optional.ofNullable(this.applicationArn);
    }
    /**
     * The name or the Id of the AttributeGroup.
     * 
    */
    public Optional<String> getAttributeGroup() {
        return Optional.ofNullable(this.attributeGroup);
    }
    public Optional<String> getAttributeGroupArn() {
        return Optional.ofNullable(this.attributeGroupArn);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttributeGroupAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String application;
        private @Nullable String applicationArn;
        private @Nullable String attributeGroup;
        private @Nullable String attributeGroupArn;
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttributeGroupAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.applicationArn = defaults.applicationArn;
    	      this.attributeGroup = defaults.attributeGroup;
    	      this.attributeGroupArn = defaults.attributeGroupArn;
    	      this.id = defaults.id;
        }

        public Builder application(@Nullable String application) {
            this.application = application;
            return this;
        }
        public Builder applicationArn(@Nullable String applicationArn) {
            this.applicationArn = applicationArn;
            return this;
        }
        public Builder attributeGroup(@Nullable String attributeGroup) {
            this.attributeGroup = attributeGroup;
            return this;
        }
        public Builder attributeGroupArn(@Nullable String attributeGroupArn) {
            this.attributeGroupArn = attributeGroupArn;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public GetAttributeGroupAssociationResult build() {
            return new GetAttributeGroupAssociationResult(application, applicationArn, attributeGroup, attributeGroupArn, id);
        }
    }
}
