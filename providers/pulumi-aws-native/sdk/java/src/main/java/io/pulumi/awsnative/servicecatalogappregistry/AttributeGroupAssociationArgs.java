// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AttributeGroupAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttributeGroupAssociationArgs Empty = new AttributeGroupAssociationArgs();

    /**
     * The name or the Id of the Application.
     * 
     */
    @InputImport(name="application", required=true)
      private final Output<String> application;

    public Output<String> getApplication() {
        return this.application;
    }

    /**
     * The name or the Id of the AttributeGroup.
     * 
     */
    @InputImport(name="attributeGroup", required=true)
      private final Output<String> attributeGroup;

    public Output<String> getAttributeGroup() {
        return this.attributeGroup;
    }

    public AttributeGroupAssociationArgs(
        Output<String> application,
        Output<String> attributeGroup) {
        this.application = Objects.requireNonNull(application, "expected parameter 'application' to be non-null");
        this.attributeGroup = Objects.requireNonNull(attributeGroup, "expected parameter 'attributeGroup' to be non-null");
    }

    private AttributeGroupAssociationArgs() {
        this.application = Output.empty();
        this.attributeGroup = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttributeGroupAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> application;
        private Output<String> attributeGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(AttributeGroupAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.attributeGroup = defaults.attributeGroup;
        }

        public Builder application(Output<String> application) {
            this.application = Objects.requireNonNull(application);
            return this;
        }

        public Builder application(String application) {
            this.application = Output.of(Objects.requireNonNull(application));
            return this;
        }

        public Builder attributeGroup(Output<String> attributeGroup) {
            this.attributeGroup = Objects.requireNonNull(attributeGroup);
            return this;
        }

        public Builder attributeGroup(String attributeGroup) {
            this.attributeGroup = Output.of(Objects.requireNonNull(attributeGroup));
            return this;
        }
        public AttributeGroupAssociationArgs build() {
            return new AttributeGroupAssociationArgs(application, attributeGroup);
        }
    }
}
