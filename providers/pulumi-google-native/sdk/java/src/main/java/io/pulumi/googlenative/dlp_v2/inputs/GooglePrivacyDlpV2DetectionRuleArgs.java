// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2HotwordRuleArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GooglePrivacyDlpV2DetectionRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2DetectionRuleArgs Empty = new GooglePrivacyDlpV2DetectionRuleArgs();

    @InputImport(name="hotwordRule")
    private final @Nullable Input<GooglePrivacyDlpV2HotwordRuleArgs> hotwordRule;

    public Input<GooglePrivacyDlpV2HotwordRuleArgs> getHotwordRule() {
        return this.hotwordRule == null ? Input.empty() : this.hotwordRule;
    }

    public GooglePrivacyDlpV2DetectionRuleArgs(@Nullable Input<GooglePrivacyDlpV2HotwordRuleArgs> hotwordRule) {
        this.hotwordRule = hotwordRule;
    }

    private GooglePrivacyDlpV2DetectionRuleArgs() {
        this.hotwordRule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DetectionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2HotwordRuleArgs> hotwordRule;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DetectionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hotwordRule = defaults.hotwordRule;
        }

        public Builder setHotwordRule(@Nullable Input<GooglePrivacyDlpV2HotwordRuleArgs> hotwordRule) {
            this.hotwordRule = hotwordRule;
            return this;
        }

        public Builder setHotwordRule(@Nullable GooglePrivacyDlpV2HotwordRuleArgs hotwordRule) {
            this.hotwordRule = Input.ofNullable(hotwordRule);
            return this;
        }

        public GooglePrivacyDlpV2DetectionRuleArgs build() {
            return new GooglePrivacyDlpV2DetectionRuleArgs(hotwordRule);
        }
    }
}