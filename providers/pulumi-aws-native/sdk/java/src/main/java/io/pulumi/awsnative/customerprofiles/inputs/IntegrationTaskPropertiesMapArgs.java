// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.enums.IntegrationOperatorPropertiesKeys;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IntegrationTaskPropertiesMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationTaskPropertiesMapArgs Empty = new IntegrationTaskPropertiesMapArgs();

    @Import(name="operatorPropertyKey", required=true)
      private final Output<IntegrationOperatorPropertiesKeys> operatorPropertyKey;

    public Output<IntegrationOperatorPropertiesKeys> getOperatorPropertyKey() {
        return this.operatorPropertyKey;
    }

    @Import(name="property", required=true)
      private final Output<String> property;

    public Output<String> getProperty() {
        return this.property;
    }

    public IntegrationTaskPropertiesMapArgs(
        Output<IntegrationOperatorPropertiesKeys> operatorPropertyKey,
        Output<String> property) {
        this.operatorPropertyKey = Objects.requireNonNull(operatorPropertyKey, "expected parameter 'operatorPropertyKey' to be non-null");
        this.property = Objects.requireNonNull(property, "expected parameter 'property' to be non-null");
    }

    private IntegrationTaskPropertiesMapArgs() {
        this.operatorPropertyKey = Output.empty();
        this.property = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationTaskPropertiesMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<IntegrationOperatorPropertiesKeys> operatorPropertyKey;
        private Output<String> property;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationTaskPropertiesMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatorPropertyKey = defaults.operatorPropertyKey;
    	      this.property = defaults.property;
        }

        public Builder operatorPropertyKey(Output<IntegrationOperatorPropertiesKeys> operatorPropertyKey) {
            this.operatorPropertyKey = Objects.requireNonNull(operatorPropertyKey);
            return this;
        }
        public Builder operatorPropertyKey(IntegrationOperatorPropertiesKeys operatorPropertyKey) {
            this.operatorPropertyKey = Output.of(Objects.requireNonNull(operatorPropertyKey));
            return this;
        }
        public Builder property(Output<String> property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }
        public Builder property(String property) {
            this.property = Output.of(Objects.requireNonNull(property));
            return this;
        }        public IntegrationTaskPropertiesMapArgs build() {
            return new IntegrationTaskPropertiesMapArgs(operatorPropertyKey, property);
        }
    }
}
