// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ConditionArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A collection of conditions.
 * 
 */
public final class GooglePrivacyDlpV2ConditionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2ConditionsArgs Empty = new GooglePrivacyDlpV2ConditionsArgs();

    /**
     * A collection of conditions.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<GooglePrivacyDlpV2ConditionArgs>> conditions;

    public Output<List<GooglePrivacyDlpV2ConditionArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    public GooglePrivacyDlpV2ConditionsArgs(@Nullable Output<List<GooglePrivacyDlpV2ConditionArgs>> conditions) {
        this.conditions = conditions;
    }

    private GooglePrivacyDlpV2ConditionsArgs() {
        this.conditions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GooglePrivacyDlpV2ConditionArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ConditionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder conditions(@Nullable Output<List<GooglePrivacyDlpV2ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<GooglePrivacyDlpV2ConditionArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }
        public Builder conditions(GooglePrivacyDlpV2ConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }        public GooglePrivacyDlpV2ConditionsArgs build() {
            return new GooglePrivacyDlpV2ConditionsArgs(conditions);
        }
    }
}
