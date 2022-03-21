// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs Empty = new WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs();

    /**
     * The label name that a log record must contain in order to meet the condition. This must be a fully qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label.
     * 
     */
    @Import(name="labelName", required=true)
      private final Output<String> labelName;

    public Output<String> getLabelName() {
        return this.labelName;
    }

    public WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs(Output<String> labelName) {
        this.labelName = Objects.requireNonNull(labelName, "expected parameter 'labelName' to be non-null");
    }

    private WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs() {
        this.labelName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> labelName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
        }

        public Builder labelName(Output<String> labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }
        public Builder labelName(String labelName) {
            this.labelName = Output.of(Objects.requireNonNull(labelName));
            return this;
        }        public WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs build() {
            return new WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs(labelName);
        }
    }
}
