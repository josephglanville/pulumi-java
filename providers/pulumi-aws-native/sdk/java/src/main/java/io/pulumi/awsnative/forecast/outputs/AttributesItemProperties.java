// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.forecast.outputs;

import io.pulumi.awsnative.forecast.enums.DatasetAttributesItemPropertiesAttributeType;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AttributesItemProperties {
    /**
     * Name of the dataset field
     * 
     */
    private final @Nullable String attributeName;
    /**
     * Data type of the field
     * 
     */
    private final @Nullable DatasetAttributesItemPropertiesAttributeType attributeType;

    @CustomType.Constructor
    private AttributesItemProperties(
        @CustomType.Parameter("attributeName") @Nullable String attributeName,
        @CustomType.Parameter("attributeType") @Nullable DatasetAttributesItemPropertiesAttributeType attributeType) {
        this.attributeName = attributeName;
        this.attributeType = attributeType;
    }

    /**
     * Name of the dataset field
     * 
    */
    public Optional<String> getAttributeName() {
        return Optional.ofNullable(this.attributeName);
    }
    /**
     * Data type of the field
     * 
    */
    public Optional<DatasetAttributesItemPropertiesAttributeType> getAttributeType() {
        return Optional.ofNullable(this.attributeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttributesItemProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String attributeName;
        private @Nullable DatasetAttributesItemPropertiesAttributeType attributeType;

        public Builder() {
    	      // Empty
        }

        public Builder(AttributesItemProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.attributeType = defaults.attributeType;
        }

        public Builder attributeName(@Nullable String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public Builder attributeType(@Nullable DatasetAttributesItemPropertiesAttributeType attributeType) {
            this.attributeType = attributeType;
            return this;
        }        public AttributesItemProperties build() {
            return new AttributesItemProperties(attributeName, attributeType);
        }
    }
}
