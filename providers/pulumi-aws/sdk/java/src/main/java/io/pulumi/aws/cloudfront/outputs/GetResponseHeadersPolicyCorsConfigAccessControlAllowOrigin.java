// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin {
    private final List<String> items;

    @CustomType.Constructor
    private GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin(@CustomType.Parameter("items") List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin build() {
            return new GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin(items);
        }
    }
}
