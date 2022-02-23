// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The integration account partner's business identity.
 * 
 */
public final class BusinessIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final BusinessIdentityArgs Empty = new BusinessIdentityArgs();

    /**
     * The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32
     * 
     */
    @InputImport(name="qualifier", required=true)
      private final Input<String> qualifier;

    public Input<String> getQualifier() {
        return this.qualifier;
    }

    /**
     * The user defined business identity value.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public BusinessIdentityArgs(
        Input<String> qualifier,
        Input<String> value) {
        this.qualifier = Objects.requireNonNull(qualifier, "expected parameter 'qualifier' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private BusinessIdentityArgs() {
        this.qualifier = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BusinessIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> qualifier;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(BusinessIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.qualifier = defaults.qualifier;
    	      this.value = defaults.value;
        }

        public Builder setQualifier(Input<String> qualifier) {
            this.qualifier = Objects.requireNonNull(qualifier);
            return this;
        }

        public Builder setQualifier(String qualifier) {
            this.qualifier = Input.of(Objects.requireNonNull(qualifier));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public BusinessIdentityArgs build() {
            return new BusinessIdentityArgs(qualifier, value);
        }
    }
}
