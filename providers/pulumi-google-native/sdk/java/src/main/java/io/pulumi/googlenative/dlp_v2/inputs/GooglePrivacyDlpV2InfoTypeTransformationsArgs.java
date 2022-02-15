// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeTransformationArgs;
import java.util.List;
import java.util.Objects;


public final class GooglePrivacyDlpV2InfoTypeTransformationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2InfoTypeTransformationsArgs Empty = new GooglePrivacyDlpV2InfoTypeTransformationsArgs();

    @InputImport(name="transformations", required=true)
    private final Input<List<GooglePrivacyDlpV2InfoTypeTransformationArgs>> transformations;

    public Input<List<GooglePrivacyDlpV2InfoTypeTransformationArgs>> getTransformations() {
        return this.transformations;
    }

    public GooglePrivacyDlpV2InfoTypeTransformationsArgs(Input<List<GooglePrivacyDlpV2InfoTypeTransformationArgs>> transformations) {
        this.transformations = Objects.requireNonNull(transformations, "expected parameter 'transformations' to be non-null");
    }

    private GooglePrivacyDlpV2InfoTypeTransformationsArgs() {
        this.transformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InfoTypeTransformationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<GooglePrivacyDlpV2InfoTypeTransformationArgs>> transformations;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InfoTypeTransformationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformations = defaults.transformations;
        }

        public Builder setTransformations(Input<List<GooglePrivacyDlpV2InfoTypeTransformationArgs>> transformations) {
            this.transformations = Objects.requireNonNull(transformations);
            return this;
        }

        public Builder setTransformations(List<GooglePrivacyDlpV2InfoTypeTransformationArgs> transformations) {
            this.transformations = Input.of(Objects.requireNonNull(transformations));
            return this;
        }

        public GooglePrivacyDlpV2InfoTypeTransformationsArgs build() {
            return new GooglePrivacyDlpV2InfoTypeTransformationsArgs(transformations);
        }
    }
}