// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FulfillmentFeatureGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FulfillmentFeatureGetArgs Empty = new FulfillmentFeatureGetArgs();

    /**
     * The type of the feature that enabled for fulfillment.
     * * SMALLTALK: Fulfillment is enabled for SmallTalk.
     *   Possible values are `SMALLTALK`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public FulfillmentFeatureGetArgs(Input<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FulfillmentFeatureGetArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FulfillmentFeatureGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FulfillmentFeatureGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public FulfillmentFeatureGetArgs build() {
            return new FulfillmentFeatureGetArgs(type);
        }
    }
}
