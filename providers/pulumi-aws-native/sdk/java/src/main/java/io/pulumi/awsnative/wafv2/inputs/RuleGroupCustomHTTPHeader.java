// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * HTTP header.
 * 
 */
public final class RuleGroupCustomHTTPHeader extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupCustomHTTPHeader Empty = new RuleGroupCustomHTTPHeader();

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @Import(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public RuleGroupCustomHTTPHeader(
        String name,
        String value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private RuleGroupCustomHTTPHeader() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomHTTPHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomHTTPHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public RuleGroupCustomHTTPHeader build() {
            return new RuleGroupCustomHTTPHeader(name, value);
        }
    }
}
