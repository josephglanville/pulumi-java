// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleActionBlockCustomResponseResponseHeader {
    /**
     * The label string.
     * 
     */
    private final String name;
    /**
     * The value of the custom header.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private WebAclRuleActionBlockCustomResponseResponseHeader(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * The label string.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The value of the custom header.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionBlockCustomResponseResponseHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionBlockCustomResponseResponseHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public WebAclRuleActionBlockCustomResponseResponseHeader build() {
            return new WebAclRuleActionBlockCustomResponseResponseHeader(name, value);
        }
    }
}
