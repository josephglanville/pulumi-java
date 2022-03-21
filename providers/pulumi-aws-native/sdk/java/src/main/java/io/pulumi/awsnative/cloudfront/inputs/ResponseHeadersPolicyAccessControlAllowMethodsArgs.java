// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ResponseHeadersPolicyAccessControlAllowMethodsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyAccessControlAllowMethodsArgs Empty = new ResponseHeadersPolicyAccessControlAllowMethodsArgs();

    @Import(name="items", required=true)
      private final Output<List<String>> items;

    public Output<List<String>> getItems() {
        return this.items;
    }

    public ResponseHeadersPolicyAccessControlAllowMethodsArgs(Output<List<String>> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private ResponseHeadersPolicyAccessControlAllowMethodsArgs() {
        this.items = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyAccessControlAllowMethodsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyAccessControlAllowMethodsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(Output<List<String>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(List<String> items) {
            this.items = Output.of(Objects.requireNonNull(items));
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public ResponseHeadersPolicyAccessControlAllowMethodsArgs build() {
            return new ResponseHeadersPolicyAccessControlAllowMethodsArgs(items);
        }
    }
}
