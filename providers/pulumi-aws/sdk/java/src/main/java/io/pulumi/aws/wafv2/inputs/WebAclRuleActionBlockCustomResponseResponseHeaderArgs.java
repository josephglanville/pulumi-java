// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleActionBlockCustomResponseResponseHeaderArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionBlockCustomResponseResponseHeaderArgs Empty = new WebAclRuleActionBlockCustomResponseResponseHeaderArgs();

    /**
     * The label string.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The value of the custom header.
     * 
     */
    @InputImport(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public WebAclRuleActionBlockCustomResponseResponseHeaderArgs(
        Output<String> name,
        Output<String> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private WebAclRuleActionBlockCustomResponseResponseHeaderArgs() {
        this.name = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionBlockCustomResponseResponseHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionBlockCustomResponseResponseHeaderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }
        public WebAclRuleActionBlockCustomResponseResponseHeaderArgs build() {
            return new WebAclRuleActionBlockCustomResponseResponseHeaderArgs(name, value);
        }
    }
}
