// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.azurenative.netapp.inputs.ExportPolicyRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumePropertiesExportPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumePropertiesExportPolicyArgs Empty = new VolumePropertiesExportPolicyArgs();

    @InputImport(name="rules")
    private final @Nullable Input<List<ExportPolicyRuleArgs>> rules;

    public Input<List<ExportPolicyRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    public VolumePropertiesExportPolicyArgs(@Nullable Input<List<ExportPolicyRuleArgs>> rules) {
        this.rules = rules;
    }

    private VolumePropertiesExportPolicyArgs() {
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumePropertiesExportPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ExportPolicyRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumePropertiesExportPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(@Nullable Input<List<ExportPolicyRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<ExportPolicyRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public VolumePropertiesExportPolicyArgs build() {
            return new VolumePropertiesExportPolicyArgs(rules);
        }
    }
}
