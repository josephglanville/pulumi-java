// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyCustomHeaderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class ResponseHeadersPolicyCustomHeadersConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyCustomHeadersConfigArgs Empty = new ResponseHeadersPolicyCustomHeadersConfigArgs();

    @InputImport(name="items", required=true)
      private final Input<List<ResponseHeadersPolicyCustomHeaderArgs>> items;

    public Input<List<ResponseHeadersPolicyCustomHeaderArgs>> getItems() {
        return this.items;
    }

    public ResponseHeadersPolicyCustomHeadersConfigArgs(Input<List<ResponseHeadersPolicyCustomHeaderArgs>> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private ResponseHeadersPolicyCustomHeadersConfigArgs() {
        this.items = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyCustomHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ResponseHeadersPolicyCustomHeaderArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyCustomHeadersConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(Input<List<ResponseHeadersPolicyCustomHeaderArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setItems(List<ResponseHeadersPolicyCustomHeaderArgs> items) {
            this.items = Input.of(Objects.requireNonNull(items));
            return this;
        }
        public ResponseHeadersPolicyCustomHeadersConfigArgs build() {
            return new ResponseHeadersPolicyCustomHeadersConfigArgs(items);
        }
    }
}
