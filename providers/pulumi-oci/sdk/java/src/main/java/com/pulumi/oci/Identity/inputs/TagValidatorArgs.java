// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class TagValidatorArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagValidatorArgs Empty = new TagValidatorArgs();

    /**
     * (Updatable) Specifies the type of validation: a static value (no validation) or a list.
     * 
     */
    @Import(name="validatorType", required=true)
    private Output<String> validatorType;

    /**
     * @return (Updatable) Specifies the type of validation: a static value (no validation) or a list.
     * 
     */
    public Output<String> validatorType() {
        return this.validatorType;
    }

    /**
     * (Updatable) The list of allowed values for a definedTag value.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return (Updatable) The list of allowed values for a definedTag value.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private TagValidatorArgs() {}

    private TagValidatorArgs(TagValidatorArgs $) {
        this.validatorType = $.validatorType;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagValidatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagValidatorArgs $;

        public Builder() {
            $ = new TagValidatorArgs();
        }

        public Builder(TagValidatorArgs defaults) {
            $ = new TagValidatorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param validatorType (Updatable) Specifies the type of validation: a static value (no validation) or a list.
         * 
         * @return builder
         * 
         */
        public Builder validatorType(Output<String> validatorType) {
            $.validatorType = validatorType;
            return this;
        }

        /**
         * @param validatorType (Updatable) Specifies the type of validation: a static value (no validation) or a list.
         * 
         * @return builder
         * 
         */
        public Builder validatorType(String validatorType) {
            return validatorType(Output.of(validatorType));
        }

        /**
         * @param values (Updatable) The list of allowed values for a definedTag value.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values (Updatable) The list of allowed values for a definedTag value.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values (Updatable) The list of allowed values for a definedTag value.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public TagValidatorArgs build() {
            $.validatorType = Objects.requireNonNull($.validatorType, "expected parameter 'validatorType' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
