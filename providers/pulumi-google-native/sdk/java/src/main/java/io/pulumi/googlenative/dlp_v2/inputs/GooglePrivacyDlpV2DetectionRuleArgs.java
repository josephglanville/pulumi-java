// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2HotwordRuleArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Deprecated; use `InspectionRuleSet` instead. Rule for modifying a `CustomInfoType` to alter behavior under certain circumstances, depending on the specific details of the rule. Not supported for the `surrogate_type` custom infoType.
 * 
 */
public final class GooglePrivacyDlpV2DetectionRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2DetectionRuleArgs Empty = new GooglePrivacyDlpV2DetectionRuleArgs();

    /**
     * Hotword-based detection rule.
     * 
     */
    @Import(name="hotwordRule")
      private final @Nullable Output<GooglePrivacyDlpV2HotwordRuleArgs> hotwordRule;

    public Output<GooglePrivacyDlpV2HotwordRuleArgs> getHotwordRule() {
        return this.hotwordRule == null ? Codegen.empty() : this.hotwordRule;
    }

    public GooglePrivacyDlpV2DetectionRuleArgs(@Nullable Output<GooglePrivacyDlpV2HotwordRuleArgs> hotwordRule) {
        this.hotwordRule = hotwordRule;
    }

    private GooglePrivacyDlpV2DetectionRuleArgs() {
        this.hotwordRule = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DetectionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GooglePrivacyDlpV2HotwordRuleArgs> hotwordRule;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DetectionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hotwordRule = defaults.hotwordRule;
        }

        public Builder hotwordRule(@Nullable Output<GooglePrivacyDlpV2HotwordRuleArgs> hotwordRule) {
            this.hotwordRule = hotwordRule;
            return this;
        }
        public Builder hotwordRule(@Nullable GooglePrivacyDlpV2HotwordRuleArgs hotwordRule) {
            this.hotwordRule = Codegen.ofNullable(hotwordRule);
            return this;
        }        public GooglePrivacyDlpV2DetectionRuleArgs build() {
            return new GooglePrivacyDlpV2DetectionRuleArgs(hotwordRule);
        }
    }
}
