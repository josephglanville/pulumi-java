// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IndexJsonTokenTypeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexJsonTokenTypeConfigurationArgs Empty = new IndexJsonTokenTypeConfigurationArgs();

    @Import(name="groupAttributeField", required=true)
      private final Output<String> groupAttributeField;

    public Output<String> getGroupAttributeField() {
        return this.groupAttributeField;
    }

    @Import(name="userNameAttributeField", required=true)
      private final Output<String> userNameAttributeField;

    public Output<String> getUserNameAttributeField() {
        return this.userNameAttributeField;
    }

    public IndexJsonTokenTypeConfigurationArgs(
        Output<String> groupAttributeField,
        Output<String> userNameAttributeField) {
        this.groupAttributeField = Objects.requireNonNull(groupAttributeField, "expected parameter 'groupAttributeField' to be non-null");
        this.userNameAttributeField = Objects.requireNonNull(userNameAttributeField, "expected parameter 'userNameAttributeField' to be non-null");
    }

    private IndexJsonTokenTypeConfigurationArgs() {
        this.groupAttributeField = Output.empty();
        this.userNameAttributeField = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexJsonTokenTypeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> groupAttributeField;
        private Output<String> userNameAttributeField;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexJsonTokenTypeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupAttributeField = defaults.groupAttributeField;
    	      this.userNameAttributeField = defaults.userNameAttributeField;
        }

        public Builder groupAttributeField(Output<String> groupAttributeField) {
            this.groupAttributeField = Objects.requireNonNull(groupAttributeField);
            return this;
        }
        public Builder groupAttributeField(String groupAttributeField) {
            this.groupAttributeField = Output.of(Objects.requireNonNull(groupAttributeField));
            return this;
        }
        public Builder userNameAttributeField(Output<String> userNameAttributeField) {
            this.userNameAttributeField = Objects.requireNonNull(userNameAttributeField);
            return this;
        }
        public Builder userNameAttributeField(String userNameAttributeField) {
            this.userNameAttributeField = Output.of(Objects.requireNonNull(userNameAttributeField));
            return this;
        }        public IndexJsonTokenTypeConfigurationArgs build() {
            return new IndexJsonTokenTypeConfigurationArgs(groupAttributeField, userNameAttributeField);
        }
    }
}
