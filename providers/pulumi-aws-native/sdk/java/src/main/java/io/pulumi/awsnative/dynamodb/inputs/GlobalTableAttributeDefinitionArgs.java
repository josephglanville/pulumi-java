// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GlobalTableAttributeDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTableAttributeDefinitionArgs Empty = new GlobalTableAttributeDefinitionArgs();

    @Import(name="attributeName", required=true)
      private final Output<String> attributeName;

    public Output<String> getAttributeName() {
        return this.attributeName;
    }

    @Import(name="attributeType", required=true)
      private final Output<String> attributeType;

    public Output<String> getAttributeType() {
        return this.attributeType;
    }

    public GlobalTableAttributeDefinitionArgs(
        Output<String> attributeName,
        Output<String> attributeType) {
        this.attributeName = Objects.requireNonNull(attributeName, "expected parameter 'attributeName' to be non-null");
        this.attributeType = Objects.requireNonNull(attributeType, "expected parameter 'attributeType' to be non-null");
    }

    private GlobalTableAttributeDefinitionArgs() {
        this.attributeName = Output.empty();
        this.attributeType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableAttributeDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> attributeName;
        private Output<String> attributeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableAttributeDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.attributeType = defaults.attributeType;
        }

        public Builder attributeName(Output<String> attributeName) {
            this.attributeName = Objects.requireNonNull(attributeName);
            return this;
        }
        public Builder attributeName(String attributeName) {
            this.attributeName = Output.of(Objects.requireNonNull(attributeName));
            return this;
        }
        public Builder attributeType(Output<String> attributeType) {
            this.attributeType = Objects.requireNonNull(attributeType);
            return this;
        }
        public Builder attributeType(String attributeType) {
            this.attributeType = Output.of(Objects.requireNonNull(attributeType));
            return this;
        }        public GlobalTableAttributeDefinitionArgs build() {
            return new GlobalTableAttributeDefinitionArgs(attributeName, attributeType);
        }
    }
}
