// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RecordConditionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration to suppress records whose suppression conditions evaluate to true.
 * 
 */
public final class GooglePrivacyDlpV2RecordSuppressionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2RecordSuppressionArgs Empty = new GooglePrivacyDlpV2RecordSuppressionArgs();

    /**
     * A condition that when it evaluates to true will result in the record being evaluated to be suppressed from the transformed content.
     * 
     */
    @InputImport(name="condition")
      private final @Nullable Output<GooglePrivacyDlpV2RecordConditionArgs> condition;

    public Output<GooglePrivacyDlpV2RecordConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    public GooglePrivacyDlpV2RecordSuppressionArgs(@Nullable Output<GooglePrivacyDlpV2RecordConditionArgs> condition) {
        this.condition = condition;
    }

    private GooglePrivacyDlpV2RecordSuppressionArgs() {
        this.condition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RecordSuppressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GooglePrivacyDlpV2RecordConditionArgs> condition;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RecordSuppressionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
        }

        public Builder condition(@Nullable Output<GooglePrivacyDlpV2RecordConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable GooglePrivacyDlpV2RecordConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }
        public GooglePrivacyDlpV2RecordSuppressionArgs build() {
            return new GooglePrivacyDlpV2RecordSuppressionArgs(condition);
        }
    }
}
