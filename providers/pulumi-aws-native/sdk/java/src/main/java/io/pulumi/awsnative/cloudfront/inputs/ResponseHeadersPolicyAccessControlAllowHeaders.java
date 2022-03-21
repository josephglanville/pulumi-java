// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ResponseHeadersPolicyAccessControlAllowHeaders extends io.pulumi.resources.InvokeArgs {

    public static final ResponseHeadersPolicyAccessControlAllowHeaders Empty = new ResponseHeadersPolicyAccessControlAllowHeaders();

    @Import(name="items", required=true)
      private final List<String> items;

    public List<String> getItems() {
        return this.items;
    }

    public ResponseHeadersPolicyAccessControlAllowHeaders(List<String> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private ResponseHeadersPolicyAccessControlAllowHeaders() {
        this.items = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyAccessControlAllowHeaders defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyAccessControlAllowHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public ResponseHeadersPolicyAccessControlAllowHeaders build() {
            return new ResponseHeadersPolicyAccessControlAllowHeaders(items);
        }
    }
}
